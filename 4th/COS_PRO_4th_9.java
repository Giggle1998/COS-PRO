import java.util.*;

class Main {
    public String solution(int hour, int minute) {
		// 절대값 처리 필수! 360 / 12 = 30도, 360 / 60 = 6도
        String answer = String.valueOf((double) Math.abs(hour * 30 - minute * 6));
        return answer;
    }

    public static void main(String[] args) {
        Main sol = new Main();
        int hour = 3;
        int minute = 0;
        String ret = sol.solution(hour, minute);
        System.out.println("solution 메소드의 반환 값은 \"" + ret + "\" 입니다.");
    }
}

