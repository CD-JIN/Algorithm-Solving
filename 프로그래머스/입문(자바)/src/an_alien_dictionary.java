import java.util.*;
import java.util.stream.*;

public class an_alien_dictionary {
	//indexOf() : 해당값을 찾지 못하면 -1 반환하는 메소드
	public int solution(String[] spell, String[] dic) {
        int answer = 2;
        for(String dicStr : dic) {
            boolean isRight = true;
            for(String spellStr : spell) {
                if(dicStr.indexOf(spellStr) == -1) {
                    isRight = false;
                    break;
                }
            }
            if(isRight) {
                answer = 1;
                break;
            }
        }
        return answer;
    }
	//스트림
	public int solution1(String[] spell, String[] dic) {
        List<Character> words = Arrays.stream(spell).map(s -> s.charAt(0)).collect(Collectors.toList());

        for (String str : dic) {
            if(str.length() < spell.length) continue;

            Set<Character> spellSet = str.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());

            if (spellSet.containsAll(words))
                return 1;
        }

        return 2;
    }
}
