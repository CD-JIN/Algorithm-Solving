
public class Decryption {
	public String solution(String cipher, int code) {
        String[] arr = cipher.split("");
        StringBuilder sb = new StringBuilder();
        for(int i = code-1; i < arr.length; i+=code) {
            sb.append(arr[i]);
        }
        String answer = sb.toString();
        return answer;
    }
	//
	public String solution1(String cipher, int code) {
        String answer = "";
        for(int i=code-1; i<cipher.length(); i+=code){
            answer += cipher.substring(i, i+1);
        }
        return answer;
    }
}
