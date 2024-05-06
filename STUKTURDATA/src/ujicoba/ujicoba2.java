package ujicoba;

public class ujicoba2 {
	
	
	
	import java.util.ArrayList;

	    public static void  main(String[] pratiku) {
	        ArrayList<String> fruits = new ArrayList<>();
	        fruits.add("Apple");
	        fruits.add("Banana");
	        fruits.add("Cherry");
	        fruits.remove("Banana");
	        System.out.println("ArrayList after removing Banana: " + fruits);
	        fruits.remove(1);
	        System.out.println("ArrayList after removing element at index 1: " + fruits);
	    }
	}

}
