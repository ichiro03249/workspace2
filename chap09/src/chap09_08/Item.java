package chap09_08;

public class Item {

	private String name;
	private int price;

	public Item(String name) {//コンストラクタ
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
	public int getPrice() {
		return this.price;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
