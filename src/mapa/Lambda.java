package mapa;

public class Lambda {
	
	public static void execute() {
		repeat(10, () -> System.out.print("Change this!!!"));
	}

	public static void repeat(int n, Runnable action) {
		for(int i = 0; i<n; i++) action.run();

	}
	
	private void doSomethingSpecial() {
		System.out.print("Nothing special");
	}
}
