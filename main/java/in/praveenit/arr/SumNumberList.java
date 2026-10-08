package in.praveenit.arr;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumNumberList {
	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(1,2,3,4,5);
		Integer sum = arr.stream().collect(Collectors.reducing(0,Integer::sum));
		System.out.println(sum);
	}

}
