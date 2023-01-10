
public class Remove_vowels {
	// 나의 풀이 속도 : 0.05 ~ 0.08
	public String solution(String my_string) {
        String remove = "aeiou";
        String answer = my_string;
        for(char c : remove.toCharArray()) {
            answer = answer.replace(String.valueOf(c), "");
        }
        return answer;
    }
	// 정규식 replaceAll() 속도 0.07 ~ 0.18
	public String solution1(String my_string) {
        String answer = "";

        answer = my_string.replaceAll("[aeiou]", "");

        return answer;
    }
	// StringBuilder이용 속도 0.04 ~ 0.07
	public String solution2(String my_string) {
        StringBuilder sb = new StringBuilder();
        for(char c : my_string.toCharArray()){
            if(c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u'){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
