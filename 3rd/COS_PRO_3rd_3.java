// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Main {
    public int solution(String[] bishops) {
        Map<Character, Integer> map = new HashMap<>();
        int[] dy = {1, 1, -1, -1};
        int[] dx = {1, -1, -1, 1};
        boolean[][] visited= new boolean[8][8];
        int answer = 0;
        map.put('A', 0);
        map.put('B', 1);
        map.put('C', 2);
        map.put('D', 3);
        map.put('E', 4);
        map.put('F', 5);
        map.put('G', 6);
        map.put('H', 7);
        
        for (String bishop : bishops) {
            int bx = 0, by = 0;
            by = map.get(bishop.charAt(0));
            bx = Integer.parseInt(String.valueOf(bishop.charAt(1))) - 1;
            visited[bx][by] = true;

            // 비숍이 움직일 수 있는 경우
            for (int i = 0; i<dx.length; i++) {
                for (int j = 1; j<8; j++) {
                    int nx = bx + (dx[i] * j);
                    int ny = by + (dy[i] * j);
                
                    if (nx >= 0 && nx < 8 && ny >= 0 && ny < 8 && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                    }
                }
            }
        }
        // 최종 가능한 구역 탐색
        for (int i = 0; i<8; i++) {
            for (int j = 0; j<8; j++) {
                if (!visited[i][j]) {
                    answer++;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Main sol = new Main();
        String[] bishops1 = {new String("D5")};
        int ret1 = sol.solution(bishops1);
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        String[] bishops2 = {new String("D5"), new String("E8"), new String("G2")};
        int ret2 = sol.solution(bishops2);
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}


