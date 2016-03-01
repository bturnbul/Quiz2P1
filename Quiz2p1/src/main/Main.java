package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		tuition();
		
	}

public static void tuition(){
	
	Scanner input = new Scanner(System.in);

	System.out.println("initial tuition cost:");
	double InitialTuition = input.nextDouble();
	System.out.println("percentage increase for tuition:");
	double PercentageIncrease  = input.nextDouble();
	System.out.println("Repayment APR:");
	double APR  = input.nextDouble();
	System.out.println("years to repay:");
	double Years  = input.nextDouble();
	
	TotalTuition(InitialTuition,PercentageIncrease);
	}

public static void TotalTuition(double InitialTuition, double PercentageIncrease){
	double totalOwed = InitialTuition*Math.exp(PercentageIncrease*4);
	System.out.println("total cost of tuition will be: $"+totalOwed);
		 
}
	
}