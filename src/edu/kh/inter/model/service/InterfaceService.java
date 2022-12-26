package edu.kh.inter.model.service;

import edu.kh.abs.model.vo.Cat;
import edu.kh.abs.model.vo.Chicken;
import edu.kh.abs.model.vo.Dog;
import edu.kh.abs.model.vo.Eagle;
import edu.kh.abs.model.vo.Penguin;
import edu.kh.abs.model.vo.Shark;
import edu.kh.abs.model.vo.WaterLife;
import edu.kh.abs.model.vo.Whale;

public class InterfaceService {
	
	public void ex1() {
		Cat cat = new Cat();
		Dog dog = new Dog();
		Whale whale = new Whale();
		
		Chicken chicken = new Chicken();
		Penguin penguin = new Penguin();
		Eagle eagle = new Eagle();
		
		Shark shark = new Shark();
		
		WaterLife[] waterLife = new WaterLife[] {
				(WaterLife)whale, penguin, shark
		};
		
		for(int i = 0; i<waterLife.length; i++) {
			waterLife[i].water();
			
			// 관계가 전혀 없는 것들의 관계를 만들어주는게 인터페이스
			// 고래, 펭귄, 상어를 묶어줄 수 있는 이유가
			// WaterLife라는 인터페이스가 있기 때문이다.
		}
		
	}
	
	

}
