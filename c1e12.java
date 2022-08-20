package javaexercises;

public class c1e12 {
	public static void main(String[] strings) {
	//Assume a runner runs 24 miles in 1 hour, 40  minutes, and 35 seconds.
	//Write a program that displays the average speed in kilometers per hour. (Note that 1 mile is 1.6 kilometers.)
		double hours = 1;
        double minutes = 40;
        double seconds = 35;
        double miles = 24;
        double kilometers= miles*1.6;
        System.out.println("kilometers=" + kilometers);
        double timeinminutes = ((hours*60*60)+ (minutes*60)+seconds)/(60*60);
        System.out.println("timeinminutes=" + timeinminutes);
        double valocity = (kilometers/timeinminutes);
        System.out.println("valocity="+ valocity);
   
	}
}
