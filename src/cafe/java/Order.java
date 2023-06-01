package cafe.java;

import java.util.ArrayList;

public class Order {
    private int orderNum; // 번호
    private ArrayList<Product> orders; //주문서


    public Order(){
        orderNum = 0;
        orders = new ArrayList<>();
    }
    public int increaseOrder() {
        return ++orderNum;
    }
    public void addOrder(Product product){

    }
}
