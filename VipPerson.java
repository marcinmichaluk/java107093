
public class VipPerson extends Person {

	double salary; 
	
	public VipPerson(String n,int a, String c, String ci, double s)
	{
		this.name=n;
		this.age=a;
		this.country=c;
		this.city=ci;
		this.salary=s;
	}
	public void show()
	{
		System.out.println("Imiê: "+this.name);
		System.out.println("wiek= "+this.age);
		System.out.println("kraj: "+this.country);
		System.out.println("miasto= "+this.city);
		System.out.println("pensja= "+this.salary);
		System.out.println("-----------------------");
	}

}
