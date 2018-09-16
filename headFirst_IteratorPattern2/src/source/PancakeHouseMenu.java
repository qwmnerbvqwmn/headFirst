package source;

import java.util.ArrayList;

import iteratorPattern.Iterator;
import iteratorPattern.Menu;

public class PancakeHouseMenu implements Menu {
    // 用一个ArrayList来实现它的菜单项
    ArrayList<MenuItem> menuItems;
    
    //在菜单的构造器中每一份都会被添加到菜单集合中
    public PancakeHouseMenu() {
    	menuItems = new ArrayList<MenuItem>();
        addItem("普通煎饼果子",
                "加上鸡蛋和火腿",
                false,
                7.5);
        addItem("蓝莓煎饼果子", 
                "加上蓝莓", 
                true, 
                5.0);
        addItem("华夫饼", 
                "加上蓝莓和草莓", 
                true, 
                6.5);
    }
    public void addItem(String name, String des, boolean veg, double pri){
        MenuItem item = new MenuItem(name, des, veg, pri);
        menuItems.add(item);
    }
    
    // 返回煎饼屋的菜单项
    public ArrayList<MenuItem> getMenuItems(){
        return menuItems;
    }

	@Override
	public Iterator createIterator() {
		// TODO 自动生成的方法存根
//		return (Iterator) this.menuItems.iterator();
		return new PancakeHouseMenuIterator(this.menuItems);
	}
}