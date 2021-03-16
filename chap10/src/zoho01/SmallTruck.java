package zoho01;

public class SmallTruck extends Truck{
	public void run() {
		System.out.println("普通に走ります");
	}
	public void stop(){
		System.out.println("普通に停まります");
	}
	public void stack() {
		System.out.println("荷物をやや積みます");
	}
}
