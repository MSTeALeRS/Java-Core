package com.lgs.lab.interface1;

public interface Multiply {

	
	
	default void multiply(int a, int b){
		
		
		System.out.println(a + " ��������� �� " +b+ " = " + a*b );
	}
}
