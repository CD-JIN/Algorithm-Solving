
public class Addition_of_fractions {
	public int[] solution(int denum1, int num1, int denum2, int num2) {
        int m = num1*num2;
        int s = denum1*num2+denum2*num1;
        int gcd = getGcd(s, m);
        int[] answer = {s/gcd, m/gcd};
        
        return answer;
    }
    public static int getGcd(int a, int b) {
		if(a%b==0) {
			return b;
		}
		return getGcd(b, a%b);
    }
}
