package Component;

import java.util.Iterator;

public abstract class MenuComponent {
	public void print() {
		throw new UnsupportedOperationException();
	}
	
	public String getName() {
		throw new UnsupportedOperationException();
	}
	
//	public MenuComponent[] getChildren() {
//		throw new UnsupportedOperationException();
//	}
	
	public boolean addChild(MenuComponent child) {
		throw new UnsupportedOperationException();
	}
	
	public Iterator<MenuComponent> getIterator() {
		throw new UnsupportedOperationException();
	}
}
