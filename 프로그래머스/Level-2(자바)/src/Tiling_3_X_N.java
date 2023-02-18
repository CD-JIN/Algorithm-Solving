
public class Tiling_3_X_N {
	static final int INT = 1000000007;
	
	// 속도는 solution1()보다 빠름. for문 자체가 i+=2다보니 더 빠른듯.
	public int solution(int n) {
        if(n < 2) return 0;

        long unique = 0;
        long[] dp = new long[n+1];
        dp[0] = 1; // 독특한 모양 계산을 위해 1 주입
        dp[2] = 3;
        
        // n=4 부터는 독특한 모양 타일이 나옴..
        for(int i=4; i<=n; i+=2) {
            unique += (2 * dp[i-4]) % INT;
            dp[i] = (3 * dp[i-2] + unique) % INT;
        }

        return (int) dp[n];
    }
	// https://gom20.tistory.com/180 이분이 설명을 잘 해놓음..
	// 위 메소드는 짝수만을 다뤄서 규칙 찾기 더 어려운데
	// 아래 메소드는 더 쉬움.. 규칙 찾기가..
	public int solution1(int n) {

        int[] dp = new int[n+1];
        dp[1] = 2;
        dp[2] = 3;
        for(int i = 3; i <= n; i++){
            if(i%2 == 0){
                //짝수
                dp[i] = dp[i-1]%INT + dp[i-2]%INT;
            } else {
                // 홀수
                dp[i] = dp[i-1]*2%INT + dp[i-2]%INT;
            }
            dp[i] = dp[i]%INT;
        }
        if(n%2 != 0) return 0;
        return dp[n];
    }
}
