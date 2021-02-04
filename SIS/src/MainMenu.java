import java.util.*;
import java.io.IOException;


public class MainMenu
	{
		public static ArrayList<Student> studentList = new ArrayList<Student>();
		static Scanner userStringInput = new Scanner(System.in);
		static Scanner userIntInput = new Scanner(System.in);
		public static int classSortChoice; 

		public static void main(String[] args) throws IOException
			{
				displayRoster();
				welcome();
				//displayRoster();
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
		
		public static void displayRoster() throws IOException
		{
			
			
			for (int i = 0; i < studentList.size(); i++)
			{
				System.out.println(studentList.getClass());
				
			}
			
		}
		
		public static void displayMainMenu() throws IOException
		{
			System.out.println("What would you like to do?");
			System.out.println("\t 1.) Add or delete a student");
			System.out.println("\t 2.) Change a students grade/schedule");
			System.out.println("\t 3.) Sort the students");
			
			int actionChoice = userIntInput.nextInt();
			
			if (actionChoice == 1)
				{
					System.out.println("Lets add or delete a student");
					addDeleteMenu();
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
		
		public static void addDeleteMenu()
		{
			System.out.println("Would you like to add or delete a student?");
		}
		
		public static void editStudentMenu()
		{
			System.out.println("Would you like to change a ");
		}
		
		public static void sortMenu() throws IOException
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
					
					Collections.sort(studentList, new NameSorter());
				}
			else if (sortChoice == 2)
				{
					System.out.println("Lets sort by GPA");
					
					Collections.sort(studentList, new GPASorter());
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
		
		public static void classSorterMenu() throws IOException
		{
			System.out.println("What class period would you like to sort by?");
			System.out.println("\t 1.) period 1");
			System.out.println("\t 2.) period 2");
			System.out.println("\t 3.) period 3");
			
			classSortChoice = userIntInput.nextInt();
			Collections.sort(studentList, new ClassSorter());
			displayRoster();
			
//			
//			if (classSortChoice == 1)
//			{
//				System.out.println("Lets sort by period 1");
//				
//				Collections.sort(studentList, new ClassSorter());
//				displayRoster();
//			}
//		else if (classSortChoice == 2)
//			{
//				System.out.println("Lets sort by period 2");
//				Collections.sort(studentList, new ClassSorter());
//			}
//		else if (classSortChoice == 3)
//			{
//				System.out.println("Lets sort by period 3");	
//				Collections.sort(studentList, new ClassSorter());
//			}
//		else
//			{
//				classSorterMenu();
//			}
		spacer();
		}
		
		
		public static void spacer()
		{
			System.out.println(" ");
		}

	}
