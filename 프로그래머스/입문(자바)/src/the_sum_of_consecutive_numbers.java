import java.util.*;

public class the_sum_of_consecutive_numbers {
	// 나의 풀이
	public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int mid = total/num;
        answer[0] = mid;
        for(int i = 1; i < answer.length; i++) {
            if(i%2==0){// 짝수일 경우
                answer[i] = mid-(i/2);
            }else {// 홀수일 경우
                answer[i] = mid+(i/2+1);
            }
        }
        // 오름차순 정렬
        Arrays.sort(answer);
        return answer;
    }
	// 시작값을 구해주는 경우... 첨에는 이생각을 못햇네..
	public int[] solution1(int num, int total) {
        int[] answer = new int[num];
        int check = num*(num+1) / 2;
        int start = (total - check) / num + 1;
        for (int i = 0; i < answer.length; i++) {
                answer[i] = start + i ;
        }
        return answer;
}
}
