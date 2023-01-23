
public class the_conditions_for_completion_of_a_triangle {
	public int solution(int[] sides) {
        int answer = 0;
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);
        for(int i=1; i<max+min; i++){
            if(i>max){
                if(min+max>i){
                    answer++;
                }
            } else {
                if(min+i>max){
                    answer++;
                }
            }
        }
        return answer;
    }
	
    public int solution1(int[] sides) {
        int answer = 0;
        int min = Math.min(sides[0], sides[1]);
        answer = 2*min-1;
        return answer;
    }
}
