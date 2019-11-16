
public class Square extends Figure implements Resetable   {
	public int NumberOfSides=4 ; 
	public double side1;
	public double side2;
	public double side3;
	public double side4;
	public double angle1;
	public double angle2;
	public double angle3;
	public double angle4;
	
	public Square(double a,double b,double c,double d,double e, double f,double g,double h )
	{
		this.side1=a;
		this.side2=b;
		this.side3=c;
		this.side4=d;
		this.angle1=e;
		this.angle2=f;
		this.angle3=g;
		this.angle4=h;
	}
    public double calculateField()
	{
		double field =this.side1*this.side2*this.side3*this.side4;
		return field;
	}
    public double calculateCircumference()
	{
		double circumference=this.side1+this.side2+this.side3+this.side4;
		return circumference;
	}
	public void show()
	{
		System.out.println("D³ugoœæ 1 boku: "+side1);
		System.out.println("D³ugoœæ 2 boku: "+side2);
		System.out.println("D³ugoœæ 3 boku: "+side3);
		System.out.println("D³ugoœæ 4 boku: "+side4);
	}
	public void ifSquare()
	{
		if(side1==side2 && side2==side3 && side3==side4 && angle1==90 && angle2==90 && angle3==90 && angle4==90)
		{
			System.out.println("To jest Kwadrat");
		}
		else
		{
			System.out.println("To nie jest Kwadrat");
		}
	}
	public void printSideNumber() {
		System.out.println("Liczba boków wynosi: "+this.NumberOfSides);
		
	}
	public void resetAllAttributes()
	{
		this.side1=0;
		this.side2=0;
		this.side3=0;
		this.side4=0;
		this.angle1=0;
		this.angle2=0;
		this.angle3=0;
		this.angle4=0;
	}
}
