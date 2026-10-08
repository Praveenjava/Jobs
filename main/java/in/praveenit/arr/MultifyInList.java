package in.praveenit.arr;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MultifyInList {
	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);
		Optional<Integer> mul = arr.stream().reduce((a, b) -> a * b);
		
		if(mul.isPresent()) {
			System.out.println(mul.get());
		}
	}

}
