package mapa;

public class Lambda {
	
	public static void execute() {
		repeat(10, () -> System.out.print("Wow!!!"));
	}

	public static void repeat(int n, Runnable action) {
		for(int i = 0; i<n; i++) action.run();
	}
}