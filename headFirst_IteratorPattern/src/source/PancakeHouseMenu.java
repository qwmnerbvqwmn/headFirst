package source;

import java.util.ArrayList;

import headFirst_IteratorPattern.MenuItem;

public class PancakeHouseMenu {
	ArrayList menuitems;
	
	public PancakeHouseMenu() {
		// TODO 自动生成的构造函数存根
		menuitems = new ArrayList();
		addItem("K&B's Pancake Breakfast.",
				"Pancakes with scrambled eggs, and toast", 
				true,
				2.99);
		addItem("Regular Pancake Breakfast",
				"Pancakes with fried eggs, sausage", 
				true,
				2.99);		
		
	}

	private void addItem(String name, String description, boolean vegetarian, double price) {
		// TODO 自动生成的方法存根
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuitems.add(menuItem);
	}

	ArrayList getMenuItems() {
		return menuitems;
	}
	

	
}
