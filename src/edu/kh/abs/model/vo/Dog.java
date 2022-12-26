package edu.kh.abs.model.vo;

public class Dog extends TypeMammalia {
	public void eat() {
		System.out.println("강쥐 밥먹");
	}
	
	public void cry() {
		System.out.println("강쥐하울링");
	}
	public void move() {
		System.out.println("강쥐무브");
	}

	@Override
	public void breastFeed() {
		// TODO Auto-generated method stub
		System.out.println("강쥐수유");
	}

}
