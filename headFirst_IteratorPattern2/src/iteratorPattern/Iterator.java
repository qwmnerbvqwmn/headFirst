package iteratorPattern;

import source.MenuItem;

public interface Iterator {

	public boolean hasNext();
	
	public MenuItem next();
	
	public boolean remove();
	
	
}
