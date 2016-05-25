package mapa;

import java.util.stream.IntStream;

public class Lambda {
	
	public static void execute() {
		repeat(10, () -> new Object());
	}

	public static void repeat(int n, Runnable action) {
		for(int i = 0; i<n; i++) action.run();

	}

	
	private void doSomethingSpecial() {
		System.out.print("Nothing special");
	}
	
	public void doSomethingSpecial(final String nothingSpecial) {
		System.out.print(nothingSpecial);
	}

}
