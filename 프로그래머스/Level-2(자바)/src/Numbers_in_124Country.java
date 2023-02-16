
public class Numbers_in_124Country {
	// 처음엔 가볍게 생각해서.. 생각보다 어려움..
	// 자료형.parse자료형(String s, int radix) 진수값(radix)에 맞게 반환
	// 위 메소드 이용해서 replaceAll("3", "4") 이러면 더 쉽게 끝날줄..
	public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        while(n>0) {
            if(n%3!=0) {
                sb.append(n%3);
                n = n/3;
            } else {
                sb.append(4);
                n = n/3-1;
            }
            
        }
        return sb.reverse().toString();
    }
}
