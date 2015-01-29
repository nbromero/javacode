//Neli Romero
//EG 1305-Spring 2015
// Assigment 1

import java.text.DecimalFormat;


public class FirstAssigment {
	public static void main(String[] arg) {
		//Introducing the variables for the radius, the area, and diameter
		int radius=5;
		double a = Math.PI*radius*radius; //the equation for the area of a circle
		double d= radius*2; //the equation for the diameter
		DecimalFormat dd = new DecimalFormat("##.####");
		String output = dd.format(a); 
		
		//The statements for each of the variables
		System.out.println("The circle's radius is 5,the area is " +output);
		System.out.println("The diameter is " +d);
	
		System.exit(0);
	}

}
