package edu.kh.polymorphism.model.vo;

public class Spark extends Car{
	
	private double discountOffer;
	
	//기본생성자
	
	public Spark() {
		// TODO Auto-generated constructor stub
	}

	public Spark(String engine, String fuel, int wheel, double discountOffer) {
		super(engine, fuel, wheel);
		this.discountOffer = discountOffer;
	}

	public double getDiscountOffer() {
		return discountOffer;
	}

	public void setDiscountOffer(double discountOffer) {
		this.discountOffer = discountOffer;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + " / " + discountOffer;
	}
	

}
