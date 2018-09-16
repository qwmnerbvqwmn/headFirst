package source;

import iteratorPattern.Iterator;
import iteratorPattern.Menu;

public class DinerMenu implements Menu {
	 // 餐厅用的是数组，所以最大长度可定
    static final int MAX_ITEMS = 6;
    int numberOFitems = 0;
    MenuItem[] menuItems;
    
    // 构造菜单的方法和煎饼果子相差无几，只是这家有数量限制
    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("蔬菜沙拉",
                "用沙拉酱和番茄酱", 
                true, 
                6.5);
        addItem("酸菜粉丝汤", 
                "", 
                true, 
                3.00);
        addItem("韭菜炒肉",
                "中份", 
                false, 
                5.3);
        addItem("热狗",
                "上面抹层芝士", 
                false, 
                4.2);
        
        
    }
    
    public void addItem(String name, String des, boolean veg, double pri){
        MenuItem item = new MenuItem(name, des, veg, pri);
        if(numberOFitems >= MAX_ITEMS){
            System.out.println("对不起，菜单暂时满了。。。今天就先提供这些吧!");
        }else{
            menuItems[numberOFitems] = item;
            numberOFitems++;
        }
    }
    
    
    public MenuItem[] getMenuItems(){
        return menuItems;
    }
	//菜单的其他方法

	@Override
	public Iterator createIterator() {
		// TODO 自动生成的方法存根
		return new DinerMenuIterator(this.menuItems);
	}
}

