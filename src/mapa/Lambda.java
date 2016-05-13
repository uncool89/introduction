package mapa;

import java.util.stream.IntStream;

public class Lambda {
	
	public static void execute() {
		IntStream.range(0,10).forEach(value -> System.out.println("Do it: "+value));
	}

	public static void repeat(int n, Runnable action) {
		for(int i = 0; i<n; i++) action.run();

	}


}
