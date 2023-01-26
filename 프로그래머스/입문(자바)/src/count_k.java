
public class count_k {
	// 속도 개판...
	public int solution(int i, int j, int k) {
        int answer = 0;
        for(int a = i; a <= j; a++) {
            String tmp = Integer.toString(a);
            String[] arr = tmp.split("");
            for(String str : arr) {
                if(str.equals(Integer.toString(k))) answer++;
            }
        }
        return answer;
    }
	//
    public int solution1(int i, int j, int k) {
        int answer = 0;
        for (int num = i; num <= j; num++){
            int tmp = num;
            while (tmp != 0){
                if (tmp % 10 == k)
                    answer++;
                tmp /= 10;
            }
        }
        return answer;
    }
}
