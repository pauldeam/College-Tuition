package CollegeTuition;
/**
 * Creating a program that finds the total amount of tuition money due, as
 * well as finds the payments needed per month, after graduation, in order
 * to pay off the debt.
 * @param initialTuition, percentInc, APR, yearsPaying, months, monthlyPayments, 
 * futureValue, totalTuition, remaining
 * @return totalTuition, monthlyPayments
 * @author Paul Jureidini
 */

import java.util.Scanner;

import static java.lang.Math.*;

public class collegeTuition {
	
	//initialize variables
	static double initialTuition,
	percentInc, 
	APR, 
	yearsPaying,
	months,
	futureValue,
	remaining,
	increments,
	monthlyPayments,
	totalTuition;

	
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
	
	//this method calculates the total amount of payments due
	public static double total(double initialTuition, double percentInc)
	{
		//calculating the total tuition that needs to be payed
		increments = initialTuition;
		totalTuition = 0;
		for (int i=1; i<=4; i++)
		{

			totalTuition = totalTuition + increments;
			increments = increments + increments * percentInc;
			
		}
		System.out.printf("The total tuition bill is $%.2f", totalTuition);
		System.out.println();

		return totalTuition;
	}
	
	//This method calculates the monthly payments
	public static double paymentCalculations(double totalTuition, double APR, double months )
	{
		//calculating the payment plan using amortization equation
		monthlyPayments = totalTuition*((APR * pow(1+APR, months))/(pow((1+APR),months)-1));
		
		System.out.printf("The monthly payments due each montth are $%.2f", monthlyPayments);
		System.out.println();
		
		return monthlyPayments;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		collegeTuition yo = new collegeTuition();
		yo.variables();
		yo.total(initialTuition, percentInc);
		yo.paymentCalculations(totalTuition, APR, months);
	}

}
