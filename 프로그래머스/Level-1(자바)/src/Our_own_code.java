import java.util.*;

public class Our_own_code {
	// 나온지 얼마 안된 문제라 열심히 풀었다.. 문제는 오래걸렸다. ㅋㅋ
	public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        String[] arr = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        ArrayList<String> al = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            al.add(arr[i]);
        }
        String[] skipArr = skip.split("");
        for(int i = 0; i < skipArr.length; i++) {
           al.remove(skipArr[i]);
        }
        String[] sArr = s.split("");
        for(int i = 0; i < sArr.length; i++) {
            sArr[i] = al.get((al.indexOf(sArr[i])+index)%(26-skip.length()));
            answer.append(sArr[i]);
        }
        return answer.toString();
    }
	
	//제일 괜찬았던 다른사람 풀이
	public String solution1(String s, String skip, int index) {
        boolean[] isSkip = new boolean[26];

        for(int i = 0; i < skip.length(); i++) isSkip[skip.charAt(i)-'a'] = true;

        char[] arr = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        StringBuilder sb = new StringBuilder();

        char[] target = s.toCharArray();

        for(char c : target) {
            int cur = c - 'a';
            for(int i = 0; i < index; i++){
                cur = (cur+1)%26;
                if(isSkip[cur]) i--;
            }
            sb.append(arr[cur]);
        }
        return sb.toString();
    }
	
	// 다른사람 풀이 : set, 아스키코드로 변환 이용
	public String solution2(String s, String skip, int index) {
        // a = 97 , z = 122
        String answer = "";

        HashSet<String> set = new HashSet<>();

        for( int i = 0 ; i < skip.length() ; i++){           
            set.add(skip.substring(i,i+1));
        }      

        for(int i = 0 ; i < s.length() ; i++){
            char target = s.charAt(i);

            int num = 0;
            while(num != index){
                int a = (int) target;
                a++;
                if(a == 123)
                    a = 97;
                target = (char) a;
                String temp = "";
                temp += target;
                if(!set.contains(temp))
                    num++;
            }
            answer += target;
        }
        return answer;
    }
}
