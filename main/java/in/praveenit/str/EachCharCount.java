package in.praveenit.str;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EachCharCount {
	public static void main(String[] args) {
		String s = "Praveen";
		Map<Character, Long> collect = s.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		collect.forEach((Character, count) -> System.out.print(Character + ":" + count));
	}

}
