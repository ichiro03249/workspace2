package chap09_08;

public class Sankaku {
	int bottom;
	int height;
	public void keisan( ) {
	this.bottom = 10;
	this.height = 100;
		int result = this.bottom*this.height/2;
		System.out.println(result);

	}
}
//セッターゲッター不要
//三角形の面積計算クラス
//	フィールド　底辺　高さ
//	メソッド　面積計算するやつ
//	三角クラスの生成
//	底辺　高さ　指定
//	メインメソッドで面積を表示







//-------------------------------------------
//hamburger　情報管理
//お客さんは専門用語を使わない
//自分たちで日本語を変換する
//問題文の意味認識は必ず確認する
//ただ情報を取り出すだけのメソッド
//getはreturnを返す
//setは？
//privateのフィールドに値を入れるだけの役割
//
//
//
//
//
//	//バイトコードの拡張子はclass
//追試の１
//問６予約語だからダメ　変数には使えないlong
//問７再代入の時は型は宣言しない
//問11 (System.in).nextLine();
//
//追試の２
//問１　age < 20 && prefs.equals("東京都")
//問２　if(s.equals("Java"))
//文字列の比較はequals　問題になりやすい！！！
//qのあとにはuが来る
//問４　xを表示させるから　１、３、５　
//int x = 0
//while(x < 6){
//x++;
//if(x % 2 == 1)
//sysout(x)
//continue
//オーバーロード
//アクセス制御
//フィールドはprivate
//メドッドはpublic
//同じクラスからしかフィールドを変えることができなくなる
//理屈　システム開発　数千クラスになる　気が付いたら変わってる　最悪
//コンパイルエラーになってないだけに探すのが大変　
//原因究明が簡単になる
//ゲッター　セッター　p503
//getName　フィールドを変更するため専用のメソッドを作っておけばいいジャン
//普通のメソッドと同じ書き方ではある
//ただただreturn this.name　で書く
//h.getName()をシステムアウトプリントで呼び出すという書き方
//public String getName(){
//return this.name;
//}public String getName(){
//return this.name;
//}
//コンストラクタってなんだっけ？
//こおの値を使って　その値を受け取らないとnewできないようにする
//コンストラクタ　自動的に処理されるやつ
//メソッドとクラス名が完全おんなじになる
//戻り値の型がない
//再代入は型を書かない
//メソッドとコンストラクタは違う　メソッドとカウントされない
//と同時に指定するがコンストラクタ」のサイン
//this.takasa = takaasa;
//this.teihen = teihen;
//と同時に　の所なのかな？
//(Sankaku s)
//double menseki = s.teihen*s.takasa/2;
//return menseki;
//
//sysout s.menseki;
//
//
//
//
//
//
//
//


