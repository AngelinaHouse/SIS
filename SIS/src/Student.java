
public class Student
{
    private String firstName;
    private String lastName;
    
   private String className1;
   private String classGrade1;

   private String className2;
   private String classGrade2;

   private String className3;
   private String classGrade3;

   private Double GPA;
   
    public Student(String fn, String ln, String c1, String g1, String c2, String g2, String c3, String g3, Double gpa)
    {
        firstName = fn;
        lastName = ln;
        className1 = c1;
        classGrade1 = g1;
        className2 = c2;
        classGrade2 = g2;
        className3 = c3;
        classGrade3 = g3;
        GPA = gpa;
    }

	public String getFirstName()
		{
			return firstName;
		}

	public void setFirstName(String firstName)
		{
			this.firstName = firstName;
		}

	public String getLastName()
		{
			return lastName;
		}

	public void setLastName(String lastName)
		{
			this.lastName = lastName;
		}

	public String getClassName1()
		{
			return className1;
		}

	public void setClassName1(String className1)
		{
			this.className1 = className1;
		}

	public String getClassGrade1()
		{
			return classGrade1;
		}

	public void setClassGrade1(String classGrade1)
		{
			this.classGrade1 = classGrade1;
		}

	public String getClassName2()
		{
			return className2;
		}

	public void setClassName2(String className2)
		{
			this.className2 = className2;
		}

	public String getClassGrade2()
		{
			return classGrade2;
		}

	public void setClassGrade2(String classGrade2)
		{
			this.classGrade2 = classGrade2;
		}

	public String getClassName3()
		{
			return className3;
		}

	public void setClassName3(String className3)
		{
			this.className3 = className3;
		}

	public String getClassGrade3()
		{
			return classGrade3;
		}

	public void setClassGrade3(String classGrade3)
		{
			this.classGrade3 = classGrade3;
		}

	public Double getGPA()
		{
			return GPA;
		}

	public void setGPA(Double gpa)
		{
			GPA = gpa;
		}

    
    
		
}
