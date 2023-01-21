import java.util.*;
import java.util.stream.*;

public class Sort_Str2 {
	// Arrays.sort() 이용 방법
	public String solution(String my_string) {
        String str = my_string.toLowerCase();
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String answer = new String(chars);
        return answer;
    }
	//Java 8
	public String solution1(String my_string) {
        String answer = my_string.toLowerCase().chars()
                        .sorted()
                        .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();
        return answer;
    }
	//스트림
	public String solution2(String myString) {
        return Arrays.stream(myString.toLowerCase(Locale.ROOT).split("")).sorted().collect(Collectors.joining());
    }
}
