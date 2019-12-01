
public class Teacher extends UniversityPerson {
	final String status="Nauczyciel";
	String school;
	String subject;
	
	public Teacher(String n, int a, String coun ,String c, String l, String pass, String sc, String sub)
	{
		this.name=n;
		this.age=a;
		this.country=coun;
		this.city=c;
		this.login=l;
		this.password=pass;
		this.school=sc;
		this.subject=sub;
	}
	public void changePass(String p)
	{
		this.password=p;
	}
	public void show()
	{
		System.out.println("Status: "+this.status);
		System.out.println("----------------------");
		System.out.println("Mam na imie "+this.name+" i "+this.age);
		System.out.println("Pochodze z "+this.country+" z miasta "+this.city);
		System.out.println("Uczê na "+this.school+" przedmiotu: "+this.subject);
		System.out.println("------------------------------------------------------------------------------------------------------------");
	}
}
