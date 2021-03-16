package chap16_01;
import java.util.ArrayList;
import java.util.Iterator;

public class Main2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		ArrayList<String> names = new ArrayList<String>();
		names.add("湊");
		names.add("朝香");
		names.add("菅原");

		Iterator<String> it = names.iterator();//この時矢印は０番目の前になっている
		while(it.hasNext()) {//矢印の次がある限りループするよ
			String e = it.next();
			System.out.println(e);
		}
		System.out.println(names);

//		↓
//		湊
//		朝香
//		菅原
//		[湊, 朝香, 菅原]　このカンマのとこに矢印があるイメージ


	}

}
