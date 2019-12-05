
public class NestedPerson  {
	
	public static void main(String args[])
	{
		Person a=new Person("Kamil", 18, "Wroclaw" , "11 listopada 14 m. 27 ", 12548563, 124578);
		Person.HealthSonda pa=a.new HealthSonda(1, "12 stycznia", "Nie" , "Apap");
		pa.ShowHealthSonda();
		
		Person b=new Person("Natalia", 36, "Warszawa" , "Pañska 40 m. 57", 658974, 321456);
		Person.HealthSonda pb=b.new HealthSonda(16, "14 lutego", "TAK" , "Eutanozan");
		pb.ShowHealthSonda();
		
		Person c=new Person("Michal", 24, "Kraków" , "Wyborowa 5 m.1", 753951, 357951);
		Person.HealthSonda pc=c.new HealthSonda(12, "15 maja", "TAK" , "2KC");
		
		Person d=new Person("Jan", 60, "Bydgoszcz", "Powstañców Œl¹skich 14 m.1", 456987, 789654);
		Person.HealthSonda pd=d.new HealthSonda(9, "2 grudnia", "NIE", "BRAK");
		pd.ShowHealthSonda();
				
	}

}
