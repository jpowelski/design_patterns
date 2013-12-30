package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenuIterator implements CustomIterator {

	Iterator<PozycjaMenu> iterator;
	
	public PancakeHouseMenuIterator(ArrayList<PozycjaMenu> pozycjeMenu) {
		iterator = pozycjeMenu.iterator();
	}

	@Override
	public boolean hasNext() {
		return iterator.hasNext();
	}

	@Override
	public PozycjaMenu next() {
		return iterator.next();
	}

}
