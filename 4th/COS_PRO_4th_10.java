import java.util.*;

class Main {
    public int solution(int a, int b) {
        int answer = 0;
				
        int cur = 2;
        while (true) {
            int cnt = 0;
            for (int i = 2; i<=cur; i++) {
                if (cur % i == 0) {
                    cnt++;
                }
            }
            // 소수
            if (cnt == 1) {
                int num1 = cur * cur;
                int num2 = cur * cur * cur;
                if ((a <= num1 && b >= num1)) {
                    answer++;
                }
                if ((a <= num2 && b >= num2)) {
                    answer++;
                }
            }
            cur++;
            if (cur * cur > b) {
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Main sol = new Main();
        int a = 6;
        int b = 30;
        int ret = sol.solution(a, b);
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}

