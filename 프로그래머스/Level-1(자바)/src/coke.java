
public class coke {
	public int solution(int a, int b, int n) {
        int answer = 0;
        int tmp = 0;
        while(n>=a) {
            answer += (n/a)*b;
            tmp = n%a;
            n = (n/a)*b+tmp;
        }
        return answer;
    }
	// 다른 사람 풀이
	public int solution1(int a, int b, int n) {
        return (n > b ? n - b : 0) / (a - b) * b;
    }
}
