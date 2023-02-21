
public class Long_Jump {
	public long solution(int n) {
        final int INT = 1234567;
        long[] arr = new long[2000];
        arr[0] = 1;
        arr[1] = 2;
        for(int i = 2; i < 2000; i++) {
            if(i>=n) break;
            arr[i] = (arr[i-1] + arr[i-2])%INT;
        }
        return arr[n-1];
    }
}
