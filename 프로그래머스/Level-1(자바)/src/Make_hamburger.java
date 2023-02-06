import java.util.*;

public class Make_hamburger {
	// 리스트에 넣어주면서 조건확인해서 바로 제거.
	public int solution(int[] ingredient) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<Integer>(ingredient.length);
        for(int i = 0; i < ingredient.length; i++){
            list.add(ingredient[i]);
            if (list.size()>3 && 
        			list.get(list.size()-4)==1 &&
        			list.get(list.size()-3)==2 &&
        			list.get(list.size()-2)==3 &&
        			list.get(list.size()-1)==1) {
        		answer++;
        		for(int j=0; j<4; j++) {
        			list.remove(list.size()-1);
        		}
        	}
        }
        
        return answer;
    }
	// 스택 사용.. 스택은 안 쓰다보니... 손이 안감..
	public int solution1(int[] ingredient) {
        int[] stack = new int[ingredient.length];
        int sp = 0;
        int answer = 0;
        for (int i : ingredient) {
            stack[sp++] = i;
            if (sp >= 4 && stack[sp - 1] == 1
                && stack[sp - 2] == 3
                && stack[sp - 3] == 2
                && stack[sp - 4] == 1) {
                sp -= 4;
                answer++;
            }
        }
        return answer;
    }
}
