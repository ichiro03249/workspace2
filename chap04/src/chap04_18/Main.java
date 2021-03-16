package chap04_18;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//		int[][] scores = new int [2][3];
		//		scores[0][0] = 40;
		//		scores[0][1] = 50;
		//		scores[0][2] = 60;
		//		scores[1][0] = 80;
		//		scores[1][1] = 60;
		//		scores[1][2] = 70;
		//		System.out.println(scores[1][1]);

		//		int[][] scores = {{40,50,60,90},{80,60,70}};

		//			System.out.println(scores.length);
		//			System.out.println(scores[0].length);
		//全部の数字を順番に表示させる　for文と拡張for文で。二重のfor文が必要
		//			for(int i =0; i<scores.length; i++ ) {
		//				for(int j = 0; j<scores[i].length; j++) {
		//					System.out.println(scores[i][j]);
		//				}
		//			}
		//----------------------------------------------------------------
		//			for(int[] value:scores ) {
		//				for(int value1:value) {
		//					System.out.println(value1);
		//				}
		//			}
		//---------------------練習4-1---------------------------
		//			int [] points = {1,2,3,4};
		//			double [] weights = {1.1,1.2,1.3,1.4,1.5};
		//			boolean [] ansews = {true,false,false};
		//			String [] names = {"t","r","y"};

		//---------------------練習4-2---------------------------
		//			int[] moneyList = {121902,8302,55100};
		//			for(int i = 0; i<moneyList.length; i++) {
		//				System.out.println(moneyList[i]);
		//			}
		//			for(int value:moneyList) {
		//				System.out.println(value);
		//			}

		//---------------------練習4-3---------------------------
		//			int[] counts = null;
		//			float[] heights = {171.3F,175.0F};
		//			System.out.println(counts[1]);
		//			System.out.println(heights[2]);

		//			java.lang.NullPointerException
		//			java.lang.ArrayIndexOutOfBoundsException
		//
		//
		//---------------------練習4-4---------------------------
		//			int[] numbers = {3,4,9};
		//			for(int i = 0; i<numbers.length; i++) {
		//				System.out.println("一桁の数字を入力してください");
		//				int input = new java.util.Scanner(System.in).nextInt();
		//				if(input == numbers[i]) {
		//					System.out.println("あたり！");
		//				}
		//			}
		//--------------------------追加問題-------------------------------
		
		//	int[] numbers = new int[3];
		//		int ram1 = new java.util.Random().nextInt(10);
		//		int ram2 = new java.util.Random().nextInt(10);
		//		int ram3 = new java.util.Random().nextInt(10);
		//		int[] numbers = { ram1, ram2, ram3 };
		//		if (ram1 != ram2 && ram2 != ram3) {
		//			for (int i = 0; i < numbers.length; i++) {
		//					System.out.println(numbers[i]);
		//			}
		//		}
		
//		int[] numbers = new int[3];
//		for (int i = 0; i < numbers.length; i++) {
//			 numbers[i] = new java.util.Random().nextInt(10);
//			for(int j = 0; j<i; j++) {
//				while(numbers[j] == numbers[i])
//				{
//				 numbers[i] = new.util.Random().nextInt(10);
//				}
//				
//			}
//		}
//		//空の配列を用意する
		//jを使って一つ少ない数より小さいやつだけ回す
		//whileで繰り返すwhileは指定した条件が満たされるまで繰り返す　サルみたいなやつである
	

		//-----------------------追加問題②--------------------------
		//②numbers ランダム０～９で５個
		//		２回入力
		//		両方合ってる時は全部あたり
		//		片保はあたり
		//		と表示
//		int ram1 = new java.util.Random().nextInt(10);
//		int ram2 = new java.util.Random().nextInt(10);
//		int ram3 = new java.util.Random().nextInt(10);
//		int ram4 = new java.util.Random().nextInt(10);
//		int ram5 = new java.util.Random().nextInt(10);
//		int[] numbers = { ram1, ram2, ram3, ram4, ram5 };
//		if (ram1 != ram2 && ram2 != ram3) {
//			for (int i = 0; i < numbers.length; i++) {
//				//					System.out.println(numbers[i]);
//				System.out.println("①　１～９の数字を入力してください");
//				int input1 = new java.util.Scanner(System.in).nextInt();
//				System.out.println("②　１～９の数字を入力してください");
//				int input2 = new java.util.Scanner(System.in).nextInt();
//				int[] allInput = { input1, input2 };
//				if (allInput[i] == numbers[i]) {
//					System.out.println("全部あたり");
//				}else if(allInput[i] == numbers[0] || allInput[i] == numbers[1]) {
//					System.out.println("片方あたり");
//				}else {
//					System.out.println("はずれ");
//				}
//			}
//		}

		//--------------------------------------------------------------
//		mainクラスから動く
		
		
		
		
		

	}

}
