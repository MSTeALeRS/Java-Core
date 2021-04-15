package com.lgs.lab.interface1;

public interface Multiply {

	
	
	default void multiply(int a, int b){
		
		
		System.out.println(a + " помножити на " +b+ " = " + a*b );
	}
}
