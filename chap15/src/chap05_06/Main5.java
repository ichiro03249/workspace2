package chap05_06;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//LocalDateTimeの生成方法
		LocalDateTime l1 = LocalDateTime.now();//今
		LocalDateTime l2 = LocalDateTime.of(2020,1,1,9,5,0,0);//時間指定

		//LocalDateTimeとZonedDateTimeの相互変換
		ZonedDateTime z1 = l2.atZone(ZoneId.of("Europe/London"));
		LocalDateTime l3 = z1.toLocalDateTime();
		System.out.println(l1);

		//InstantとZonedDateTimeの相互変換
		Instant i1 = z1.toInstant();
		ZonedDateTime z2 = i1.atZone(ZoneId.of("Asia/Tokyo"));
		ZonedDateTime z3 = l2.atZone(ZoneId.of("Asia/Tokyo"));

		//LocalDateTimeからZonedDateTimeに変換（ロンドン時間）
		System.out.println(z1);
		//ZonedDateTimeからZonedDateTimでロンドン時間から東京時間に
		System.out.println(z2);
		//LocalDateTimeからZonedDateTimに変換（東京時間）
		System.out.println(z3);
		//ZonedDateTimからLocalDateTimeに変換（タイムゾーン削除）
		System.out.println(l3);

	}

}
