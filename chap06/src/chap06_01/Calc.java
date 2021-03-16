package chap06_01;

public class Calc {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 10;
		int b = 2;
		int total = tasu(a,b);
		int delta = hiku(a,b);
		System.out.println("足すと" + total +  "、引くと" + delta);


	}
	public static int tasu(int a , int b) {
		return (a + b);
	}
	public static int hiku(int a, int b) {
		return (a -b);
	}

}
//カレントディレクトリpwd
//拡張for文は配列ノ時だけ
//for(int value:scores){
//System.out.print(value);
//}これでscoresの中を全部を取り出す処理

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
