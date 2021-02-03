import java.util.*;
import java.text.*;

public class MainMenu
	{
		static Scanner userStringInput = new Scanner(System.in);
		static Scanner userIntInput = new Scanner(System.in);
		public static int classSortChoice; 

		public static void main(String[] args)
			{
				welcome();
				displayMainMenu();

			}
		
		public static void welcome()
		{
			System.out.println("Welcome to the Student Information System!");
			System.out.println("You will be able to a varaity of things to a class list of students \n"
					+ "Like adding or deleting a student, changing a students grade or schedule, \n"
					+ "and sorting them by last name or GPA.");
			spacer();
			
		}
		
		public static void displayMainMenu()
		{
			System.out.println("What would you like to do?");
			System.out.println("\t 1.) Add or delete a student");
			System.out.println("\t 2.) Change a students grade/schedule");
			System.out.println("\t 3.) Sort the students");
			
			int actionChoice = userIntInput.nextInt();
			
			if (actionChoice == 1)
				{
					System.out.println("Lets add or delete a student");
				}
			else if (actionChoice == 2)
				{
					System.out.println("Lets change a grade");
				}
			else if (actionChoice == 3)
				{
					System.out.println("Lets sort the students");
					sortMenu();
				}
			else
				{
					displayMainMenu();
				}
			spacer();
		}
		
		public static void sortMenu()
		{
			System.out.println("Here we can sort the students by last name, gpa, or classes. \n"
					+ "Which would you like to do?");
			System.out.println("\t 1.) Sort by last name");
			System.out.println("\t 2.) Sort by GPA");
			System.out.println("\t 3.) Sort by class");
			
			int sortChoice = userIntInput.nextInt();
			
			if (sortChoice == 1)
				{
					System.out.println("Lets sort by last name");
					
					Collections.sort(Main.studentList, new NameSorter());
				}
			else if (sortChoice == 2)
				{
					System.out.println("Lets sort by GPA");
					
					Collections.sort(Main.studentList, new GPASorter());
				}
			else if (sortChoice == 3)
				{
					System.out.println("Lets sort by class");	
					classSorterMenu();
				}
			else
				{
					sortMenu();
				}
			spacer();
			
		}
		
		public static void classSorterMenu()
		{
			System.out.println("What class period would you like to sort by?");
			System.out.println("\t 1.) period 1");
			System.out.println("\t 2.) period 2");
			System.out.println("\t 3.) period 3");
			
			classSortChoice = userIntInput.nextInt();
			
			if (classSortChoice == 1)
			{
				System.out.println("Lets sort by period 1");
				
				Collections.sort(Main.studentList, new ClassSorter());
				displayRoster();
			}
		else if (classSortChoice == 2)
			{
				System.out.println("Lets sort by period 2");
			}
		else if (classSortChoice == 3)
			{
				System.out.println("Lets sort by period 3");	
				classSorterMenu();
			}
		else
			{
				classSorterMenu();
			}
		spacer();
		}
		
		public static void displayRoster()
		{
			for (int i = 0; i < Main.studentList.size(); i++)
			{
				System.out.println(Main.studentList);
			}
			
		}
		
		public static void spacer()
		{
			System.out.println(" ");
		}

	}
