package chap15_01;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String s1 = "すっきりJava";
		String s2 = "Java";
		String s3 = "java";
		String s4 = "     ";//半角スペース５つ
		String s5 = "　　　　　";//全角スペース５つ

		if(s2.equals(s3)) {
			System.out.println("s2とs3は等しい");
		}
		if(s2.equalsIgnoreCase(s3)) {
			System.out.println("s2とs3はケースを区別しなければ等しい");
		}
		System.out.println("s1の長さは" + s1.length() + "です");
		System.out.println(s2.equals(s3));
		System.out.println(s2.equalsIgnoreCase(s3));//同じだったらtrueを返す
		System.out.println(s1.isEmpty());//空っぽだったらtrueを返す
		System.out.println(s4.length());
		System.out.println(s5.length());
		System.out.println(s4.isEmpty());//空っぽではない長さがあるから
		System.out.println(s5.isEmpty());//空っぽではない長さがあるから




	}
}
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
//
//
//
//
//
//
//

