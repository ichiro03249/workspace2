package chap09_08;

public class Item_main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Item i = new Item("apple");
		i.setPrice(238);

		Item i2 = new Item("牛乳");
		i2.setPrice(178);

		Item i3 = new Item("コーンフレーク");
		i3.setPrice(298);

		int total = i.getPrice() + i2.getPrice() + i3.getPrice();

		System.out.println("お買い上げ金額は、" + total);

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
