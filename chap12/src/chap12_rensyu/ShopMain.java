package chap12_rensyu;

public class ShopMain {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//それぞれのhamburgerを作ってカロリーの値をsetで決める
		Menu ch = new CheeseBurger();
		ch.setCalorie(800.0);

		Menu tr = new TeriyakiBurger();
		tr.setCalorie(850.0);

		Menu ri = new RiceBurger();
		ri.setCalorie(1000.0);

		//それぞれのhamburgerを配列に入れる
		Menu[] menus = {ch,tr,ri};

		//sumの値を初期化
		double sum = 0;
		for(Menu a : menus) {
			sum += a.getCalorie();

		}

		System.out.println("配列を使って計算したカロリーの合計は、" + sum);







		Menu[] menu = new Menu[3];
		menu[0] = new CheeseBurger();
		menu[1] = new TeriyakiBurger();
		menu[2] = new RiceBurger();
		CheeseBurger cheese = new CheeseBurger();
		cheese.setName("CheeseBurger");
		cheese.getName();

		menu[0].setName("CheeseBurger");
		menu[0].setCalorie(800.0);
		System.out.println(menu[0].getName());
		System.out.println(menu[0].getCalorie());


		menu[1].setName("TeriyakiBurger");
		menu[1].setCalorie(850.0);
		System.out.println(menu[1].getName());
		System.out.println(menu[1].getCalorie());

		menu[2].setName("RiceBurger");
		menu[2].setCalorie(1000.0);
		System.out.println(menu[2].getName());
		System.out.println(menu[2].getCalorie());

		double total = menu[0].getCalorie() + menu[1].getCalorie()	+ menu[2].getCalorie();
		System.out.println("３つのhamburgerのカロリーの合計は、" + total + "です") ;


	}

}
