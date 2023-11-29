class Main {
    public String reverse(String number) {
        String reverseNumber = "";
        for(int i = number.length()-1; i >= 0; i--)
            reverseNumber += String.valueOf(number.charAt(i));
        return reverseNumber;
    }

    public String solution(int n) {
        String answer = "";
        for(int i = 0; i < n; i++) {
            answer += Integer.toString(i+1);
            answer = reverse(answer);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main sol = new Main();
        int n = 5;
        String ret = sol.solution(n);
        System.out.println("solution 메소드의 반환 값은 \"" + ret + "\" 입니다.");
    }
}

