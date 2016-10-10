package stu01;

public class Kimbob implements Menu {
	public static final String NAME = "김밥";
	public static final int PRICE = 3000;
	
	
	@Override
	public String getNmae() {
		return NAME;
	}

	@Override
	public int getPrice() {
		return PRICE;
	}

}
