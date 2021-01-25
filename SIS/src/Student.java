public class Student
{
    private String name;

    private String [] classNames = new String [3];
    private String [] classGrades = new String [3];
   // private String className1;
   // private String classGrade1;

   // private String className2;
   // private String classGrade2;

   // private String className3;
   // private String classGrade3;

    public Student(String n, String c1, String g1, String c2, String g2, String c3, String g3)
    {
        name = n;
        classNames[0] = c1;
        classGrades[0] = g1;
        classNames[1] = c2;
        classGrades[1] = g2;
        classNames[2] = c3;
        classGrades[2] = g3;
    }

    public String getClassName(int num)
			{
				return classNames[num+1];
			}
    public String getClassGrade(int num1)
			{
				return classGrades[num1+1];
			}

		public void setRank(String rank)
			{
				this.rank = rank;
			}

		
}