import java.util.*;
public class conversion {

	public static void main(String[] args)
	{
		int userOption = 0;
		System.out.println("\nPlease enter a distance in meters: ");
		Scanner scr = new Scanner(System.in);
		double distanceMeters = scr.nextDouble();
		while (userOption != 4)
		{
			menu();
			System.out.print("Enter your choice: ");
			userOption = scr.nextInt();
			if (userOption == 1)
				showKilometers(distanceMeters);
			else if (userOption == 2)
				showInches(distanceMeters);
			else if (userOption == 3)
				showFeet(distanceMeters);
			else if (userOption == 4)
				System.out.println("Bye!");
			else
				System.out.println("Error: User input was not 1-4");
		}
		
		
		
	}
	
	public static void showKilometers(double meters)
	{
		double kilometers = meters * .001;
		System.out.println("Distance in Kilometers: " + kilometers + "\n");
	}
	public static void showInches(double meters)
	{
		double inches = meters * 39.37;
		System.out.println("Distance in Inches: " + inches + "\n");
	}
	public static void showFeet(double meters)
	{
		double feet = meters * 3.281;
		System.out.println("Distance in Feet: " + feet + "\n");
	}
	public static void menu()
	{
		System.out.println("1. Convert to kilometers");
		System.out.println("2. Convert to inches");
		System.out.println("3. Convert to feet");
		System.out.println("4. Quit the program \n");
	}
	
}