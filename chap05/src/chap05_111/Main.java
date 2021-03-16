package chap05_111;

public class Main {

	//--------------------練習問題---------------------

	//---------------------5-1-------------------------
	//		public static void main(String[] args) {
	//			introduceOneself();
	//		}

	//		public static void introduceOneself() {
	//			String name = "もりやま";
	//			int age = 35;
	//			double tall = 18.2;
	//			char zodiac = '牛';
	//
	//		System.out.println("名前は" + name);
	//		System.out.println("年齢は" + age);
	//		System.out.println("身長は" + tall);
	//		System.out.println("干支は" + zodiac);
	//}

	//---------------------5-2-------------------------

	//		public static void main(String[] args) {
	//
	//			System.out.println("アドレスを入力してください");
	//			String input = new java.util.Scanner(System.in).nextLine();
	//
	//			System.out.println("メールタイトルを入力してください");
	//			String input2 = new java.util.Scanner(System.in).nextLine();
	//
	//			System.out.println("メールの本文を入力してください");
	//			String input3 = new java.util.Scanner(System.in).nextLine();
	//
	//			email(input,  input2,  input3);
	//		}
	//
	//		public static void email(String address, String title, String text) {
	//			System.out.println(address + "に、以下のメールを送信しました。");
	//			System.out.println( "件名" + title);
	//			System.out.println("本文" + text);
	//		}
	//	}
	//

	//---------------------5-3-------------------------

//			public static void main(String[] args) {
//
//				System.out.println("アドレスを入力してください");
//				String address = new java.util.Scanner(System.in).nextLine();
//
//	//			System.out.println("メールタイトルを入力してください");
//	//			String input2 = new java.util.Scanner(System.in).nextLine();
//
//				System.out.println("メールの本文を入力してください");
//				String text = new java.util.Scanner(System.in).nextLine();
//				email(text,address);
//				email(address);
//			}
//
//			public static void email(String text, String address) {
//				System.out.println(address + "に、以下のメールを送信しました。");
//				System.out.println("件名：無題");
//				System.out.println("本文" + text);
//
//			}
//			public static void email(String address ) {
//				System.out.println(address + "に、以下のメールを送信しました。");
//				System.out.println("件名：無題");
//
//			}
	//
	//

	//---------------------5-4-------------------------
	public static void main(String[] args) {
		//		calcTriangleArea(10.0, 5.0);
		double circle =	calcCircleArea(5.0);
		System.out.println(calcTriangleArea(10.0, 5.0));
		System.out.println(calcCircleArea(5.0));
		System.out.println(String.format("円の半径がの場合、面積は%.1f",circle));

	}

	public static double calcTriangleArea(double bottom, double height) {
		return (bottom * height) / 2;

	}

	public static double calcCircleArea(double radius) {

	 double area =  radius * radius * 3.14;
		return area;

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
//
//
//
//
//
//
//
//

