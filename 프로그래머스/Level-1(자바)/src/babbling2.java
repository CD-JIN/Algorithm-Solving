
public class babbling2 {
	public int solution(String[] babbling) {
        String[] can = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        for(String str : babbling) {
            if(str.contains("ayaaya") || str.contains("yeye") 
               || str.contains("woowoo") || str.contains("mama")){
                continue;
            }
            str = str.replace(can[0], "1");
            str = str.replace(can[1], "1");
            str = str.replace(can[2], "1");
            str = str.replace(can[3], "1");
            str = str.replace("1", "");
            if(str.isEmpty()) {
                answer++;
            }
        }
        return answer;
    }
}
