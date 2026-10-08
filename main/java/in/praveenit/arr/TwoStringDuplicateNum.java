package in.praveenit.arr;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TwoStringDuplicateNum {
	public static void main(String[] args) {
		int[] arr1 = { 2, 3, 4, 5, 6 };
		int[] arr2 = { 6, 7, 8, 4, 1 };

		List<Integer> collect = Arrays.stream(arr2).boxed().collect(Collectors.toList());
		List<Integer> collect2 = Arrays.stream(arr1).filter(collect::contains).distinct().boxed()
				.collect(Collectors.toList());
		System.out.println(collect2);
	}

}
