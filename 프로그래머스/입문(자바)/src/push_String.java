
public class push_String {
	public int solution(String A, String B) {
        int answer = 0;
        String copyA = A;
        for(int i = 0; i < A.length() ; i++) {
            if(copyA.equals(B)) {
                return answer;
            }
            String temp = copyA.substring(copyA.length()-1);
            copyA = temp + copyA.substring(0, copyA.length()-1);
            answer++;
        }
        return -1;
    }
	// 다른사람 풀이... 이런 생각은 못했다...
	 public int solution1(String A, String B) {
	        String tempB = B.repeat(3);
	        return tempB.indexOf(A);
	    }
}
