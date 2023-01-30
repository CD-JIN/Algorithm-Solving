
public class specialSort {
	// 설명 나중에 추가.. 직관적으로 안풀어짐..
	public int[] solution(int[] numlist, int n) {
        int size = numlist.length;
        for(int i=0; i<size-1; i++){
            for(int k=i+1; k<size; k++){
                int a = Math.abs(numlist[i] - n);
                int b = Math.abs(numlist[k] - n);
                if(a > b || (a == b && numlist[i] < numlist[k])){
                    int temp = numlist[i];
                    numlist[i] = numlist[k];
                    numlist[k] = temp;
                }
            }
        }
        return numlist;
    }
}
