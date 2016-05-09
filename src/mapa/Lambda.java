package mapa;

public class Lambda {
	
	public static void execute() {
		repeat(10, () -> System.out.print("This is change made from master!!!"));
	}

	public static void repeat(int n, IntConsumer action) {
		for(int i = 0; i<n; i++) action.accept(i);

	}
}
