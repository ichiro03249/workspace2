package chap14_01;

public class Main2 {
public static void print() {
	System.out.println("abc");
}
public static void prints() {
	System.out.println("kljh");
}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		print();
		prints();
//		Hero2.money = 100;
		Hero2.setRandomMoney();
		Hero2 h1 = new Hero2();
		Hero2 h2 = new Hero2();
		System.out.println(h1.hp);
		System.out.println(Hero2.money);
		System.out.println(h1.money);
//		h1.money = 300;
		h1.setRandomMoney();
		System.out.println(h2.money);
		System.out.println(Math.PI);

//		Hero.money= (int)(Math.random() *1000);
//		Hero.money = new Random().nextInt(1000);
	}

}
