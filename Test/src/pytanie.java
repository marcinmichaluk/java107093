package quizz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class quizz {
String pytanie;
String a;
String b;
String c;
String d;
String prawidlowa;
String odpowiedz;
int numer_pytania; 

public quizz()
{
	pytanie=" ";
	a=" ";
	b=" ";
	c=" ";
	d=" ";
	prawidlowa=" ";
	numer_pytania=1;
}
public void wyswietl_pytanie(int nr, String p, String a, String b, String c, String d)
{
	System.out.println("Pytanie numer: "+ nr);
	System.out.println(p);
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
}
public void sprawdz_odpowiedz(String odp, String p)
{
	if(p.equals(odp))
	{
		System.out.println("Wybrales prawidlowa odpowiedz ! Gratki");
	}
	else
	{
		System.out.println("Niestety prawidlowa odpowiedz to-> "+p);
	}
}
public static void main(String[]arg) throws FileNotFoundException
{
	File file= new File("quiz.txt");
	Scanner odczyt = new Scanner(new File("C:\\Users\\Marcin\\Desktop\\quiz.txt"));
	quizz p1=new quizz();
	for(int i=0; i< 5; i++)
	{
		p1.numer_pytania=i+1; 
		p1.pytanie=odczyt.nextLine();
		p1.a=odczyt.nextLine();
		p1.b=odczyt.nextLine();
		p1.c=odczyt.nextLine();
		p1.d=odczyt.nextLine();
		p1.prawidlowa=odczyt.nextLine();
		String xd=odczyt.nextLine();
		p1.wyswietl_pytanie(p1.numer_pytania,p1.pytanie, p1.a,p1.b,p1.c,p1.d);
		System.out.println("Wybierz a, b , c lub d");
		Scanner scan=new Scanner(System.in);
		String odp=scan.next();
		p1.sprawdz_odpowiedz(odp,p1.prawidlowa);
		
		
	}
	}
}

