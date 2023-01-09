

public class game_369 {
	public int solution(int order) {
        int answer = 0;
        String str = Integer.toString(order);
        String[] arr = str.split("");
        for(int i = 0; i < arr.length; i++) {
            if(Integer.valueOf(arr[i])==3||Integer.valueOf(arr[i])==6||Integer.valueOf(arr[i])==9) answer++;
        }
        return answer;
    }
}
