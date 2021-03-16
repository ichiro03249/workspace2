package chap05_08;

public class Main {
	//returnは変数にして渡すという作業。
	//それを渡した先で使えるようにできるようにするやつ
	//置き換わった後に代入
	//キャッチボールにルールがあるみたいな感じ
		public static int add(int x, int y) {
			int ans = x + y;
			return ans;
		
		}
public static void main(String[] args) {
	System.out.println(add(add(10,20),add(30,40)));
}
//add(10,20)が最初に実行される
//別のメソッドの引数にしている。わりとよくあるかも。
//Randam().nextInt()もメソッド。printLn()もメソッド。Scanner()はクラス名
//引数にはなにがはいているのか？戻り値はなんなのか？考えるの大事
//returnはメソッドの終わりも意味する。returのあとに書くとエラーになる
//同じクラスで同じ名前のメソッドは使えない→オーバーロード

}
