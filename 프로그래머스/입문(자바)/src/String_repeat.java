
public class String_repeat {
	// 생각보다 느림... 1~2ms
	public String solution1(String my_string, int n) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        for(char ch : arr) {
            for(int i = 1; i <=n; i++) {
                answer += Character.toString(ch);;
            }
        }
        return answer;
    }
	// 비슷한데... solution1보다 조금 빠름
	public String solution2(String my_string, int n) {
        String answer = "";
        String[] arr = my_string.split("");
        for(String s : arr) {
            for(int i = 1; i <=n; i++) {
                answer += s;
            }
        }
        return answer;
    }
	// 7~9 사이 속도...
	public String solution3(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        for(char c : my_string.toCharArray()){
            sb.append((c + "").repeat(n));
        }
        return sb.toString();
    }
}
