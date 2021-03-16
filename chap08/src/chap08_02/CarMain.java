package chap08_02;

public class CarMain {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

			Car c = new Car();
			c.fuel = 5;
			c.speed = 30;

			c.run(1);
			int dist = c.run(3);
			System.out.println(dist + "km走りました");
			c.accelarate(15);
			c.showMeter();
			c.stop();

	}

}
//OSって　もっとも基本的なソフトウェア　システム全体を管理する
//windowsやmacosはどっちもOS.
//パブリックDNSは　アクセスの受付窓口
//Nginxも受付窓口ウェブサーバーのこと　Webサーバーのシェアは、NginxはApacheに次いで第2位です。
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
