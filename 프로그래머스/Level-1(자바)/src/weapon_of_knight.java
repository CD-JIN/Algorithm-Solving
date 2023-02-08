
public class weapon_of_knight {
	// 처리 속도 0.02에서 100몇까지 다양...
	// 쉽게 풀긴했는데... 속도가..
	// 좀더 클린코드 가다듬으면 올라갈듯..
	public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] knightArr = new int[number];
        for(int i = 0; i < knightArr.length; i++) {
            knightArr[i] = i+1;
        }
        int[] divArr = new int[number];
        for(int i = 0; i < divArr.length; i++) {
            for(int j = 1; j*j <= knightArr[i]; j++) {
                if(j*j==knightArr[i]) divArr[i]++;
                else if(knightArr[i] % j == 0) divArr[i] += 2;
            }
        }
        int count = 0;
        for(int i = 0; i < divArr.length; i++) {
            if(divArr[i]>limit) count++;
            else answer += divArr[i];
        }
        answer += power*count;
        return answer;
    }
	// 0.01에서 10사이인 다른사람 풀이
	public int solution1(int number, int limit, int power) {
        int[] count = new int[number + 1];    
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number / i; j++) {
                count[i * j]++;
            }
        }
        int answer = 0;
        for (int i = 1; i <= number; i++) {
            if (count[i] > limit) {
                answer += power;
            } else {
                answer += count[i];
            }
        }
        return answer;
    }
}
