import java.util.*;

class Main {
    ArrayList<Integer> list = new ArrayList<>();
    public void makeNum(int[] cardReal, int[] cardCheck, int cnt, int cur) {
        if (cnt == 0) {
            list.add(cur);
            return;
        }
        
        for (int i = 1; i<10; i++) {
            if (cardCheck[i] < cardReal[i]) {
                cardCheck[i]++;
                makeNum(cardReal, cardCheck, cnt-1, cur*10+i);
                cardCheck[i]--;
            }
        }
    }
		
    public int solution(int[] card, int n) {
        int answer = -1;
				int[] cardReal = new int[10];
				int[] cardCheck = new int[10];
				
				for (int i = 0; i < card.length; i++) {
					cardReal[card[i]]++;
				}
				makeNum(cardReal, cardCheck, card.length, 0);
				for (int i = 0; i < list.size(); i++) {
					if (n == list.get(i)) {
						answer = i+1;
					}
				}
        return answer;
    }
    public static void main(String[] args) {
        Main sol = new Main();
        int card1[] = {1, 2, 1, 3};
        int n1 = 1312;
        int ret1 = sol.solution(card1, n1);
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int card2[] = {1, 1, 1, 2};
        int n2 = 1122;
        int ret2 = sol.solution(card2, n2);
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }    
}
    
