
public class Discount_cloth {
	public int solution(int price) {
        int answer = price;
        int dis1 = 100000;
        int dis2 = 300000;
        int dis3 = 500000;
        if(price >= dis3) {
            answer = (int)(price*0.8);
            return answer;
        } else if (price >= dis2) {
            answer = (int)(price*0.9);
             return answer;
        } else if (price >= dis1) {
            answer = (int)(price*0.95);
             return answer;
        } 
        return answer;
    }
}
