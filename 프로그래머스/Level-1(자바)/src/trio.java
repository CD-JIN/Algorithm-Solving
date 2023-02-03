
public class trio {
	public int solution(int[] number) {
        int answer = 0;
        int sum = 0;
        for(int i = 0; i < number.length-2; i++) {
            int tmp1 = number[i];
            for(int j = i+1; j < number.length-1; j++) {
                int tmp2 = number[j];
                for(int n = j+1; n < number.length; n++) {
                    int tmp3 = number[n];
                    sum = tmp1+tmp2+tmp3;
                    if(sum==0) answer++;
                }
            }
        }
        return answer;
    }
}
