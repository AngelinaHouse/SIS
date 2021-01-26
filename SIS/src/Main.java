import java.util.*;
import java.io.*;

public class Main
	{
		ArrayList<Student> studentList = new ArrayList<Student>();
		public static void main(String[] args) throws IOException
			{
				System.out.println("Welcome to the SIS");
				readTextFile();
			}
		public static void readTextFile() throws IOException
		{
			//This method fills the student objects
			
			Scanner file = new Scanner(new File ("SIS Project Text File.txt"));
			int times = file.nextInt();
			 
			for (int i = 0; i <= times; i++)
			{
				studentList.add(i);
				
			}
		}

	}

