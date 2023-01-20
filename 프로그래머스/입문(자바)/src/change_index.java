
public class change_index {
	// StringBuilder 쓰는거랑 안쓰는거 차이가 크다..
	// 0.02 나옴
	public String solution(String my_string, int num1, int num2) {
        String[] arr = my_string.split("");
        String temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< arr.length ; i++) {
            sb.append(arr[i]);
        }
        String answer = sb.toString();
        return answer;
    }
	// 1.00~~ 나옴
	public String solution1(String my_string, int num1, int num2) {
        String answer = "";
        String[] arr = my_string.split("");
        String temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
        for(String str : arr){
            answer += str;
        }
        return answer;
    }
}
