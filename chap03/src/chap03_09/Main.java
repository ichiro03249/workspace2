package chap03_09;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		for(int i = 1; i<10; i++) {
//			for(int j = 1; j<10; j++) {
//				System.out.print(i*j+ "\t");
//
//			}
//			System.out.println("");
//		}

//		for(int i = 1; i<10; i++) {
//			if(i == 3) {
//				break;
//			}
//			System.out.print(i);
//		}
//		System.out.println(" ");
//		for(int i = 1; i<10; i++) {
//			if(i == 3) {
//				continue;
//			}
//			System.out.print(i);
//		}

//-------------------------練習３－１----------------
//		int weight = 60;
//		if(weight == 60) {
//		}
//		int age1 = 10;
//		int age2 = 4;
//		if((age1 + age2) * 2 > 60) {
//		}
//
//		int i = 0;
//		if( age == (i % 2 != 0)) {
//
//		}
//		String name = "湊";
//		if(name.equals("湊"){
//
//		}



//-------------------------練習３－２----------------

//		c
//		e
//		f


//		正解
//		c
//		d
//		e
//


//-------------------------練習３－３----------------




//
//
//		int isHungry = 0;
//		String food = "カレー";
//		System.out.println("こんにちは");
//		if(isHungry == 0) {
//			System.out.println("おなか一杯です");
//		}else if(isHungry == 1) {
//			System.out.println(food + "をいただきます");
//		}
//		else {
//			System.out.println("腹ペコです");
//		}
//		int isHungry = 1;
//
//		System.out.println(isHungry ==  0 ? "3" : "9");

//		System.out.println("ごちそうさまでした");


//-------------------------練習３－４----------------

//		boolean tenki = false;
//		if(tenki == true) {
//			System.out.println("洗濯をします");
//			System.out.println("散歩に行きます");
//		}else {
//			System.out.println("DVDを見ます");
//			System.out.println("寝ます");
//		}
//		プログラムは意図したように動きました
//		boolean tenki = false;に変更する
//		｛｝をつける
//
//		System.out.println();



//-------------------------練習３－５----------------
//
//		System.out.println("[メニュー]1：検索　２：登録　３：削除\"　４：更新");
//
//		int selected = new java.util.Scanner(System.in).nextInt();
//		switch(selected) {
//			case 1:
//				System.out.println("検索します");
//				break;
//			case 2:
//				System.out.println("登録します");
//				break;
//			case 3:
//				System.out.println("削除します");
//				break;
//			case 4:
//				System.out.println("更新します");
//				break;
//				default:
//					System.out.println();
//		}
//




//-------------------------練習３－６----------------

		System.out.println("数当てゲーム");
		int ans = new java.util.Random().nextInt(9);
		for(int i = 0; i<5; i++ ) {
			System.out.println("０～９までの数字を入力してください");
			int num = new java.util.Scanner(System.in).nextInt();
			if(num == ans) {
				System.out.println("あたり！");
				break;
			}else if(num != ans) {
				System.out.println("違います");
			}
			System.out.println("ゲームを終了します");
		}

//-------------------------------------------------------



	}

}
