
public class Flip_Array {
	public int[] solution(int[] num_list) {
        int[] list = num_list;
        int l = num_list.length;
        for(int i = 0; i < l/2; i++) {
            int temp = list[i];
            list[i] = list[l-i-1];
            list[l-i-1] = temp;
        }
        return list;
    }
}
