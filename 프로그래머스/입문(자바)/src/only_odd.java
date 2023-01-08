import java.util.*;

public class only_odd {
	 public int[] solution1(int n) {
	        int[] answer;
	        int index = 0;
	        if(n%2==0) answer = new int[n/2];
	        else answer = new int[n/2+1];
	        for(int i = 1; i <= n; i += 2) {
	            answer[index] = i;
	            index++;
	        }
	        return answer;
	    }
	 
	 public int[] solution2(int n) {
	        int[] temp = new int[n];
	        int index = 0;
	        for(int i = 1; i <= n; i += 2) {
	            temp[index] = i;
	            index++;
	        }
	        int[] answer = Arrays.copyOfRange(temp, 0, index);
	        return answer;
	    }
}
