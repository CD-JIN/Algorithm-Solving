import java.util.*;

public class Remove_pair {
	// String 이용 버전
	public int solution(String s) {
 
        String[] arr = s.split("");
        Stack<String> stack = new Stack<>();
        for(int i = 0; i < arr.length; i++) {
            String str = arr[i];
            if(stack.isEmpty()) stack.push(str);
            else {
                if(stack.peek().equals(str)) {
                    stack.pop();
                } else {
                    stack.push(str);
                }
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }
	// char 이용 버전. 이게 더 빠름..
	public int solution1(String s) {

        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < arr.length; i++) {
            char c = arr[i];
            if(stack.isEmpty()) stack.push(c);
            else {
                if(stack.peek().equals(c)) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }
}
