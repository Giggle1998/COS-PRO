class Main {
    public long solution(long num) {
        long answer = 0;
        while (true) {
            // 숫자 1증가
            num++;
            
            // 문자열로 변환
            String tmp = String.valueOf(num);
            
            // 0 탐색
            boolean flag = true;
            for (int i = 0; i<tmp.length(); i++) {
                // 0이 있다면 계속 탐색
                if (tmp.charAt(i) == '0') {
                    flag = false;
                    break;
                }
            }
            // 0이 없다면 정답 반환
            if (flag) {
                answer = num;
                break;
            }
        }
        
        return answer;
    }

    public static void main(String[] args) {
    Main sol = new Main();
    long num = 9949999;
    long ret = sol.solution(num);

    System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}

