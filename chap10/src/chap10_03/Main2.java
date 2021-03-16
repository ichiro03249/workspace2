package chap10_03;

public class Main2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero h = new Hero();
		Matango m = new Matango();
//		m.attack(h);

		PoisonMatango pm = new PoisonMatango('A');
		pm.attack(h);
	}

}
//引数を持つコンストラクタを定義するとnewをする時に値を指定できる
//オーバーライドは親クラスの内容を子クラスが上書きできる　メソッド名と引数を同じにする
//オーバーロードは多重定義法
//クラスにfinalをつけると継承できなくなる
//メソッドにもfinalをつけられる　オーバーライドできなくなる
//final Stirng hero は定数
//
//できるだけ親に迷惑をかけないように子クラスの中で解決をしようとする。
//協調性が強くて親の言いなりになるくかわいそうな子どもをイメージする
//superは親クラスを意味する　ただしカプセル化がされていてprivateになっているとsuper.フィールド名も使えなくなる
//privateがついているとgetter setterを使うしかねえ
//super();が隠れている　どこに？
//親コンストラクタが一番最初に処理が行われる
//super();はコンストラクタの一番最初にしか書けないでも省略してもオッケー
//--------------is aの関係　has aの関係ってのもあったな　なんだっけ？-------------
//is aの関係　子クラスは親クラスのお一種であるという表現に合っていないといけないというルール
//is aの関係にのっとっていないといけない２つの理由とは？
//クラスが拡張していった時に現実世界との矛盾が生じてオブジェクト指向が使えなくなる可能性があるから
//オブジェクト指向の多態性を使えなくなるから
//汎化　特化　
//親クラスになればなるほど抽象的で曖昧なものにな→汎化
//子クラスになればなるほど具体的になる→特化


//is a は「一種」がキーワード　「一部」ではない
//継承のイメージがちがっていたので要注意！！
//辞書の一種は英和辞書とかだよ
//------------p392のコンストラクタの継承のとこわからない-----------
//親クラスのコンストラクタ
//
//オーバーライド　privateフィールドをオーバーライドする
//あの図を思い出す　p384の図を思い出す
//親を内側に持っていた
//キーボード　F3で親に飛べる
//
//p425
//public abstract 戻り値　メソッド名（引数リスト）;
//abstract 抽象　曖昧という意味
//抽象メソッド
//public abstract class クラス名
//抽象メソッドってなに？
//抽象クラスはnewできない
//抽象メソッドが１０個ある　継承する　使う場合だけオーバーライドする？　使わない場合は新しいメソッドを書けば大丈夫？
//抽象メソッドを継承している場合の解決方法は２つ
//継承した側のクラスもabstractをつけて抽象クラスにする　キョンシーに噛まれたみたいなもん
//噛まれたら基本キョンシー化する
//もしくは、未完成部分を全部なくす
//キョンシーからもらった毒を全部なくす
//
//
//2/27
//高度な継承の復習
//抽象メソッドの特徴２つ
//波かっこがない
//abstractがついている
//抽象メソッドを作ったら必ずクラスにもabstractをつけないといけない　
//ただし、抽象クラスを作ったからと言って抽象メソッドを作らなくてもいい　インスタンス化させないために！！！
//この場合、継承の材料として使うという意味合いが強い
//
//------p435-------
//インターフェースはさらに曖昧なもの
//インターフェースとして特別扱いできる２つの条件
//①すべてのメソッドは抽象メソッドである
//②基本的にフィールドを一つも持たない
//public interface Craeture{
//public abstract void run();
//}
//インターフェースはクラスじゃないから作り方が違う
//void run();　public abstractが省略されている形
//なぜなら、publicであることもabstractであることもわかりきっているから
//フィールド　定数だけは宣言できる　フィールドを書いたら自動的に定数になって
//public static finalが省略されているということになる
//
//メニューはメソッドのかたまり
//interfaceは接点という意味
//GUI=グラフィカル　ユーザー　インターフェイス。グーグルのアイコンをクリック。
//クロームが開くという結果はわかるが中で行われている処理については知らない
//機械側もクリックされたら開けばいいということだけ
//
//CUI=キャラクター　ユーザー　インターフェイス。文字を介して機械との接点になる
//
//インターフェイス＝メニュー＝メソッドの塊＝接点
//interefaceから引き継ぐ場合にはextendsではなくてimplements
//interfaceから引き継ぐ場合は継承ではなく実装という
//右クリックでオーバーライドメソッドを簡単に作れるようになる
//
//@ アノテーション
//@override　オーバーライドアノテーション　下記のメソッドが正しくオーバーライドされているかをチェックしてくれる
//間違っているとコンパイルエラーになる
//
//p442
//クラス図ではインターフェイスの実装の場合は点線を使う
//インターフェイスの効果
//①共通のメソッドを実装するように強制できる
//②そのメソッドは持っているということが保証される
//
//特別扱いされる理由
//多重継承ができる　メソッドの内容がないしそれをオーバーライドするから
//多重継承するときの構文
//public class クラス名　implements 親インターフェイス１,親インターフェイス2{
//}
//p448
//インターフェイスをインターフェイスが継承する場合はextends
//同じもの→同じもの＝extends
//A→B＝implements
//
//p451
//デフォルト実装つき抽象メソッドの宣言
//defalut 戻り値　メソッド名（引数）｛
//処理のデフォルト実装
//｝
//今はそこまで覚えておかなくていいと思うby飯塚さん
//
//
//
//
//
//
//
//
//

