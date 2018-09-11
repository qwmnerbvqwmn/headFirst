package waiteress;

import Component.MenuComponent;

public class panny implements waiteress {

	private MenuComponent menu;

	public panny(MenuComponent menu) {
		this.menu = menu;
		
	}
	
	@Override
	public void printMenu() {
		// TODO Auto-generated method stub
		this.menu.print();
	}

	
}
