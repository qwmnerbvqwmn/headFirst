package waiteress;

import source.MenuItem;

public interface waiteress {
//	1：打印出菜单上的每一项
	public void printMenu();
//	2：只打印早餐项
	public void printBreakfest();
//	3：只打印午餐项
	public void printDiner();
//	4：打印所有的素食菜单项
	public void printVegetables();
//	5：指定项的名称，如果该项是素食的话，返回true，否则返回false
	public boolean isVegetables(MenuItem menuitem);
//	1：打印没分菜单上的所有项，必须调用PancakeHouseMenu和DinerMenu的getMenuItenm（）方法，来取得它们各自的菜单项，两者返回类型是不一样的。
	

}
