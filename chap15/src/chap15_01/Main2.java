package chap15_01;

public class Main2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String s1 = "Java and Javascript";

		if(s1.contains("Java")) {
			System.out.println("文字列s1は文字列を含んでいます");
		}
		if(s1.endsWith("Java")) {
			System.out.println("文字列s1はJavaが末尾にあります");
		}
		System.out.println("文字列s１で最初にJavaが登場する位置は" + s1.indexOf("Java"));


		System.out.println("文字列s1で最後にJavaが登場するの位置は" + s1.lastIndexOf("Java"));


		System.out.println(s1.length());


		System.out.println(s1.contains("Java"));//true
		System.out.println(s1.startsWith("and"));//false
		System.out.println(s1.startsWith("J"));//true
		System.out.println(s1.indexOf("J"));//0と表示
		System.out.println(s1.indexOf('j'));//-1と表示
		System.out.println(s1.indexOf(74));//０と表示　Jを数字でchar型で言うと74番



	}

}
