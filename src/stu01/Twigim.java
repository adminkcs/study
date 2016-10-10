package stu01;

public class Twigim implements Menu {

	public static final String NAME = "튀김";
	public static final int PRICE = 2000;
	
	@Override
	public String getNmae() {
		return NAME;
	}

	@Override
	public int getPrice() {
		return PRICE;
	}

}
