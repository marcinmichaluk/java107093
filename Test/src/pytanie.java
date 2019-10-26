import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class pytanie 
{
	String tresc;
	String odpowiedz;
	String poprawna; 
	int nr_pytania;
	
	public pytanie(int a)
	{
		nr_pytania=a;
	}
	  public static void main(String[] args) throws FileNotFoundException 
	  {
	        File file = new File("C:\\Users\\107093\\Desktop\\quiz.txt");
	        Scanner in = new Scanner(file);

	        String zdanie = in.nextLine();
	        System.out.println(zdanie);
	  }     
}
