package code09_01;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 10;
		Hero h = new Hero();
		h.name = "ミナト";
		h.hp = 100;
		h.sword = s;
		System.out.println("現在の武器は" + h.sword.name);
		h.attack();
		Sword s2 = new Sword();
		s2.name = "氷の剣";
		s2.damage = 15;
		h.sword = s2;h.attack();

	}

}
//thisは自分の持っているという意味
//フィールドにもインスタンスを代入できる
//has-aの関係
//heroはswrordを持っている
//クラスをフィールドとして利用している関係をhas-aの関係という
//自分の作ったクラスをメソッドの引数として渡せる　Stringとおんなじ
//
//
//
