class Main {	
    public String solution(String s1, String s2, int p, int q) {
        String answer = "";
				
        int sum1 = 0, sum2 = 0, num = 0;
    
        for (int i = s1.length() - 1; i>=0; i--) {
            sum1 += Integer.parseInt(s1.substring(i, i+1)) * Math.pow(p, num);
            num++;
        }
        num = 0;
        for (int i = s2.length() - 1; i>=0; i--) {
            sum2 += Integer.parseInt(s2.substring(i, i+1)) * Math.pow(p, num);
            num++;
        }
    
        int sum = sum1 + sum2;
        
        while (sum > 0) {
            answer = String.valueOf(sum % q) + answer;
            sum /= q;
        }
        return answer;
    }

    public static void main(String[] args) {
    	Main sol = new Main();
    	String s1 = new String("112001");
        String s2 = new String("12010");
        int p = 3;
        int q = 8;
    	String ret = sol.solution(s1, s2, p, q);
        System.out.println("solution 메소드의 반환 값은 \"" + ret + "\" 입니다.");
   }
}