
public class Next_big_number {
	public int solution(int n) {
        int answer = 0;
        
        String binaryStrN = Integer.toBinaryString(n);
        
        int cnt =0;
        
        for(int i = 0;i<binaryStrN.length();i++){
            if(binaryStrN.charAt(i) == '1') cnt++;
        }
        
        for(int i =n+1;i<1000001;i++){
            
            String temp = Integer.toBinaryString(i);
            int tempCnt = 0;
            for(int j =0;j<temp.length();j++){
                if(temp.charAt(j) == '1') tempCnt++;
            }
            
            if(tempCnt == cnt) {
                answer = i;
                break;
            }
        }
        
        return answer;
    }
	
	// 처음 작성코드.. 효율성테스트에서 시간초과..
	public int solution1(int n) {
        String binaryStrN = Integer.toBinaryString(n);
        String tmp = binaryStrN.replaceAll("1", "");
        // 1의 개수
        int cnt = binaryStrN.length()-tmp.length();
        while(true){
            int tmpInt = n+1;
            String binaryStr = Integer.toBinaryString(tmpInt);
            String newTmp = binaryStr.replaceAll("1", "");
            int newCnt = binaryStr.length()-newTmp.length();
            if(cnt==newCnt) return tmpInt;
            n++;
        }
    }
}
