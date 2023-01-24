
public class cut_paper {
	// 나만 어렵게 생각해서 풀었나봐...
	public int solution(int M, int N) {
        int answer = 0;
        int temp1 = 0;
        int temp2 = 0;
        int min = Math.min(M, N);
        int max = Math.max(M, N);
        if(M==1 && N==1) return 0;
        while(min>1) {
            if(min!=1) {
                min--;
                temp1++;
            }
        }
        while(max>1) {
            if(max!=1) {
                max--;
                temp2++;
            }
        }
        answer = temp1+((temp1+1)*temp2);
        return answer;
    }
	// 하..
	public int solution1(int M, int N) {
        return M * N - 1;
    }
}
