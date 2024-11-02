package mod4;

import java.util.Scanner;

public class LoopingConstruct {
	
	public static void main(String[] args)	{
		Scanner scnr = new Scanner(System.in);
			double total = 0.0;
			double max = Double.MIN_VALUE;
			double min = Double.MAX_VALUE;
			double interest = 0.20;
			double totInterest;
			int count = 0;
			
		while (count < 5)	{
			count = count + 1;
			
			System.out.println("Enter value as a decimal (example, 40.00): ");
			double value = scnr.nextDouble();
			
			total = total + value;
			
		if (value > max)	{
			max = value;	
		}
		
		else if (value < min)	{
			min = value;
		}
		
		}
		
		totInterest = total * interest;
		
		System.out.println();
		System.out.println("Total: " + total);
		System.out.println("Average: " + (total / 5));
		System.out.println("Maximum: " + max);
		System.out.println("Minimum: " + min);
		System.out.println("Total with Interest at 20%: " + totInterest);
		scnr.close();
			
	}

}
