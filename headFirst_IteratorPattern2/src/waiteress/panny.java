package waiteress;

import iteratorPattern.Iterator;
import source.*;

public class panny implements waiteress {

//	ArrayList<>
	PancakeHouseMenu phMenu;
	DinerMenu dMenu;
	Iterator phMenuIter;
	Iterator dMenuIter;

	public panny() {
		super();
		this.phMenu = new PancakeHouseMenu();
		this.dMenu = new DinerMenu();
		this.phMenuIter = phMenu.createIterator();
		this.dMenuIter = dMenu.createIterator();
	}

	
	@Override
	public void printMenu() {
		System.out.println("PancakeHouseMenu:");
		this.printOneMenu(phMenuIter);
		System.out.println("DinerMenu:");
		this.printOneMenu(dMenuIter);

	}
	
	public void printOneMenu(Iterator iter) {
		while (iter.hasNext()) {
			MenuItem menuitem = iter.next();
			System.out.println(menuitem.getName()+" "+menuitem.getDescription()+" "+menuitem.getPrice());
		}
	}

	@Override
	public void printBreakfest() {
		System.out.println("PancakeHouseMenu:");
		this.printOneMenu(phMenuIter);
	}

	@Override
	public void printDiner() {
		// TODO 自动生成的方法存根
		System.out.println("DinerMenu:");
		this.printOneMenu(dMenuIter);
	}

	@Override
	public void printVegetables() {
		// TODO 自动生成的方法存根
		Iterator iter = this.phMenuIter;
		while (iter.hasNext()) {
			MenuItem menuitem = iter.next();
			if (this.isVegetables(menuitem)) {
				System.out.println(menuitem.getName()+" "+menuitem.getDescription()+" "+menuitem.getPrice());
			}
			
		}
		iter = this.dMenuIter;
		while (iter.hasNext()) {
			MenuItem menuitem = iter.next();
			System.out.println(menuitem.getName()+" "+menuitem.getDescription()+" "+menuitem.getPrice());
		}
	}

	@Override
	public boolean isVegetables(MenuItem menuitem) {
		// TODO 自动生成的方法存根
		return true;
	}
	
}
