
public class food_fighter_competition {
	public String solution(int[] food) {
		// 쉬웠다...
		StringBuilder answer = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < food.length; i++) {
            for(int j = 1; j <= food[i]/2; j++){
                sb.append(i);  
            }            
        }
        StringBuilder reverseSb = new StringBuilder();
        answer.append(sb+"0");
        reverseSb.append(sb.reverse());
        answer.append(reverseSb);
        return answer.toString();
    }
}
