
public class chicken_coupon {
	public int solution(int chicken) {
        int answer = 0;
        int service = 0;
        int coupon = chicken;
        while(coupon>=10) {
            answer += coupon/10;
            service = coupon/10;
            coupon = coupon%10 + service;
        }
        return answer;
    }
}
