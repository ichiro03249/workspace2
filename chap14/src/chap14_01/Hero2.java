package chap14_01;

public class Hero2 {
	String name;
	int hp;
	static int money;

	public static void setRandomMoney() {
		Hero2.money = (int)(Math.random() * 1000);//0以上1000未満のランダムな数字が入る
	}
}
