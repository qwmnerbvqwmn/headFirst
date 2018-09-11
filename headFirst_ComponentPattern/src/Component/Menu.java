package Component;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {
	
	ArrayList<MenuComponent> MenuChildren;
	String name;
	
	public Menu(String name) {
		this.name = name;
		MenuChildren = new ArrayList<MenuComponent>();
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void print() {
		System.out.println(getName()+":");
		for (MenuComponent menuChild : MenuChildren) {
			menuChild.print();
		}
		System.out.println("--------------------");
		System.out.println("");
	}
	
	@Override
	public boolean addChild(MenuComponent child) {
		// TODO Auto-generated method stub
		return this.MenuChildren.add(child);
	}
	
	@Override
	public Iterator<MenuComponent> getIterator() {
		// TODO Auto-generated method stub
		return super.getIterator();
	}
}
