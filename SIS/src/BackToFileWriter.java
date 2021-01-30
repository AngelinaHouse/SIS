import java.io.*;
public class BackToFileWriter {

	public static void writeBackToFile()
	{
		 String fileName = "SIS Project Text File.txt";

	        try {
	            // Assume default encoding.
	            FileWriter fileWriter = new FileWriter(fileName, true);

	            // Always wrap FileWriter in BufferedWriter.
	            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

	            // Note that write() does not automatically
	            // append a newline character.
	            
	            for (int w = 0; w <Main.studentList.size(); w++)
	            {
	            	bufferedWriter.write(Main.studentList.get(w).getFirstName());
	            	bufferedWriter.write(Main.studentList.get(w).getLastName());
	            	
	            	bufferedWriter.write(Main.studentList.get(w).getClassName1());
	            	bufferedWriter.write(Main.studentList.get(w).getClassGrade1());
	            	
	            	bufferedWriter.write(Main.studentList.get(w).getClassName2());
	            	bufferedWriter.write(Main.studentList.get(w).getClassGrade2());
	            	
	            	bufferedWriter.write(Main.studentList.get(w).getClassName3());
	            	bufferedWriter.write(Main.studentList.get(w).getClassGrade3());

		            bufferedWriter.newLine();


	            }
	           
	            // Always close files.
	            bufferedWriter.close();
	        	}
	        
	        catch(IOException ex) 
	        	{
	            System.out.println("Error writing to file '" + fileName + "'");
	            // Or we could just do this:
	            // ex.printStackTrace();
	        	}
	}
}
