import java.util.Arrays;

public class the_conditions_for_completion_of_a_triangle1 {
	public int solution(int[] sides) {
        Arrays.sort(sides);
        if(sides[0]+sides[1]<=sides[2]) return 2;
        else return 1;
    }
}
