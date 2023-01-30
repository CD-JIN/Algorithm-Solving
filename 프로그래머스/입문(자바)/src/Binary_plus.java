
public class Binary_plus {
	public String solution(String bin1, String bin2) {
		// 자료형.parse자료형(String s, int radix) 진수값(radix)에 맞게 반환
        long newValue = Long.parseLong(bin1, 2) + Long.parseLong(bin2, 2);
        //자료형.toBinaryString(자료형 i) => 이진수(String값)로 변환
        return Long.toBinaryString(newValue);
    }
	// 참고 16진수(toHexString​) 8진수(toOctalString) 변환도 있음.
}
