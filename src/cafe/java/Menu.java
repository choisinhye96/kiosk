package cafe.java;

public class Menu {
    private String name; //메뉴: 커피와 논 커피
    private String detail; // 메뉴 설명
//    private char temperature; //아이스(I) 또는 핫(H)
//    String extra; // 샷추가
//    private String cup; // 매장컵 또는 테이크 아웃컵
//    private char size; // 레귤러(R) 또는 플러스(P) 사이즈

    //필드
    public Menu(String name, String detail) {
        this.name = name;
        this.detail = detail;
    }


    // 메소드
    public String getName() {
        return name;
    }

    public String getDetail() {
        return detail;
    }

//    public char choiceTemperatureIceOrHot(char type) {
//        temperature = type;
//        return temperature;
//    }
//    public String getCup() {
//        return cup;
//    }
//    public void setCup(String cup) {
//        this.cup = cup;
//    }
//    public char choiceSizeRegulerORPlus(char type) {
//        size = type;
//        return size;
//    }



}
