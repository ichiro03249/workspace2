package chap08_02;

public class Car {
	int fuel;
	int speed;

	public void accelarate(int acceleration) {
		int r = this.speed + acceleration;
		//this.speed += acceleration;
		System.out.println("現在の時速は" + r);
	}
	public int run(int hour) {
		int allFuel = hour * this.fuel;//走った距離数分の燃料
		int allDistance = allFuel * this.speed;
		
		//int dist = speed * hour;
		//this.fuel -= dist;
		// return dist;
		return allDistance;
	}
	public void stop() {
		this.speed = 0;
		System.out.println("停止しました");
	}
	public void showMeter() {
		System.out.println("現在の燃料は、" + this.fuel + "。　現在の時速は" + this.speed);
	}



}
//燃料　時速　走行距離