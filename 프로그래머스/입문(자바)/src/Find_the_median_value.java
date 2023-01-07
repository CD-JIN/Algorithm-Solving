import java.util.Arrays;

public class Find_the_median_value {
	public int solution(int[] array) {
        Arrays.sort(array);
        int answer = array[array.length/2];
        return answer;
    }
}
