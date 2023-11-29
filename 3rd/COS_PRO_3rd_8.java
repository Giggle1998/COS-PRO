class Main {
    public int solution(int k, int[] student) {
        int answer = 0;
        for(int i = 0; i < student.length; i++){
            student[i] -= 4*k;
            if(student[i] <= 0)
                continue;
            answer += (student[i] + k - 1) / k;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main sol = new Main();
        int k1 = 1;
        int[] student1 = {4, 4, 4, 4};
        int ret1 = sol.solution(k1, student1);
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");
        
        int k2 = 3;
        int[] student2 = {15, 17, 19, 10, 23};
        int ret2 = sol.solution(k2, student2);
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}
    

