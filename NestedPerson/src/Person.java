
public class Person {
	
        class HealthSonda{
		
		int ID;
		String dateOfLastVisit;
		String allergy;
		String medicines; 
		
		public HealthSonda(int i, String dolv, String al, String med)
		{
			this.ID=i;
			this.dateOfLastVisit=dolv;
			this.allergy=al;
			this.medicines=med;
		}
		
		public void ShowHealthSonda() 
		{
			System.out.println("Imiê: "+ name + ", "+ age+ " lat- "+city+" .");
			System.out.println("Numer porz¹dkowy: "+ this.ID );
			System.out.println("Data ostatniej wizyty: " + this.dateOfLastVisit);
			System.out.println("Alergia: "+this.allergy);
			System.out.println("Przypisane leki: "+this.medicines);
			System.out.println("===========================================================================");
			System.out.println();
		}
	}
	
	String name;
	int age; 
	String city;
	String address; 
	int NationalInsuranceNumber;
	int IdCardNumber;
	
	public Person(String n , int a, String c, String ar, int NIN, int IDCN)
	{
		this.name=n;
		this.age=a;
		this.city=c;
		this.address=ar;
		this.NationalInsuranceNumber=NIN;
		this.IdCardNumber=IDCN;	
		
	}

}
