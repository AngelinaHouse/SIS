import java.util.*;
import java.io.*;

public class Main
	{
		public static ArrayList<Student> studentList = new ArrayList<Student>();
		public static void main(String[] args) throws IOException
			{
				System.out.println("Welcome to the SIS");
				readTextFile();
				gpaCalculator();
			}
		public static void readTextFile() throws IOException
		{
			//This method fills the student objects
			
			Scanner file = new Scanner(new File ("SIS Project Text File.txt"));
			
			 
			while (file.hasNext())
			{
				studentList.add(new Student(file.next(), file.next(), file.next(), file.next(), file.next(), file.next(), file.next(), file.next(), 0.0));

			}
		}
		
		public static void gpaCalculator()
		{
			
			for (int i = 0; i <= studentList.size(); i++)
			{
				double sum = 0;
				double average = 0;
				//grade 1 value
				if (studentList.get(i).getClassGrade1().equals("A+"))
				{
					sum = sum + 4.0;
				}
				else if (studentList.get(i).getClassGrade1().equals("A"))
				{
					sum = sum + 4.0;
				}
				else if (studentList.get(i).getClassGrade1().equals("A-"))
				{
					sum = sum + 3.7;
				}
				else if (studentList.get(i).getClassGrade1().equals("B+"))
				{
					sum = sum + 3.3;
				}
				else if (studentList.get(i).getClassGrade1().equals("B"))
				{
					sum = sum + 3.0;
				}
				else if (studentList.get(i).getClassGrade1().equals("B-"))
				{
					sum = sum + 2.7;
				}
				else if (studentList.get(i).getClassGrade1().equals("C+"))
				{
					sum = sum + 2.3;
				}
				else if (studentList.get(i).getClassGrade1().equals("C"))
				{
					sum = sum + 2.0;
				}
				else if (studentList.get(i).getClassGrade1().equals("C-"))
				{
					sum = sum + 1.7;
				}
				else if (studentList.get(i).getClassGrade1().equals("D+"))
				{
					sum = sum + 1.3;
				}
				else if (studentList.get(i).getClassGrade1().equals("D"))
				{
					sum = sum + 1.0;
				}
				else if (studentList.get(i).getClassGrade1().equals("F"))
				{
					sum = sum + 0.0;
				}
				
				//Grade 2 value
				if (studentList.get(i).getClassGrade2().equals("A+"))
				{
					sum = sum + 4.0;
				}
				else if (studentList.get(i).getClassGrade2().equals("A"))
				{
					sum = sum + 4.0;
				}
				else if (studentList.get(i).getClassGrade2().equals("A-"))
				{
					sum = sum + 3.7;
				}
				else if (studentList.get(i).getClassGrade2().equals("B+"))
				{
					sum = sum + 3.3;
				}
				else if (studentList.get(i).getClassGrade2().equals("B"))
				{
					sum = sum + 3.0;
				}
				else if (studentList.get(i).getClassGrade2().equals("B-"))
				{
					sum = sum + 2.7;
				}
				else if (studentList.get(i).getClassGrade2().equals("C+"))
				{
					sum = sum + 2.3;
				}
				else if (studentList.get(i).getClassGrade2().equals("C"))
				{
					sum = sum + 2.0;
				}
				else if (studentList.get(i).getClassGrade2().equals("C-"))
				{
					sum = sum + 1.7;
				}
				else if (studentList.get(i).getClassGrade2().equals("D+"))
				{
					sum = sum + 1.3;
				}
				else if (studentList.get(i).getClassGrade2().equals("D"))
				{
					sum = sum + 1.0;
				}
				else if (studentList.get(i).getClassGrade2().equals("F"))
				{
					sum = sum + 0.0;
				}
				
				//grade 3 value
				if (studentList.get(i).getClassGrade3().equals("A+"))
				{
					sum = sum + 4.0;
				}
				else if (studentList.get(i).getClassGrade3().equals("A"))
				{
					sum = sum + 4.0;
				}
				else if (studentList.get(i).getClassGrade3().equals("A-"))
				{
					sum = sum + 3.7;
				}
				else if (studentList.get(i).getClassGrade3().equals("B+"))
				{
					sum = sum + 3.3;
				}
				else if (studentList.get(i).getClassGrade3().equals("B"))
				{
					sum = sum + 3.0;
				}
				else if (studentList.get(i).getClassGrade3().equals("B-"))
				{
					sum = sum + 2.7;
				}
				else if (studentList.get(i).getClassGrade3().equals("C+"))
				{
					sum = sum + 2.3;
				}
				else if (studentList.get(i).getClassGrade3().equals("C"))
				{
					sum = sum + 2.0;
				}
				else if (studentList.get(i).getClassGrade3().equals("C-"))
				{
					sum = sum + 1.7;
				}
				else if (studentList.get(i).getClassGrade3().equals("D+"))
				{
					sum = sum + 1.3;
				}
				else if (studentList.get(i).getClassGrade3().equals("D"))
				{
					sum = sum + 1.0;
				}
				else if (studentList.get(i).getClassGrade3().equals("F"))
				{
					sum = sum + 0.0;
				}
				average = sum/3;
				studentList.get(i).setGPA(average);
			}
		}

	}

