package code09_01;

public class Main3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String s = new String("こんにちは");
		System.out.println(s);
		if(s == "こんにちは") {
			System.out.println("true");
		}else {
			System.out.println("false");
		}

		if(s.equals("こんにちは")){
		System.out.println("true");
		}
	}


}
// == は番地が等しいかを調べている
//equalsメソッドは中の値が等しいかどうかを調べる
//equalsの中には文字列を入れる
//a.equals("こんにちは");　戻り値必ずboolean型
//文字コードで０番が入っている
//char型\u00000
//false
//nill
//null
//バイトコードの拡張子はclass
//追試の１
//問６予約語だからダメ　変数には使えないlong
//問７再代入の時は型は宣言しない
//問11 (System.in).nextLine();
//
//追試の２
//問１　age < 20 && prefs.equals("東京都")
//問２　if(s.equals("Java"))
//文字列の比較はequals　問題になりやすい！！！
//qのあとにはuが来る
//問４　xを表示させるから　１、３、５　int x = 0
//while(x < 6){
//x++;
//if(x % 2 == 1)
//sysout(x)
//continue
//オーバーロード

//パッケージとごにチームわけされていく
//指クラス作って５回生成すればいけるんじゃないか？
//爪クラスを作って指クラスに持たせればいいんじゃない？
//hamburgerメニュー作る
//肉　カロリ。　原価
//バンズ　カロリ。　原価
//hamburgerに肉クラス　バンズクラス　を持たせる
//簡単に作れて管理も簡単になるのがオブジェクト指向？
//クラスにインスタンスをもたせることができる
//自分が設計していくときに大変
//初心者には難しいはず
//コンストラクタ　newする時に初期値で渡さない　何かの値を受け取ってnewするのがコンストラクタ
//インスタンスが生まれた時に自動実行される処理がある
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



