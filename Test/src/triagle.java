import java.util.Scanner;

public class triagle 
{
   public double bok1; 
   public double bok2;
   public double bok3; 
   
   public triagle(double a, double b, double c)
   {
	   Scanner scan=new Scanner(System.in);
	   for(int i=0 ; i<1; )
	   {
		   bok1=a;
		   bok2=b;
		   bok3=c;
		   if(ifTriagle()==true)
		   {
			   break; 
		   }
		   if(ifTriagle()==false)
		   {
			   System.out.println("Podano nieprawidlowe dlugosci boku ");
			   System.out.println("Wprowadz ponownie wymiary trojkata ");
			   System.out.println("Podaj dlugosc 1 boku");
			   double d=scan.nextDouble();
			   System.out.println("Podaj dlugosc 2 boku");
			   double e=scan.nextDouble();
			   System.out.println("Podaj dlugosc 3 boku");
			   double f=scan.nextDouble();
		   }
	   }
   }
   public boolean ifTriagle() 
   {
	   if(( bok1<bok2+bok3 && bok3>bok2-bok1)|| (bok2<bok3+bok1 && bok1>bok3-bok2) || (bok3<bok3+bok2 && bok2>bok3-bok1))
	   {
		   return true; 
	   }
	   else 
	   {
		   return false; 
	   }
   }
   public void pokaz()
   {
	   System.out.println("bok pierwszy= "+bok1 );
	   System.out.println("bok drugi= "+bok2 );
	   System.out.println("bok trzeci= "+bok3 );
   }
   public static void main(String[]args)
   {
	   Scanner scan=new Scanner(System.in);
	   System.out.println("Podaj dlugosc 1 boku");
	   double a=scan.nextDouble();
	   System.out.println("Podaj dlugosc 2 boku");
	   double b=scan.nextDouble();
	   System.out.println("Podaj dlugosc 3 boku");
	   double c=scan.nextDouble();
	   triagle trojkat= new triagle(a,b,c);
	   trojkat.pokaz();
   }
}
