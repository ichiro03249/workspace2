package chap17_02;
import java.io.FileWriter;
import java.io.IOException;
public class Main2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		FileWriter fw = null;
		try {
			fw = new FileWriter("data.txt");
			fw.write("hello!");
			System.out.println("正常です");
		}catch(Exception e) {
			System.out.println("何らかの例外が発生しました");
		}finally {
			if(fw != null) {

				try {

					fw.close();
				}catch(IOException e) {
					;
				}
			}
		}









	}

}
