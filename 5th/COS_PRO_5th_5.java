// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Main {
    public int solution(int[] enemies, int[] armies) {
        int answer = 0;
        Arrays.sort(enemies);
        Arrays.sort(armies);
        int idxEnemy = 0, idxArmy = 0;
        while (idxEnemy < enemies.length - 1 || idxArmy < armies.length - 1) {
            if (enemies[idxEnemy] <= armies[idxArmy]) {
                idxEnemy++;
                idxArmy++;
                answer++;
            } else {
                idxArmy++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
    	Main sol = new Main();
    	int[] enemies1 = {1, 4, 3};
    	int[] armies1 = {1, 3};
    	int ret1 = sol.solution(enemies1, armies1);
    	System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

    	int[] enemies2 = {1, 1, 1};
    	int[] armies2 = {1, 2, 3, 4};
    	int ret2 = sol.solution(enemies2, armies2);
    	System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}

