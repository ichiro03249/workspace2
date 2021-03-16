package chap03_02;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

//		boolean doorClose = true;
//		while(doorClose == true) {
//			System.out.println("ノックする");
//			System.out.println("１分待つ");
//
//		}

//		---------------------練習問題-----------------------
//		①
//

		int num = 0;
		while( num < 11) {
			System.out.println(num);
			num++;
		}

//		②
		int i = 0;

		while (i <20) {
		 System.out.println((i + 1) + "明日はお休み");
		 i++;
		}
//		③
//		String income = "月の給料日:";
//		String money = "所持金\\";

		int months = 1;
		int income = 50000;

		while(months <= 5) {

			System.out.println(months +  "月の給料日:所持金\\" + income);
			months++;
			income += 50000;

		}



		System.out.println();

//		④
		int months_after = 4;
		int income_after = 200000;

		while(months_after <=8) {
			System.out.println(months_after +  "月の給料日:所持金\\" + income_after);
			if(months_after == 6) {
				System.out.println(months_after +  "月の給料日:所持金\\" + 0);
			}
			months_after++;
			income_after += 50000;
		}

//	⑤
//		サイコロ
//		２回降る
//		大きい目が出たほうを勝ち
//		ゲーム結果
//		〇と△が等しい場合は「引き分け」と表示する


		int maru = new java.util.Random().nextInt(6);
		int sankaku = new java.util.Random().nextInt(6);
		maru++;
		sankaku++;
		int m = Math.max(maru,sankaku);
		System.out.println(maru + "と"+ sankaku +"は、" + m + "の方が大きいので、" + m + "の勝ち");
		if(maru == sankaku) {
			System.out.println("引き分け");
		}
//⑥
//	数当て
//		サイコロ
//		コンソールに入力1ケタ数字と等しければ
//		ビンゴ
//		ひとしくなければ　はずれ

//		int saikoro = new java.util.Random().nextInt(6);
//		System.out.println("サイコロの数を当ててください");
//		int expect = new java.util.Scanner(System.in).nextInt();
//
//		if(expect == saikoro){
//			System.out.println("ビンゴ！");
//		}else {
//			System.out.println("はずれー！");
//		}







//		⑦
//		パスワードを登録しますと表示
//		ひらがな」4」文字を入力こんそーるから
//
//		一致　登録しました
//		不一致　パスワードが異なります

		System.out.println("パスワードを登録します");
		String name = new java.util.Scanner(System.in).nextLine();

		System.out.println("パスワードを確認します");
		String confirm = new java.util.Scanner(System.in).nextLine();


//			boolean a = true;
		if(name.equals(confirm) ) {

			System.out.println("登録しました");

		}else {
		System.out.println("パスワードが異なります");
		}





	}

}
