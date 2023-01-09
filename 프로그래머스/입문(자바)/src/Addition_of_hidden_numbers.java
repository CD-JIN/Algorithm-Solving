import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Addition_of_hidden_numbers {
	// 아스키 코드 이용해서 숫자인지 체크하고 Integer로 변환 후 더하기
	// 나의 풀이..
	public int solution(String my_string) {
        int answer = 0;
        char[] arr = my_string.toCharArray();
        for(char c : arr) {
            if(49<=c && c<=57) {
                answer += Integer.valueOf(c)-48;
            }
        }
        return answer;
    }
	// 다른사람들 풀이
	public int solution1(String my_string) {
        int answer = 0;
        for(int i=0; i<my_string.length(); i++){
            if(Character.digit(my_string.charAt(i), 10) > 0){
                answer += Integer.parseInt(String.valueOf(my_string.charAt(i)));
            }
        }
        return answer;
    }
	// 정규식 이용한 풀이
	public int solution2(String my_string) {
        int answer = 0;
        String pattern = "^[0-9]*$";
        String[] list = my_string.split("");

        for(int i = 0; i < list.length; i ++) {
            if(Pattern.matches(pattern,list[i])) {
                answer += Integer.parseInt(list[i]);
            }
        }
        return answer;
    }
	// 람다
	public int solution3(String myString) {
        return myString.chars().mapToObj(i -> (char) i).filter(Character::isDigit).map(String::valueOf).mapToInt(Integer::valueOf).sum();
    }

}
