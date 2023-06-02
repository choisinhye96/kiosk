package cafe.java;

import javax.imageio.stream.ImageInputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Screen {
    private Scanner scanner;
    private ArrayList<Menu> menuList;
    private Map<Menu, ArrayList<Product>> productMap;
    private Order order;

    public Screen(ArrayList<Menu> menuList,Map<Menu, ArrayList<Product>> productMap){
        this.scanner = new Scanner(System.in);
        this.menuList = menuList;
        this.productMap = productMap;
        order = new Order();
    }

    public void show(){
        int choice = 0;

        while(true){
            printMenu();
            choice = selectNum();
            switch (choice) {
                case 0:
                    selectNum();
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                    Menu menu = menuList.get(choice - 1);
                    printProductMenu(menu);
                    selectProduct(menu);
                    break;
                case 5:
                    order.printOrders();
                    if (selectNum() == 1) {
                        printComplete();
                    }
                    break;
                case 6:



            }
        }
    }


        public void printMenu(){
            Kiosk kiosk = new Kiosk();
            System.out.println("텐퍼센트에 오신걸 환영합니다.");
            System.out.println("아래 메뉴판을 보고 메뉴를 골라 입력해주세요.");

            System.out.println("텐퍼센트 메뉴");
           for(int i = 0; i < menuList.size(); i++){
               Menu menu = menuList.get(i);
               System.out.println("%d, %s / %s\n", (i+1), menu.getName(),menu.getDetail());
            }
            System.out.println();


        }
}

