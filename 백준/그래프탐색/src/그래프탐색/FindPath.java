package 그래프탐색;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class FindPath {
	 static FastReader scan = new FastReader();
	    static StringBuilder sb = new StringBuilder();

	    static int N, M;
	    static int[][] adj;
	    static boolean[] visit;

	    static void input() {
	        N = scan.nextInt();
	        adj = new int[N+1][N+1];
	        visit = new boolean[N+1];
	        for(int i = 1; i <= N; i++) {
	        	for(int j = 1; j <= N; j++) {
	        		adj[i][j] = scan.nextInt();
	        	}
	        }
	    }

	    // start 에서 시작해서 갈 수 있는 정점들을 모두 탐색하기
	    static void bfs(int start) {
	        Queue<Integer> queue = new LinkedList<>();
	        
	        for(int i = 1; i <= N; i++) {
	        	visit[i] = false;
	        }
	        
	        queue.add(start);
	        visit[start] = false; // 예외: 자기 자신에게 돌아올 수 있는지 체크해야되므로..
	        
	        while(!queue.isEmpty()) {
	        	int x = queue.poll();
	        	
	        	for(int y = 1; y <= N; y++) {
	        		if(adj[x][y]== 0) continue;
	        		if(visit[y]) continue;
	        		
	        		queue.add(y);
	        		visit[y] = true;
	        	}
	        }
	        
	        for(int i = 1; i <= N; i++) {
	        	sb.append(visit[i] ? 1 : 0).append(" ");
	        }
	        sb.append('\n');
	    }

	    static void pro() {
	        for(int i = 1; i <= N; i++) {
	        	bfs(i);
	        }
	        
	        System.out.println(sb);
	    }

	    public static void main(String[] args) {
	        input();
	        pro();
	    }


	    static class FastReader {
	        BufferedReader br;
	        StringTokenizer st;

	        public FastReader() {
	            br = new BufferedReader(new InputStreamReader(System.in));
	        }

	        public FastReader(String s) throws FileNotFoundException {
	            br = new BufferedReader(new FileReader(new File(s)));
	        }

	        String next() {
	            while (st == null || !st.hasMoreElements()) {
	                try {
	                    st = new StringTokenizer(br.readLine());
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            }
	            return st.nextToken();
	        }

	        int nextInt() {
	            return Integer.parseInt(next());
	        }

	        long nextLong() {
	            return Long.parseLong(next());
	        }

	        double nextDouble() {
	            return Double.parseDouble(next());
	        }

	        String nextLine() {
	            String str = "";
	            try {
	                str = br.readLine();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	            return str;
	        }
	    }
}
