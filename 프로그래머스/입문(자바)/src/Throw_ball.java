
public class Throw_ball {
	// 공 위치 체크가 중요했음..
	public int solution(int[] numbers, int k) {
        int answer = numbers[2*(k-1)%numbers.length];
        return answer;
    }
}
