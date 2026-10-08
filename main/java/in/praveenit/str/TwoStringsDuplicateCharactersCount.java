package in.praveenit.str;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TwoStringsDuplicateCharactersCount {
	public static void main(String[] args) {
		String s = "Praveen";
		String s1 = "Boyalapalli";

		String combine = s + s1;

		Map<Character, Long> collect = combine.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		collect.entrySet().stream().filter(entry -> entry.getValue() > 1)
				.forEach(entry -> System.out.println(entry.getKey() + ":" + entry.getValue()));

	}

}
