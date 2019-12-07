
public class Main<T> {	
	
	protected Main(){
		
	}
	boolean contains (T[] a, T el) {
		for(int i=0; a.length>i; i++){
			if(a[i].equals(el))return true; 
		}
		return false;
	}
	public static void main(String args[]){
		String[] array = {"element", "item"};
	    String element1 = "element";
	    String element2 = "element2";
	    
	    Main main = new Main();
	    System.out.println(main.contains(array, element1));
	    System.out.println(main.contains(array, element2));
	}

}
