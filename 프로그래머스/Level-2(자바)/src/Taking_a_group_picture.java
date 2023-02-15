import java.util.*;

public class Taking_a_group_picture {
	static int answer;
    static HashMap<Character, Integer> map;
    static boolean[] check;
    static int[] arr;

    public int solution(int n, String[] data) {
        map = new HashMap<>();  
        check = new boolean[8]; // 줄 섰는지 체크용
        arr = new int[8];       // 줄 세우기 배열
        answer = 0;             // 조건 만족 경우의 수
        // map 값 넣기 {A, C, F, J, M, N, R, T}
        map.put('A', 0);
        map.put('C', 1);
        map.put('F', 2);
        map.put('J', 3);
        map.put('M', 4);
        map.put('N', 5);
        map.put('R', 6);
        map.put('T', 7);
        dfs(0, data);
        return answer;
    }

    public static void dfs(int index, String[] data) {
        if(index == 8 && conditionCheck(data)) answer++;
        else {
            for(int i = 0; i < 8; i++) {
                if(!check[i]) {
                    check[i] = true;
                    arr[index] = i;
                    dfs(index + 1, data);
                    check[i] = false;
                }
            }
        }
    }

    public static boolean conditionCheck(String[] data) {
        for(String str : data) {
            int a = arr[map.get(str.charAt(0))];
            int b = arr[map.get(str.charAt(2))];
            int distance = Integer.parseInt(str.substring(4, 5))+1;

            switch(str.charAt(3)) {
                case '=' :
                    if (Math.abs(a - b) != distance) return false;
                    break;
                case '>' :
                    if (Math.abs(a - b) <= distance) return false;
                    break;
                case '<' :
                    if (Math.abs(a - b) >= distance) return false;
                    break;
            }
        }
        return true;
    }
}
