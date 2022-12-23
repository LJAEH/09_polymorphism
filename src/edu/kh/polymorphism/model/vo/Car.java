package edu.kh.polymorphism.model.vo;

public class Car {
	
	private String engine;
	private String fuel; 
	private int wheel;

	public Car() { // 기본생성자
		super(); // 부모생성자(Object)
		// 안적어도 컴파일러가 자동으로 만들어줌
	}

	// alt shift s => o => enter 매개변수 생성자 자동완성
	public Car(String engine, String fuel, int wheel) {
		this.engine = engine;
		this.fuel = fuel;
		this.wheel = wheel;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
	
	@Override // 오버라이드 했다는걸 알려주는 Override 어노테이션
	public String toString() {
		return engine + " / " + fuel + " / " + wheel;
	// 엔진 / 연료 / 바퀴갯수
	}
	
	
}
