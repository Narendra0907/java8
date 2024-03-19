
public class MethodReference {

	static void m() {
		System.out.println("m1 m3thod");
	}

	public static void main(String[] args) {
		FunctionalInterface1 fun=MethodReference::m;
	}
}
