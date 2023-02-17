
public class Tiling_2_X_N {
	// 피보나치 수열...
	public int solution(int n) {
        final int INT = 1000000007;
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 2;
        for(int i = 2; i < n; i++) {
            arr[i] = (arr[i-1] + arr[i-2])%INT;
        }
        return arr[n-1];
    }
}
