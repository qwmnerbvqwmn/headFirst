package source;

import java.util.ArrayList;

import iteratorPattern.Iterator;

public class PancakeHouseMenuIterator implements Iterator {

	
	private ArrayList<MenuItem> menuItems;
	private java.util.Iterator<MenuItem> menuItemsIter;

	public PancakeHouseMenuIterator(ArrayList<MenuItem> menuItems) {
		// TODO 自动生成的构造函数存根
		this.menuItems = menuItems;
		this.menuItemsIter = menuItems.iterator();
	}

	@Override
	public boolean hasNext() {
		// TODO 自动生成的方法存根
		return menuItemsIter.hasNext();
	}

	@Override
	public MenuItem next() {
		// TODO 自动生成的方法存根
		return menuItemsIter.next();
	}

	@Override
	public boolean remove() {
		// TODO 自动生成的方法存根
		return false;
	}

}
