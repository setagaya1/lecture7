# 第７回講義課題
## 概要
‐ 授業で扱った実装例を参考にHTTPメソッドのGET/POST/PATCH/DELETEのリクエストを扱えるControllerを実装する。
- そのうえでオリジナルの使用を追加する。
## オリジナル要素
講義中に具体例として挙げていたものを中心に、以下のものを実装例へ追加いたしました（オリジナルとは…）。 

-  GETメソッドにクエリパラメーター「msg」を受け取れるように変更。
-  POST、PATCHメソッドにて使用するformに生年月日と身長も渡せるように追加（lombokライブラリを使用)
-  バリデーションを適用し「名前：空欄NG」「生年月日：yyyy-mm-dd以外NG」「身長：0～300以外NG」とした。  NGとなった場合はレスポンスボディに「failure」と表示されるようにした。
## 実行結果
- GET
![image](https://github.com/setagaya1/lecture7/assets/136170263/fd761a0c-887a-4c01-bdb5-acafc295b0a9)
- POST（正常）
![image](https://github.com/setagaya1/lecture7/assets/136170263/6e1a7387-36b4-46f0-aa49-a8893d27cf36)
- POST（NG、身長が範囲外）
![image](https://github.com/setagaya1/lecture7/assets/136170263/0d67e342-8964-487b-a7f3-5d317556299a)
- PATCH
![image](https://github.com/setagaya1/lecture7/assets/136170263/f2e06343-00aa-4744-9c08-8692fa313a65)
- DELETE
![image](https://github.com/setagaya1/lecture7/assets/136170263/044cc8df-ef20-49c4-b834-c40c552798c0)


