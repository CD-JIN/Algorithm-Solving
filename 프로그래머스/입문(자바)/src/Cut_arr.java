import java.util.*;

public class Cut_arr {
	// 반복문 이용 하기
	public int[] solution1(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2-num1+1];
        int i = 0;
        for(int x = num1 ; x <=num2; x++) {
            answer[i] = numbers[x];
            i++;
        }
        return answer;
    }
	// Arrays.copyOfRange() 이용
	public int[] solution2(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2-num1+1];
        answer = Arrays.copyOfRange(numbers, num1, num2+1);
        return answer;
    }
	
	// 결과 : 속도는 비슷.. 메모리는 Arrays 메소드 쓰는게 조금더 좋음
}
