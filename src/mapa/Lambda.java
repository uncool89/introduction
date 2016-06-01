package mapa;

import java.util.stream.IntStream;

public class Lambda {
	
	public static int g = 10;
	private String de = "Moja Toyota to najlepsza robota";
	private String me = "Honda is very good car";

	public static void execute() {
		repeat(10, () -> new Object());
		repeat(10, () -> System.out.print("Zajac je marchewke"));
	}
	

	public static void repeat(int n, Runnable action) {
		for(int i = 0; i<n; i++) action.run();

	}

	private void doSomethingSpecial() {
		System.out.print("Nothing special");
	}
	
	private Object doSomethingSpecial(final int d) {
		final int o = d;
		System.out.print("Nothing special");
		return o;
	}
	
	private double doSomethingSpecial(final double d) {
		final double o = d;
		System.out.print("Nothing special");
		return o;
	}
	
	private void doSomethingSpecial(final boolean d) {
		System.out.print("Nothing special");
	}

}
