
public class Ant_corps {
	public int solution(int hp) {
        int answer = 0;
        int tempHp = hp;
        //first
        for(int i = 5; i >=1 ; i -=2) {
            answer += tempHp/i;
            tempHp = tempHp%i;
            if(tempHp==0) break;
        }
        return answer;
    }
}
