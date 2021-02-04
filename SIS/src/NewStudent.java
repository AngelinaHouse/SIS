import java.util.*;

public class NewStudent {

	protected static Scanner uI = new Scanner(System.in);
	protected static String fName = "";
	protected static String lName = "";
	protected static String [] classNames = new String [3];
	protected static String [] classGrades = new String [3];

	public static void addNewStudent()
	{
		
		
		
		
		System.out.println("Welcome to the New Student Portal");
		System.out.println();
		System.out.println();
		System.out.println("Let's start with the basic information");
		System.out.println();
		makeName();
		for (int p = 1; p < 4; p++)
		{
			makeClass(p);
			System.out.println();
			addGrade(p);
		}
		
		//
		MainMenu.studentList.add(new Student(fName, lName, classNames[0], classGrades[0],classNames[1], classGrades[1],classNames[2], classGrades[2],0.0));
		//
		System.out.println();
		System.out.println(MainMenu.studentList.get(MainMenu.studentList.size()-1) +" sucessfully created!");
		System.out.println();

	}
	
	private static void addGrade(int g) {
		try
		{
			 System.out.println("Please enter the grade for " + classNames[g-1]);
			 classGrades[g-1] = uI.nextLine();
			
		}
		catch (Exception e)
		{
			System.out.println("Something went wrong, please try again");
			addGrade(g);
		}
		
	}

	public static void makeClass(int c) {
		
		try
		{
			 System.out.println("Please enter the name of your period " + c);
			 classNames[c-1] = uI.nextLine();
			
		}
		catch (Exception e)
		{
			System.out.println("Something went wrong, please try again");
			makeClass(c);
		}
		
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
