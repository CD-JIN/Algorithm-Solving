import java.util.*;

class Node{
    int x,y;
    public Node(int x,int y){
        this.x = x;
        this.y = y;
    }
}

public class Kakao_Friends_Coloring_Book {
	static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    
    static boolean[][] visited;
    static Queue<Node> queue;
    static int size;
    
    // bfs 이용
    public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        visited = new boolean[m][n];
        queue = new LinkedList<Node>();
        
        for(int i = 0; i < m; i++){
            for(int j = 0;j <n ; j++){
                if(visited[i][j] != true && picture[i][j] != 0 ){
                    size = 1;
                    bfs(i, j, m, n, picture);
                    if(maxSizeOfOneArea < size) maxSizeOfOneArea = size;
                    numberOfArea++;
                }
            }
        }
        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }
    
    public void bfs(int x, int y, int m, int n, int[][] picture){
        queue.add(new Node(x,y));
        visited[x][y] = true;
        
        while(!queue.isEmpty()){
            Node originalLocation = queue.poll();
            for(int i = 0; i < 4; i++){
                int kx = originalLocation.x + dx[i];
                int ky = originalLocation.y + dy[i];
                if(0 <= kx && kx < m && 0 <= ky && ky < n){
                    if(visited[kx][ky] != true && picture[x][y] == picture[kx][ky]){
                        queue.add(new Node(kx,ky));
                        visited[kx][ky] = true;
                        size++;
                    }
                }
            }
        }
    }
}
// DFS 이용 풀이
class Solution {
    // 변수 접근을 위한 전역 변수들.
    static int numberOfArea;
    static int maxSizeOfOneArea;
    // 한 영역의 수를 저장하는 변수.
    static int count = 0;

    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    
    // DFS 메소드
    public static void dfs(int x,int y, int[][] picture, boolean[][] check){

        if(check[x][y]) return;
        

        check[x][y] = true;
 
        count++;
        
        // 한 좌표에서 상,하,좌,우 탐색.
        for(int i =0;i<4;i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            // 배열의 범위를 벗어나면 continue.
            if(nx<0 || nx>=picture.length || ny<0 || ny>=picture[0].length) continue;
            
            // 같은 영역 && 방문한적 없는 좌표일 경우
            if(picture[x][y] == picture[nx][ny] && !check[nx][ny]){                
                // DFS를 위한 재귀호출.
                dfs(nx,ny,picture,check);
            }            
        }        
    }
    
    public int[] solution(int m, int n, int[][] picture) {
        // 초기화 
        numberOfArea =0;
        maxSizeOfOneArea=0;
        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        
        // 방문여부를 체크 할 배열.
        boolean[][] check = new boolean[m][n];
        
        // 주어진 picture 배열을 탐색.
        for(int i =0;i<m;i++){
            for(int j=0;j<n;j++){
                // 원소가 0이 아니고, 방문한 적이 없다면.
                if(picture[i][j] != 0 && !check[i][j]){
                    // 영역의 수가 1개 증가하며 DFS 탐색 수행.
                    numberOfArea++;
                    dfs(i,j,picture,check);
                }
                // 한 영역의 탐색이 모두 끝났다면, 조건에 따라 최대 영역의 수를 변경.
                if(count > maxSizeOfOneArea) maxSizeOfOneArea = count;
                // 한 영역의 수는 다시 초기화.
                count = 0;
            }
        }
        
        // 각 값을 answer 배열에 담아주고 끝.
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        
        return answer;
    }
}
