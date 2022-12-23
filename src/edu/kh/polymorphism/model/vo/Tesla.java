package edu.kh.polymorphism.model.vo;

public class Tesla extends Car{
	// Car를 상속받을 수 있도록 => extends Car(부모)
	
	private int batteryCapacity; // 배터리 용량
	
	
	// 기본생성자 ctrl + space + enter
	public Tesla() {
		// TODO Auto-generated constructor stub
		super(); // Car
	}

	// 매개변수생성자 alt + shift + s => o 드롭박수 => 매개변수
	public Tesla(String engine, String fuel, int wheel, int batteryCapacity) {
		super(engine, fuel, wheel);
		this.batteryCapacity = batteryCapacity;
	}
	
	// getter/setter alt + shift + s + r
	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	
	// Car.toString()의 오버라이딩
	@Override
	public String toString() {
		return super.toString() + " / " + batteryCapacity;
			// super. = super참조변수
	}
	
	
}
