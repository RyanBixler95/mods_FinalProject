package mod5;

import java.util.Scanner;

public class GetMonthlyTemperatures {
	public static void main(String[] args)	{
		Scanner scnr = new Scanner(System.in);
		final int NUM_MONTHS = 12;
		String[] monthsInYear = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		double[] monthAvgTemp = {23.5, 32.4, 52.3, 67.7, 82.4, 96.5, 101.2, 80.4, 68.3, 52.1, 42.2, 29.5};
		int i;
		
		System.out.print("Enter a month to view (or 'year' for yearly overview): ");
		String input = scnr.next();
		
		if (input.equalsIgnoreCase("year"))	{
			double totalTemp = 0;
			double highestTemp = Double.MIN_VALUE;
			double lowestTemp = Double.MAX_VALUE;
			String highestMonth = "";
			String lowestMonth = "";
			
			for (i = 0; i < NUM_MONTHS; ++i)	{
				System.out.println(monthsInYear[i] + " Average Temperature: " + monthAvgTemp[i] + "°F");
				totalTemp = totalTemp + monthAvgTemp[i];
				
				if (monthAvgTemp[i] > highestTemp)	{
					highestTemp = monthAvgTemp[i];
					highestMonth = monthsInYear[i];
				}
				
				if (monthAvgTemp[i] < lowestTemp)	{
					lowestTemp = monthAvgTemp[i];
					lowestMonth = monthsInYear[i];
				}
			}
			
			double yearlyAverage = totalTemp / NUM_MONTHS;
			System.out.println("Yearly Average Temperature: " + yearlyAverage + "°F");
			System.out.println("Highest Monthly Average Temperature: " + highestMonth + " with " + highestTemp + "°F");
			System.out.println("Lowest Monthly Average Temperature: " + lowestMonth + " with " + lowestTemp + "°F");	
			}
				else {
					int index = -1;
					for (i = 0; i < NUM_MONTHS; ++i)	{
						if (monthsInYear[i].equalsIgnoreCase(input))	{
							index = i;
							break;
					}
				}
					
			if (index != -1)	{
				System.out.println(monthsInYear[index] + " Average Temperature: " + monthAvgTemp[index] + "°F");
			}
				else {
					System.out.println("Invalid user input!");
					scnr.close();
			}
		}	
		
	}
}
