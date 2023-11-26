class Main {
    public int solution(int[] arr, int K) {
        int answer = 0;
        // arr중에서 3개만 뽑아서 탐색하기
        for (int i = 0; i<arr.length-2; i++) {
            int sum = arr[i];
            for (int j = i+1; j<arr.length-1; j++) {
                sum += arr[j];
                for (int k = j+1; k<arr.length; k++) {
                    sum += arr[k];
                    // 정답 조건에 만족하면 카운트
                    if (sum % K == 0) {
                        answer++;
                    }
                    sum -= arr[k];
                }
                sum -= arr[j];
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Main sol = new Main();
        int[] arr = {1, 2, 3, 4, 5};
        int K = 3;
        int ret = sol.solution(arr, K);
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}


