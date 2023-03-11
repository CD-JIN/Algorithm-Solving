
public class carpet {
	public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;
        
        for(int i = 3; i < sum; i++) {
            int tmp = sum / i;
            
            if(sum%i==0 && tmp>=3) {
                int row = Math.min(i, tmp);
                int col = Math.max(i, tmp);
                int yellowValue = (row-2) * (col-2);
                if(yellowValue == yellow) {
                    answer[0] = col;
                    answer[1] = row;
                }
            }
        }
        return answer;
    }
}
