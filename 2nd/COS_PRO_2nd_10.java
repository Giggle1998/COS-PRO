class Main {
    public String solution(String s) {
        s += '#';
        String answer = "";
        for(int i = 0; i < s.length(); ++i){
            if (s.charAt(i) == '0' && s.charAt(i+1) != '0')
                answer += "0";
            else
                // 1인 경우에만 1을 추가
                if (s.charAt(i) == '1')
                	answer += "1";
        }
        return answer;
    }
    public static void main(String[] args) {
        Main sol = new Main();
        String s = "101100011100";
        String ret = sol.solution(s);
        System.out.println("solution 메소드의 반환 값은 \"" + ret + "\" 입니다.");
    }
}

