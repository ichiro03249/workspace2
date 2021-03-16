package chap05_06;
import java.time.LocalDate;
import java.time.Period;
public class Main7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		LocalDate d1 = LocalDate.of(2020,1,1);
		LocalDate d2 = LocalDate.of(2020,1,4);

		//3日間を表わすPeriodを２通りの方法で生成
		Period p1 = Period.ofDays(3);//3日足すという意味
		Period p2 = Period.between(d1, d2);//引数の差と同じ数

		//d2のさらに３日後を計算する
		LocalDate d3 = d2.plus(p2);

		System.out.println(d3);//2020-01-07
		System.out.println(p2);//p3D
		System.out.println(p1);//p3D
		System.out.println(d1);//1/1
		System.out.println(d2);//1/4




	}

}
