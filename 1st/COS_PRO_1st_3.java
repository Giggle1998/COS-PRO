class Main {
    class Pair{
        public int firstNum;
        public int secondNum;
    }
    
    public int func_a(int numA, int numB, char exp){
        if (exp == '+')
            return numA + numB;
        else if (exp == '-')
            return numA - numB;
        else
            return numA * numB;
    }
    
    public int func_b(String exp){
        for(int i = 0; i < exp.length(); i++){
            char e = exp.charAt(i);
            if(e == '+' || e == '-' || e == '*')
                return i;
        }
        return -1;
    }
    public Pair func_c(String exp, int idx){
        Pair ret = new Pair();
        ret.firstNum = Integer.parseInt(exp.substring(0, idx));
        ret.secondNum = Integer.parseInt(exp.substring(idx + 1));
        return ret;
    }
    
    public int solution(String expression) {
        // 연산자의 인덱스를 찾는 메소드
        int expIndex = func_b(expression);
        // 첫번째, 두번째 수를 분리하는 메소드
        Pair numbers = func_c(expression, expIndex);
        // 최종 결과를 반환하는 메소드
        int result = func_a(numbers.firstNum, numbers.secondNum, expression.charAt(expIndex));
        return result;
    }

    public static void main(String[] args) {
        Main sol = new Main();
        String expression = "123+12";
        int ret = sol.solution(expression);

        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
