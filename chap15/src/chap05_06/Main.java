package chap05_06;

// TODO 自動生成されたメソッド・スタブ
//		long start = System.currentTimeMillis();
//		StringBuilder sb = new StringBuilder();
//		for(int i = 0; i < 10000; i++) {
//			sb.append("Java");
//		}
//		String s = sb.toString();
//
//		long end = System.currentTimeMillis();
//		long end1 = end -start;
//
//
//		System.out.println("処理にかかった時間は・・・" + (end1) + "ミリ秒でした");
//
//		start = System.currentTimeMillis();
//
//		s  = "Java";
//		for(int i = 0; i < 10000; i++) {
//			s = s+"Java";
//		}
//		end = System.currentTimeMillis();
//		long end2 = end -start;
//		System.out.println("処理にかかった時間は・・・" + (end2) + "ミリ秒でした");
//		System.out.println("+演算子にかかった時間はStringBuilderで処理にかかった時間の・・・\n"
//		+ (end2/end1) + "倍でした");
//
//		System.out.println(end);
//
//		Date d = new Date(1614818215101L);
//		System.out.println(d);
//		System.out.println();



//
//
//	}
//
//}

//----------------------------------3/4 若菜さん-------------------------------------
//
//p578
//日付と時刻を扱う
//System.currentTimeMillis();

//p580
//import java.util.Date;
//Date d = new Date();
//
//
//Date now = new Date();
//System.out.println(now);
//System.out.println(now.getTime());
//
//Date past = new Date(1600705425827L);
//System.out.println(past);
//past.setTime(1220705425827L);
//System.out.println(past);
//↓
//Thu Mar 04 09:43:28 JST 2021
//1614818608256
//Tue Sep 22 01:23:45 JST 2020
//Sat Sep 06 21:50:25 JST 2008

//p581
//人間が指定しやすい形式　６つのint
//機械が扱いやすい　long型　Date型
//人間が扱いやすい　６つのint
//
//p582
//Calendarクラスの利用
//
//Calendar c = Calendar.getInstance();//staticなのでnewする必要はない。
//でもimportしてgetInstance()!!

//パターン①　指定するやり方
//c.set(2019,8,22,1,23,45);//月だけは0から始まるから+1
//c.set(Calendar.MONTH, 9);//月だけは0から始まるから+1
//Date d = c.getTime();
//System.out.println(d);
//
////パターン②　今の日時を取得する方法
//Date now = new Date();
//c.setTime(now);
//System.out.println("今は" + now);
//
//int y = c.get(Calendar.YEAR);
//System.out.println("今年は" + y + "年です");

//p584
//simpleDateFormat
//文字列型の日時を取得する
//①Date d = f.parse("2020/09/22 01:23:45");
//System.out.println(d);
//②Date now = new Date();
//String s = f.format(now);
//System.out.println("現在は" + s + "です");
//２つの方法がある
//
//
//
//
//SimpleDateFormat f = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");

//Date d = f.parse("2020/09/22 01:23:45");
//System.out.println(d);
//
//Date now = new Date();
//String s = f.format(now);
//System.out.println("現在は" + s + "です");
//
//p586
//long型とDate型の関係の図があるから見とく！！
//
//p587
//Date Calendarの代表な問題
//①使い方が紛らわしいAPIがある
//②並列処理で用いるとインスタンスの内容が壊れることがある
//
//p589
//java.timeパッケージ
//
//同じ瞬間の判定だとisEqual()を使う
//time APIの多くはnewが禁止されている。静的メソッドのnow(),of()を使ってインスタンスを生成する
//
//
//import java.time.*
//をしてもファイルを保存しても使ってるものだけのimportｎ記述に変えてくれる
//
//p593
//曖昧な日時の必要性
//ZonedDateTime LocalDateTime
//通常はLocalの方をよく使う
//
//p594
//	//LocalDateTimeの生成方法
//LocalDateTime l1 = LocalDateTime.now();//今
//LocalDateTime l2 = LocalDateTime.of(2020,1,1,9,5,0,0);//時間指定
//
////LocalDateTimeとZonedDateTimeの相互変換
//ZonedDateTime z1 = l2.atZone(ZoneId.of("Europe/London"));
//LocalDateTime l3 = z1.toLocalDateTime();
//System.out.println(l1);
//
////InstantとZonedDateTimeの相互変換
//Instant i1 = z1.toInstant();
//ZonedDateTime z2 = i1.atZone(ZoneId.of("Asia/Tokyo"));
//ZonedDateTime z3 = l2.atZone(ZoneId.of("Asia/Tokyo"));
//
////LocalDateTimeからZonedDateTimeに変換（ロンドン時間）
//System.out.println(z1);
////ZonedDateTimeからZonedDateTimでロンドン時間から東京時間に
//System.out.println(z2);
////LocalDateTimeからZonedDateTimに変換（東京時間）
//System.out.println(z3);
////ZonedDateTimからLocalDateTimeに変換（タイムゾーン削除）
//System.out.println(l3);
//
//
//ZonedDateTimとLocalDateTimeの変換はタイムゾーンをつけるかつけないかの違いでしかない
//
//p595
//その他の日時を表わすクラス
//格納するしないの表があってわかりやすいから見といた方がいいよ
//
//p596
//特定日時を指し示すクラスで共通利用されるメソッド
//見といた方がいいね！
//インスタンスを生成する静的メソッド一覧とかあるからわかりやすいかも！
//

//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//	// TODO 自動生成されたメソッド・スタブ
//文字列からLocalDateを生成

//DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyy/MM/dd");
//LocalDate ldate = LocalDate.parse("2020/09/22",fmt);
//System.out.println(ldate + "は、自分が指定した日です");
//
////1000日後を計算する
//LocalDate ldatep = ldate.plusDays(1000);
//System.out.println(ldatep + "は、自分が指定した日に1000日を足したものです");
//String str = ldatep.format(fmt);
////System.out.println(fmt);
//System.out.println("1000日後は" + str);
//
////現在日付との比較
//LocalDate now = LocalDate.now();
//if(now.isAfter(ldatep)) {//nowは1000日後と比較したときに過去のものになったらtrueを返しますよ
//	System.out.println("1000日後は過去日付です");
//}

//p597
//時間や期間を表わすクラス
//
//import java.time.LocalDate;
//import java.time.Period;
//
//	// TODO 自動生成されたメソッド・スタブ
//LocalDate d1 = LocalDate.of(2020,1,1);
//LocalDate d2 = LocalDate.of(2020,1,4);
//
////3日間を表わすPeriodを２通りの方法で生成
//Period p1 = Period.ofDays(3);//3日足すという意味
//Period p2 = Period.between(d1, d2);//引数の差と同じ数
//
////d2のさらに３日後を計算する
//LocalDate d3 = d2.plus(p2);
//
//System.out.println(d3);//2020-01-07
//System.out.println(p2);//p3D
//System.out.println(p1);//p3D
//System.out.println(d1);//1/1
//System.out.println(d2);//1/4

//APIリファレンスを見て勉強して
//




//----------------------------3/5 若菜さん--------------------------------------------
//テストは第二部
//7章～１３章（１４章も微妙に入るかも？）
//
//
//
//

