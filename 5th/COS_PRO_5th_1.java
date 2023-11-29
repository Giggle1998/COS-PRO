class Main {
    public int solution(int n) {
        int answer = 0;

        int[] steps = new int[n+1];
        steps[1] = 1;
        steps[2] = 2;
        steps[3] = 4;
        for(int i = 4; i <= n; i++)
        	steps[i] = steps[i-1] + steps[i-2] + steps[i-3];
        answer = steps[n];

        return answer;
    }

    public static void main(String[] args) {
    	Main sol = new Main();
    	int n1 = 3;
    	int ret1 = sol.solution(n1);
    	System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

    	int n2 = 4;
    	int ret2 = sol.solution(n2);
    	System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}
    
