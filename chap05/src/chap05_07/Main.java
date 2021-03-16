package chap05_07;

public class Main {
//returnは変数にして渡すという作業。
//それを渡した先で使えるようにできるようにするやつ
//置き換わった後に代入
//キャッチボールにルールがあるみたいな感じ	
	
	public static void main(String[] args) {
		int ans = add(100, 10);
		System.out.println("100+10 = "+ans);
	}
	public static int add(int x, int y) {
		int ans = x + y;
		return ans;
	}


}
