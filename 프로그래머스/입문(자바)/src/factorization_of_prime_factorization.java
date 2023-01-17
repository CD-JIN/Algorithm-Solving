import java.util.*;

public class factorization_of_prime_factorization {
	// set, stream 둘다 써봣는데 테스트는 통과하지만 제출에서 탈락..
	// 몇몇 제출 테스트에서 통과가 안된다...
	public int[] solution(int n) {
        Set<Integer> set = new HashSet<>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                set.add(i);
                n /= i;
            }
        }
        int[] answer = new int [set.size()];
        Iterator<Integer> it = set.iterator();
        int i=0;
        while (it.hasNext()){
            answer[i] = it.next();
            i++;
        }
        // 정렬 하는거랑 안하는거랑 차이가 있는지 몰겠다...
        // 분명히 순서대로면 정렬이 필요가 없는디...
        // 일단 정렬해야 정답이라 해놓음.. 생각 정리가 필요
        Arrays.sort(answer);
        return answer;
    }
}
