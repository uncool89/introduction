package mapa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class mapa {

	public static void main(String[] args) {
    String test = "test";
    List <String> testList = new ArrayList<>();
    testList.add("BMW");
	Map<String, String> map = new HashMap<String, String>();
	map.put("1", "Audi");
	map.put("2", "Mercedes");
	map.put("3", "BMW");
	
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
	
	private static void doSomething(){
		System.out.println.("Do something");
	}
}
