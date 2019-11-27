import java.util.Scanner;

public class strEnd {
	
public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Program bêdzie wczytywal parametry dopoki ktorys z nich nie bedzie mial koncowki 'end' ");
		for(int i=0; i==0;)
		{
			System.out.println("Podaj parametr ");
			String str=scan.next();
			int where=str.indexOf("end");
			if((str.length()-3)==where)
			{
				System.out.println("parametr ma koncowke end, koniec programu.");
				break;
			}
		}
	}

}
