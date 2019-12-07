import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person implements Comparable<Person> {
	
	String name;
	String surname; 
	int age; 
	public Person(String n, String s, int a) {
		this.name=n;
		this.surname=s;
		this.age=a;
	}
	    public String toString() {
	    	
	    	return this.name+" "+this.surname+" "+this.age+" lat";
	}
	 public int compareTo(Person o) {
			if(this.age==o.age) return 0;
		    if((this.age>o.age))return -1;
			else return 1;
     }
	 public String getName() {
		 return name;
	 }
	 public String getSurname() {
		 return surname;
	 }
	 int compare(Person object1, Person object2) {
		 return object1.getName().compareTo(object2.getName());
	 }
	public static void main(String[] args) {
		List<Person> list=new ArrayList<>();
		list.add(new Person("Daniel","Lipa",16));
		list.add(new Person("Romek","Weso³y",36));
		list.add(new Person("Amanda","Nielat",14));
		list.add(new Person("Izabela","Makarena",19));
		list.add(new Person("Alina","Bystra",60));
		System.out.println(list);
		System.out.println("=================================");
		System.out.println("Posortowana lista wiekiem: ");
		Collections.sort(list);
		System.out.println(list);
		
		
	}

}
