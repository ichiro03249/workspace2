package chap09_08;

public class Main3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero2 h = new Hero2();
		h.setName("ひろ");

		Wand wa = new Wand();
		wa.setPower(20);

		Wizard wi = new Wizard();
		wi.heal(h,wa);

	}

}

