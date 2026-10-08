package in.praveenit.arr;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestNum {
	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(2, 3, 4, 5, 6, 1, 0);
		Integer secNum = arr.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
		System.out.println(secNum);

	}

}
