package ua.lviv.lgs;

import java.util.UUID;

public class Application {

	public static void main(String[] args) {
		
	Robot r = new Robot();
	
	r.Work();
	
	CoffeRobot cr =new CoffeRobot();
	
	cr.Work();
	
	
	RobotCoocker rc =new RobotCoocker();
	
	rc.Work();
	
	RobotDancer rd  =new RobotDancer();
	
	rd.Work();
		

	Robot[] rmixrobots= mixrobots();
	for (int i = 0; i < 20; i++) {
		rmixrobots[i].Work();
		
	}
	
	
	}
	
	static Robot[] mixrobots() {
		Robot[] robots = new Robot[20];
		for (int i = 0; i < 5; i++) {
			Robot robot = new Robot();
			robots[i]=robot;
			
		}
		
		for (int i = 5; i < 10; i++) {
			Robot robot = new CoffeRobot ();
			robots[i]=robot;
			
		}
		for (int i = 10; i < 15; i++) {
			Robot robot = new RobotCoocker ();
			robots[i]=robot;
			
		}
		for (int i = 15; i < 20; i++) {
			Robot robot = new RobotDancer ();
			robots[i]=robot;
			
		}
		return robots;
	}

}


