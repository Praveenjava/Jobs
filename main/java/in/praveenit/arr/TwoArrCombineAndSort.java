package in.praveenit.arr;

import java.util.Arrays;
import java.util.stream.Stream;

public class TwoArrCombineAndSort {
	public static void main(String[] args) {
		int[] i = { 1, 2, 3, 4, 5 };
		int[] j = { 6, 7, 8, 9, 0 };

		Object[] array = Arrays.stream(new int[][] { i, j }).flatMapToInt(Arrays::stream).boxed()
				.sorted((a, b) -> a - b).toArray();
		System.out.println(Arrays.toString(array));

	}

}
