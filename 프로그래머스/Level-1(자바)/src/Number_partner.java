import java.util.*;

public class Number_partner {
	// Map 이용해서 풀수도 있을듯.. 일단 힌트 이용
	 public String solution(String X, String Y) {
	        StringBuilder answer = new StringBuilder();
	        int[] x = {0,0,0,0,0,0,0,0,0,0};
	        int[] y = {0,0,0,0,0,0,0,0,0,0};
	        for(int i=0; i<X.length();i++){
	           x[X.charAt(i)-48] += 1;
	        }
	        for(int i=0; i<Y.length();i++){
	           y[Y.charAt(i)-48] += 1;
	        }
	        // 정렬 메소드 쓰지않고 좋은방법인듯.. 기억.
	        for(int i=9; i >= 0; i--){
	            for(int j=0; j<Math.min(x[i],y[i]); j++){
	                answer.append(i);
	            }
	        }
	        if("".equals(answer.toString())){
	           return "-1";
	        }else if(answer.toString().charAt(0)==48){
	           return "0";
	        }else {
	            return answer.toString();
	        }
	    }
	// 나의 첫번째 풀이 테스트 19개중 5개 시간초과...
	public String solution1(String X, String Y) {
        String answer = "";
        ArrayList<Integer> al = new ArrayList<Integer>(Math.min(X.length(), Y.length()));
        for(int i = 0; i < X.length(); i++) {
            for(int j = 0; j < Y.length(); j++) {
                char x = X.charAt(i);
                char y = Y.charAt(j);
                if(x==y) {
                    al.add(x - '0');
                    Y = Y.replaceFirst(x+"", "X");
                    break;
                }
            }
        }
        Collections.sort(al, Collections.reverseOrder());
        // 짝꿍이 존재하지 않을 경우
        if(al.isEmpty()) return "-1";
        int sum = 0;
        
        for(int i = 0; i < al.size(); i++) {
            sum += al.get(i);
            answer += al.get(i)+"";
        }
        // 짝꿍이 존재하지만 전부 0일경우
        if(sum==0) return "0";
        // 짝궁이 존재하고 0이 아닐경우

        return answer;
    }
}
