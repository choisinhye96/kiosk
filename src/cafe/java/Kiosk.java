package cafe.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Kiosk {
    public static void main(String[] args) {
        Kiosk kiosk = new Kiosk();
        kiosk.goKiosk();

    public void goKiosk() {
        ArrayList<Menu> menuList = initMenu();
        Map<Menu, ArrayList<Product>>  productMap = initProduct(menuList);
        Screen screen = new Screen(menuList, productMap);
        screen.show();
    }

    private ArrayList<Menu> initMenu(){
        ArrayList<Menu> menuList = new ArrayList<>();
        menuList.add(new Menu("AMERICANO", "향기로운 아메리카노"));
        menuList.add(new Menu("CAFE_LATTE", "진한 다크 에스프레소와 고소한 서울우유의 조화"));
        menuList.add(new Menu("MILK_TEA", "얼그레니 티백이 아닌 건찻잎을 사용하여 꿀, 우유와 함께 24시간 냉침하여 만드는 로얄밀크티"));
        menuList.add(new Menu("BLACK_GRAPEFRUIT_TEA", "수제 자몽청의 과육과 블랙퍼스트티의 조화"));
        return menuList;
    }
    private Map<Menu, ArrayList<Product>> initProduct(ArrayList<Menu> menuList) {
        Map<Menu, ArrayList<Product>>  productMap = new HashMap<>();
        ArrayList<Product> productList = new ArrayList<>();
        productList.add(new Product("AMERICANO", "향기로운 아메리카노",2.8));
        productList.add(new Product("CAFE_LATTE", "진한 다크 에스프레소와 고소한 서울우유의 조화",3.8));
        productList.add(new Product("VANILA_LATTE","마다가스카르산 생바닐라빈으로 매장에서 직접 시럽을 끓여, 진한 바닐라향과 은은한 단맛을 내는 바닐라빈 라떼",4.3));
        productList.add(new Product("FLAT_WHITE","산미가 매력적인 미디움 원두와 우유의 조화. 부드럽고 진한 10oz 사이즈의 미니라떼",3.5));
        productList.add(new Product("CAFE_MOCHA","매장에서 직접 초콜릿을 중탕하여 만든 달콤한 리얼초코베이스와 쌉싸름한 에스프레소가 절묘하게 어울리는 커피", 4.8));
        productList.add(new Product("MATCHA_CAFE_LATTE","유기농 하동말차 베이스에 쌉싸름한 에스프레소가 곁들어진 커피 말차의 진한 맛이 일품", 4.8));
        productList.add(new Product("TEN_LATTE","시그니처메뉴. 진한 카페라떼 위 쫀득한 휘핑이 올라간 10oz 사이즈의 미니 라떼", 3.9));
        productMap.put(menuList.get(0), productList);

        productList = new ArrayList<>();
        productList.add(new Product("MILK_TEA", "얼그레니 티백이 아닌 건찻잎을 사용하여 꿀, 우유와 함께 24시간 냉침하여 만드는 로얄밀크티", 4.5));
        productList.add(new Product("BLACK_GRAPEFRUIT_TEA", "수제 자몽청의 과육과 블랙퍼스트티의 조화", 4.0));
        productList.add(new Product("BLACK_LEMON_TEA", "블랙티와 레몬청의 조화", 4.0));
        productList.add(new Product("CHOCO_LATTE", "벨기에산 초콜릿을 직접 중탕으로 녹여 만든 찐한 초코라떼", 4.5));
        productMap.put(menuList.get(1), productList);
        return productMap;
    }
}
