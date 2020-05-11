package com.aamir.annotations;

/*
 * A Basic example of override annotation
 */

class Base{
	
	public void display() {
		System.out.println("Super Class");
	}
}

public class ChildClass extends Base {
	
	@Override
	public void display() {
		System.out.println("Sub Class");
	}
	
	public static void main(String[] args) {
		
		ChildClass obj = new ChildClass();
		obj.display();
	}
}