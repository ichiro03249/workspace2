package chap04_15;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[] arrayA = { 1, 2, 3 };
		int[] arrayB;

		arrayB = arrayA;
		arrayB[0] = 100;//アドレスをコピーするよという式
		System.out.println(arrayA[0]);



		//スタック　ヒープ
			//こういうコードは意味がないよ笑
//---------------------------------------------------
		int[] array = { 1, 2, 3 };

		array = null;
		array[0] = 10;

		System.out.println(array[0]);

	}
	//2進数だと0と1だから人間にはわかりにくい。16進数だと数字が少なくなって人間が管理しやすくなる

}
