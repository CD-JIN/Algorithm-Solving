
public class Numerical_Block {
	// 쉽지 않은 문제...
	public int[] solution(long begin, long end) {
        int maxValue = 10000000;
        int start = (int)begin;
        int finish = (int)end;

        int[] arr = new int[finish-start+1];
        int index = 0;

        if(start == 1){
            arr[index++] = 0;
            start++;
        }

        for(int i = start; i <= finish; i++) {
            int value = 1;

            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i % j == 0) {
                    value = i/j;
                    if(value <= maxValue) break;
                    else value = j;
                }
            }
            arr[index++] = value;
        }

        return arr;
    }
}
