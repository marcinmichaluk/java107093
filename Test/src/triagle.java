package trojkat;

import java.lang.Math;
import java.util.Scanner;

public class triagle 
{
	public double side1;
	public double side2;
	public double side3;
	
	public triagle (double a, double b, double c )
	{
		Scanner scan=new Scanner(System.in);
		for(int i=1 ;i<10; )
		{
			if(a+b>c && b+c>a && c+a>b  )
			{
			side1=a;
			side2=b;
			side3=c;
			break;
			}
			else
			{
				System.out.println("Podano nieprawidlowe wymiary trojkata ");
				System.out.println("Spróbój ponownie ");
				System.out.println("Podaj dlugosc 1 boku trojkata. ");
				a=scan.nextDouble();
				System.out.println("Podaj dlugosc 2 boku trojkata. ");
				b=scan.nextDouble();
				System.out.println("Podaj dlugosc 3 boku trojkata. ");
			    c=scan.nextDouble();
			}
			
		}
	}
	public double circuit(triagle a )
	{
		double cir= a.side1+a.side2+a.side3; 
		return cir;
	}
	public void area(triagle a)
	{
		double p=a.circuit(a)/2; 
		double ar=Math.sqrt(p*(p-a.side1)*(p-a.side2)*(p-a.side3));
		System.out.println("Pole trojkata wynosi "+ar);
	}
	public void sort(triagle a)
	{
		System.out.print("Sortowanie długości boków: ");
		double max=a.maxSide(a);
		if( max == a.side1 && a.side1==a.side2 && a.side1==a.side3 && a.side2==a.side3)
		{
			System.out.print(side1+" ");
			System.out.print(side2+" ");
			System.out.print(side3);
		}
		if( max == a.side1 && ( a.side3 != a.side2))
		{
			System.out.print(side1+" ");
			if(a.side2<=a.side3)
			{
				System.out.print(a.side3+" ");
				System.out.print(a.side2);
			}
			if(a.side2>=a.side3)
			{
				System.out.print(a.side2+" ");
				System.out.print(a.side3);
			}
		}
		if( max == a.side2 && ( a.side3 != a.side1))
		{
			System.out.print(side2+" ");
			if(a.side3<=a.side1)
			{
				System.out.print(a.side1+" ");
				System.out.print(a.side3);
			}
			if(a.side3>=a.side1)
			{
				System.out.print(a.side3+" ");
				System.out.print(a.side1);
			}
		}
		if( max == a.side3 && (a.side1 != a.side2))
		{
			System.out.print(side3+" ");
			if(a.side2<=a.side1)
			{
				System.out.print(a.side1+" ");
				System.out.print(a.side2);
			}
			if(a.side2>=a.side1)
			{
				System.out.print(a.side2+" ");
				System.out.print(a.side1);
			}
		}
		System.out.println();
	}
	public void ifrectangular(triagle a)
	{
		double max=a.maxSide(a);
		if( max == a.side1)
		{
			if(max*max== (a.side2* a.side2) +(a.side3*a.side3) )
			{
				System.out.println("Trojkat jest prostokatny ");
			}
			else
			{
				System.out.println("Trojkat nie jest prostokatny");
			}
		}
		if( max == a.side2 && (a.side1 != a.side3))
		{
			if(max*max== (a.side3* a.side3) +(a.side1*a.side1) )
			{
				System.out.println("Trojkat jest prostokatny ");
			}
			else
			{
				System.out.println("Trojkat nie jest prostokatny");
			}
		}
		if( max == a.side3 && (a.side1 != a.side2))
		{
			if(max*max== (a.side2* a.side2) +(a.side1*a.side1) )
			{
				System.out.println("Trojkat jest prostokatny ");
			}
			else
			{
				System.out.println("Trojkat nie jest prostokatny");
			}
		}
		
	}
	public void ifobtuse(triagle a)
	{
		double max=a.maxSide(a);
		if( max == a.side1)
		{
			if(max*max> (a.side2* a.side2) +(a.side3*a.side3) )
			{
				System.out.println("Trojkat jest rozwartokatny ");
			}
			else
			{
				System.out.println("Trojkat nie jest rozwartokatny");
			}
		}
		if( max == a.side2 && (a.side1 != a.side3))
		{
			if(max*max> (a.side3* a.side3) +(a.side1*a.side1) )
			{
				System.out.println("Trojkat jest rozwartokatny ");
			}
			else
			{
				System.out.println("Trojkat nie jest rozwartokatny");
			}
		}
		if( max == a.side3 && (a.side1 != a.side2))
		{
			if(max*max> (a.side2* a.side2) +(a.side1*a.side1) )
			{
				System.out.println("Trojkat jest rozwartokatny ");
			}
			else
			{
				System.out.println("Trojkat nie jest rozwartokatny");
			}
		}
		
	}
	public double maxSide(triagle a)
	{
		double max=a.side1 ;
		if(max<a.side2)
		{
			max=a.side2;
		}
		if(max<a.side3)
		{
			max=a.side3;
		}
		return max;
	}
	public void show()
	{
		System.out.println("Bok 1= "+side1);
		System.out.println("Bok 2= "+side2);
		System.out.println("Bok 3= "+side3);
	}
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Podaj dlugosc 1 boku trojkata. ");
		double a=scan.nextDouble();
		System.out.println("Podaj dlugosc 2 boku trojkata. ");
		double b=scan.nextDouble();
		System.out.println("Podaj dlugosc 3 boku trojkata. ");
		double c=scan.nextDouble();
		triagle tri=new triagle(a,b,c);
		tri.show();
		tri.circuit(tri);
		tri.area(tri);
		tri.sort(tri);;
		tri.ifrectangular(tri);
		tri.ifobtuse(tri);
	}

}
