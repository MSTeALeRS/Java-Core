package com.lgs.lab.interface1;

public interface Minus  {
	
	
	default void minus(int a, int b ){
		
		
		System.out.println(a + " ������ " +b+ " = " + (a-b) );
	}

}
