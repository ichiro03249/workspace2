package chap08_02;

import java.util.Random;// 楽ちんのやり方がある。これがあればRandomから書いて短くできる

public class Cleric {

	String name;
	int hp;
	int mp;
	final int MAX_HP = 50;
	final int MAX_MP = 10;
// int hp = MAX_HP = 50;
//	int mp = MAX_MP = 10;

	public void selfAid() {
		this.mp -= 5;
		this.hp = this.MAX_HP;
		System.out.println("MPを５使った");
		System.out.println("HPがMAXになった");
		//mp-5 = maaxhp.
	}

	public int pray(int sec) {

		int num = new Random().nextInt(3);
		int reMp = num + sec;
		int result = this.mp + reMp;
//		int result2 = this.mp + reMp;
//		int t = Math.min(this.MAX_MP,result2);
		if (result <= 10) {
			System.out.println(this.name + "は、祈ってMP" + this.mp + "に" + reMp + "足されて" + result + "になった！");
			System.out.println("今のMPは、" + result);

		} else if (result >= 11) {
//		this.mp += reMp;
			System.out.println(this.name + "は、祈ってMP" + this.mp + "に" + reMp + "足されて最大MP10になった！");
			System.out.println("今のMPは、10");
		}
		System.out.println(reMp + "ポイント増えて、現在は" + result);
//		return t;
		return result;
		
	}
	//セカンド足す　最大ｍｐを超えない
}
//なるべく修正箇所が少ない方を選ぶ　やり方を身に着ける
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
//
//
//
//
//


