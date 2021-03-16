package chap16_01;
import java.util.HashMap;
import java.util.Map;

public class Main6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Map<String,Integer> prefs = new HashMap<String,Integer>();
		prefs.put("京都府",255 );
		prefs.put("東京都",1261 );
		prefs.put("熊本県",181 );

		for(String key : prefs.keySet()) {//prefs =京都府
			int value = prefs.get(key);//京都府の値をgetして代入
			System.out.println(key + "の人口は、" + value);
		}

		System.out.println(prefs);










	}

}
