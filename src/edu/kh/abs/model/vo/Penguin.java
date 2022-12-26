package edu.kh.abs.model.vo;

public class Penguin extends TypeBirds implements WaterLife {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("펭귄냠");
	}

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("펭귄울음");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("펭귄슬라이딩");
	}

	@Override
	public void water() {
		// TODO Auto-generated method stub
		System.out.println("펭귄은다좋아");
	}

}
