class Main {
    public long solution(int oneDayPrice, int multiDay, int multiDayPrice, long n){
        if(oneDayPrice * multiDay <= multiDayPrice)
            return n * oneDayPrice;
        else
            return (n / multiDay) * multiDayPrice + (n % multiDay) * oneDayPrice;
    }

    public static void main(String[] args) {        
        Main sol = new Main();
 
        int oneDayPrice1 = 3;
        int multiDay1 = 5;
        int multiDayPrice1 = 14;
        long n1 = 6;
        long ret1 = sol.solution(oneDayPrice1, multiDay1, multiDayPrice1, n1);
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int oneDayPrice2 = 2;
        int multiDay2 = 3;
        int multiDayPrice2 = 5;
        long n2 = 11;
        long ret2 = sol.solution(oneDayPrice2, multiDay2, multiDayPrice2, n2);
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}
