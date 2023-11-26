class Main {
    public int solution(int money) {
        int coin[] = {10, 50, 100, 500, 1000, 5000, 10000, 50000};
        int counter = 0;
        int idx = coin.length - 1;
        while (money > 0){
						// 거스름돈을 받을 수 있는 수
            counter += money / coin[idx];
						// 나머지 금액
            money %= coin[idx];
						// 다음 동전,지폐로 이동
            idx -= 1;
        }
        return counter;
    }

    public static void main(String[] args) {
        Main sol = new Main();
        int money = 2760;
        int ret = sol.solution(money);

        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}


