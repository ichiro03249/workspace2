package chap12_rensyu;

public class AnimalsMain {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Cat cat = new Cat();
		Dog dog = new Dog();
		Bird bird = new Bird();
		Animal[] animals = {cat,dog,bird};

		for (Animal a : animals) {
			a.talk();
		}

		PetHotel p = new PetHotel();
		p.service(animals);

	}

}


//自分でこのクラスはなにをするクラスなのかというのを決めてから書いた方がわかりやすいよ
//---------ここらへんのさねよしさんポイント----------------
//①基本的に処理はメインでやっていく
//②
//③
//
//配列を使うと簡単になる
//インスタンス化した後に配列に入れるやり方の方が楽

//3/2　飯塚さん
//多態性の復習
//ひとまとまりのバーガー型の配列の型に入れられるのが多態性のメリット
//まとめて処理できるというのが最大のメリット
//同じ型に入れてまとめて処理をするメリット
//何ができるかといういのは型に依存する
//バーガー型がどのメソッドを使えるかとういうのを決める
//実行した時にどんな動きをするのかというのは中に入っているチーズバーガーインスタンスが決める
//親クラスが持っているメソッドしか使えない
//なにが使えるのかというのは親任せ
//子クラスは学生みたいなもんメソッドはお金みたいなもん
//お金を得るのは親任せだけど、何に使うのかは子クラスの学生さん
//ダウンキャスト
//どうしても子クラスのfly();を使いたかったら、ダウンキャストをする
//if(h instanceof SuperHero){
//SuperHero sh = (SuperHero)h;
//sh.fly();
//}
//
//instanceof演算子を使った方が安全　	trueの時だけダウンキャストをする
//instanceofを使わないとclasscastexceptionのエラーが発生する可能性がある
//多態は親クラスに入れるとまとめて使えて便利だよねって話
//ほとんどの現場ではこの３つのオブジェクト指向を使って作っていく
//サーブレットJSPもjavaの一種
//サーブレットでもオブジェクト指向のこの３つが絶対に必要！！！！
//テストの後忘れちゃったでは現場では意味がない
//p529
//すべてのクラスの祖先
//暗黙の継承
//あるクラスを作る時にextendsをしないと自動的にjava.lang.Objectを親クラスを継承したとみなされる
//public class Empty extends Object　だとみなされる
//すべてのクラスの親がObjectクラスになる
//インターフェイスは違う　あくまでクラス型だけ
//
//ｐ５３１
//Objectクラスの存在価値
//①多態性を利用できるようになるから
//Object型の変数にはどんなインスタンスも代入できる
//System.out.println(e);
//eの中に入っているtoStringメソッドを実行する　それを画面に表示する
//それがSystem.out.println();メソッドの役割
//Object型のSystem.out.println();メソッド
//
//②最低限備えておいた方がいいメソッドをデフォルトで持てるから
//Objectクラスで宣言されHeroクラスに継承されたtoString()
//
//p535
//toString() equals() は有名なやつ
//等値と等価の違い
//equals()
//等値　同一の存在であること
//等価　同じ内容であること
//同じかどうかの判定　==ではだめなの？
//微妙に意味が違うよ
//等値　==　→同じアドレスに　同じなのか？っていう意味
//等価　equals　→同じ内容か？って意味
//なにを持って同じ内容なのか？
//equalsはオーバーライドしない限りは等値==と同じ
//うーーん、コードで書くとどういう感じになるの？
//objectクラスの作る人からしたら、どんなフィールドを作るのかわからない
//オーバーライドする側が決めてね
//equalsメソッドをオーバーライドする側が決める
//オーバーライドする側が決めるってどいう意味？　コードで書くとどういうこと？
//String型のequalsメソッドは一文字を一文字を調べて全部同じ文字であればtrueにしようと決めた。→我々が。使う側が
//オーバーライドしない限りは==と同じこｋとが起きてしまうよ
//newしているからアドレスは絶対に違うものになる
//だから違う内容ですという表示になる
//正しくオーバーライドしよう
//p537
//等価判定方法の指定
//Objectクラスが持っている==はアドレスを判定するよ
//public boolean equals(Object o) {
//if(this == o) {
//	return true;
//}
//if(o instanceof Hero) {
//	Hero h = (Hero)o;
//	if(this.name.equals(h.name)) {
//		return true;
//	}
//}
//return false;
//}
//同じaddressかどうか調べる
//同じaddressであれば必ず同じ内容になるから
//
//Objectクラスにはnameというフィールドはない
//だからダウンキャストが必要になる
//ということはinstanceof演算子でチェックしないといけない
//nameはString型だからequalsメソッドを使う
//最初のif
//二番目のifでtrueにならなかったら最終的にはfalseを返す
//等値をした後に判定していくのはパターン
//
//p540
//静的メンバ
//static
//staticのついたフィールド
//特別がない限りstaticはつけない
//staticは独立したもの
//同じクラスから生成さえれたインスタンスでフィールドを共有したい時に
//staticをつける
//staticがもたらす３つの効果
//①フィールソ変数の実体がクラスに準備される
//②
//③
//ataticはクラスで１個だけ存在する
//０個でも誰かが必ず１個存在する
//クラスの共通のお財布なのでHeroクラスの共有財産みたいなもん
//クラス型.静的フィールド名
//System.out.println(Hero2.money);みたいな感じ
//
//静的な（static）なクラス（金型）にフィールド（箱）が所属するからクラス変数と言われてりするんだって
//クラスをインスタンス化される前から存在する
//でも、あんまり見かけないんだよね　飯塚さん談
//インターフェイスはフィールドを持てないけど定数は持てる
//その定数はインスタンス化しなくても使える
//
//p546
//public static finalコンビネーション
//ataticはfinal publicと一緒に指定される
//変化しない定数を各インスタンスで共有するために利用される
//staticにしているとnewしていなくてもいきなり使える！！
//これ大きなメリットです　飯塚さん談
//
//p547
//メソッドにstaticがつくとどうなるの？というお話
//Hero2.money = (int)(Math.random() * 1000);//0以上1000未満のランダムな数字が入る
//キャストは掛け算よりも優先順位が高いから（）をつけて先に計算すること
//Hero.setRandomMoney()
//
//静的メソッドを定義するとあらわれる３つの効果
//①メソッド自体がクラスに属するになる
//②インスタンスにメソッドの分身が準備される
//③インスタンスを１つも生み出さなくても呼びだせる
//
//Math.randomはstatic
//Hero.money= (int)(Math.random() *1000);←こっちはstaticだからnewしなくても使える
//Hero.money = new Random().nextInt(1000);←こっちはnewしてる
//mainメドッドにstaticがついているのは、newせずに使えるようにしたいから
//
//p548
//静的メソッドの制約
//staticメソッドにはstaticのフィールドを！目には目を歯には歯を
//static繋がりがないと使えない
//同一クラス内のstaticがついていないフィールドやメソッドは使えない
//
//p550
//静的メソッドを呼びだす理由
//①newせずに手軽に呼びだせる
//
//②newではなく静的メソッドを使ってインスタンスを生成するため
//
//コンストラクタはpbliで使うことが多い
//privateで使うこともある　外部からインスタンス化できない
//特殊なインスタンスを作りたいとき
//
//----------------------p552練習問題---------------------------------
//
//オーバーライドは親クラスの内容を子クラスが上書きすること
//メソッド名と引数は同じであること
//
//System.out.println(a);をすると画面にがあれになるということは
//
//toString()をオーバーライドしないといけないなあと考えてほしいんですね　飯塚さん
//
//public class Account {
//String accountNumber;
//int balance;
//
//@Override
//public String toString() {
//	return "\\" + this.balance + "(口座番号：" + this.accountNumber + ")";
//}
//@Override
//public boolean equals(Object o) {
//	if(this == o) {//そのインスタンスともらったoは同じものですか？という意味
//		return true;
//	}
//	if(o instanceof Account) {//oに入っているのがAccountクラスかどうかをチェックしている
//		Account a = (Account)o;
//
//		String ans1 = a.accountNumber.trim();
//		String ans2 = a.accountNumber.trim();
//		if(ans1.equals(ans2)) {
//			return true;
//		}
//	}
//	return false;
//}
//
//
//}

//
//public class MainAccount {

//public static void main(String[] args) {
//	// TODO 自動生成されたメソッド・スタブ
//	Account a = new Account();
//	a.accountNumber = "4649";
//	a.balance = 1592;
//
//	System.out.println(a);
//
//	Account a2 = new Account();
//	a2.accountNumber = " 4649";
//	a2.balance = 2525;
//
//
//
//
//	if(a.equals(a2) == true) {//ここの内容をAccountクラスの方でやってたんだeqaulas
//		System.out.println("同じ内容です");
//	}else {
//		System.out.println("違う内容です");
//	}
//}
//
//}

//public class Cleric {
//String name;
//int hp;
//int mp;
//public static final int MAX_HP = 50;
//public static final int MAX_MP = 10;
//}
//解説
//if(a.equals(a2) == true) 
//aはthis(持っているやつ)、a2がObject oに入ることになる
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


