package chap17_02;

import java.io.FileWriter;

public class Main3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		try(FileWriter fw = new FileWriter("data.txt");){
			fw.write("hello!");
			System.out.println("正常です");

		}catch(Exception e) {
			System.out.println("何らかの例外が発生しました");
		}





	}

}
