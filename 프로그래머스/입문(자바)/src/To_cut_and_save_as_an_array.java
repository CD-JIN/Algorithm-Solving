
public class To_cut_and_save_as_an_array {
	public String[] solution(String my_str, int n) {
        int length = 0;
        if(my_str.length()%n==0){
            length = my_str.length()/n;
        } else {
            length = my_str.length()/n+1;
        }
        int index = 0;
        String[] answer = new String[length];
        for(int i = 0; i < my_str.length(); i = i+n) {
            if(i+n<=my_str.length()){
                answer[index] = my_str.substring(i,i+n);
            } else {
                answer[index] = my_str.substring(i,my_str.length());
            }
            index++;
        }
        return answer;
    }
}
