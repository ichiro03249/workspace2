package chap05_04;

public class Main {

	public static void main(String[] args) {
		hello("湊");
		hello("静香");
		hello("菅原");
		System.out.println("メソッドを呼び出してください");
	}
	public static void hello(String name) {
		System.out.println(name + "さん、こんにちは");
	}
	
	
	
	
	
	
	
	
}




//(String name) はキャッチャーミット
//キャッチャーミットがないと危ないからボール（値）は投げないでねという意味
