package chap05_02;

public class Main {
	public static void hello() {
		System.out.println("湊さんこんにちは");
	}
	public static void main(String[] args) {
		hoge();
		System.out.println("メソッドを呼び出す");
		hello();
		System.out.println("メソッドの呼び出しが終わりました");
	}
	public static void hoge() {
		System.out.println("ほげほげ");
	}
}
