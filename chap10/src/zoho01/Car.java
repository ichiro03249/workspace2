package zoho01;

public abstract class Car {
	private String name;
	private int price;
	private int fuel;
	public abstract void run();
	public abstract void stop();

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
		if(this.price <= 100000) {
			throw new IllegalArgumentException("100000円以下には設定できません");
		}
		this.price = price;
	}
	public int getFuel() {
		return fuel;
	}
	public void setFuel(int fuel) {
		this.fuel = fuel;
	}


}
