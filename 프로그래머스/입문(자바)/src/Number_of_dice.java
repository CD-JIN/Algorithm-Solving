
public class Number_of_dice {
	public int solution(int[] box, int n) {
        int answer = 1;
        for(int l : box) {
            if(l<n) return 0;
            answer *= l/n;
        }
        return answer;
    }
}
