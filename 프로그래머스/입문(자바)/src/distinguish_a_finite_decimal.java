
public class distinguish_a_finite_decimal {
	public int solution(int a, int b) {
		// 기약분수의 분모 newI
        int newI = b / getGcd(a,b);
        while (newI != 1) {
            if (newI % 2 == 0) {
                newI /= 2;
            } else if (newI % 5 == 0) {
                newI /= 5;
            } else {
                return 2;
            }
        }
        return 1;
    }
	// 유클리드 호제법(최대공약수)
    public int getGcd(int a, int b) {
        if(a%b==0) {
            return b;
        } else {
            return getGcd(b, a%b);
        }
    }
}
