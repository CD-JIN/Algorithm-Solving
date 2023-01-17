import java.util.*;

public class Sort_String {
	// 너무 생각하기 귀찬았던 나.. 무식하게 해버렸다.
	public int[] solution(String my_string) {
        int leng = 0;
        String[] arr = my_string.split("");
        for(String str : arr) {
            if(str.equals("0")||str.equals("1")||str.equals("2")||str.equals("3")||str.equals("4")||str.equals("5")||str.equals("6")||str.equals("7")||str.equals("8")||str.equals("9")) {
                leng++;
            }
        }
        int[] answer = new int[leng];
        int index = 0;
        for(String str : arr) {
            if(str.equals("0")||str.equals("1")||str.equals("2")||str.equals("3")||str.equals("4")||str.equals("5")||str.equals("6")||str.equals("7")||str.equals("8")||str.equals("9")) {
                answer[index] = Integer.parseInt(str);
                index++;
            }
        }
        Arrays.sort(answer);
        return answer;
    }
	// 스트림 고수의 정규식 이용
	public int[] solution1(String myString) {
        return Arrays.stream(myString.replaceAll("[A-Z|a-z]", "").split("")).sorted().mapToInt(Integer::parseInt).toArray();
    }
	//정규식, replaceAll 이용한게 제일 깔끔한 풀이였던것 같다.
	public int[] solution2(String my_string) {

        my_string = my_string.replaceAll("[a-z]","");

        int[] answer = new int[my_string.length()];

        for(int i =0; i<my_string.length(); i++){
            answer[i] = my_string.charAt(i) - '0';
        }

        Arrays.sort(answer);

        return answer;
    }
}
