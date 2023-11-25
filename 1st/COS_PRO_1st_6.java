import java.util.*;

class Main {
    public int solution(String pos) {
        Map<Character, Integer> map = new HashMap<>();
        int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
        int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};
        map.put('A', 0);
        map.put('B', 1);
        map.put('C', 2);
        map.put('D', 3);
        map.put('E', 4);
        map.put('F', 5);
        map.put('G', 6);
        map.put('H', 7);
    
        char ch = pos.charAt(0);
        int x = Integer.parseInt(String.valueOf(pos.charAt(1))) - 1;
        int y = map.get(ch);
        
        int answer = 0;
        for (int i = 0; i<8; i++) {
            int cx = x + dx[i];
            int cy = y + dy[i];
            
            if (cx >= 0 && cx < 8 && cy >= 0 && cy < 8) {
                answer++;
            }
        }
	
        return answer;
    }

    public static void main(String[] args) {
        Main sol = new Main();
        String pos = "A7";
        int ret = sol.solution(pos);

        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
