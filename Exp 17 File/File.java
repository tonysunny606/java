import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;




public class File
	{
	  public static void main(String[] args)
	  {
	  try
	  	{	
	  		FileWriter writer = new FileWriter("File1.txt",true);
	  		writer.write("new file is created");
	  		writer.close();
			FileReader reader = new FileReader("File1.txt");
	  		BufferedReader br=new BufferedReader(reader);
	  		String line;
	  		System.out.println("Data read from line:");
	  		while((line = br.readLine()) != null) 
	  		{
	  		System.out.println(line);
	  		}
	  		reader.close();
	  		}
	  		catch(IOException e)
	  		{
	  		System.out.println("--------Error-----");
	  		}
	  		}
	  		}
	  		
