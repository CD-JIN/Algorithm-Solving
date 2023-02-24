
public class Maximum_and_minimum_values {
	public String solution(String s) {
        String[] arr = s.split(" ");
        int min = Integer.parseInt(arr[0]);
        int max = Integer.parseInt(arr[0]);
        for(String str : arr) {
            int tmp = Integer.parseInt(str);
            if(tmp<min) min = tmp;
            else if(tmp>max) max = tmp;
        }
        String answer = min + " " + max;
        return answer;
    }
}
