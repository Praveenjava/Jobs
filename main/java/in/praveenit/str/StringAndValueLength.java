package in.praveenit.str;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringAndValueLength {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Banana", "Apple", "Kiwi","Mango");
		Map<String, Integer> collect = words.stream().collect(Collectors.toMap(Function.identity(), String::length));
		System.out.println(collect);
	}

}
