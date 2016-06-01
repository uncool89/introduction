package mapa;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.List;

public class mapa {
             //czemu ta klasa tak sie nazywa?
    // he?
	public static void main(String[] args) {
	List <String> testList = new ArrayList<>();
	testList.add("TEST");
	testList.add("NISSAN");
	testList.forEach((x)->System.out.println(x));
	testList.forEach(s -> System.out.println(s));
	Lambda.execute();
	}
	
	private void doNothing(final int a){
		
	}
}
