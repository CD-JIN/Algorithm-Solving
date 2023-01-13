import java.math.*;

public class Case_of_div_bead {
	// 처음 보는 BigInteger.. 공부해서 블로깅
	public BigInteger solution(int balls, int share) {
        return factor(balls).divide(factor(balls - share).multiply(factor(share)));
    }
    public BigInteger factor(int num){
        BigInteger ret = new BigInteger("1");
        BigInteger from = new BigInteger("1");
        BigInteger to = new BigInteger(String.valueOf(num));
        for(BigInteger i = from; i.compareTo(to) <= 0; i = i.add(BigInteger.ONE)){
            ret = ret.multiply(i);
        }
        return ret;
    }
    
    public BigInteger solution1(int balls, int share) {
        BigInteger[] DP = new BigInteger[31];
        DP[0] = new BigInteger("1");
        DP[1] = new BigInteger("1");
        for (int i = 2; i <= 30; i++) {
            DP[i] = DP[i - 1].multiply(new BigInteger(Integer.toString(i)));
        }
        return (DP[balls].divide(DP[balls - share].multiply(DP[share])));
    }
}
