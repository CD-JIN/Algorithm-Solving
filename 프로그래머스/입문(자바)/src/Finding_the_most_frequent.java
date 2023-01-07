import java.util.HashMap;

public class Finding_the_most_frequent {
	public int solution(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int maxKey = -1, maxValCnt = 0;
		for (int i = 0; i < array.length; i++) {
			int t = map.getOrDefault(array[i], 0) + 1;
			map.put(array[i], t);
			if(maxValCnt<t) {
                maxKey = array[i]; 
                maxValCnt = t;
            }
		}
		for(Integer i: map.keySet()) {
			if(map.get(i)==maxValCnt && i!=maxKey) return -1;
		}
		return maxKey;
    }
}
