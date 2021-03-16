package chap05_06;

public class MainRensyu {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

//p600の練習問題①
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= 100; i++) {
			sb.append(i + "," );
		}
		String s = sb.toString();
		System.out.println(s);

//

	}

	}


//----------------------------3/5 若菜さん--------------------------------------------
//テスト範囲　テストは第二部
//7章～１３章（１４章も微妙に入るかも？）
//
//p600 練習問題の解説
//①
//教科書の解答通り
//
//
//
//
//②
//public Stirng ()
//if(!folder,endWiths(\\)){
//folder += "\\;}
//return folder + file;
//
//③
//正規表現と一致するパターン
//①すべての文字列　.*
//②最初の１文字はA,２文字目は数字、３文字目は数字かなし　A\d{1,2}もしくはA[0-9]{1,2}
//③最初の１文字じはU,２～４文字目は英大文字　U[A-Z]{3}
//
//
//④
//p583あたり参考
//タイムゾーンあたりが全然わかってない
//
//⑤
//java.timeはDateを改善して作られた
//
//
//p606　１６章　コレクション
//要するに何？の質問が有効かも？
//
//ArrayListを使うメリットは？
//
//配列とArrayListの違い
//①import util.ArrayList
//②<>を使って格納するインスタンスの型を指定するArrayList<String>←ジェネリクスっていうい指定法らしい
//③宣言時のサイズ指定は不要、要素は随時追加できる
//
//コレクションフレームワークのクラスたちはインスタンスでないものは格納できない
//配列の方がメモリ効率がいい
//拡張for文とかとセットで使うから特定のやつを取得するとき番号指定する不便さとかはあまり感じないよ
//
//p611
//ラッパークラス
//オートボクシング　オートアンボクシングArrayList<Integer>として使える
//p612 確かにArrayListと拡張for文を組み合わせたら便利だな
//下の方にあるやつ全然わからんかった
//
//p613
//ArrayListの使い方
//ArrayList<> 変数名　= new ArrayList<>();
//ArrayList<Integer> points = new ArrayList<Integer>();
//points.add(10);
//points.add(80);
//points.add(75);
//points.set(1,1000);//1番目に上書きしている
//points.add(0,500000000);//0番目に挿入してる
//for(int i :points) {
//System.out.println(i);
//}

//p614
//
//p615
//remove()したら削除された要素の後ろにあるやつ全部１こずつ前に詰められる
//左辺をきっちり記述していれば右辺の型の名前は省略できるよ　ダイヤモンド演算子という
///ArrayList<Integer> points = new ArrayList<>();
//
//p616
//lengthとsizeは同じ使い方
//拡張for文もやり方は同じ
//
//p618
//イテレータ
//イテレータはリストに入ってるやつのココ！！！と指す矢印
//イテレータのインスタンスはnewを使わない
//Iterator<> it = リスト変数.iterator();
//呼びだした時は０番目の１個前のなにもないところを矢印で指している
//イテレータhasNext()は次しか見れないから、０番目から始まると判定できない
//
//p620
//
//ArrayList<String> names = new ArrayList<String>();
//names.add("湊");
//names.add("朝香");
//names.add("菅原");
//
//Iterator<String> it = names.iterator();//この時矢印は０番目の前になっている
//while(it.hasNext()) {//矢印の次がある限りループするよ
//	String e = it.next();
//	System.out.println(e);
//}
//System.out.println(names);

//↓
//湊
//朝香
//菅原
//[湊, 朝香, 菅原]　このカンマのとこに矢印があるイメージ
//---------------------------
//p621
//リストから順に取り出す方法は３つとも利用できるようにしよう
//for文
//拡張for文
//イテレータ
//イテレータにしかできないことがあるから覚えておいた方がいいよ
//
//ArrayList　０番あ、１番い、２番う、３番え
//LInkedList　あ→い→う→え
//みたいな感じ
//p626
//ArrayListはっけこう頻繁に使うから覚えておいた方がいいよ　若菜さん談
//printList(ArrayList<String> list){
//}
//
//p627
//set関連クラス
//大きく見ると３種類
//List Set Map　インターフェースがあるんだなあ
//
//p628
//重複は許さないがその順番は問わない　ってときに	set関連クラスを使う
//
//①重複した値を格納しようとすると無視される
//②set() get()がない 添え字がないから
//③要素を一つずつ取り出すときの順番は不明
//
//p629
//Set<String> colors = new HashSet<String>();
//colors.add("赤");
//colors.add("青");
//colors.add("黄");
//colors.add("赤");//重複しているから無視された笑
//System.out.println("色は" + colors.size() + "種類");
//System.out.println(colors);
//↓
//色は3種類
//[青, 赤, 黄]

//p630
//Set<String> colors = new HashSet<String>();
//colors.add("赤");
//colors.add("青");
//colors.add("黄");
//
//for(String s : colors) {
//	System.out.print(s + "→");
//}
//	System.out.println("\n" + colors);
//↓
//青→赤→黄→
//[青, 赤, 黄]
//-----------3/5 4時限目-------------
//p632
//Treeはアルファベット順に五十音順に出力される
//
//p633
//mapとはkey value値　のペアとして格納される
//Map<String,Integer>　連想配列と似てるよね
//値の重複はok キーの重複はできない
//
//p635
//Map<String,Integer> prefs = new HashMap<String,Integer>();
//prefs.put("京都府",255 );
//prefs.put("東京都",1261 );
//prefs.put("熊本県",181 );
//
//int tokyo = prefs.get("東京都");
//System.out.println("東京都の人口は、" + tokyo);
//
//prefs.remove("京都府");
//prefs.put("熊本県",182 );
//int kumamoto = prefs.get("熊本県" );
//
//System.out.println("熊本県の人口は、" + kumamoto);
//
//System.out.println(prefs);
//↓
//東京都の人口は、1261
//熊本県の人口は、182
//{東京都=1261, 熊本県=182}

//p636
//
//Map<String,Integer> prefs = new HashMap<String,Integer>();
//prefs.put("京都府",255 );
//prefs.put("東京都",1261 );
//prefs.put("熊本県",181 );
//
//for(String key : prefs.keySet()) {//prefs =京都府
//	int value = prefs.get(key);//京都府の値をgetして代入
//	System.out.println(key + "の人口は、" + value);
//}
//
//System.out.println(prefs);
//
//↓
//京都府の人口は、255
//東京都の人口は、1261
//熊本県の人口は、181
//{京都府=255, 東京都=1261, 熊本県=181}

//p637
//格納順に取り出したいとき　LinkedHashMap
//アルファベット順で取り出したいとき　TreeMap
//
//p638
//コレクションの応用
//
//p639
//Hero h = new Hero();
//h.name = "ミナト";
//List<Hero> list = new ArrayList<Hero>();//
//list.add(h);//hをリストに格納　参照値を見ている
//h.name = "スガワラ";//格納した後にhのnameを書き換え
//System.out.println(list.get(0).name);
//
//System.out.println();

//↓
//スガワラ
//
//p641
//自分で作ったクラスに関しては、equals() hashCode()とかはオーバーライドするときは気を付ける
//意図しない動作をすることがあるらしい
//
//p642
//主なコレクション３つとは？
//イテレータを用いるとなにができる？
//利すべきコレクションの選び方の表があるから見てみるとわかりやすいかも
////---------------p643 練習問題----------------------------
//-----------①-----------------
//日本の全都道府県の名前（順序は不問）　Set
//５人の生徒のテストの点数　List
//過去の総理大臣の名前と任期（順序は不問）　Map
//
//-------------②-------------------------------
//public class Hero {
//private String name;
//
//public Hero(String name) {//コンストラクタ
//	this.name = name;
//}
//public String getName() {//ゲッター
//	return this.name;
//}
//}
//
//---------------------3/8 若菜さん-------------------------------
//----------------p648----------------------
//不具合対策こそが腕の見せ所
//
//①syntax error 文法間違い
//コンパイラが指摘したコードの箇所を修正する
//②runtime error 範囲外の要素へのアクセス、０での割り算、存在しないファイルのオープン
//例えば配列の要素の長さを超えたインデックスの指定
//あらかじめエラーが発生したときのための処理を書いておく
//③logic error　文法に問題ないし強制終了もしない。想定内容と違う結果を得てしまう
//例えば、計算結果がおかしいなど
//自力で原因箇所を探して修正する
//
//p653//
//例外処理の流れ
//
//p655
//新しい例外処理の方法
//try //本来の処理
//catch//例外処理
//sysout("エラーです。中断します")みたいな感じ
//
//try-catch文
//tryブロックの実行中に例外的状態が発生したら
//処理がcatchブロックに移行する
//例外的状況が発生しているかどうかをチェックする面倒な作業はJVMに任せることで、
//開発者はが負う責任を軽減してくれる
//
//p657
//例外クラス
//
//例外的状況にはいろいろある
//ファイルがない　メモリがない　変数がnullなど
//
//例外クラスの種類
//error　回復見込みがない状況
//exception　回復見込みがあるなど
//
//①error系例外
//
//②exception系例外
//ネットあわーくに接続できないｔなど
//
//③
//RuntimeException系例外
//必ずしもm発生を想定すべきとまでは言えない
//
//p660
//特に注目してほしいのは
//exception系例外
//try-catch文で例外が発生したときの代替処理を用意しておかないとコンパイルエラーになる
//
//p662
//発生する例外の調べ方
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
//
//
//
//
//
//
//
//
