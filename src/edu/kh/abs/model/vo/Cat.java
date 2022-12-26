package edu.kh.abs.model.vo;

public class Cat extends TypeMammalia{

	@Override
	public void eat() {
		System.out.println("고양식사");
	}

	@Override
	public void cry() {
		System.out.println("고양하울링");
	}

	@Override
	public void move() {
		System.out.println("전광석화");
	}

	@Override
	public void breastFeed() {
		// TODO Auto-generated method stub
		System.out.println("고양수유");
	}
	

}
