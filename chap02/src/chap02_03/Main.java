package chap02_03;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("私の好きな記号は二重引用符（\\）です");
//練習問題①
//		底辺　高さ　２　＝　結果

		double bottom = 5;
		double height = 50;
		double result =(bottom * height) / 2;
		System.out.println("三角形の面積は、"+result);





//練習問題②
//20000円　3500円ワイン　
//		何本購入可能？
//		いくら余る？
		int money = 20000;
		int wine = 3500;
		int buy = money/wine;
		int amari = money%wine;
		System.out.println("買った本数は、"+buy);
		System.out.println("余りは\\"+amari);


		int a = 5;
		a -= 3;
		a *= 3;
		a %= 6;
		System.out.println(a);




	}

}
