import java.util.*;

public class the_nearest_same_letter {
	public int[] solution(String s) {
        int[] answer = new int[s.length()];
        String[] arr = s.split("");
        HashMap<String, Integer> map = new HashMap<>();
        // map key에는 글자, value에는 index(위치)
        for(int i = 0; i < answer.length; i++) {
            if(!map.containsKey(arr[i])) { // 키가 없을 경우
                answer[i] = -1;
                map.put(arr[i], i);
            } else { // 키가 있을 경우
                answer[i] = i-map.get(arr[i]);
                map.replace(arr[i], i);
            }
        }
        return answer;
    }
	// 다른사람 풀이.. 다 비슷하게 map 사용. 
	// 이 풀이는 map 사용 없이 했음..
	 public int[] solution1(String s) {
	        int[] answer = new int[s.length()];

	        answer[0] = -1;
	        for(int i = 1; i < s.length(); i++){
	            for(int j = i-1; j >= 0; j--){
	                if(s.charAt(i) == s.charAt(j)){
	                    answer[i] = i - j;
	                    break;
	                }
	            }
	            if(answer[i] == 0) answer[i] = -1;
	        }
	        return answer;
	    }
}
