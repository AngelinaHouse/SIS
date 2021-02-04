import java.util.Scanner;

public class StudentEditor {
	protected static int indexChoice;
	public static void studentEditSelect()
	{
		System.out.println("Please type the index of the student you would like to edit within the Student List.");
		Scanner indexSelection = new Scanner(System.in);
		indexChoice = indexSelection.nextInt();
		fieldSelection();

	}
	public static void fieldSelection()
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

		if (indexChoice == 1)
		{
			MainMenu.studentList.get(indexChoice).setFirstName(editChoice);
		}

		else if (indexChoice == 2)
		{
			MainMenu.studentList.get(indexChoice).setLastName(editChoice);
		}

		else if (indexChoice == 3)
		{
			MainMenu.studentList.get(indexChoice).setClassName1(editChoice);
		}

		else if (indexChoice == 4)
		{
			MainMenu.studentList.get(indexChoice).setClassGrade1(editChoice);
		}

		else if (indexChoice == 5)
		{
			MainMenu.studentList.get(indexChoice).setClassName2(editChoice);
		}

		else if (indexChoice == 6)
		{
			MainMenu.studentList.get(indexChoice).setClassGrade2(editChoice);
		}

		else if (indexChoice == 7)
		{
			MainMenu.studentList.get(indexChoice).setClassName3(editChoice);
		}

		else if (indexChoice == 8)
		{
			MainMenu.studentList.get(indexChoice).setClassGrade3(editChoice);
		}

	}

}