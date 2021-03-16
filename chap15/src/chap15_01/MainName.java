package chap15_01;

public class MainName {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	String s = "java";

//		System.out.println("java".matches("JAVA"));
//		System.out.println("java".matches("JAVA".toLowerCase()));
//		System.out.println("java".matches(".Java."));
//		System.out.println("java".matches("java2*"));
//		System.out.println("java".matches("java2*."));
//		System.out.println("java".matches("java2.*"));

		System.out.println("java".matches("[a-z]"));
		System.out.println("java".matches("[a-z0-9]*."));
		System.out.println("java".matches("[a-z]{5}"));
		System.out.println("hoge".matches(".*e$"));
		System.out.println("こんにちは".matches("[あ-ん]*"));
	}

}
