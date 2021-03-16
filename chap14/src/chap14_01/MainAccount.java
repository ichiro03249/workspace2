package chap14_01;

public class MainAccount {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Account a = new Account();
		a.accountNumber = "4649";
		a.balance = 1592;

		System.out.println(a);

		Account a2 = new Account();
		a2.accountNumber = " 4649";
		a2.balance = 2525;




		if(a.equals(a2) == true) {//ここの内容をAccountクラスの方でやってたんだeqaulas
			System.out.println("同じ内容です");
		}else {
			System.out.println("違う内容です");
		}
	}

}
