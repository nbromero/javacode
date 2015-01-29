//Neli Romero
//EG 1305-Spring 2015
//Programming Challenge 15
import java.text.DecimalFormat;

public class PChallenge {
	public static void main(String[] arg) {
		
		//Introducing the variables for the survey
		double total_surveys = 12467;
		double energy = 12467*.14; //the equation for how many customers drink energy drinks
		DecimalFormat one = new DecimalFormat("##.");
		String e = one.format(energy);
		double citrus = energy*.64; //the equation for how many drink citrus flavored energy drinks 
		DecimalFormat flavored  = new DecimalFormat("##");
		String c = flavored.format(citrus);
		
		//The statements for each question of the survey
		System.out.println("There was a toal of " +total_surveys +" surveys given to see how many customers consume energy drinks, "
				+ "and from those to see how many drink citrus flavored.");
		System.out.println("From those surveys the number of customers that drink energy drinks is " +e);
		System.out.println("From the amount that drink energy drinks only " +c +" drink energy drinks that are citrus flavored.");
		
	System.exit(0);
	}
	
	
}