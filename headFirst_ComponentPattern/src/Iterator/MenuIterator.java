package Iterator;

import java.util.Iterator;
import java.util.Stack;

import Component.Menu;
import Component.MenuComponent;

public class MenuIterator implements Iterator<MenuComponent> {

//	Iterator rootIter;
	Stack<Iterator<MenuComponent>> stackIters;
	
	public MenuIterator(Iterator<MenuComponent> iter) {
		// TODO 自动生成的构造函数存根
		stackIters.push(iter);
	}
	
//	public 
	
//	public Menu /
	
	public void pointTreeBack() {
		while (! stackIters.peek().hasNext()) {
			stackIters.pop();
		}
//		stackIters.push(stackIters.peek().next().getIterator());
	}
	
	public void pointTreeGo() {
		MenuComponent mc = stackIters.peek().next();
		if (mc instanceof Menu) {
			stackIters.push(mc.getIterator());
//			mc = mc.
			
		}
	}
	
	
	
	@Override
	public boolean hasNext() {
		// TODO 自动生成的方法存根
		refreshStackTree();
		MenuComponent
		
		
		return false;
	}

	@Override
	public MenuComponent next() {
		// TODO 自动生成的方法存根
		return null;
	}
	
}
