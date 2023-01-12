import java.util.*;

public class Morse_code {
	// 주의: string 비교는 equals()... 까먹지 말자..
	public String solution(String letter) {
        String[] mo = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] alpa = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String answer = "";
        String[] arr = letter.split(" ");
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < mo.length; j++) {
                if(arr[i].equals(mo[j])) {
                    answer += alpa[j];
                    break;
                }
            }
        }
        return answer;
    }
	
	// Map이용 이게 조금 더 느린듯..
	public String solution1(String letter) {
	       Map<String, String> alphabetMap = new HashMap<>() {
	            {
	                put(".-", "a");
	                put("-...", "b");
	                put("-.-.", "c");
	                put("-..", "d");
	                put(".", "e");
	                put("..-.", "f");
	                put("--.", "g");
	                put("....", "h");
	                put("..", "i");
	                put(".---", "j");
	                put("-.-", "k");
	                put(".-..", "l");
	                put("--", "m");
	                put("-.", "n");
	                put("---", "o");
	                put(".--.", "p");
	                put("--.-", "q");
	                put(".-.", "r");
	                put("...", "s");
	                put("-", "t");
	                put("..-", "u");
	                put("...-", "v");
	                put(".--", "w");
	                put("-..-", "x");
	                put("-.--", "y");
	                put("--..", "z");
	            }
	        };
	        String answer = "";
	        String[] arr = letter.split(" ");
	        for (String str : arr) {
	            answer += alphabetMap.get(str);
	        }
	        return answer;
	    }
}
