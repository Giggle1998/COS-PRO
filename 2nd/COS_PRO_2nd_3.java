class Main {
    public int func_a(int n){
        int ret = 1;
        while(n > 0){
            ret *= 10;
            n--;
        }
        return ret;
    }

    int func_b(int n){
        int ret = 0;
        while(n > 0){
            ret++;
            n /= 10;
        }
        return ret;
    }
    
    int func_c(int n){
        int ret = 0;
        while(n > 0){
            ret += n%10;
            n /= 10;
        }
        return ret;
    }
    
	public int solution(int num) {
        int nextNum = num;
        while(true){
            nextNum++;
            // 길이 구하기
            int length = func_b(nextNum);
            if(length % 2 != 0)
                continue;
            // 분리자
            int divisor = func_a(length/2);
            int front = nextNum / divisor;
            int back = nextNum % divisor;
            // 앞뒤 누적합 구하기
            int frontSum = func_c(front);
            int backSum = func_c(back);
            if(frontSum == backSum)
                break;
        }
        return nextNum - num;
    }
    public static void main(String[] args) {
        Main sol = new Main();
        int num1 = 1;
        int ret1 = sol.solution(num1);
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int num2 = 235386;
        int ret2 = sol.solution(num2);
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}


