import java.util.HashMap;
import java.util.Map;

public class StreamOnMap {

	public static void main(String[] args) {
		Map<String, Float> bank = new HashMap<>();
		
		bank.put("Sanjay", 1500f);
		bank.put("Anil", 1600f);
		bank.put("Praveen", 1700f);
		bank.put("Sachin", 1800f);
		
		bank.entrySet()  //returns Set<Map.Entry<Key, Value>>
			.stream()
			.forEach(entry -> System.out.println(entry.getKey()+" : " + entry.getValue()));
		System.out.println("-".repeat(100));
		
		//forEach on a Map  - forEach(java.util.function.BiConsumer<? super K, ? super V>);
		bank.forEach((key, value) -> System.out.println(key+ " : "+ value));
	}

}
