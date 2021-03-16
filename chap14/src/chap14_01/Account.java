package chap14_01;

public class Account {
	String accountNumber;
	int balance;

	@Override
	public String toString() {
		return "\\" + this.balance + "(口座番号：" + this.accountNumber + ")";
	}
	@Override
	public boolean equals(Object o) {
		if(this == o) {//そのインスタンスともらったoは同じものですか？という意味
			return true;
		}
		if(o instanceof Account) {//oに入っているのがAccountクラスかどうかをチェックしている
			Account a = (Account)o;//Object型をAccount型に代入してる

			String ans1 = a.accountNumber.trim();//Account型で作られた１つのもの
			String ans2 = a.accountNumber.trim();//Account型で作られた別のもう１つのもの
			if(ans1.equals(ans2)) {//それらを調べて同じであればtrueを返すよ。
				return true;
			}
		}
		return false;




	}
}
//3/3 実吉さん
//p556
//文字列処理
//入力フォームとかで使うよ
//性　名　が分かれてる　けど　確認画面で入力する時にはくっつけて表示するよね
//メールや電話番号を半角に変えるとか
//文字列処理はよく使うよね
//
//１５章の後半は正規表現
//電話番号は１０桁で！　→８桁しかなかったらエラーを返すとか
//
//Stringクラス　の主なメソッド
//Stringクラスはあまりにもよく使うのでimport文なしで使えるようになっている
//
//p557
//文字列を調査する
//	public static void main(String[] args) {
// TODO 自動生成されたメソッド・スタブ
//String s1 = "すっきりJava";
//String s2 = "Java";
//String s3 = "java";
//String s4 = "     ";//半角スペース５つ
//String s5 = "　　　　　";//全角スペース５つ
//
//if(s2.equals(s3)) {
//	System.out.println("s2とs3は等しい");
//}
//if(s2.equalsIgnoreCase(s3)) {
//	System.out.println("s2とs3はケースを区別しなければ等しい");
//}
//System.out.println("s1の長さは" + s1.length() + "です");
//System.out.println(s2.equals(s3));
//System.out.println(s2.equalsIgnoreCase(s3));//同じだったらtrueを返す
//System.out.println(s1.isEmpty());//空っぽだったらtrueを返す
//System.out.println(s4.length());
//System.out.println(s5.length());
//System.out.println(s4.isEmpty());//空っぽではない長さがあるから
//System.out.println(s5.isEmpty());//空っぽではない長さがあるから
//
//p558
//文字列を検索する
//先頭は０文字目からスタートする
//
//public static void main(String[] args) {
// TODO 自動生成されたメソッド・スタブ
//String s1 = "Java and Javascript";
//
//if(s1.contains("Java")) {
//	System.out.println("文字列s1は文字列を含んでいます");
//}
//if(s1.endsWith("Java")) {
//	System.out.println("文字列s1はJavaが末尾にあります");
//}
//System.out.println("文字列s１で最初にJavaが登場する位置は" + s1.indexOf("Java"));
//
//
//System.out.println("文字列s1で最後にJavaが登場するの位置は" + s1.lastIndexOf("Java"));
//
//
//System.out.println(s1.length());
//
//
//System.out.println(s1.contains("Java"));//true
//System.out.println(s1.startsWith("and"));//false
//System.out.println(s1.startsWith("J"));//true
//System.out.println(s1.indexOf("J"));//0と表示
//System.out.println(s1.indexOf('j'));//-1と表示
//System.out.println(s1.indexOf(74));//０と表示　Jを数字でchar型で言うと74番
//


//p559
//String s1 = "Java programing";
//
//System.out.println("文字列s1の4文字目以降は" + s1.substring(3));//表示はa programing
//
//System.out.println("文字列s1の4～8文字目以降は" + s1.substring(3, 8));//表示はa pro
//	System.out.println(s1.charAt(6));//表示はr



//
//テスト２部構成　１部が教科書前半あたり　２部の方、がっつりオブジェクト指向かと思いきやも１部との違いがわからなかったらしい　実吉さん談
//合計４ページ
//１４章以降のやつは暗記しておく必要はない
//選択問題系　引数とか戻り値
//
//p583あたり
//public アクセス修飾子のとこは復習する　p498の表とか
//
//離席するときは画面を閉じる　Windowsボタン＋Ｌでログオフ
//
//String s1 = " Java Programing ";

//System.out.println( s1.toLowerCase());//
//System.out.println( s1.toUpperCase());//
//System.out.println( s1.trim());//トリマーのtrim
//System.out.println( s1.replace("J","K"));//J→Kに置き換わる

//p561
//文字列の連結
//１０万回連結することなんてざらにある
//StringBiulder
//
//p562
//	StringBuilder sb = new StringBuilder();

//sb.append("Hello");
//sb.append("World");
//
//System.out.println(sb.toString());//文字列の連結
//
//for(int i = 0; i < 1000; i++) {
//	sb.append("Java");
//}
//String s = sb.toString();
//System.out.print(s);

//p566
//正規表現
//フロントエンジニアとかは必須っぽい？
//文字列のチェック
//p568
//return name.matches("[A-Z][A-Z0-9]{7}");
//
//来週からのカリキュラム　実吉さん談
//LinuxはOS　インフラ系の人は必須　
//Git　バージョン管理ツール　Gitの友達はSVNというやつ
//複数人で開発する時に一人一人が最新バージョンを知れたり触れたり間違って古いやつをやってしまわないように便利
//VBA　開発現場ではよく使われる　けっこう高い
//pythonとVBAはよくセットで使われる　RPA
//DB　select文を中心に４大大事なやつがある
//
//
//System.out.println("java".matches("JAVA"));
//System.out.println("java".matches("JAVA".toLowerCase()));
//System.out.println("java".matches(".Java."));
//System.out.println("java".matches("java2*"));
//System.out.println("java".matches("java2*."));
//System.out.println("java".matches("java2.*"));
//
//⑦ハットとダラー　先頭と末尾
//^j.*p$　やじjで始まって、真ん中はなんでもよくって、pで終わる　ということを意味しているよ　実吉さん談
//
//ミナトくんのやりたい処理
//return name.matches("[A-Z][A-Z0-9]{7}");
//・必ず８文字
//・使える文字はA～Zと0～9
//・最初の文字に数字は使えない
//角かっこ　一文字
//

//System.out.println("java".matches("[a-z]"));false
//System.out.println("java".matches("[a-z0-9]*."));true
//System.out.println("java".matches("[a-z]{5}")); false
//System.out.println("hoge".matches(".*e$"));true
//System.out.println("こんにちは".matches("[あ-ん]*"));true

//p572
//String r = "今日は３月３日ひな祭り";
//String[] array = r.split("日");
//System.out.println(array[0]);
//System.out.println(array[1]);
//System.out.println(array[2]);
//System.out.println(array[3]);
//今
//は３月３
//ひな祭り
//
//
//String y = "123.456";
//System.out.println(y.replace(".",",")); //123,456　.を文字だと認識するの
//System.out.println(y.replaceAll(".",","));//,,,,,,, Allの方は正規表現が使えるので全部を.に置換する

//
//p574
//文字列の書式整形
//format(書式指定文字列,引数 )
//format(こ%ん%に%ち%は,a,b,c,d)
//こaんbにcちdは
//
//%-9s%-13s所持金%,6d
//%-9s
//9文字分確保しますよ
//%-13s
//１３文字分確保しますよ
//所持金%
//これはこのまま表示しますよ　流れ込んできませんよということ
//
//スペースはそのまま表示される　ただの文字列扱いされる
//基本右寄せ　左に寄せたいときだけ-をつける
//
//System.out.printf("製品番号%s-%02d","SJV",3);
//製品番号SJV-03 と表示される
//%s　%のところに流れ込んでくるよ　文字列が
//%02d　%のところに流れ込んでくるよ　２ケタの整数が　
//
//
//3/4 若菜さん
//
//p578
//日付と時刻を扱う
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//

