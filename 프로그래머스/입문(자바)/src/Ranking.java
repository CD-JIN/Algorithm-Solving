import java.util.*;

public class Ranking {
	public int[] solution(int[][] score) {
        List<Integer> scoreList = new ArrayList<>();
        for(int[] t : score){
            scoreList.add(t[0] + t[1]);
        }
        scoreList.sort(Comparator.reverseOrder());

        int[] answer = new int[score.length];
        for(int i=0; i<score.length; i++){
            answer[i] = scoreList.indexOf(score[i][0] + score[i][1])+1;
        }
        return answer;
    }
	// 이게 베스트 인듯...
	public int[] solution1(int[][] score) {
        double[] map = new double[score.length];
        int[] result= new int[score.length];
        for (int i = 0; i <score.length ; i++) {
            map[i] = (score[i][0]+ score[i][1])/2.0;
        }
        for (int i = 0; i <score.length ; i++) {
            int count =0;
            for (int j = 0; j <score.length ; j++) {
                if(map[i] < map[j]){
                    count++;
                    }
                }
            result[i] = count+1;
        }
    return result;
    }
}
