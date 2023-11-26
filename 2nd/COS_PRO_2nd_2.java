class Main {
    public int func_a(String times){
        int hour = Integer.parseInt(times.substring(0, 2));
        int minute = Integer.parseInt(times.substring(3));
        return hour*60 + minute;
    }
    public int solution(String[] subwayTimes, String currentTime) {
				// 현재 시간
        int currentMinute = func_a(currentTime);
        int INF = 1000000000;
        int answer = INF;
        for(int i = 0; i < subwayTimes.length; ++i){
						// 지하철 시간
            int subwayMinute = func_a(subwayTimes[i]);
						// 지하철 시간이 현재 시간보다 이상인 경우 가능
            if(subwayMinute >= currentMinute){
                answer = subwayMinute - currentMinute;
                break;
            }
        }
        if(answer == INF)
            return -1;
        return answer;
    }
    public static void main(String[] args) {
        Main sol = new Main();
        String[] subwayTimes1 = {"05:31", "11:59", "13:30", "23:32"};
        String currentTime1 = "12:00";
        int ret1 = sol.solution(subwayTimes1, currentTime1);
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        String[] subwayTimes2 = {"14:31", "15:31"};
        String currentTime2 = "15:31";
        int ret2 = sol.solution(subwayTimes2, currentTime2);
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}


