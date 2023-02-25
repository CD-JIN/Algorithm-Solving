
public class Fibonacci_number {
	public int solution(int n) {
        final int INT = 1234567;
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        for(int i = 2; i < arr.length; i++) {
            arr[i] = (arr[i-1] + arr[i-2])%INT;
        }

        return arr[n];
    }
}
