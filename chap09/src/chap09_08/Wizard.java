package chap09_08;

public class Wizard {

	private int hp;
	private int mp;
	private String name;
	private Wand wand;

	public void heal(Hero2 h, Wand wa) {
		int basePoint = 10;
		int recoverPoint = (int) (basePoint * wa.getPower());
		h.setHp(h.getHp() + recoverPoint);
		System.out.println(h.getName() + "のHPを" + recoverPoint + "回復した！");
	}

	public void setWand(Wand wand) {
		if(wand == null) {
			throw new IllegalArgumentException("杖を持っていません");
		}

	}
	public void setPower(int hp,int mp) {
		if(hp < 0 && mp < 0) {
			throw new IllegalArgumentException("正常な数字ではありません");
		}
		if(hp < 0) {
			hp = 0;
		}
			this.hp = hp;
			this.mp = mp;
	}

}
//----------------------②----------------------
//getHpメソッドがHeroで未定義だから
//wand.powerが見えない。privateでカプセル化

//newする時に値を入れて渡すのがコンストラクタ
//publilc class Hero
//public Hero()
//自動的に実行させる処理
//コンストラクタの特例
//１個もコンストラクタがなければ、引数なし処理なしのデフォルトコンストラクタが
//自動的に追加される
//コンストラクタを呼び出せるのはJVMだけ
//this()が同じクラスの中のコンストラクタを呼びだす処理
//this.メンバ名　のthisとはまったく別物と考えた方がいい
//
//クラス型変数Hero h = new Hero();の中にはインスタンス情報が格納されているメモリの先頭番地がはいってる
//クラス型はフィールドの型、メソッドの引数・戻り値としても利用できる
//コンストラクタはnewのインスタンス化の直後に自動的に実行される
//引数を持つコンストラクタを定義するとnewをするときに値を指定できる
//同一クラスの別コンストラクタを呼びだす時ってどんな時？あまり必要性を感じないんだけど
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


