package iterator;

public class DinerMenuIterator implements CustomIterator {

	private PozycjaMenu[] elementy;
	private int pozycja;

	public DinerMenuIterator(PozycjaMenu[] elementy) {
		this.elementy = elementy;
	}

	@Override
	public boolean hasNext() {
		if (pozycja >= elementy.length || elementy[pozycja] == null) {
			return false;
		}
		return true;
	}

	@Override
	public Object next() {
		PozycjaMenu pozycjaMenu = elementy[pozycja];
		pozycja++;
		return pozycjaMenu;
	}

}
