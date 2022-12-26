package edu.kh.abs.model.service;

import edu.kh.abs.model.vo.Animal;
import edu.kh.abs.model.vo.Cat;
import edu.kh.abs.model.vo.Chicken;
import edu.kh.abs.model.vo.Dog;
import edu.kh.abs.model.vo.Eagle;
import edu.kh.abs.model.vo.Penguin;
import edu.kh.abs.model.vo.Shark;
import edu.kh.abs.model.vo.TypeBirds;
import edu.kh.abs.model.vo.TypeMammalia;
import edu.kh.abs.model.vo.TypePisces;
import edu.kh.abs.model.vo.Whale;

public class AbstractService {
	// Chicken
	// Eagle
	// Penguin
	// Shark
	// Whale
	
	// TypeBirds
	// TypeMammalia
	// TypePisces
	
	public void ex1() {
		Cat cat = new Cat();
		Dog dog = new Dog();
		Whale whale = new Whale();
		
		Chicken chicken = new Chicken();
		Penguin penguin = new Penguin();
		Eagle eagle = new Eagle();
		
		Shark shark = new Shark();
		
		cat.eat();
		cat.cry();
		cat.move();
		
		dog.eat();
		dog.cry();
		dog.move();
		
		// Animal animal = new Animal(); 
		// <= 애니멀은 인스턴스화가 안됨
		// 추상클래스는 객체로 만들 수 있디만, 타입으로서의 역할은 한다.
		
		TypeMammalia[] mammalia = new TypeMammalia[] {cat, dog, whale};
		
		TypeBirds[] birds = new TypeBirds[] {chicken, eagle, penguin};
		
		TypePisces[] pisces = new TypePisces[] { shark };
		
		Animal[] animal = new Animal[] {
				cat, dog, whale,
				chicken, eagle, penguin,
				shark,
				//mammlia[0]
				//bird[2]
		};
		
		for(int i = 0; i<animal.length; i++) {
			animal[i].cry();
			animal[i].eat();
			animal[i].move();
			
			//만약 animal 중에 타입이 고양이 일때
			//수유를 한다는 !breastFeed() 출력
			if(animal[i] instanceof Cat) {
				System.out.println("고양이는 이래");
				
				((Cat)animal[i]).breastFeed();
				// animal에는 breastFeed가 없어서 접근불가능
				// 강제형변환에의한 다운캐스팅으로 접근가능하게만들어준다
				// Cat 클래스에서 오버라이딩으로 재정의된 내용이 출력된다.
			}
			
			if(animal[i] instanceof Eagle) {
				System.out.println("독수리는");
				((Eagle)animal[i]).fly();
				
			}
			
			if(animal[i] instanceof Shark) {
				System.out.println("상어는");
				Shark sk = (Shark)animal[i];
				sk.swimming();
			}
			
			
		}
		
	}

}
