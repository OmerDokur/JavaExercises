package javaexercises;

public class c1e05 {
	public static void main(String[] args) {
		//Write a program that displays the result of
	    //(9.5 * 4.5 - 2.5 * 3) / (45.5 - 3.5)
		
		System.out.println("((9.5*4.5)-(2.5*3))/(45.5-3.5)=?");
		
		System.out.println("a= 9.5*4.5");
		float a = (float) (9.5*4.5);
		System.out.println("a=" + a);
		System.out.println("b=2.5*3");
		float b = (float) (2.5*3);
		System.out.println("b=" + b);
		System.out.println("c=45.5-3.5");
		float c = (float) (45.5-3.5);
		System.out.println("c=" + c);
		
		System.out.println("(a-b)/c = " + (a - b ) /c );

	}
}
