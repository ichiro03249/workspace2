package chap05_06;
import java.util.Calendar;
import java.util.Date;

public class Main2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		Date now = new Date();
//		System.out.println(now);
//		System.out.println(now.getTime());
//
//		Date past = new Date(1600705425827L);
//		System.out.println(past);
//		past.setTime(1220705425827L);
//		System.out.println(past);

		Calendar c = Calendar.getInstance();//staticなのでnewする必要はない。
		//でもimportしてgetInstance()!!

		//パターン①　指定するやり方
		c.set(2019,8,22,1,23,45);//月だけは0から始まるから+1
		c.set(Calendar.MONTH, 9);//月だけは0から始まるから+1
		Date d = c.getTime();
		System.out.println(d);

		//パターン②　今の日時を取得する方法
		Date now = new Date();
		c.setTime(now);
		System.out.println("今は" + now);

		int y = c.get(Calendar.YEAR);
		System.out.println("今年は" + y + "年です");






	}

}
