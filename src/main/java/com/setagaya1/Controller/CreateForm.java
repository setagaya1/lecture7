package com.setagaya1.Controller;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

/*
POSTメソッドに使用するformに生年月日を追加。
フィールドの変更に伴うコンストラクタ、getter、setter変更が面倒なので、試しにlombokライブラリを使用。
 */
@AllArgsConstructor
@Data
public class CreateForm {

    @NotNull
    private String name;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;

    @Range(min= 0 ,max = 300)
    private int height;

}
