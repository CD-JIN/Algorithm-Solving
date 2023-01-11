
public class upper_and_lower_case_letters {
	public String solution(String my_string) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        for(char c : arr) {
            if(65<=c&&c<=90) {
                c = Character.toLowerCase(c);
                answer += c;
            } else if(97<=c&&c<=122) {
                c = Character.toUpperCase(c);
                answer += c;
            }
        }
        return answer;
    }
	// 이게 훨씬 빠름...
	public String solution1(String my_string) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++){
            char c = my_string.charAt(i);
            if(Character.isUpperCase(c)){
                answer += String.valueOf(c).toLowerCase();
            }else{
                answer += String.valueOf(c).toUpperCase();
            }
        }
        return answer;
    }
}
