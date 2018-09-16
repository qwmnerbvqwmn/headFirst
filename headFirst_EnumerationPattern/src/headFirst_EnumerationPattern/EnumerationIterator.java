package headFirst_EnumerationPattern;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIterator<E> implements Iterator<E> {

	Enumeration<E> enumer;
	
	public EnumerationIterator(Enumeration<E> enumer) {
		// TODO 自动生成的构造函数存根
		this.enumer = enumer;
	}
	
	@Override
	public boolean hasNext() {
		// TODO 自动生成的方法存根
		
		return enumer.hasMoreElements();
	}

	@Override
	public E next() {
		// TODO 自动生成的方法存根
		return enumer.nextElement();
	}

}
