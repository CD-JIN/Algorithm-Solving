import java.util.*;

public class parallel {
	public int solution(int[][] dots) {
        int answer = 0;
        ArrayList<Double> arr = new ArrayList<>();
        for(int i = 0; i < dots.length-1; i++) {
            if(answer == 1) {
                break;
            } else {
                for(int j = i+1; j < dots.length; j++) {
                    Double tmp = (double) (dots[i][1]-dots[j][1]) / (dots[i][0]-dots[j][0]);
                    if(arr.contains(tmp)) {
                        answer = 1;
                        break;
                    } else {
                        arr.add(tmp);
                    }
                }
            }
        }
        return answer;
    }
	// '익자에요'님의 솔루션
	private int xPos = 0;
    private int yPos = 1;
    private int[][] checkCases = {{0, 1, 2, 3}, {0, 2, 1, 3}, {0, 3, 1, 2}};
    public int solution1(int[][] dots) {
        int answer = 0;
        for (int[] checkCase : checkCases) {
            if (checkParallel(checkCase, dots)) {
                answer = 1;
                break;
            }
        }

        return answer;
    }

    private boolean checkParallel(int[] checkCase, int[][] dots) {
        int xPos1 = dots[checkCase[0]][xPos];
        int yPos1 = dots[checkCase[0]][yPos];
        int xPos2 = dots[checkCase[1]][xPos];
        int yPos2 = dots[checkCase[1]][yPos];
        int xPos3 = dots[checkCase[2]][xPos];
        int yPos3 = dots[checkCase[2]][yPos];
        int xPos4 = dots[checkCase[3]][xPos];
        int yPos4 = dots[checkCase[3]][yPos];
        // (y4 - y3)(x2 - x1) - (x4 - x3)(y2 - y1) 평행여부 조건
        int chk = ((yPos4 - yPos3) * (xPos2 - xPos1)) - ((xPos4 - xPos3) * (yPos2 - yPos1));
        if (chk == 0) {
            return true;
        }
        return false;
    }
}
