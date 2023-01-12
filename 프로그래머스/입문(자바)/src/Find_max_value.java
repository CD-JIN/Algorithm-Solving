
public class Find_max_value {
	public int[] solution(int[] array) {
        int[] answer = new int[2];
        for(int i = 0; i < array.length-1; i++) {
            if(array[i]<array[i+1]){
                answer[0] = array[i+1];
                answer[1] = i+1;
            } else {
                answer[0] = array[i];
                answer[1] = i;
            }
        }
        return answer;
    }
	
	public int[] solution1(int[] array) {
        int max = 0;
        int maxIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                maxIndex = i;
            }
        }
        int[] answer = {max, maxIndex};
        return answer;
    }
}
