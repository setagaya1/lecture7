package com.setagaya1.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Map;

@RestController
public class TestController {


    @GetMapping("/names")
    //クエリパラメータ"msg"を受け取れるように変更
    public List<String> getName(@RequestParam String msg) {
        return List.of("setagaya", msg);
    }

    @PostMapping("/names")
    //バリデーションを追加
    public ResponseEntity<String> create(@RequestBody @Validated CreateForm form, BindingResult result) {
            URI url = UriComponentsBuilder.fromUriString("http:localhost:8080")
                    .path("/name/id")
                    .build()
                    .toUri();
            if (result.hasErrors()) {
                return ResponseEntity.created(url).body("failure"); //エラーメッセージ
            } else {
                return ResponseEntity.created(url).body("name successfully created");
            }
    }

    @PatchMapping("/names/{id}")
    public ResponseEntity<Map<String, String>> update(@PathVariable("id") int id, @RequestBody UpdateForm form) {
        return ResponseEntity.ok(Map.of("message", "name successfully updated"));
    }

    @DeleteMapping("/names/{id}")
    public ResponseEntity<Map<String, String>> delete(@PathVariable("id") int id) {
        //削除処理は今回は省略
        return ResponseEntity.ok(Map.of("message", "name successfully deleted"));
    }
}
