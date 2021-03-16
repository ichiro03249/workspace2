package chap05_05;

public class Main {

//	public static void main(String[] args) {
//		add(100,20);
//		add(200,50);
//	}
//	public static void add(int x, int y) {
//		int ans = x + y;
//		System.out.println(x + "+" + y + "=" + ans);
//	}

//----------------------------練習問題①--------------------------

	//長方形の面積
	//chouhoukeiArea()

//	public static void main(String[] args) {
//		chouhoukeiArea();
//	}
//
//	public static void chouhoukeiArea() {
//		int a = 66;
//		int b = 90;
//		int ans = a*b;
//		System.out.println(ans);
//	}




//----------------------------練習問題②--------------------------
	//長方形の面積
		//chouhoukeiArea()
//mainメソッドから渡す

//
//	public static void main(String[] args) {
//		int tate = 68;
//		int yoko = 33;
//
//		result(tate,yoko);
//	}
//	public static void chouhoukeiArea(int a , int b) {
//		int ans = a*b;
//		System.out.println(ans);
//	}


//----------------------------練習問題③--------------------------

//	三角形　sankakukeiArea()
//	面積　printArea()
//	メインメソッド→底辺高さ→printArea

	public static void main(String[] args) {
		int bottom = 10;
		int height = 20;
		sankakukeiArea(bottom,height);

	}
	public static void sankakukeiArea(int a , int b) {
		int ans = (a*b) / 2;
		System.out.println(ans);
	}

//-----------------------------------------------------------------
//returnは変数にして渡すという作業



}
