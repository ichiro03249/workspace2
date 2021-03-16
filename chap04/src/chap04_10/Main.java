package chap04_10;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] scores = { 20, 30, 40, 50, 80 };
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		int avg = sum / scores.length;
		//				System.out.println("合計点"+ sum);
		//				System.out.println("平均点"+avg);

		//------------------最大値------------
		int intMax = 0;
		for (int i = 0; i < scores.length; i++) {

			intMax = Math.max(intMax, scores[i]);
		}
		System.out.println("最大値" + intMax);



		//---------------------最小値---------------
		int intMin = Integer.MIN_VALUE;
//		int intMin = Integer.MIN_VALUE;

		for (int i = 0; i > scores.length; i++) {
			intMin = Math.max(intMin, scores[i]);
		}
		System.out.println("最小値" + intMin);

		//------------すべての値を掛け算した値------------
		int all = 1;
		for (int i = 0; i < scores.length; i++) {
			all *= scores[i];
		}
		System.out.println("全掛け" + all);
		//------------------------------------------
		int count = 0;
		for(int i = 0; i<scores.length; i++) {
			if(scores[i] >= 50) {
				count++;
			}
		}
		System.out.println("50点以上の科目の数は"+ count);







	}

}
