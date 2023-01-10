
public class different_age {
	// 쉽게 풀긴 했으나 속도..개판 10.0 넘음
	public String solution(int age) {
        String[] ageStrArr = {"a","b","c","d","e","f","g","h","i","j"};
        String answer = "";
        String s = age + "";
        for(String str : s.split("")) {
            int temp = Integer.parseInt(str);
            answer += ageStrArr[temp];
        }
        return answer;
    }
	// 속도: 1.00 ~~ 2.0 사이
    public String solution1(int age) {
        String answer = "";
        String[] alpha = new String[]{"a","b","c","d","e","f","g","h","i","j"};

        while(age>0){
            answer = alpha[age % 10] + answer;
            age /= 10;
        }

        return answer;
    }
}
