package headFirst_IteratorPattern;

public class DinerMenuIterator implements Iterator {

	private MenuItem[] menuItems;
	private int curIndex;
	public DinerMenuIterator(MenuItem[] menuItems) {
		// TODO 自动生成的构造函数存根
		this.menuItems = menuItems;
		curIndex = 0;
	}
	
	@Override
	public boolean hasNext() {
		// TODO 自动生成的方法存根
		if (curIndex >= menuItems.length || menuItems[curIndex] == null) {
			return false;
		}		
		return true;
	}

	@Override
	public MenuItem getNext() {
		// TODO 自动生成的方法存根
		return menuItems[curIndex++];
	}

}
