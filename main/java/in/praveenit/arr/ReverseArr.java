package in.praveenit.arr;

import java.util.Arrays;

public class ReverseArr {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int[] revarr = Arrays.stream(arr).boxed().sorted((a, b) -> Integer.compare(b, a)).mapToInt(Integer::intValue)
				.toArray();
		System.out.println(Arrays.toString(revarr));

	}

}
