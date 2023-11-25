import java.util.*;

class Main {
    interface DeliveryStore{
        public void setOrderList(String[] orderList);
        public int getTotalPrice();
    }
    
    class Food{
        public String name;
        public int price;
        public Food(String name, int price){
            this.name = name;
            this.price = price;
        }
    }

    // implements를 통해 인터페이스 활용
    class PizzaStore implements DeliveryStore{
        private ArrayList<Food> menuList;
        private ArrayList<String> orderList;
        
        public PizzaStore(){
            menuList = new ArrayList<Food>();
            String[] menuNames = {"Cheese", "Potato", "Shrimp", "Pineapple", "Meatball"};
            int[] menuPrices = {11100, 12600, 13300, 21000, 19500};
            for(int i = 0; i < 5; i++)
                menuList.add(new Food(menuNames[i], menuPrices[i]));
            
            orderList = new ArrayList<String>();
        }
        
        // DeliveryStore의 setOrderList 메소드 활용
        public void setOrderList(String[] orderList){
            for(int i = 0; i < orderList.length; i++)
                this.orderList.add(orderList[i]);
        }
        
        // DeliveryStore의 getTotalPrice 메소드 활용
        public int getTotalPrice(){
            int totalPrice = 0;
            Iterator<String> iter = orderList.iterator();
            while (iter.hasNext()) {
                String order = iter.next();
                for(int i = 0; i < menuList.size(); i++)
                    if(order.equals(menuList.get(i).name))
                        totalPrice += menuList.get(i).price;
            }
            return totalPrice;
        }
    }
    
    public int solution(String[] orderList) {
        DeliveryStore deliveryStore = new PizzaStore();
        
        deliveryStore.setOrderList(orderList);
        int totalPrice = deliveryStore.getTotalPrice();
        
        return totalPrice;
    }

    public static void main(String[] args) {
        Main sol = new Main();
        String[] orderList = {"Cheese", "Pineapple", "Meatball"};
        int ret = sol.solution(orderList);
        
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
 
