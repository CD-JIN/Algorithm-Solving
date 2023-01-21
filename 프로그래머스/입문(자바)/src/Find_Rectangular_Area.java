
public class Find_Rectangular_Area {
	public int solution(int[][] dots) {
        int column = 0;
        int row = 0;
        for(int i = 0; i < 3 ; i++) {
            if(dots[i][0]!=dots[i+1][0]) {
                row = Math.abs(dots[i][0]-dots[i+1][0]);
            }
            if(dots[i][1]!=dots[i+1][1]) {
                column  = Math.abs(dots[i][1]-dots[i+1][1]);
            }
        }
        int answer = row*column;
        return answer;
    }
	//
	public int solution1(int[][] dots) {
        int answer = 0;
        int[] dot = dots[0];
        for(int i =0; i<dots.length; i++){
            int x = dots[i][0];
            int y = dots[i][1];
            if(dot[0]!=x && dot[1]!=y){
                answer = Math.abs(x-dot[0]) * Math.abs(y-dot[1]);
                break;
            }
        }
        return answer;
    }
}
