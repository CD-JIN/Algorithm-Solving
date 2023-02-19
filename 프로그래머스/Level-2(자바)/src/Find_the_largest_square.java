
public class Find_the_largest_square {
	public int solution(int [][]board){
        int answer = 0;
        int m = board.length;
        int n = board[0].length;
        
        // 예외를 없애기 위한 새로운 배열 만들기
        int[][] newBoard = new int[m+1][n+1];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                newBoard[i+1][j+1] = board[i][j];
            }
        }
        
        int max = 0;
        
        for(int i = 1; i < newBoard.length; i++) {
            for(int j = 1; j < newBoard[0].length; j++) {
                if(newBoard[i][j]==1) {
                    int up = newBoard[i-1][j];
                    int left = newBoard[i][j-1];
                    int leftUp = newBoard[i-1][j-1];
                    int min = Math.min(leftUp, Math.min(left, up));
                    newBoard[i][j] = min+1;
                    // 현재까지 max값과 newBoard[i][j] 중 더 큰값
                    max = Math.max(max, newBoard[i][j]);
                }
            }
        }
        answer = max*max;
      
        return answer;
    }
}
