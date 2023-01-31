import java.util.*;

public class fruit_seller {
	// 생각나는대로 해버리니 성능 구짐..
	public int solution(int k, int m, int[] score) {
        int answer = 0;
        Integer[] tmp = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(tmp, Collections.reverseOrder());
        for(int i = m-1; i < tmp.length; i += m) {
            answer += tmp[i]*m;
        }
        return answer;
    }
	// 내림차순 정렬 안하고 for문에서 해결하기
	public int solution1(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        for(int i = score.length; i >= m; i -= m){
            answer += score[i - m] * m;
        }
        return answer;
    }
	// 더 성능 좋은게 없을까??...
}
