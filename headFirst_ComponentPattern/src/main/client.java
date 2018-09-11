package main;

import Component.MenuComponent;
import sourceMenu.MenuInit;
import waiteress.panny;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuComponent menu = MenuInit.getMenu();
		panny p = new panny(menu);
		p.printMenu();
		
	}

}
