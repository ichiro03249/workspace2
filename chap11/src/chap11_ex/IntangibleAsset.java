package chap11_ex;

public class IntangibleAsset extends Asset {
	String patent;

	public IntangibleAsset(String name, int price, String patent) {
		super(name, price);
		this.patent = patent;
	}
	public String getPatent() {
		return patent;
	}
	public void setPatent(String patent) {
		this.patent = patent;
	}




}
