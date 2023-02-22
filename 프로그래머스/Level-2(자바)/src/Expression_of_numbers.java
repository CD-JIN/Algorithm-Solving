
public class Expression_of_numbers {
	public int solution(int n) {
        int answer = 0;
         
         for(int i=1; i<=n; i++) {
             int sum = 0;
             for(int j=i; j<=n; j++) {
                 sum += j;
                 
                 if(sum==n) {
                     answer++;
                     break;
                 } else if(sum>n) {
                     break;
                 }
             }
         }      
         return answer;
   }
	
	// 정수론 정리... 첨 본 이론
	// 확실히 처리속도 효율성 측면에서 빠름..
	public int solution1(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i += 2) {
            if (n % i == 0) 
            answer++;
        }
        return answer;
    }
}
