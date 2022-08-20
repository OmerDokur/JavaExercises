package javaexercises;

public class c1e11 {
	public static void main(String[] strings) {
		//The U.S. Census Bureau projects population based on the following assumptions:
		//■ One birth every 7 seconds
		//■ One death every 13 seconds
		//■ One new immigrant every 45 seconds
		//Write a program to display the population for each of the next five years.
		//Assume the current population is 312,032,486 and one year has 365 days.
		    double birthrateinseconds = 7.0;
	        double deathrateinseconds = 13.0;
	        double newimmigrantinseconds = 45.0;



	        double currentpopulation = 312032486;

	        double secondsinyears = 60 * 60 * 24 * 365;

	        double numbirths = secondsinyears / birthrateinseconds;
	        double numdeaths = secondsinyears / deathrateinseconds;
	        double numimmigrants = secondsinyears / newimmigrantinseconds;

	        for (int i = 1; i <= 5; i++) {
	            currentpopulation += numbirths + numimmigrants - numdeaths;
	            System.out.println("Year " + i + " = " + (int)currentpopulation);
	        }
	}
}
	

