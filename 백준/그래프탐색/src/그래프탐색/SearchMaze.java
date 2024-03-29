package 그래프탐색;

import java.io.*;
import java.util.*;

public class SearchMaze {
	static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int N, M;
    static String[] a;
    static int[][] dist;
    static boolean[][] visit;
    static int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    static ArrayList<Integer> group;

    static void input() {
        N = scan.nextInt();
        M = scan.nextInt();
        a = new String[N];
        for (int i = 0; i < N; i++)
            a[i] = scan.nextLine();
        visit = new boolean[N][M];
        dist = new int[N][M];
    }

    // x, y 를 갈 수 있다는 걸 알고 방문한 상태
    static void bfs(int x, int y) {
        // dist 배열 초기화
        for(int i = 0; i < N; i++) {
        	for(int j = 0; j < M; j++) {
        		dist[i][j] = -1;
        	}
        }

        // (x, y)를 Q에 넣어주고, visit 표시와 dist 값 초기화
        Queue<Integer> Q = new LinkedList<Integer>();
        Q.add(x);
        Q.add(y);
        visit[x][y] = true;
        dist[x][y] = 1;

        // BFS 과정 시작
        while(!Q.isEmpty()) {
        	x = Q.poll();
        	y = Q.poll();
        	for(int i = 0; i < 4; i++) {
        		int nx = x + dir[i][0];
        		int ny = y + dir[i][1];
        		if(nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
        		if(visit[nx][ny]) continue;
        		if(a[nx].charAt(ny)== '0') continue;
        		Q.add(nx);
        		Q.add(ny);
        		visit[nx][ny] = true;
        		dist[nx][ny] = dist[x][y] + 1;
        	}
        }
    }

    static void pro() {
        // 시작점이 (0, 0)인 탐색 시작
        bfs(0, 0);

        // (N-1, M-1)까지 필요한 최소 이동 횟수 출력
        System.out.println(dist[N-1][M-1]);
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
