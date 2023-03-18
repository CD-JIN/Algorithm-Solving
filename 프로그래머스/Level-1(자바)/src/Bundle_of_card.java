import java.util.*;

public class Bundle_of_card {
	// 쉬운 풀이
	public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int idx1 = 0;
        int idx2 = 0;

        for(int i = 0 ; i < goal.length; i++) {
            if(idx1 < cards1.length && goal[i].equals(cards1[idx1])) {
                idx1++;
                continue;
            } else if(idx2 < cards2.length && goal[i].equals(cards2[idx2])) {
                idx2++;
                continue;
            } else {
                answer = "No";
                return answer;
            }
        }
        return answer;
    }
	
	
	// 큐 연습용
	
	static Queue<String> card1, card2, G;
    
    public String solution1(String[] cards1, String[] cards2, String[] goal) {
        card1 = create(cards1);
        card2 = create(cards2);
        G = create(goal);
        
        String answer = check();
        
        return answer;
    }
    
    static Queue<String> create(String[] arr) {
        Queue<String> tmp = new LinkedList<>();
        
        for(int i = 0; i < arr.length; i++) {
            tmp.add(arr[i]);            
        }
        return tmp;
    }
    
    static String check() {        
        String ans = "Yes";
        
        String tmp = "";
        while(!G.isEmpty()){
            tmp = G.poll();
            if(tmp.equals(card1.peek())) card1.poll();
            else if(tmp.equals(card2.peek())) card2.poll();
            else return "No";                                               
        }        
        return ans;
    }
}
