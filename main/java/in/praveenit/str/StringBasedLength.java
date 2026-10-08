package in.praveenit.str;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringBasedLength {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Banana", "Mango", "Apple", "Kiwi");
		List<String> collect = words.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());

		System.out.println(collect);
	}

}
