class Main {
    public int solution(int[] arr) {
        int answer = 0;
        // 연속 구간을 저장할 수 있는 배열
        int[] check = new int[arr.length];
        // 현재 숫자와 check를 가르킬 인덱스
        int cur = arr[0], idx = 0;
        check[idx] = 1;
        answer = check[idx];
        for (int i = 1; i<arr.length; i++) {
            // 이전 값보다 크면 길이 증가
            if (cur < arr[i]) {
                check[idx]++;
            // 이전 값보다 작으면 새로운 배열 추가
            } else {
                idx++;
                check[idx] = 1;
            }
            cur = arr[i];
            // 최대 길이 도출
            if (answer < check[idx]) {
                answer = check[idx];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main sol = new Main();
        int[] arr = {3, 1, 2, 4, 5, 1, 2, 2, 3, 4};
        int ret = sol.solution(arr);
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}


