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
				Main.readTextFile();
				Main.gpaCalculator();
				
				System.out.println("************** FOR REFERENCE **************");
				displayRoster();
				
				//welcome();
				displayMainMenu();
				//BackToFileWriter.writeBackToFile();

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
				System.out.print(studentList.get(i).getFirstName()+" "+studentList.get(i).getLastName()+"		"+studentList.get(i).getClassName1()+" "+studentList.get(i).getClassGrade1()+"		"+studentList.get(i).getClassName2()+" "+studentList.get(i).getClassGrade2()+"		"+studentList.get(i).getClassName3()+" "+studentList.get(i).getClassGrade3()+"		");
				System.out.format("%.1f", studentList.get(i).getGPA());
				System.out.println();
				
			}
			spacer();
		}
		
		public static void displayMainMenu() throws IOException
		{
			System.out.println("What would you like to do?");
			System.out.println("\t 1.) Add or delete a student");
			System.out.println("\t 2.) Change a students grade/schedule");
			System.out.println("\t 3.) Sort the students");
			System.out.println("\t 4.) Exit");
			
			int actionChoice = userIntInput.nextInt();
			
			if (actionChoice == 1)
				{
					System.out.println("Lets add or delete a student");
					addDeleteMenu();
				}
			else if (actionChoice == 2)
				{
					System.out.println("Lets change a grade");
					StudentEditor.studentEditSelect();
				}
			else if (actionChoice == 3)
				{
					System.out.println("Lets sort the students");
					sortMenu();
				}
			else if (actionChoice == 4)
			{
				System.exit(0);
			}
			else
				{
					displayMainMenu();
				}
			spacer();
		}
		
		public static void addDeleteMenu() throws IOException
		{
			System.out.println("Would you like to add or delete a student?");
			
			String choice = userStringInput.nextLine();
			
			if (choice.equals("add") || choice.equals("Add"))
			{
				NewStudent.addNewStudent();
			}
			else if(choice.equals("delete") || choice.equals("Delete"))
			{
				RemoveStudent.removeTheStudent();
			}
			else
			{
				System.out.println("That is an invalid choice, please try again");
				System.out.println();
				addDeleteMenu();
			}
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
					displayRoster();
					System.out.println();
					System.out.println("Rerouting to Main Menu");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						
					}
					MainMenu.displayMainMenu();

				}
			else if (sortChoice == 2)
				{
					System.out.println("Lets sort by GPA");
					
					Collections.sort(studentList, new GPASorter());
					displayRoster();
					System.out.println();
					System.out.println("Rerouting to Main Menu");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						
					}
					MainMenu.displayMainMenu();

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
			System.out.println();
			System.out.println("Rerouting to Main Menu");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				
			}
			MainMenu.displayMainMenu();

			

		}
		
		
		public static void spacer()
		{
			System.out.println(" ");
		}

	}
