package in.praveenit.str;

import java.util.Map;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class RepeatedWord {
	public static void main(String[] args) {
		String s = "Hi Hello Enjoy Hi Enjoy";

		Pattern pattern = Pattern.compile("\\s+");
		Map<String, Long> collect = pattern.splitAsStream(s)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		collect.entrySet().stream().filter(entry -> entry.getValue() > 1)
				.forEach(entry -> System.out.println(entry.getKey() + ":" + entry.getValue()));
	}

}
