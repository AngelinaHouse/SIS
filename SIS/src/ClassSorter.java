import java.util.Comparator;

public class ClassSorter implements Comparator<Student>
	{
		public int compare (Student s1, Student s2)
		{
			if (MainMenu.classSortChoice == 1)
				{
					return s1.getClassName1().compareTo(s2.getClassName1());
				}
			else if (MainMenu.classSortChoice == 2)
				{
					return s1.getClassName2().compareTo(s2.getClassName2());
				}
			else
				{
					return s1.getClassName3().compareTo(s2.getClassName3());
				}
		}
	}
