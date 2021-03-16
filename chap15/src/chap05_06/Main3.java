package chap05_06;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main3 {

	public static void main(String[] args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		SimpleDateFormat f = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");

		Date d = f.parse("2020/09/22 01:23:45");
		System.out.println(d);

		Date now = new Date();
		String s = f.format(now);
		System.out.println("現在は" + s + "です");


	}

}
