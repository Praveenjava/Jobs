package in.praveenit.arr;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddAndEvenNumbers {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		List<Integer> even = Arrays.stream(arr).filter(n -> n % 2 == 0).boxed().collect(Collectors.toList());
		List<Integer> odd = Arrays.stream(arr).filter(n -> n % 2 != 0).boxed().collect(Collectors.toList());
		System.out.println(even);
		System.out.println(odd);

	}

}
