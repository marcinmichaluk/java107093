import java.util.HashMap;
import java.util.Map;

public class maps {
	
    public static void main(String[] args) {
		Map<Integer , String> map=new HashMap<Integer,String>();
		map.put( 980903093 , "Patrycja");
		map.put(937362542, "Weso³y Romek");
		map.put(65783213, "Izabela");
		map.put(839402932, "Jolanta");
		
		System.out.println(map.get(65783213));
		System.out.println(map.get(937362542));
	}

}
