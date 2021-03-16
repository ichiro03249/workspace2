package chap11_ex;

public abstract class Asset {
//たんじぶらせっとから渡した方がいいフィールドメソッドを考える
	String name;
	int price;


	public Asset(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}


}
