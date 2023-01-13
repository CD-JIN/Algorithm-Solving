import java.util.*;

public class Count_number7 {
	public int solution(int[] array) {
        int answer = 0;
        for(int a : array){
            while(a != 0){
                if(a % 10 == 7){
                    answer++;
                }
                a /= 10;
            }
        }
        return answer;
    }
	
	public int solution1(int[] array){
	       int answer = 0;
	       String str = Arrays.toString(array);
	       for(int i = 0; i < str.length(); i++){
	            if(str.charAt(i) == '7'){
	                answer++;
	            }
	       }
	       return answer;
	    }
}
