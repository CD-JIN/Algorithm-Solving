
public class Double_the_Array {
	public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        int i =0;
        for(int number : numbers) {
            number = number*2;
            answer[i] = number;
            i++;
        }
        return answer;
    }
}
