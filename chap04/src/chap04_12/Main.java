package chap04_12;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

//		int[] seq = new int[10];
//
//		for(int i = 0; i<seq.length; i++) {
//			seq[i] = new java.util.Random().nextInt(4);
//		}
//
//		for(int i = 0; i<seq.length; i++) {
//			char[] base = {'A','T','G','C'};
//			System.out.print(base[seq[i]] + " ");


//			switch(seq[i]) {
//			case 0:
//				System.out.print("A ");
//				break;
//			case 1:
//					System.out.print("B ");
//					break;
//			case 2:
//					System.out.print("T ");
//					break;
//			case 3:
//					System.out.print("C ");
//					break;
//			}
//		}

		int[] scores = { 20, 30, 40, 50, 80 };
		
		for(int value:scores) {
			value += 5;
			System.out.println(value);
		}
//int型の配列と取り出したい時はintのvalueに入れる



//-----------------------------------------------
		//---------------------最小値---------------
//		int[] scores = { 20, 30, 40, 50, 80 };
//		int intMin = Integer.MAX_VALUE;
////		int intMin = Integer.MIN_VALUE;
//
//		for (int i = 0; i  <scores.length; i++) {
//			intMin = Math.min(intMin, scores[i]);
//		}
//		System.out.println("最小値" + intMin);



	}

}
