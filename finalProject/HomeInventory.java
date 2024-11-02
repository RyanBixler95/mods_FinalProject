package finalProject;

import java.util.ArrayList;
import java.util.Scanner;

public class HomeInventory {
		private static ArrayList<Home> homes = new ArrayList<>();
		
		public static void main(String[] args)	{
		Scanner scnr = new Scanner(System.in);
		
		try {
			// Initialize Home object with parameterized constructor
			Home home1 = new Home(2500, "123 Main St", "Aurora", "CO", 80012, "Model A", "available");
			homes.add(home1);
			Home home2 = new Home(3000, "456 Elm St", "Aurora", "CO", 80013, "Model B", "available");
			homes.add(home2);
			Home home3 = new Home(4000, "4700 NE 63rd St", "Oklahoma City", "OK", 73121, "Model C", "available");
			homes.add(home3);
			Home home4 = new Home(3200, "277 Middle River St", "Fort Lauderdale", "FL", 33309, "Model B", "available");
			homes.add(home4);
			Home home5 = new Home(2900, "891 Helen St", "Lake Worth", "FL", 33463, "Model A", "available");
			homes.add(home5);
			Home home6 = new Home(3000, "8738 East John Ave", "Los Angelas", "CA", 90006, "Model B", "available");
			homes.add(home6);
			Home home7 = new Home(3250, "67 Elizabeth St", "Fresno", "CA", 93727, "Model A", "available");
			homes.add(home7);
			Home home8 = new Home(1750, "350 Puuala St", "Kula", "HI", 96790, "Model C", "available");
			homes.add(home8);
			
			// Add homes using for loop
			for (Home home : homes)	{
				System.out.println(home.addHome());
			}
			
			// Show total number of homes
			System.out.println("\n*" + homes.size() + " homes are currently in the inventory.");
			
			// Search functionality
			System.out.print("\nEnter state abbreviation (ex: Colorado = CO) to search: ");
			String searchState = scnr.nextLine();
			ArrayList<Home> results = searchHomesByState(searchState);
			System.out.println("\nSearch Results:");
			for (Home home : results)	{
				System.out.print(home.getAddress() + ", " + home.getCity() + ", " + home.getState() + ", " + home.getZipCode() + ", ");
				System.out.println(home.getModelName() + ", Status: " + home.getSaleStatus());
			}
			
			// Remove home
			System.out.println("\nEnter address of the home to remove: ");
			String removeAddress = scnr.nextLine();
			Home homeToRemove = null;
			for (Home home : homes)	{
				if (home.getAddress().equalsIgnoreCase(removeAddress))	{
					homeToRemove = home;
					break;
				}
			}
			if (homeToRemove != null)	{
				homes.remove(homeToRemove);
				System.out.println("\n*Home Removed Successfully*");
			} else	{
				System.out.println("\nHome not found.");
			}
			
			// Add new home with user input
			System.out.println("\nThe following information is required to add a new home to the inventory:");
			System.out.print("Enter square feet: ");
			int squareFeet = scnr.nextInt();
			scnr.nextLine(); 
			System.out.print("Enter street address: ");
			String address = scnr.nextLine();
			System.out.print("Enter city: ");
			String city = scnr.nextLine();
			System.out.print("Enter state: ");
			String state = scnr.nextLine();
			System.out.print("Enter zip code: ");
			int zipCode = scnr.nextInt();
			scnr.nextLine(); 
			System.out.print("Enter model name (Model A-Z): ");
			String modelName = scnr.nextLine();
			System.out.print("Enter sale status (available/sold/under contract): ");
			String saleStatus = scnr.nextLine();
			
			Home newHome = new Home(squareFeet, address, city, state, zipCode, modelName, saleStatus);
			homes.add(newHome);
			System.out.println(newHome.addHome());
			
			// List new home values
			System.out.println("New Home Details:");
			System.out.println("Square Feet: " + newHome.getSquareFeet());
			System.out.println("Address: " + newHome.getAddress());
			System.out.println("City: " + newHome.getCity());
			System.out.println("State: " + newHome.getState());
			System.out.println("Zip Code: " + newHome.getZipCode());
			System.out.println("Model Name: " + newHome.getModelName());
			System.out.println("Sale Status: " + newHome.getSaleStatus());
			
			// Update home sale status with user input
			String newSaleStatus = "";
			while (true)	{
			System.out.println("Enter the new sale status (available/sold/under contract): ");
			newSaleStatus = scnr.nextLine().toLowerCase();
			if (newSaleStatus.equals("available") || newSaleStatus.equals("sold") || newSaleStatus.equals("under contract"))	{
				break; 
			} else	{
				System.out.println("Invalid status entered. Please enter 'available', 'sold', or 'under contract'.");
			}
			}
			System.out.println(newHome.updateHome(newSaleStatus));
			System.out.println("Updated Sale Status: " + newHome.getSaleStatus());
			
			// Prompt to print to file
			System.out.println("Do you want to print the information to a file (Y/N)");
			String response = scnr.nextLine();
			if (response.equalsIgnoreCase("Y"))	{
				System.out.println("File will be printed to C:\\Temp\\Home.txt");
			} else	{
				System.out.println("A file will not be printed.");
			}
		} catch (Exception e)	{
			System.out.println("An error occurred: " + e.getMessage());	
		} finally {
			scnr.close();
		}
	}	
		
		
			public static ArrayList<Home> searchHomesByState(String state)	{
				ArrayList<Home> results = new ArrayList<>();
				for (Home home : homes)	{
					if (home.getState().equalsIgnoreCase(state))	{
						results.add(home);	
					}
				}
				return results;
			}
}
