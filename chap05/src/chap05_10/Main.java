package chap05_10;

public class Main {

	public static int add(int x, int y) {
		return x + y;

	}
	public static int add(int x, int y,int z) {
		return x + y + z;

	}
	public static double add(double x , double y) {
		return x + y;
	}

	public static String add(String x, String y) {
		return x + y;//答えだけを返す
	}


	//
	public static void main(String[] args) {
		System.out.println(add(10,20));
		System.out.println(add(10,20,90));
		System.out.println(add(3.5,2.7));
		System.out.println(add("HELLO　","WORLD"));


	}
	//returnは変数にして渡すという作業。
	//それを渡した先で使えるようにできるようにするやつ
	//置き換わった後に代入
	//キャッチボールにルールがあるみたいな感じ
	//add(10,20)が最初に実行される
	//別のメソッドの引数にしている。わりとよくあるかも。
	//Randam().nextInt()もメソッド。printLn()もメソッド。Scanner()はクラス名
	//引数にはなにがはいているのか？戻り値はなんなのか？考えるの大事
	//returnはメソッドの終わりも意味する。returのあとに書くとエラーになる
	//同じクラスで同じ名前のメソッドは使えない→オーバーロード→型で区別できるならok
//	引数が重要。引数の型が違っていれば同じメソッドを作れる
//同じ型なら引数の数で判断する。これなら同じメソッド名を作れる
//ミットの数とミットの型が違っていれば同じメソッドを作れるってことかな
//引数の型、数、順番のどれかが違っていればオーバーロードできる（重複できる）
//引数に違う型をStringとintだとしてもいける。その場合定義文はどうなる？
//public static StringのStringはreturはString（文字列）じゃないとダメだよ
	
//戻り値が違うだけではエラー
//メソッド定義は呼び出して使われるためにある
//呼び出し側の引数が１０を入れて呼び出す→メソッドに行く→メソッド引数のradiusならば10がradiusに代入される
//ひもで引っ張って荷物をとる。なにかをくくりつけるのかはむこう側の人がなにをつけてくれるのか？なにをほしいか書いてお来るのか？
//シグネチャは型、数、順番
//
//
//
//
//
//
//
//


}
