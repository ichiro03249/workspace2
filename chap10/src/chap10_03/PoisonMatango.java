package chap10_03;

public class PoisonMatango extends Matango {

		int posionDamage = 5;
		public PoisonMatango(char suffix) {
			super(suffix);
		}
	public void attack(Hero h) {
		super.attack(h);
		if(this.posionDamage != 0) {
			System.out.println("さらに毒の胞子をばらまいた！");
			int s = h.hp / 5;
			h.hp -= s;//再代入
			System.out.println(s + "ポイントのダメージ！");
//			System.out.println("残りのHeroの体力HPは" + r);
			this.posionDamage --;//デクリメント
			System.out.println("残りの毒攻撃ができる回数は" + this.posionDamage);
		}
	}


}
