package code09_01;

public class Wizard {
	String name;
	int hp;
	public void heal(Hero h) {//必ずHero型のｍのをくださいねということ
		h.hp += 10;
		System.out.println(h.name + "のHPを回復した！" );
		System.out.println("今のHPは" + h.hp);
	}

}
