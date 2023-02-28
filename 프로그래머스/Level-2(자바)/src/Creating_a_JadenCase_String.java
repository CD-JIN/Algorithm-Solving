
public class Creating_a_JadenCase_String {
	// 테스트 8번.. 때문에 오래 걸렸다.. 마지막 if문이 해결..
	public String solution(String s) {
        String[] arr = s.trim().toLowerCase().split(" ");
        StringBuilder answer = new StringBuilder();
        
        for(int i=0; i<arr.length; i++) {
    		String now = arr[i];

    		if(now.length() == 0) {
    			answer.append(" ");
                continue;
    		}     		
    		else {    			
    			answer.append(now.substring(0, 1).toUpperCase());    			
    			answer.append(now.substring(1, now.length()));    			
    			answer.append(" ");
    		}    		
    	}        
        if(!" ".equals(s.substring(s.length()-1, s.length()))) {
            answer.deleteCharAt(answer.lastIndexOf(" "));
        }
        return answer.toString();
    }
	
	// 다른 사람 풀이 깔끔해서 가져와봄.. 삼항연산자
    public String solution1(String s) {
        String answer = "";
        String[] sp = s.toLowerCase().split("");
        boolean flag = true;

        for(String ss : sp) {
            answer += flag ? ss.toUpperCase() : ss;
            flag = ss.equals(" ") ? true : false;
        }

        return answer;
    }
}
