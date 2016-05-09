package mapa;

import java.util.ArrayList;
import java.util.List;

public class mapa {

	public static void main(String[] args) {
	List <String> testList = new ArrayList<>();
	testList.add("BMW");
	testList.add("OPEL");
	testList.forEach((x)->System.out.println(x));
	}
}
