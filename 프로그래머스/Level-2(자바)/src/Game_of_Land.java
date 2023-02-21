
public class Game_of_Land {
	// DP 문제
    int solution(int[][] land) {
        int[][] dp = new int[land.length][land[0].length];
        // 첫번째 행만 복사
        for(int i = 0; i < land[0].length; i++) {
            dp[0][i] = land[0][i];
        }
        
        for(int i = 1; i < land.length; i++) {
            for(int j = 0; j < land[0].length; j++) {
                for(int k = 0; k < land[0].length; k++) {
                    if(j==k) continue; // 같은 열을 연속해서 밟을 수 없는 규칙
                    dp[i][j] = Math.max(dp[i][j], dp[i-1][k] + land[i][j]);
                }
            }
        }
        
        int answer = 0;
        for(int i = 0; i < dp[0].length; i++) {
            answer = Math.max(answer, dp[dp.length-1][i]);
        }

        return answer;
    }
}
