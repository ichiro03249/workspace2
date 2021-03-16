package chap15_01;

public class Main5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		StringBuilder sb = new StringBuilder();


		sb.append("Hello");
		sb.append("World");

		System.out.println(sb.toString());

		for(int i = 0; i < 1000; i++) {
			sb.append("Java");
		}
		String s = sb.toString();
	System.out.print(s);








	}


}
