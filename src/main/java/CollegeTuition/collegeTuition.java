package CollegeTuition;

import java.util.Scanner;

import static java.lang.Math.*;

public class collegeTuition {
	
	double initialTuition, 
	percentInc, 
	APR, 
	yearsPaying,
	months,
	monthlyPayments, 
	futureValue,
	totalTuition,
	remaining;
	
	Scanner scan = new Scanner(System.in);
	
	public void variables()
	{
		System.out.println("Please enter the initial tuition cost: ");
		initialTuition = scan.nextInt();
		
		System.out.println("Please enter the percent increase in tuition in percentage form"
				+ "(ex: 10 for 10%): ");
		percentInc = scan.nextInt();
		percentInc = percentInc/100;
		
		System.out.println("Please enter the APR (annual percentage rate) for your student loan"
				+ "in percentage form as done above: ");
		APR = scan.nextInt();
		APR = APR/100;
		
		System.out.println("Please enter how many years you plan on paying off your loans: ");
		yearsPaying = scan.nextInt();
		months = yearsPaying*12; //months in a year
	}
	
	public void total()
	{
		//calculating the total tuition that needs to be payed
		double increments = initialTuition;
		totalTuition = 0;
		for (int i=1; i<=4; i++)
		{
//			System.out.println(increments);
			totalTuition = totalTuition + increments;
			increments = increments + increments * percentInc;
			
		}
		System.out.printf("The total tuition bill is $%.2f", totalTuition);
		System.out.println();
	}
	
	public void paymentCalculations()
	{
		//calculating the payment plan
		monthlyPayments = totalTuition*((APR * pow(1+APR, months))/(pow((1+APR),months)-1));
		
		System.out.printf("The monthly payments due each montth are $%.2f", monthlyPayments);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		collegeTuition yo = new collegeTuition();
		yo.variables();
		yo.total();
		yo.paymentCalculations();
	}

}
