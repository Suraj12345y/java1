package Hyptonuse_triangle;
import java.util.Scanner;

public class Main1 {
	public static void main(String[]args) {
		System.out.println("Enter side1 of a triangle: ");
		System.out.println("Enter side2 of a triangle: ");
	    Scanner sc=new Scanner(System.in);
	    double x=sc.nextDouble();
	    double y=sc.nextDouble();
	    double z=Math.sqrt((x*x)+(y*y));
	    System.out.println("The hypotunuse of a triangle is: "+z);
		
		
	}

}
