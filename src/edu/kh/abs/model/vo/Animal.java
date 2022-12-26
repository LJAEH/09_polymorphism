package edu.kh.abs.model.vo;

public abstract class Animal { 
 // abstract가 붙는 순간, 객체화가 안되는 클래스 (=인스턴스화가 안됨)
 // 단, 타입으로서의 의미는 그대로.. 
 // ex) 고양이는 동물이라는 타입일뿐 객체로 동물인건 아님
	
	public abstract void eat(); // 추상메서드
	// 먹기(eat)라는 메서드는 있지만, 어떻게 동작할지 정의하지 않아야 함
	// + 추상메서드가 있다면, 추상클래스여야 함.
	public abstract void cry();
	public abstract void move();

}
