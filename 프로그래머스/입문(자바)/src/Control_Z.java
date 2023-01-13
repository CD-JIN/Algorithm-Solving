import java.util.*;

public class Control_Z {
	// 속도 차이는 크게 없는듯...
	public long solution(String s) {
        long answer = 0;
        String[] arr = s.split(" ");
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].equals("Z")) {
                answer -= Integer.parseInt(arr[i-1]);
            } else {
                answer += Integer.parseInt(arr[i]);
            }
        }
        return answer;
    }
	// stack 이용
	public int solution1(String s) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (String w : s.split(" ")) {
            if (w.equals("Z")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(w));
            }
        }
        for (int i : stack) {
            answer += i;
        }
        return answer;
    }
	// LinkedList 이용
	public int solution2(String s) {
        int answer = 0;
        LinkedList<Integer> numbers = new LinkedList<>();
        if (!s.isEmpty()) {
            String[] split_s = s.split(" ");
            for (int i = 0; i < split_s.length; i++) {
                if (split_s[i].equals("Z")) {
                    if (i - 1 >= 0 && numbers.size() > 0)
                        numbers.removeLast();
                }else numbers.add(Integer.valueOf(split_s[i]));
            }
        }
        for (Integer number : numbers) {
            answer += number;
        }
        return answer;
    }
}
