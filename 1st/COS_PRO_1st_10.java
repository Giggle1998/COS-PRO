class Main{
    int solution(int[] prices){
        int inf = 1000000001;
        int tmp = inf;
        int answer = -inf;
        for(int price : prices){
            if(tmp != inf)
                // 현재 가격에서 최소 가격을 빼야함
                answer = Math.max(answer, price - tmp);
            tmp = Math.min(tmp, price);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main sol = new Main();
        int[] prices1 = {1, 2, 3};
        int ret1 = sol.solution(prices1);
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int[] prices2 = {3, 1};
        int ret2 = sol.solution(prices2);
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}
