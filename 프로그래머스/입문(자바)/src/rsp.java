
public class rsp {
	public String solution(String rsp) {
        String answer = "";
        String[] arr = rsp.split("");
        for(int i = 0; i < arr.length; i++) {
            if(Integer.valueOf(arr[i])==0) answer += "5";
            else if(Integer.valueOf(arr[i])==2) answer += "0";
            else answer += "2";
        }
        return answer;
    }
	// 왜인지 모르겠지만 Interger.valueOf() 쓰는게
	// str.equals("?") 보다 빠른...
}
