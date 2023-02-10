import java.math.BigInteger;
import java.util.stream.LongStream;

public class Small_Substring {
	// BigInteger 배웠던게 생각나서.. 여기서 써먹어봄..
	// Long.parseLong 가능
	// solution1, solution2 말고는 다 비슷하게 푼듯..
	public int solution(String t, String p) {
        int answer = 0;
        int size = t.length()-p.length()+1;
        for(int i = 0; i < size; i++) {
            BigInteger cutT = new BigInteger(t.substring(i, i+p.length()));
            BigInteger pBigNumber = new BigInteger(p);
            if(cutT.longValue() <= pBigNumber.longValue()) answer++;
        }
        return answer;
    }
	
	// 스트림을 이용한 다른사람 풀이
	public int solution1(String t, String p) {
        long targetNumber = Long.parseLong(p);
        int targetNumberLength = p.length();

        return (int) LongStream.range(0L, t.length() - targetNumberLength + 1L)
                .mapToObj(i -> t.substring((int) i, (int) i + targetNumberLength))
                .mapToLong(Long::parseLong)
                .filter(number -> number <= targetNumber)
                .count();
    }
	
	// try catch문으로 감싸고 compareTo 메소드 사용
	public int solution2(String t, String p) {
        int answer = 0;
        try {
            for (int i = 0; i < t.length(); i++) {
                String num = t.substring(i, i + p.length());
                if (num.compareTo(p) < 1) {
                    answer++;
                }
            }
        } catch (Exception e) {
            System.out.println("end");
        }
        return answer;
    }
}
