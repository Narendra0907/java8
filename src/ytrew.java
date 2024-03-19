import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class ytrew {

	public static void main(String[] args) {
		Integer[] numbers = { 12, 23, 34, 45, 56, 67, 78, 89, 90, };
		List<Integer> asList = Arrays.asList(numbers);

		asList.stream().map((x) -> {
			return x * x*x;
		}).filter((x) -> x >50).
		forEach((x) -> System.out.println(x));

	}
}
