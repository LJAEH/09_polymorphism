package edu.kh.abs.model.vo;

public class Whale extends TypeMammalia implements WaterLife  {

	@Override
	public void breastFeed() {
		// TODO Auto-generated method stub
		System.out.println("고래도수유함");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("고래사냥");
	}

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("고래초음파");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("고래무브");
	}

	@Override
	public void water() {
		System.out.println("고래는 물속에");
		// TODO Auto-generated method stub
		
	}

}
