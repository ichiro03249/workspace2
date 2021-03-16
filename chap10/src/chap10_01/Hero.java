package chap10_01;

public class Hero {

	String name = "ミナト";
	int hp = 100;
	//戦う
	public void attack(Matango m) {
		System.out.println( this.name + "の攻撃！");
		m.hp -= 5;
		System.out.println("10ポイントのダメージを与えた！");
	}
//	逃げる
	public void run() {
		System.out.println(this.name + "は逃げ出した！");
	}
	public Hero() {
		System.out.println("Heroのコンストラクタ");
	}


}
//レジスタークラスを作って計算の処理をmainでしない方がきれい
//カプセル化　フィールド変数をprivate メソッドをpublic
//不可視ですのエラーはprivaateにアクセスしている
//フィールドに直接触ることができたら検査がないのでマイナスの値とかを入れ放題になってしまう
//どっからでもアクセスできましょ　だれでも使えますよがpublic
//限られたとこしかアクセスできないよがprivate
//なんにも書かないとpackage privateという　自分と同じパッケージにいればアクセスできるやつ
//protected　継承をやらないとわからないやつ
//setterは入れる　getterは取り出すという役割というだけ
//

//
//継承
//extends 元クラス
//差分メンバ　フィールド変数とメソッドのこと
//superheroクラスはheroクラスの子クラス
//javaでは多重継承はできない。メソッド名がかぶったりするので
//オーばーローライド　親クラスの内容を子どもが上書きする　メソッド名と引数の内容も同じにする
//オーバーロード　多重定義法
//フィールド変数も上書きできるの？
//クラスにfinalをつけるとそれを継承できなくなる
//Stringクラスとかもfinalがついてるので継承できない
//メソッドにもfinalがつけられる　そしてオーバーライドできなくなる
//final class クラス名　→継承できない　継承していく中での最後だよ→final
//final 戻り値　メソッド名　→オーバーライドできない　オーバーライドする中での最後だよ→final
//final データ型　変数名　→値を書き換えられない（定数）　書き換えていく中での最後だよ→final
//
//p383
//できるだけsperheroクラスで解決しようとする
//superは親クラスを意味する　ただしカプセル化をしてprivateがついているとsuper.フィールド名も使ええなくなる
//privateがついているとgetter setterを使うしかない
//trueなくてもはflyingはboolean型なので自動的にtrueだったらという意味になる
//not だったら!this.flyingとするとfalseの意味になる
//
//コンストラクタ
//インスタンス化したときに自動的に処理される初期化のやつ
//super();が隠れている
//親コンストラクタが一番最初に行われる
//super();はコンストラクタの一番最初にしか書けない　しかし省略してもかまわない
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
//
//
//
//
//
//
//