package com.giacomini.andrea.OCA.MethodsAndEncapsulation.ApplyingAccessModifiers.Examples.pond.goose;

import com.giacomini.andrea.OCA.MethodsAndEncapsulation.ApplyingAccessModifiers.Examples.pond.duck.DuckTeacher;

public class LostDuckling {

	public void swim(){
		
		DuckTeacher teacher = new DuckTeacher();
		teacher.swim();										// accesso ad un membro PUBLIC permesso, anche se in package diversi
		System.out.println("Thanks " + teacher.name);		// accesso ad un membro PUBLIC permesso, anche se in package diversi
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
