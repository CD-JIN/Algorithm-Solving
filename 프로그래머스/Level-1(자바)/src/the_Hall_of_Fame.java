import java.util.*;

public class the_Hall_of_Fame {
	// Collections 공부하기
    public int[] solution(int k, int[] score) {
		int[] result = new int[score.length];
		ArrayList<Integer> rank = new ArrayList<>();

		for (int i = 0; i < result.length; i++) {
			rank.add(score[i]);
			if (i >= k) rank.remove(Collections.min(rank));
			result[i] = Collections.min(rank);
		}
		return result;
	}
    // 다른사람 풀이 PriorityQueue 공부 하기
    public int[] solution1(int k, int[] score) {
        int[] answer = new int[score.length];

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int num=0; num<score.length;num++) {
            queue.add(score[num]);
            if(queue.size()<=k) {
                answer[num]=queue.peek();
            }else {
                queue.remove();
                answer[num]=queue.peek();
            }
        }

        return answer;
    }
    // 다른 사람 풀이
    public int[] solution2(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        int temp = 0;
        for(int i = 0; i < score.length; i++) {
            priorityQueue.add(score[i]);
            if (priorityQueue.size() > k) {
                priorityQueue.poll();
            }
            answer[i] = priorityQueue.peek();
        }
        return answer;
    }
}
