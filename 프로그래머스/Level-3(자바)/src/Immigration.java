import java.util.*;

public class Immigration {
	public long solution(int n, int[] times) {
        long answer = Long.MAX_VALUE;
        Arrays.sort(times);
    
        long L = times[0];
        long R = (long)n*times[times.length-1]; //long 형변환 안해줘서 시간오래걸림...
        
        while(L <= R) {
            long mid = (L + R) / 2;
            long sum = 0; // 총 심사한 인원
            for (int i = 0; i < times.length; i++) { 
                sum += mid / times[i];
                
                if(sum >= n) break;
            }
            if (n > sum) { 
                L = mid + 1;
            } else { 
                R = mid - 1;
                answer = mid;
            }
        }
        return answer;
    }
}
