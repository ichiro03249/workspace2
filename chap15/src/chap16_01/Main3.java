package chap16_01;
import java.util.HashSet;
import java.util.Set;


public class Main3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		Set<String> colors = new HashSet<String>();
//		colors.add("赤");
//		colors.add("青");
//		colors.add("黄");
//		colors.add("赤");//重複しているから無視された笑
//		System.out.println("色は" + colors.size() + "種類");
//		System.out.println(colors);

		Set<String> colors = new HashSet<String>();
		colors.add("赤");
		colors.add("青");
		colors.add("黄");

		for(String s : colors) {
			System.out.print(s + "→");
		}
			System.out.println("\n" + colors);




	}

}
