import java.util.*;

public class To_check_personality_type {
	public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i< survey.length; i++) {
            int value = choices[i];
            if( value < 4) {
                char ch = survey[i].charAt(0);
                map.put(ch, map.getOrDefault(ch, 0) + 4 - value);
            } else if(value > 4) {
                char ch = survey[i].charAt(1);
                map.put(ch, map.getOrDefault(ch, 0) + value - 4);
            }
        }
        return new StringBuilder()
            .append(map.getOrDefault('R', 0) >= map.getOrDefault('T', 0) ? 'R' : 'T')
            .append(map.getOrDefault('C', 0) >= map.getOrDefault('F', 0) ? 'C' : 'F')
            .append(map.getOrDefault('J', 0) >= map.getOrDefault('M', 0) ? 'J' : 'M')
            .append(map.getOrDefault('A', 0) >= map.getOrDefault('N', 0) ? 'A' : 'N')
            .toString();
    }
	// 더 이해하기 쉬운 풀이(다른사람)
	public String solution1(String[] survey, int[] choices) {
        String answer = "";

        //비동의-동의
        HashMap<String, Integer> map = new HashMap<>();

        map.put("R", 0);
        map.put("T", 0);
        map.put("C", 0);
        map.put("F", 0);
        map.put("J", 0);
        map.put("M", 0);
        map.put("A", 0);
        map.put("N", 0);

        for(int i = 0; i < survey.length; i++){

            String a = survey[i].substring(0, 1);
            String b = survey[i].substring(1, 2);


            if(choices[i] == 1){
                map.put(a, map.get(a) + 3);
            } else if(choices[i] == 2){
                map.put(a, map.get(a) + 2);
            } else if(choices[i] == 3){
                map.put(a, map.get(a) + 1);
            } else if(choices[i] == 5){
                map.put(b, map.get(b) + 1);
            } else if(choices[i] == 6){
                map.put(b, map.get(b) + 2);
            } else if(choices[i] == 7){
                map.put(b, map.get(b) + 3);
            } 

        }

        StringBuilder sb = new StringBuilder();

        if(map.get("R") >= map.get("T")){
            sb.append("R");
        } else{
            sb.append("T");
        }

        if(map.get("C") >= map.get("F")){
            sb.append("C");
        } else {
            sb.append("F");
        }

        if(map.get("J") >= map.get("M")){
            sb.append("J");
        } else {
            sb.append("M");
        }

        if(map.get("A") >= map.get("N")){
            sb.append("A");
        } else {
            sb.append("N");
        }

        answer = sb.toString();

        return answer;
    }
}
