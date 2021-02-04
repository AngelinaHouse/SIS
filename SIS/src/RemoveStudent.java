import java.util.*;

public class RemoveStudent {

	protected static Scanner uI = new Scanner (System.in);
	public static void removeTheStudent()
	{
		try 
		{
			System.out.println("Please enter the student's name in which you want to delete");
			System.out.println();
			System.out.println();
			String name = uI.nextLine();
			
			String [] nameSplit = name.split(" ");
			
			for(int i = 0; i < Main.studentList.size(); i++)
			{
				if(Main.studentList.get(i).getFirstName().equals(nameSplit[0]) && Main.studentList.get(i).getLastName().equals(nameSplit[1]))
				{
					Main.studentList.remove(i);
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("Something went wrong, please try again");
			removeTheStudent();
		}
	}
}
