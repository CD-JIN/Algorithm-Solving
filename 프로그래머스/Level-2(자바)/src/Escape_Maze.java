import java.util.*;

public class Escape_Maze {
	 // 좌표를 담을 클래스
    static public class Node{
        
        int x, y, time;//x좌표, y좌표, 이동한 초 
        
        public Node(int x, int y, int time) {
            this.x = x;
            this.y = y;
            this.time = time;
        }
    }
    
    static char[][] map;
    static int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    static int N, M;
    static int startX, startY, endX, endY, leverX, leverY;    
    static boolean[][] visit;
    
    public int solution(String[] maps) {
        N = maps.length;
        M = maps[0].length();
        map = new char[N][M];
        
        int toLever = 0;
        int toEnd = 0;
        
        input(maps);
        
        visit = new boolean[N][M]; // 방문 초기화
        toLever = bfs1(startX, startY);
        
        visit = new boolean[N][M]; // 방문 초기화
        toEnd = bfs2(leverX, leverY);
        
        if(toEnd == -1 || toLever == -1) {
            return -1;
        } 
        
        return toLever + toEnd;
    }
    
    static void input(String[] maps) {
        
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                map[i][j] = maps[i].charAt(j);
                if(map[i][j] == 'S') {
                    startX = i;
                    startY = j;
                }
                if(map[i][j] == 'E') {
                    endX = i;
                    endY = j;
                }
                if(map[i][j] == 'L') {
                    leverX = i;
                    leverY = j;
                }
            }
        }
    }
    
    static int bfs1(int x, int y) {// start -> lever 까지              
        
        Queue<Node> Q = new LinkedList<>();
        Q.add(new Node(x, y, 0));
        visit[x][y] = true;
        
        while(!Q.isEmpty()) {
            Node now = Q.poll();
            
            for(int i = 0; i < 4; i++) {
                int nx = now.x + dir[i][0];
                int ny = now.y + dir[i][1];
                if(nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
                if(map[nx][ny] == 'X' || visit[nx][ny]) continue;
                if(map[nx][ny] == 'L') return now.time + 1;
                
                Q.add(new Node(nx, ny, now.time + 1));
                visit[nx][ny] = true;                
            }
        }
        return -1;
    }
    
    static int bfs2(int x, int y) {// lever -> end 까지              
        
        Queue<Node> Q = new LinkedList<>();
        Q.add(new Node(x, y, 0));
        visit[x][y] = true;
        
        while(!Q.isEmpty()) {
            Node now = Q.poll();
            
            for(int i = 0; i < 4; i++) {
                int nx = now.x + dir[i][0];
                int ny = now.y + dir[i][1];
                if(nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
                if(map[nx][ny] == 'X' || visit[nx][ny]) continue;
                if(map[nx][ny] == 'E') return now.time + 1;
                
                Q.add(new Node(nx, ny, now.time + 1));
                visit[nx][ny] = true;                
            }
        }
        return -1;
    }
}
