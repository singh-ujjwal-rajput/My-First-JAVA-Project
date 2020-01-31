package com.oops.concept;
class Parent{
	int i=10;
	void p1()
	{
		System.out.println("Parent Method");
	}
}
class Child extends Parent{
	int i =18;
	void child()
	{
		System.out.println("Child Method");
	}
}
public class InheritanceEx2 {
	public static void main(String[] args) {
		Child child = new Child();
		child.p1();
		child.child();
		System.out.println(child.i);
		
		Parent p = new Parent();
		p.p1();
		//p.child();
		
		Parent p1 = new Child();
		p1.p1();
		//p1.child();
		
		//Child ch1 = new Parent();
	}
}
