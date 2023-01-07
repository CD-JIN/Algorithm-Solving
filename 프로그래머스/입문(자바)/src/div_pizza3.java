
public class div_pizza3 {
	public int solution(int slice, int n) {
        if(n<=slice) {
            return 1;
        } else {
            if(n%slice==0) {
                return n/slice;
            } else return n/slice+1;
        }
    }
}
