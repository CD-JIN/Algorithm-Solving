import java.util.*;

public class Choose_a_multiple_of_N {
	public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> li = new ArrayList<>();
        for(int i : numlist) {
            if(i%n==0) {
                li.add(i);
            }
        }
        int[] answer = new int[li.size()];
        int index = 0;
        for(int i : li){
            answer[index++] = i;
        }
        return answer;
    }
	
	// 시간은 오래걸리지만 스트림으로 한줄.. 대단..
	public int[] solution1(int n, int[] numList) {
        return Arrays.stream(numList).filter(value -> value % n == 0).toArray();
    }
}
