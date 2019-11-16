
public class Zadanie {
	
 public static void main(String[] arg)
 {
	 System.out.println("Kwadrat 1 ");
	 Square a=new Square(2,2,2,2,90,90,90,90) ;
	 a.ifSquare();
	 System.out.println("Pole wynosi:"+a.calculateField());
	 System.out.println("Obwod wynosi: "+a.calculateCircumference());
	 a.show();
	 a.printSideNumber();
	 a.resetAllAttributes();
	 a.show();
	 
	 System.out.println("Kwadrat2 ");
	 Square b=new Square(2,3,2,2,90,90,90,90) ;
	 b.ifSquare();
	 System.out.println("Pole wynosi:"+b.calculateField());
	 System.out.println("Obwod wynosi: "+b.calculateCircumference());
	 b.show();
	 b.printSideNumber();
	 b.resetAllAttributes();
	 b.show();
	 
	 System.out.println("Kwadrat3 ");
	 Square c=new Square(3,3,3,3,45,90,90,90) ;
	 c.ifSquare();
	 System.out.println("Pole wynosi:"+c.calculateField());
	 System.out.println("Obwod wynosi: "+c.calculateCircumference());
	 c.show();
	 c.printSideNumber();
	 c.resetAllAttributes();
	 c.show();
	 
	 System.out.println("Kwadrat4 ");
	 Square d=new Square(2,2,2,2,40,40,40,40) ;
	 d.ifSquare();
	 System.out.println("Pole wynosi:"+d.calculateField());
	 System.out.println("Obwod wynosi: "+d.calculateCircumference());
	 d.show();
	 d.printSideNumber();
	 d.resetAllAttributes();
	 d.show();
 }
}
