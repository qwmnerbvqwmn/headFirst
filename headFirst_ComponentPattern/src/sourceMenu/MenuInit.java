package sourceMenu;

import java.util.ArrayList;

import Component.*;

public class MenuInit {
//	public MenuInit() {
//		
//	}
	private static MenuComponent menuInstence;
	
	public static MenuComponent getMenu() {
		if (menuInstence == null) {
			menuInstence = getMenuInitialize();
		}
		return menuInstence;
	}
	
	private static MenuComponent getMenuInitialize() {
		MenuComponent menu = new Menu("Root menu");
		menu.addChild(getMenuBreakfast());
//		menu.addChild(getMenuLunch());
		menu.addChild(getMenuDinner());
		return menu;
	}

	private static MenuComponent getMenuDinner() {
		// TODO Auto-generated method stub
		MenuComponent menu = new Menu("Dinner menu");
		MenuItem[] pancakeHouseMenu = new DinnerMenu().getMenuItems();
		for (MenuItem menuItem : pancakeHouseMenu) {
			if (menuItem != null) {
				menu.addChild(menuItem);
			}			
		}
		return menu;
	}

	private static MenuComponent getMenuLunch() {
		// TODO Auto-generated method stub
		return null;
	}

	private static MenuComponent getMenuBreakfast() {
		// TODO Auto-generated method stub
		MenuComponent menu = new Menu("Breakfase menu");
		ArrayList<MenuItem> pancakeHouseMenu = new PancakeHouseMenu().getMenuItems();
		for (MenuItem menuItem : pancakeHouseMenu) {
			menu.addChild(menuItem);
		}
		return menu;
	}
	
	
}
