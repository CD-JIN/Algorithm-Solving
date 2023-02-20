import java.util.*;

public class correct_parentheses {
	boolean solution(String s) {
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='(') {
                stack.push(1);
            } else {
                // 비어 있는데 ')' 나오면 올바른 괄호가 아님
                if(stack.empty()==true) return false;
                else stack.pop();
            }
        }
        if(stack.empty()==true) return true;
        else return false;
    }
	
	// stack 없이 풀이 방법
	boolean solution1(String s) {
        boolean answer = false;
        int count = 0;
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i) == '('){
                count++;
            }
            if(s.charAt(i) == ')'){
                count--;
            }
            if(count < 0){
                break;
            }
        }
        if(count == 0){
            answer = true;
        }

        return answer;
    }
}
