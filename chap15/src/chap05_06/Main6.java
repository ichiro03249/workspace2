package chap05_06;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Main6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//文字列からLocalDateを生成

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyy/MM/dd");
		LocalDate ldate = LocalDate.parse("2020/09/22",fmt);
		System.out.println(ldate + "は、自分が指定した日です");

		//1000日後を計算する
		LocalDate ldatep = ldate.plusDays(1000);
		System.out.println(ldatep + "は、自分が指定した日に1000日を足したものです");
		String str = ldatep.format(fmt);
//		System.out.println(fmt);
		System.out.println("1000日後は" + str);

		//現在日付との比較
		LocalDate now = LocalDate.now();
		if(now.isAfter(ldatep)) {
			System.out.println("1000日後は過去日付です");
		}






	}

}
