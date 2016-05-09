package mapa;

import java.util.ArrayList;
import java.util.List;

public class mapa {

	public static void main(String[] args) {
	List <String> testList = new ArrayList<>();
	testList.add("FERRARI");
	testList.add("HONDA");
	testList.forEach((x)->System.out.println(x));
	}
}
