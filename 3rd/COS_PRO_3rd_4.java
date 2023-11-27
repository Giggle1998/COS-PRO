class Main {
    public int solution(String s1, String s2) {
        int answer = 0;
        int maxLen = -1;
        for (int i = 0; i<s1.length(); i++) {
            int idx1 = i, idx2 = 0, cnt = 0;
            // 인덱스 조절하며 탐색
            while (true) {
                // 동일한 경우
                if (s1.charAt(idx1) == s2.charAt(idx2)) {
                    idx1++;
                    idx2++;
                    cnt++;
                // 동일하지 않은 경우
                } else {
                    // 길이 저장
                    if (maxLen < cnt) {
                        maxLen = cnt;
                    }
                    
                    idx2++;
                    cnt = 0;
                }
                // 길이를 초과한다면 탐색 종료
                if (idx1 == s1.length() || idx2 == s2.length()) {
                    if (maxLen < cnt) {
                        maxLen = cnt;
                    }
                    break;
                }
            }
        }
        answer = s1.length() + s2.length() - maxLen;
        return answer;
    }
    public static void main(String[] args) {
        Main sol = new Main();
        String s1 = new String("ababc");
        String s2 = new String("abcdab");
        int ret = sol.solution(s1, s2);
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
    

