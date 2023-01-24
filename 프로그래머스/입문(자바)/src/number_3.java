
public class number_3 {
	public int solution(int n) {
        int answer = n;
        int i = 1;
        while (i <= answer) {
            if ((i % 3 == 0) || i/10 == 3 || i%10 == 3 || i/10==13) {
                answer++;
            }
            i++;
        }
        return answer;
    }
	//valueOf().contains()  썻으면 더 빨리 풀었을 수도..
	// n은 100이하로 나오지만 결과값은 100 이상 나올수 있다는거 미스.
	public int solution1(int n) {
        int answer = n;
        int i = 1;
        while (i <= answer) {
            if ((i % 3 == 0) || String.valueOf(i).contains("3")) {
                answer++;
            }
            i++;
        }
        return answer;
    }
}
