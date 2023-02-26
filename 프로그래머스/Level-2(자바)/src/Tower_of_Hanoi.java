import java.util.*;

public class Tower_of_Hanoi {
	public static void main(String[] args) {
		Tower_of_Hanoi hanoi = new Tower_of_Hanoi();
		System.out.println(Arrays.deepToString(hanoi.solution(2)));
	}
	
	static int[][] answer;
    static int row;
    static void hanoi(int start, int waypoint, int finish, int n) {
        if(n==0) return;
        
        hanoi(start, finish, waypoint, n-1);
        answer[row][0] = start;
        answer[row++][1] = finish;
        hanoi(waypoint, start, finish, n-1);
    }
    
    public int[][] solution(int n) {
        answer = new int[(int)Math.pow(2, n) - 1][2];
        hanoi(1, 2, 3, n);
        return answer;
    }
}
