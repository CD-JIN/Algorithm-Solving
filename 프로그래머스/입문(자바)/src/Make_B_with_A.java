import java.util.*;

public class Make_B_with_A {
	// 생각나는대로 풀었지만 100% 만족하는 솔루션은 아님..
	public int solution(String before, String after) {
        String[] arrA = after.split("");
        String[] arrB = before.split("");
        int temp = 0;
        for(int i = 0; i < arrA.length; i++) {
            for(int j = 0; j < arrB.length; j++) {
                if(arrA[i].equals(arrB[j])) {
                    arrB[j] = "";
                    temp++;
                    break;
                }
            }
        }
        if(temp!=arrA.length) return 0;
        else return 1;
    }
	//
	public int solution1(String before, String after) {
        char[] a = before.toCharArray();
        char[] b = after.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        return new String(a).equals(new String(b)) ? 1 :0;
    }
	// 이게 다른 사람 풀이 중 제일 괜찮은듯..
	public int solution2(String before, String after) {
        int[] array1 = new int[26];
        int[] array2 = new int[26];
        for(int i=0; i<before.length(); i++){
            ++array1[before.charAt(i)-'a'];
            ++array2[after.charAt(i)-'a'];
        }

        for(int i=0; i<26; i++){
            if(array1[i] != array2[i]){
                return 0;
            }
        }
        return 1;
    }
}
