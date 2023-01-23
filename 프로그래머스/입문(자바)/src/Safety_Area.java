import java.util.*;

public class Safety_Area {
	public int solution(int[][] board) {
        int answer = 0;
        int boomExplosionRange = 1;
        // 복사본 생성 : 폭탄 범위에 값 넣기 위해서..
        int[][] copyBoard = new int[board.length][board[0].length]; 
        int tempIndex = 0;
        for (int[] rows : board) { // 복사본에 값 넣기
            copyBoard[tempIndex] = Arrays.copyOf(rows, board[tempIndex].length);
            tempIndex++;
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                int val = board[i][j];
                if(val == 0) continue;
                makeBoomArea(i, j, boomExplosionRange, copyBoard);
            }
        }
        // 복사본에서 값 0을 확인해서 안전지대 카운트
        for (int[] ints : copyBoard) {
            for (int anInt : ints) {
                if(anInt == 0)
                    answer++;
            }
        }
        return answer;
    }
    // 폭탄 살상반경에 값 1 넣기 메소드
    private void makeBoomArea(int row, int col, int boomExplosionRange, int[][] board) {
        for (int r = row - boomExplosionRange; r <= row + boomExplosionRange ; r++) {
            if(r < 0 || r >= board.length) continue;
            for (int c = col - boomExplosionRange; c <= col + boomExplosionRange; c++) {
                if(c < 0 || c >= board[0].length) continue;
                board[r][c] = 1;
            }
        }
    }
    // 처음에는 나도 이런식을 할려다가 너무 코드 길어질것 같아서 방향 틀었는데
    // 생각보다 간단하게 한듯.
    // 다른사람 풀이 중 하나 : if문으로 위험지대 다 체크해서 걸러버리기
    public int solution1(int[][] board) {
        int answer = 0;
        for (int i=0; i<board.length; i++) {
            for (int j=0; j<board[0].length; j++) {
                if (i-1 >= 0 && j-1 >= 0 && board[i-1][j-1] == 1) { continue; }
                if (j-1 >= 0 && board[i][j-1] == 1) { continue; }
                if (i+1 <= board.length-1 && j-1 >= 0 && board[i+1][j-1] == 1) { continue; }
                if (i-1 >= 0 && board[i-1][j] == 1) { continue; }
                if (board[i][j] == 1) { continue; }
                if (i+1 <= board.length-1 && board[i+1][j] == 1) { continue; }
                if (i-1 >= 0 && j+1 <= board.length-1 && board[i-1][j+1] == 1) { continue; }
                if (j+1 <= board.length-1 && board[i][j+1] == 1) { continue; }
                if (i+1 <= board.length-1 && j+1 <= board.length-1 && board[i+1][j+1] == 1) { continue; }
                answer++;
            }
        }
        return answer;
    }
}
