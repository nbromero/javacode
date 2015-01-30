import java.util.Scanner;

import javax.swing.JOptionPane;

//Neli Romero
//EG 1305-Spring 2015
// Program 2

public class ComputerBMI {
	public static void main(String[] arg) {
		//The scanning functions to remember weight and height 
		String input = JOptionPane.showInputDialog("What is you weight in pounds?");
		double weight = Double.parseDouble(input);
		input = JOptionPane.showInputDialog("What is your height is inches?");
		double height = Double.parseDouble(input);
		//The variables needed to determine the Body Mass Index
		double kilo = .45359237 * weight; //how 
		double meters = .0254 * height;
		double bmi = kilo / (meters * meters) ;
		
		JOptionPane.showMessageDialog(null, "Your Body Mass Index is " +bmi); //Your end result for your BMI 
		System.exit(0);	

	}
}
