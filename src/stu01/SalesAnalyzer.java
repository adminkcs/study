package stu01;
import java.util.ArrayList;
import java.util.Random;

public class SalesAnalyzer {

    // 주문 리스트
    private ArrayList<Menu> orders;

    public SalesAnalyzer() {
    	orders = new ArrayList<Menu>();
    }

    // 메인 테스트
    public static void main(String[] args) {
        SalesAnalyzer sales = new SalesAnalyzer();

        // 랜덤 주문 생성.
        sales.randomOrders();
        // 매출 계산.
        int totalSales = sales.calculateSales();
        System.out.println("총 매출액: " + totalSales + "원");
    }

    // 랜덤 주문 생산기
    public void randomOrders() {
        Random random = new Random();
        int n = 51 + random.nextInt(50);
        for (int i = 0; i < n; i++) {
        	orders.add(randomOrder());
        }
    }

    private Menu randomOrder() {
    	Menu nemu = null;
    	Random random = new Random();
    	switch (random.nextInt(3)){
    	case 0:
    		nemu = new Ramyun();
    		System.out.println(nemu.getPrice());
    		break;
    	case 1:
    		nemu = new Kimbob();
    		break;
    	case 2:
    		nemu = new Twigim();
    		break;
    	}
    	return nemu;
    }

    // 매출 계산
    public int calculateSales() {
    	
        int raCount = 0;
        int kimCount = 0;
        int twiCount = 0;
        int totalSales = 0;
        for(Menu menu : orders){
        	if(menu.getClass() == Ramyun.class)
        		raCount++;
        	else if(menu.getClass() == Kimbob.class)
        		kimCount++;
        	else if(menu.getClass() == Twigim.class)
        		twiCount++;
        	
        	totalSales += menu.getPrice();
        }
        
        
        int raSales = Ramyun.PRICE * raCount;
        int kimSales = Kimbob.PRICE * kimCount;
        int twiSales = Kimbob.PRICE * twiCount;

        System.out.printf("[라면] %d개: %d원\n", raCount, raSales);
        System.out.printf("[김밥] %d개: %d원\n", kimCount, kimSales);
        System.out.printf("[튀김] %d개: %d원\n", twiCount, twiSales);
        System.out.println("==================");

        return totalSales;
    }
}