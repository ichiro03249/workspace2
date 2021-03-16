package code09_01;

public class Main2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero h1 = new Hero();
		h1.name = "ミナト";
		h1.hp = 100;
		Hero h2 = new Hero();
		h2.name = "アサカ";
		h2.hp = 100;
		Wizard w = new Wizard();
		w.name = "スガワラ";
		w.hp = 50;
		w.heal(h1);//参照が便利に働いている
		w.heal(h2);
		w.heal(h2);


	}

}
//インスタンスの番地が入っている
//APIreference　クラス　java.lang.Stringが書いてある
//じつは　クラスだったString
//java.langパッケージの場合はimportする必要はないため
//new演算子　nweだらけにならないよう　""でかこめばok
//newを用いてインスタンスを生成する方法
//
//
//
//
//
//
