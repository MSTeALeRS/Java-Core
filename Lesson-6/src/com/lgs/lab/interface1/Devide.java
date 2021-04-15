package com.lgs.lab.interface1;

public interface Devide {
 
	
 default void devide(int a, int b){
		
		
		System.out.println(a + " поділити на " +b+ " = " + a/b );
	}
}
