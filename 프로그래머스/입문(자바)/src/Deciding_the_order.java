
public class Deciding_the_order {
	// 중복된 원소가 없어서 가능..
	public int[] solution(int[] emergency) {
        int[] temp = emergency;
        int[] answer = new int[emergency.length];
        for(int i = 0; i < emergency.length; i++) {
            int count = 1;
            for(int j = 0; j < temp.length; j++) {
                if(emergency[i]<temp[j]) {
                    count++;
                }
            }
            answer[i] = count;
        }
        return answer;
    }
}
