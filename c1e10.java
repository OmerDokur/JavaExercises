package javaexercises;

public class c1e10 {
	public static void main(String[] strings) {
		//Assume a runner runs 14 kilometers in 45 minutes and 30 seconds. 
		//Write a program that displays the average speed in miles per hour. (Note that 1 mile is 1.6 kilometers.)
		double kilometers= 14.0;
		double miles= kilometers/1.6;
		double velocity= (45.5 * 60.0 + 30.0) / (60.0 * 60.0);
		double milesperhour = miles / velocity;
		System.out.println("milesperhour=" + milesperhour);
	
	}

}
