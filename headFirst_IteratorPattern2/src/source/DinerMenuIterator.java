package source;

import iteratorPattern.Iterator;

public class DinerMenuIterator implements Iterator {

	private MenuItem[] menuItems;
	private int curIndex = 0;

	public DinerMenuIterator(MenuItem[] menuItems) {
		// TODO 自动生成的构造函数存根
		this.menuItems = menuItems;
	}

	@Override
	public boolean hasNext() {
		// TODO 自动生成的方法存根
		return curIndex < menuItems.length && menuItems[curIndex]!=null;
	}

	@Override
	public MenuItem next() {
		// TODO 自动生成的方法存根
		return menuItems[curIndex++];
	}

	@Override
	public boolean remove() {
		// TODO 自动生成的方法存根
		return false;
	}

}
