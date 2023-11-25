class Main {
    public int solution(int n) {
        int[][] arr = new int[n][n];
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        int x = 0, y = 0;
        int idx = 0;
        arr[x][y] = 1;
        
        // 방향 전환 탐색
        for (int i = 2; i<=Math.pow(n, 2); i++) {
            x += dx[idx];
            y += dy[idx];
            if (x < 0 || x >= n || y < 0 || y >= n || arr[x][y] != 0) {
                x -= dx[idx];
                y -= dy[idx];
                idx = (idx + 1) % 4;
                x += dx[idx];
                y += dy[idx];
            }
            
            arr[x][y] = i;
        }
        
        // 대각선 탐색 후 정답 반환
        int answer = 0;
        for (int i = 0; i<n; i++) {
            answer += arr[i][i];
        }
				
        return answer;
    }
    public static void main(String[] args) {
    Main sol = new Main();
    int n1 = 3;
    int ret1 = sol.solution(n1);
    System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

    int n2 = 2;
    int ret2 = sol.solution(n2);
    System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}
