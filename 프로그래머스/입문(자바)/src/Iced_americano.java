
public class Iced_americano {
	public int[] solution(int money) {
        int iceA = 5500;
        int[] answer = new int[2];
        answer[0] = money/iceA;
        answer[1] = money%iceA;
        return answer;
    }
}
