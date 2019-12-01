
public class zadaniePerson {
	
	public static void main(String[] args) {
		VipPerson marek=new VipPerson("Marek",36,"Grecja","Ateny", 36980);
		marek.show();
		VipPerson pati=new VipPerson("Patrycja",19,"W³ochy","Mediolan", 76048);
		pati.show();

		Student iza=new Student("Izabela", 20, "Polska", "Warszawa", "Izabelak", "Makarówka59" ,107938, "Politechnika Warszawska", 4.2 , 1);
		iza.show();
		Student John=new Student("John", 22, "United Kingdom", "Huntington", "John123", "Johnsoninio", 105387, "University of Cambridge", 4.5, 3);
		John.show();

		Teacher jan=new Teacher("Jan", 43, "Polska", "Bydgoszcz", "Janko14", "4pancerni", "Uniwersytet Kardyna³a Stefana Wyszyñskiego", "matematyka");
		jan.show();
		Teacher rom=new Teacher("Roman", 50, "Rosja", "Moskwa", "Roman4761", "sqrt4761", "Uniwersytet Warszawaski", "Filozofia");
		rom.show();
	}

}
