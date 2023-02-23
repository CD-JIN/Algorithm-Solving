import java.util.*;

public class How_to_get_in_line {
	public int[] solution(int n, long k) {
        int[] answer = new int[n];
        ArrayList<Integer> list = new ArrayList<>();
        
        long factorial = 1;
        for(int i = 1; i <= n; i++) {
            list.add(i);
            factorial *= i;
        }
        
        k--;
        int index = 0;
        while(index < n) {
            factorial /= n - index;
            answer[index++] = list.remove((int) (k/factorial)); // list.remove(index)
            k %= factorial;
        }
        
        return answer;
    }
}
