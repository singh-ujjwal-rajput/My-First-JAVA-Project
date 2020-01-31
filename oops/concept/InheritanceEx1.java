package com.oops.concept;
class Animal{
	void eat()
	{
		System.out.println("Eating.....");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("Barking...");
	}
}
class BabyDog extends Dog{
	void play()
	{
		System.out.println("Baby Dog Playing..");
	}
}
public class InheritanceEx1 {
	public static void main(String[] args) {
		BabyDog baby = new BabyDog();
		baby.eat();
		baby.bark();
		baby.play();

	}

}
