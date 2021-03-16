package chap04_03;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] scores = {20,30,40,50};
		int sum = scores[0] + scores[1] + scores[2] + scores[3] + scores[4];
		int avg = sum / scores.length;
		System.out.println("合計点は"+ sum);
		System.out.println("平均点は"+avg);

	}

}
