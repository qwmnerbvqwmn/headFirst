package Component;

import java.util.Iterator;

public class MenuItem extends MenuComponent {
	private String name;
	private String description;
	private boolean vegetarian;
	private double price;
	
	public MenuItem(String name, String description, boolean vegetarian, double price) {
		super();
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(name+":\t"+description+","+vegetarian+","+price);
	}
	
	@Override
	public Iterator<MenuComponent> getIterator() {
		// TODO 自动生成的方法存根
		
	}
	
}
