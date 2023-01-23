
public class babbling {
	public int solution(String[] babbling) {
        int answer = 0;
        for(String str : babbling) {
            str = str.replaceFirst("aya", "1");
            str = str.replaceFirst("ye", "1");
            str = str.replaceFirst("woo", "1");
            str = str.replaceFirst("ma", "1");
            str = str.replace("1", "");
            if(str.isEmpty()) {
                answer++;
            }
        }
        return answer;
    }
	// 코드는 이게 제일 깔끔했음.. 정규식 이용 matches()
	public int solution1(String[] babbling) {
        int answer = 0;
        for(int i=0; i<babbling.length; i++){
            if(babbling[i].matches("^(aya(?!aya)|ye(?!ye)|woo(?!woo)|ma(?!ma))+$")){
                answer++;
            }
        }
        return answer;
    }
}
