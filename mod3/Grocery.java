package mod3;

import java.util.Scanner;

public class Grocery {

	public static void main(String[] args)	{
		Scanner scnr = new Scanner(System.in);
			System.out.println("Enter the amount for the first week's grocery bill as a decimal (example, 30.10): ");
			double week1Bill = scnr.nextDouble();
			System.out.println("Enter the amount for the second week's grocery bill as a decimal (example, 30.10): ");
			double week2Bill = scnr.nextDouble();
			System.out.println("Enter the amount for the third week's grocery bill as a decimal (example, 30.10): ");
			double week3Bill = scnr.nextDouble();
			System.out.println("Enter the amount for the fourth week's grocery bill as a decimal (example, 30.10): ");
			double week4Bill = scnr.nextDouble();
			System.out.println("Enter the coupon amount as a decimal (example, .10): ");
			double couponAmount = scnr.nextDouble();
			
		if (couponAmount > 1.0)	{
			couponAmount = 0.10;
		}
		else if (couponAmount <= 0)	{
			couponAmount = 0.10;
		}
		
			System.out.println();
			System.out.print("Weekly Average without Coupon is: ");
			System.out.println((week1Bill + week2Bill + week3Bill + week4Bill) / 4);
			System.out.print("Weekly Average with Coupon is: ");
			System.out.println(((week1Bill + week2Bill + week3Bill + week4Bill) * (1 - couponAmount)) / 4);
			System.out.print("Monthly total without Coupon is: ");
			System.out.println(week1Bill + week2Bill + week3Bill + week4Bill);
			System.out.print("Monthly Total with Coupon is: ");
			System.out.println((week1Bill + week2Bill + week3Bill + week4Bill) * (1 - couponAmount));
			scnr.close();
	}
}
