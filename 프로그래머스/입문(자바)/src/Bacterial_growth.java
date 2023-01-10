
public class Bacterial_growth {
	public int solution(int n, int t) {
        for(int i = 1; i <=t; i++) {
            n *= 2;
        }
        return n;
    }
	// 생각하지 못한 풀이.. 런타임에러 나오지만..
	public int solution1(int n, int t) {
        int answer = 0;
        answer = n << t;
        return answer;
    }
	// Math 이용.. 그래도 solution() 이 더 빠름..
	public int solution2(int n, int t) {
        int answer = n * (int)Math.pow(2,t);
        return answer;
    }
}
