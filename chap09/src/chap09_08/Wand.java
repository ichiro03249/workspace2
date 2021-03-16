package chap09_08;

public class Wand {
	//------------------①---------------------------
	//getter setterは必要ない　メンバ指定するだけ
	private String name;
	private double power;

	public String getName() {
		return this.name;
	}
	public double getPower() {
		return this.power;
	}
	public void setName(String name ) {
		if(name.length() < 3) {
			throw new IllegalArgumentException("名前が短すぎる");
		}
		this.name = name;
	}
	public void setPower(double power) {
		if(power < 0.4 && power >100) {
			throw new IllegalArgumentException("増幅率が範囲内ではない");
		}
		this.power = power;
	}



}
//杖と名前は３文字以上
//杖による増幅率は0.5～100以下
//必ず杖を装備する
//HP MPは0以上　ただしHP負の値が入る時は自動的に０になる