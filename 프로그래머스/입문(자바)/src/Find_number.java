
public class Find_number {
	public int solution(int num, int k) {
        int answer = -1;
        int length = (int)(Math.log10(num)+1);
        for(int i = length ; i > 0; i--) {
            if(num%10==k) answer= i;
            num /= 10;
        }
        return answer;
    }
	// 다른사람 풀이 속도는 느리지만 센스굿
	public int solution1(int num, int k) {
        return ("-" + num).indexOf(String.valueOf(k));
    }
}
