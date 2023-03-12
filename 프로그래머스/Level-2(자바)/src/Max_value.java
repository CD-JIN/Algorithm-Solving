import java.util.*;

public class Max_value {
	public String solution(int[] numbers) {
        String[] strArr = new String[numbers.length];
        for(int i = 0; i < numbers.length; i++) {
            strArr[i] = Integer.toString(numbers[i]);
        }
        
        Arrays.sort(strArr, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
        
        /*
         * //내림차순 정렬
        Arrays.sort(strArr, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return (b+a).compareTo(a+b);
                //오름차순 정렬 (o1+o2).compareTo(o1+o2);
            }
        });
         */
        
        if(strArr[0].equals("0")) return "0";
        
        StringBuilder sb = new StringBuilder();
        
        for(String s : strArr) {
            sb.append(s);
        }
        
        return sb.toString();
    }
	
	// 다른 사람 풀이
	// 처음 보는 concat 메소드와 나의 부족한 스트림 실력을 위해 공부겸 가져옴
	public String solution1(int[] numbers) {
        String answer = "";
        answer = Arrays.stream(numbers)
        .mapToObj(String::valueOf)
        .sorted((s1, s2) -> -s1.concat(s2).compareTo(s2.concat(s1)))
        .reduce("", (s1, s2) -> s1.equals("0") && s2.equals("0") ? "0" : s1.concat(s2));
        return answer;
    }
}
