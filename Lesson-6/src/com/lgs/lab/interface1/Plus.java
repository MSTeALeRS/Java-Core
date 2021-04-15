package com.lgs.lab.interface1;

public interface Plus {

	
	default void plus(int a, int b){
		
		
		System.out.println(a + " додати " +b+ " = " + (a+b) );
	}
	
}
