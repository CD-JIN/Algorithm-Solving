
public class Reverse_String {
	// 1.StringBuffer, StringBuilder 이용해서 뒤집기
    public String solution(String my_string) {
        StringBuffer sb = new StringBuffer(my_string);
        String answer = sb.reverse().toString();
        return answer;
    }
    // 2.char[] 로 변환하여 뒤집기 
    // 3.List로 변환 후 Collections.reverse(list) 이용하여 뒤집기
}
