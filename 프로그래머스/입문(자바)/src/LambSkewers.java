
public class LambSkewers {
	class Solution {
	    public int solution(int n, int k) {
	        int service = n/10;
	        int ggochi = n*12000;
	        int drink = (k-service)*2000;
	        int answer = ggochi+drink;
	        return answer;
	    }
	}
}
