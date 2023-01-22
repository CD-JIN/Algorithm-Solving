import java.util.*;

public class Make_Maxvalue2 {
	// 정렬 하고 값 찾는게 더 느림..
	public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int result1 = numbers[numbers.length-1]*numbers[numbers.length-2];
        int result2 = numbers[0]*numbers[1];
        if(result1<result2) {
            return result2;
        } else return result1;
    }
	//이중 for문으로 하나하나 곱해보면서 맥스값 찾기
	public int solution1(int[] numbers) {
        int start = numbers[0]*numbers[1];
        int max = start;
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
            	max= Math.max(max, numbers[i]*numbers[j]);
            }
        }
        return max;
    }
}
