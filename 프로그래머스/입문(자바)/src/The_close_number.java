
public class The_close_number {
	// 제한 사항을 꼼꼼히 보자... 더 작은수 리턴하는 것..
	public int solution(int[] array, int n) {
        int minGap = 99;
        int answer = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i]==n) {
                answer = n;
                break;
            } else if(minGap>Math.abs(array[i]-n)) {
                minGap = Math.abs(array[i]-n);
                answer = array[i];
            } else if(minGap==Math.abs(array[i]-n)) {
                if(answer<array[i]){
                    continue;
                } else {
                    answer = array[i];
                }
            }
        }
        return answer;
    }
}
