package chap16_01;
import java.util.Set;
import java.util.TreeSet;

public class Main4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Set<String> words = new TreeSet<String>();
		words.add("dog");
		words.add("cat");
		words.add("wolf");
		words.add("panda");
		for(String s : words) {
			System.out.print(s + "→");
		}

		System.out.println("\n" +  words);

	}

}
