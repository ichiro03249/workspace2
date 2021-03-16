package chap15_01;

public class Main6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String s = "abc,def:ghi";
		String[] words = s.split("[,:]");
		for(String w : words) {
			System.out.println(w + "->");
		}

		String r = "今日は３月３日ひな祭り";
		String[] array = r.split("日");
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
//		System.out.println(array[3]);

		String k = "abc,def:ghi";
		String w = s.replaceAll("[beh]","X");//文字列の置換ができるbとeとhのうちのどれかに当てはまったらXに変える
		System.out.println(w);

		String y = "123.456";
		System.out.println(y.replace(".",",")); //123,456　.を文字だと認識するの
		System.out.println(y.replaceAll(".",","));//,,,,,,, Allの方は正規表現が使えるので全部を.に置換する










	}

}
