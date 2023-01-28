import java.util.*;

public class Length_of_overlapping_line_segments {
	// 느낀점 : 진짜 여러가지 메소드를 사용해서 가능하다...
	public int solution(int[][] lines) {
        // 1. arr 배열 및 변수 초기화
        int[] arr = new int[200];
        int answer = 0;
        
        // 2. lines 정보를 arr 배열에 적용
        for(int i = 0; i < lines.length; i++) {
        	// 3. 음수 제거를 위해 +100 해주기
            for(int j = lines[i][0] + 100; j < lines[i][1] + 100; j++) {
            	arr[j]++;
            }
        }   
        // 4. arr 배열에서 겹친 부분 세기
        for(int i = 0; i < 200; i++) {
        	if(arr[i] > 1) answer++;
        } 
        return answer;
    }
	//
	public int solution1(int[][] lines) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<lines.length; i++) {
            int min = Math.min(lines[i][0], lines[i][1]);
            int max = Math.max(lines[i][0], lines[i][1]);
            for (int j=min; j<max; j++) {
                map.put(j, map.getOrDefault(j, 0) + 1);
            }
        }
        int answer = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 2) {
                answer++;
            }
        }
        return answer;
    }
	//
	public int solution2(int[][] lines) {
        int answer = 0;
        Map<Integer, Integer> linesMap = new HashMap<Integer, Integer>();
        for (int[] line : lines) {
            int startIdx = line[0];
            int endIdx = line[1];
            if (endIdx < startIdx) {
                int temp = endIdx;
                endIdx = startIdx;
                startIdx = temp;
            }
            for (int idx = startIdx; idx < endIdx; idx++) {
                if (linesMap.containsKey(idx)) {
                    linesMap.put(idx, linesMap.get(idx) + 1);
                } else {
                    linesMap.put(idx, 1);
                }
            }
        }

        for (int overlapLine : linesMap.values()) {
            if (overlapLine > 1) {
                answer++;
            }
        }
        return answer;
    }
}
