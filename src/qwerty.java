import java.util.function.Function;

public class qwerty {

	public static void main(String[] args) {
		Function<Integer,Integer> fun=Logic::m;
		System.out.println(fun.apply(23));
	}
}
