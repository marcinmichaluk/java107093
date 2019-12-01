
public class Student extends UniversityPerson {
	int index;
	String school;
	final String status="Student";
	double average;
	int year;
	public Student(String n, int a, String coun ,String c, String l, String pass, int in, String sc, double av, int ye)
	{
		this.name=n;
		this.age=a;
		this.country=coun;
		this.city=c;
		this.login=l;
		this.password=pass;
		this.index=in;
		this.school=sc;
		this.average=av;
		this.year=ye;
	}
	public void changePass(String p)
	{
		this.password=p;
	}
	
	public void show()
	{
		System.out.println("Moj status to: "+this.status);
		System.out.println("Mam na imie "+this.name+" i "+this.age+" lat, jestem studentem "+this.year+" roku.");
		System.out.println("Pochodze z "+this.country+" z miasta "+this.city);
		System.out.println("Uczê siê na "+ this.school + "moj numer indexu to: "+this.index + " a srednia moich ocen to "+this.average);
		System.out.println("------------------------------------------------------------------------------------------------------------");
	}

}
