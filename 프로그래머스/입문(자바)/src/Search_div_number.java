import java.util.*;

public class Search_div_number {
	// 반환값 귀찬아서 int[] -> Integer[]로 바꿔버림..
	public Integer[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1 ; i <= n ; i++) {
            if(n%i==0) {
                list.add(i);
            }
        }
        Integer[] answer = list.toArray(new Integer[0]);
        return answer;
    }
	//이렇게 할까 하다가... 리스트 써보고 싶어서..
	public int[] solution1(int n) {
        int[] answer = new int[n];
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                cnt++;
            }
        }
        answer = new int[cnt];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer[index] = i;
                index++;
            }
        }
        return answer;
    }
}
