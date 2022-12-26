package edu.kh.abs.model.vo;

public class Shark extends TypePisces implements WaterLife {

	@Override
	public void swimming() {
		// TODO Auto-generated method stub
		System.out.println("물고기헤엄");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("물고기먹기");
	}

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("물고기외침");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("물고기무브");
	}

	@Override
	public void water() {
		// TODO Auto-generated method stub
		System.out.println("상어는물에살아");
		
	}

}
