import java.util.*;

public class Plus_hiddenNumbers {
	public int solution(String my_string) {
        for(int i = 0; i<my_string.length(); i++) {
            if(('a'<=my_string.charAt(i)&&my_string.charAt(i)<='z')||
               ('A'<=my_string.charAt(i)&&my_string.charAt(i)<='Z')) {
                my_string = my_string.replaceFirst(Character.toString(my_string.charAt(i)), " ");
            }
        }
        int answer = 0;
        String[] arr = my_string.trim().split(" ");
        for(String str : arr) {
            if(!str.equals("")){//For -> java.lang.NumberFormatException: For input string: ""
                answer += Integer.parseInt(str);
            }
        }
        return answer;
    }
	//  더 깔끔한 버전
	public int solution1(String my_string) {
        int answer = 0;

        String[] str = my_string.replaceAll("[a-zA-Z]", " ").split(" ");

        for(String s : str){
            if(!s.equals("")) answer += Integer.valueOf(s);
        }

        return answer;
    }
	//정규식 + Arrays.stream
	public int solution2(String myString) {
        return Arrays.stream(myString.split("[A-Z|a-z]")).filter(s -> !s.isEmpty()).mapToInt(Integer::parseInt).sum();
    }
}
