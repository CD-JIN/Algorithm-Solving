import java.util.*;

public class Remove_duplicate_characters {
	public String solution(String my_string) {
        String[] arr = my_string.split("");
        List<String> list = new ArrayList<>();
        for(String str: arr) {
            list.add(str);
        }
        List<String> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
		    if (!result.contains(list.get(i))) {
			    result.add(list.get(i));
		    }
	    }
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < result.size(); i++) {
            answer.append(result.get(i));
        }
        return answer.toString();
    }
	//내가 원했던 답.. Set 특성이용.. 문제는 메소드들을 몰라..
	public String solution1(String my_string) {
        String[] answer = my_string.split("");
        Set<String> set = new LinkedHashSet<String>(Arrays.asList(answer));

        return String.join("", set);
    }
	//속도는 별로지만.. 아이디어 굿..
	public String solution2(String my_string) {
        String answer = "";

        for(int i=0; i<my_string.length(); i++){
            //my_string.indexOf(my_string.charAt(i));
            if(i==my_string.indexOf(my_string.charAt(i)))
                answer+=my_string.charAt(i);
        }

        return answer;
    }
}
