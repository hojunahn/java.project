package 어레이리스트메뉴;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMenu {
    public static void main(String[] args) {
        List<MenuInfo> menuList = new ArrayList<>();
        menuList.add(new MenuInfo("Americano",2800,"coffee","커피",true));
        menuList.add(new MenuInfo("latte",3500,"커피","우유",true));
        menuList.add(new MenuInfo("BlackTea", 4500,"Tea","홍차",false));
        for(MenuInfo menu : menuList) System.out.println(menu.getJsonFormat());
    }
}

class MenuInfo{
    String name;
    int price;
    String category;
    String desc;
    boolean isTax;

    public MenuInfo(String name, int price, String category, String desc, boolean isTax) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.desc = desc;
        this.isTax = isTax;
    }
    public String getJsonFormat() {
        return "{"+"\"name\":"+name+","+"\"price\":"+price+","+"\"isTax\":"+isTax+"}";
    }
}
