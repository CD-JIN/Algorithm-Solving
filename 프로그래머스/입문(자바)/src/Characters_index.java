
public class Characters_index {
	// 좀더 편한 if문으로 도배해버렸다.
	// 원래는 if문으로 완성해놓고 클린하게 만들려했으나 테스트9번에서 안되서
	// 로직 허점 찾는다고 시간을 너무 소비해버림..
	public int[] solution(String[] keyinput, int[] board) {
        int[] max = {board[0]/2, board[1]/2}; 
        int[] answer = new int[2];
        for(int i = 0; i < keyinput.length; i++) {
            if(keyinput[i].equals("left")) {
                if(answer[0]>=0) {
                    if(answer[0]<max[0]) {
                        answer[0] -= 1;    
                    } else if(answer[0]==max[0]) {
                        answer[0] -= 1;  
                    }
                } else {
                    if(Math.abs(answer[0])<max[0]) {
                        answer[0] -= 1;    
                    } else continue;
                }
            } else if(keyinput[i].equals("right")) {
                if(answer[0]<max[0]) {
                    answer[0] += 1;    
                } else continue;
            } else if(keyinput[i].equals("up")) {
                if(answer[1]<max[1]) {
                    answer[1] += 1;    
                } else continue;
            } else {
                if(answer[1]>=0) {
                    if(answer[1]<max[1]) {
                        answer[1] -= 1;    
                    } else if(answer[1]==max[1]) {
                        answer[1] -= 1;   
                    }
                } else {
                    if(Math.abs(answer[1])<max[1]) {
                        answer[1] -= 1;    
                    } else continue;
                }
            }
        }
        return answer;
    }
	//
	public int[] solution1(String[] keyinput, int[] board) {
        int[] now = {0, 0};
        for (int i = 0; i < keyinput.length; i++){
            if(keyinput[i].equals("left")) now[0] -= now[0]>-(board[0]/2)?1:0;
            else if(keyinput[i].equals("right")) now[0] += now[0]<(board[0]/2)?1:0;
            else if(keyinput[i].equals("down")) now[1] -= now[1]>-(board[1]/2)?1:0;
            else if(keyinput[i].equals("up")) now[1] += now[1]<(board[1]/2)?1:0;
            }
        return now;
    }
	//객체 지향... 
	private String up = "up";
    private String down = "down";
    private String left = "left";
    private String right = "right";
    private int xPos = 0;
    private int yPos = 1;
    private int maxWidth = 0;
    private int maxHeight= 0;
    int[] answer = {0, 0};

    public int[] solution2(String[] keyinput, int[] board) {
        maxWidth = board[xPos] / 2;
        maxHeight = board[yPos] / 2;
        for (String moveKey : keyinput) {
            move(moveKey);
        }
        return answer;
    }

    private void move(String key) {
        if (up.equals(key)) {
            // up
            moveUp();
        } else if (down.equals(key)) {
            // down
            moveDown();
        } else if (left.equals(key)) {
            // left
            moveLeft();
        } else {
            // right
            moveRight();
        }
    }

    private void moveUp() {
        int top = Math.abs(maxHeight);
        if (answer[yPos] + 1 <= top) {
            answer[yPos]++;
        };
    }

    private void moveDown() {
        int bottom = Math.abs(maxHeight) * -1;
        if (answer[yPos] - 1 >= bottom) {
            answer[yPos]--;
        };
    }

    private void moveLeft() {
        int left = Math.abs(maxWidth) * -1;
        if (answer[xPos] - 1 >= left) {
            answer[xPos]--;
        };
    }

    private void moveRight() {
        int right = Math.abs(maxWidth);
        if (answer[xPos] + 1 <= right) {
            answer[xPos]++;
        };
    }
}
