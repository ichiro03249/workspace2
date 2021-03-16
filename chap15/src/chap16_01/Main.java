package chap16_01;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<Integer> points = new ArrayList<Integer>();
		points.add(10);
		points.add(80);
		points.add(75);
		points.set(1,1000);//1番目に上書きしている
		points.add(0,500000000);//0番目に挿入してる
		for(int i :points) {
		System.out.println(i);
		}

	}

}
