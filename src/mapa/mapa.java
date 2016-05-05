package mapa;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class mapa {

	public static void main(String[] args) {
	Map<String, String> map = new HashMap<String, String>();
	map.put("1", "Honda");
	map.put("2", "Ford");
	map.put("3", "Fiat");
	
	//loop a Map
	for (Map.Entry<String, String> entry : map.entrySet()) {
		System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
	}
	
	String value = map.get("1").toLowerCase();
	System.out.print(value);
	String value1 = map.get("3").toLowerCase();
	System.out.print(value1);

    System.out.println("Key set values are: " + map.keySet());
	
	
	}
}
