
public class Next_number {
	public int solution(int[] common) {
        String str = "";
        int answer;
        int x = 0;
        if(common[1]-common[0]==common[2]-common[1]) {
            str = "cha";
            x = common[1]-common[0];
        } else if (common[1]/common[0]==common[2]/common[1]) {
            str = "bi";
            x = common[1]/common[0];
        }
        if(str.equals("cha")) {
            answer = common[common.length-1]+x;
        } else {
            answer = common[common.length-1]*x;
        }
        return answer;
    }
}
