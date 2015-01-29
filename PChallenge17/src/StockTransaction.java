//Neli Romero
//EG 1305-Spring 2015
//Programming Challenge 17

import java.text.DecimalFormat;

public class StockTransaction {
	public static void main(String[] arg) {
		
		//Introducing the variables for the first time Joe buys stock
		final double COMMISSION_RATE = 0.02; //the constant variable for the commission
		int purchased = 1000;
		double paid = 32.87;
		double first_total = paid*purchased; //the total he paid for the stocks
		DecimalFormat a = new DecimalFormat("##.##");
		String ft = a.format(first_total);
		double first_commission = first_total*COMMISSION_RATE; //how much he paid the stockbroker
		DecimalFormat b = new DecimalFormat("##.##");
		String fc = b.format(first_commission);
		
		//Introducing the variables for when Joe sold his stock
		int sold = 1000;
		double sold_for = 33.92;
		double profit = sold * sold_for; //total he gained from selling the stock
		double second_commission = profit*COMMISSION_RATE; //how much he paid the stockbroker again
		DecimalFormat c = new DecimalFormat("##.##");
		String sc = c.format(second_commission);
		double lost_commission = first_commission + second_commission; //the lost in commission
		double gained = profit - lost_commission; //the profit he gained minus the commission
		DecimalFormat f = new DecimalFormat("##.##");
		String g = f.format(gained);
		
		//the statements of Joe buying and paying the commission
		System.out.println("Last month Joe purchased " +purchased +" stocks for $" +paid +" each.");
		System.out.println("He paid a total of $" +ft +" and gave a commission of $" +fc +" to his stockbroker.");
		
		//the statements of Joe selling, paying the commission, and how much he gained
		System.out.println("Two weeks later, Joe sold his " +sold +" stocks for $" +sold_for +" each.");
		System.out.println("Once again, he paid his stockbroker a profit this time he paid him $" +sc);
		System.out.println("The amount of profit that Joe made after selling his stock and paying his stockbroker was $" +g);

		System.exit(0);		
}
} 