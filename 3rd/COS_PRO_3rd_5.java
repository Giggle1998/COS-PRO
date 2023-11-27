class Main {
    public String solution(String phrases, int second) {
        String answer = "";
        // 계산에 사용할 초 구하기
        int sec = second % 14;
        
        // 문자 출력
        answer = phrases.substring(0, sec);
        // 나머지는 "_" 처리
        for (int i = 0; i<phrases.length() - sec; i++) {
            answer = "_" + answer;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main sol = new Main();
        String phrases = new String("happy-birthday");
        int second = 3;
        String ret = sol.solution(phrases, second);
        System.out.println("solution 메소드의 반환 값은 \"" + ret + "\" 입니다.");
    }
}

    
