
public class Div_String {
	public int solution(String s) {
        String[] arr = s.split("");
        String firstS = "";
        int answer = 0;
        int equalCnt = 0;
        int notEqualCnt = 0;
        for(int i = 0 ; i < arr.length; i++) {
            if(equalCnt==0 && notEqualCnt==0) {
                firstS = arr[i];
            }
            if(arr[i].equals(firstS)) {
                equalCnt++;
            } else {
                notEqualCnt++;
            }
            if(equalCnt==notEqualCnt) {
                answer++;
                equalCnt = 0;
                notEqualCnt = 0;
            }
            if(equalCnt!=notEqualCnt && i==arr.length-1) {
                answer++;
            }
        }
        return answer;
    }
	// 나의 풀이에서 속도 향상 시킨 풀이
	public int solution1(String s) {
        int answer = 0;
        char init = s.charAt(0);
        int count = 0;
        for (char c : s.toCharArray()) {
            if (count == 0) {
                init = c;
            }
            if (init == c) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                answer++;
            }
        }

        if(count > 0) {
            answer++;
        }
        return answer;
    }
}
