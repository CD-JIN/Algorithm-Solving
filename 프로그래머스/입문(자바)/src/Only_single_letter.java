import java.util.*;
import java.util.stream.*;


public class Only_single_letter {
	// 속도 : 0.02~ 0.06 사이
	public String solution(String s) {
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 97] += 1;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]==1) {
            	sb.append((char)(i + 'a'));
            }
        }
        String answer = sb.toString();
        return answer;
    }
	//속도 : 0.4~0.8 사이
	public String solution1(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> charMap = new HashMap<>();
        for(char c : chars){
            charMap.put(c, charMap.getOrDefault(c, 0) +1);
        }

        StringBuilder sb = new StringBuilder();
        for(char c : charMap.keySet()){
            if( charMap.get(c) == 1){
                sb.append(c);
            }
        }
        char[] charArr = sb.toString().toCharArray();
        Arrays.sort(charArr);
        return new String(charArr);
    }
	//속도 : 6.0 ~ 9.0 사이
	 public String solution2(String s) {

	        HashSet<String> set = new HashSet<>();

	        for (int i = 0; i < s.length(); i++) {
	            String replace = s.replace(s.charAt(i) + "", "");
	            if(s.length() - replace.length() == 1){
	                set.add(s.charAt(i)+"");
	            }
	        }
	        ArrayList<String> list = new ArrayList<>(set);
	        Collections.sort(list);
	        return String.join("", list);
	    }
	 //5.0 ~ 11.0 사이
	 public String solution3(String s) {
	        return Arrays.stream(s.split(""))
	                .collect(Collectors.groupingBy(s1 -> s1))
	                .entrySet()
	                .stream()
	                .filter(entry -> entry.getValue().size() <= 1)
	                .map(Map.Entry::getKey)
	                .sorted()
	                .collect(Collectors.joining());
	    }
}
