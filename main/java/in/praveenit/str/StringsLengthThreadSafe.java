package in.praveenit.str;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

public class StringsLengthThreadSafe {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Banana", "Mango", "Apple", "Kiwi");
		ConcurrentMap<Integer, List<String>> collect = words.stream()
				.collect(Collectors.groupingByConcurrent(String::length));
		System.out.println(collect);

	}

}
