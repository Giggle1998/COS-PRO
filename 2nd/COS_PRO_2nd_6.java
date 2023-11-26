import java.util.*;

class Main {
    public int[] solution(String commands) {
        int[] answer = new int[2];
        // 이동 방향 L R U D
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        
        int x = 0, y = 0;
        // 조건에 따라 탐색
        for (char command : commands.toCharArray()) {
            if (command == 'L') {
                x += dx[0];
                y += dy[0];
            } else if (command == 'R') {
                x += dx[1];
                y += dy[1];
            } else if (command == 'U') {
                x += dx[2];
                y += dy[2];
            } else if (command == 'D') {
                x += dx[3];
                y += dy[3];
            }
        }
        answer[0] = x;
        answer[1] = y;
			
        return answer;
    }
    public static void main(String[] args) {
        Main sol = new Main();
        String commands = "URDDL";
        int[] ret = sol.solution(commands);
        System.out.println("solution 메소드의 반환 값은 " + Arrays.toString(ret) + " 입니다.");
    }
}


