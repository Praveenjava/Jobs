package in.praveenit.arr;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;

public class MaxAndMinNumbers {
	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5, 6);
		Optional<Integer> max = arr.stream().max(Integer::compareTo);
		max.ifPresent(value -> System.out.println("Max: " + value));

		Optional<Integer> min = arr.stream().min(Integer::compareTo);
		min.ifPresent(value -> System.out.println("Min: " + value));
	}

}
