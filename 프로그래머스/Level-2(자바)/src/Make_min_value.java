import java.util.*;

public class Make_min_value {
	public int solution(int []A, int []B) {
        Arrays.sort(A);
        Arrays.sort(B);
        // 내림차순 효율성 테스트에서 시간초과..
        // Integer[] newB = Arrays.stream(B).boxed().toArray(Integer[]::new);
        // Arrays.sort(newB, Comparator.reverseOrder());
        int answer = 0;
        int length = A.length;

        for(int i = 0; i < length; i++) {
            answer += A[i]*B[length-1-i];
        }
        
        return answer;
    }
	// quickSort 이용
	public int solution1(int []A, int []B){
        int answer = 0;
        int length = A.length;

        quickSort(A, 0, A.length-1);
        quickSort(B, 0, B.length-1);

        //System.out.println(A[0]);
        //System.out.println(B[0]);

        for(int i = 0 ; i < length ; i++) {
            answer += A[i] * B[length-1-i];
        }

        return answer;
    }

    public static void quickSort(int[] arr, int left, int right) {
        int i, j, pivot, tmp;

        if (left < right) {
            i = left;
            j = right;
            pivot = arr[left];
            //분할 과정
            while (i < j) {
                while (arr[j] > pivot) j--;
                while (i < j && arr[i] <= pivot) i++;

                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
            arr[left] = arr[i];
            arr[i] = pivot;
            //정렬 과정
            quickSort(arr, left, i - 1);
            quickSort(arr, i + 1, right);
        }
    }
}
