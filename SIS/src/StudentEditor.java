import java.io.IOException;
import java.util.Scanner;

public class StudentEditor {
	protected static int indexChoice;
	protected static Scanner uI = new Scanner (System.in);
	public static void studentEditSelect() throws IOException
	{
		System.out.println("Please enter the student's name in which you want to edit");
		System.out.println();
		System.out.println();
		String name = uI.nextLine();
		
		String [] nameSplit = name.split(" ");
		
		for(int i = 0; i < MainMenu.studentList.size(); i++)
		{
			if(MainMenu.studentList.get(i).getFirstName().equals(nameSplit[0]) && MainMenu.studentList.get(i).getLastName().equals(nameSplit[1]))
			{
				indexChoice = i;
			}
		}
		
		fieldSelection();

	}
	public static void fieldSelection() throws IOException
	{
		System.out.println("Which field would you like to edit?");
		System.out.println("");
		System.out.println("1. First Name");
		System.out.println("2. Last Name");
		System.out.println("3. Class One Name");
		System.out.println("4. Class One Grade");
		System.out.println("5. Class Two Name");
		System.out.println("6. Class Two Grade");
		System.out.println("7. Class Three Name");
		System.out.println("8. Class Three Grade");
		Scanner fieldSelection = new Scanner(System.in);
		int fieldChoice = fieldSelection.nextInt();

		System.out.println("What would you like to change the selected field to?");
		Scanner edit = new Scanner(System.in);
		String editChoice = edit.next();

		if (fieldChoice == 1)
		{
			MainMenu.studentList.get(indexChoice).setFirstName(editChoice);
		}

		else if (fieldChoice == 2)
		{
			MainMenu.studentList.get(indexChoice).setLastName(editChoice);
		}

		else if (fieldChoice == 3)
		{
			MainMenu.studentList.get(indexChoice).setClassName1(editChoice);
		}

		else if (fieldChoice == 4)
		{
			MainMenu.studentList.get(indexChoice).setClassGrade1(editChoice);
		}

		else if (fieldChoice == 5)
		{
			MainMenu.studentList.get(indexChoice).setClassName2(editChoice);
		}

		else if (fieldChoice == 6)
		{
			MainMenu.studentList.get(indexChoice).setClassGrade2(editChoice);
		}

		else if (fieldChoice == 7)
		{
			MainMenu.studentList.get(indexChoice).setClassName3(editChoice);
		}

		else if (fieldChoice == 8)
		{
			MainMenu.studentList.get(indexChoice).setClassGrade3(editChoice);
		}
		
		System.out.println("Edit Sucessful!");
		System.out.println();

		System.out.println("Rerouting to Main Menu");
		MainMenu.displayMainMenu();


	}

}