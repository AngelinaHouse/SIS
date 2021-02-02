import java.util.*;

public class NewStudent {

	protected static Scanner uI = new Scanner(System.in);
	protected static String fName = "";
	protected static String lName = "";
	public static void addNewStudent()
	{
		
		
		
		
		System.out.println("Welcome to the New Student Portal");
		System.out.println();
		System.out.println();
		System.out.println("Let's start with the basic information");
		System.out.println();
		
	}
	
	public static void makeName()
	{
		try
		{
			System.out.println("Please enter you first and last name");
			String name = uI.nextLine();
		
			String [] namesplit = name.split(" ");
		
			fName = namesplit[0];
			lName = namesplit[1];
		}
		catch(Exception InputMismatchException)
		{
			System.out.println("That is not your name silly");
			makeName();
		}
	}
}
