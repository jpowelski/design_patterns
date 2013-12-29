package adapter_facade.enumeration_iterator;

import java.util.Iterator;
import java.util.Vector;

public class EnumerationIteratorTest {
public static void main(String[] args) {
	Vector<Object> v = new Vector<>();
	Iterator<Object> iterator = new EnumerationIterator(v.elements());
	while(iterator.hasNext()){
		System.out.println(iterator.next());
	}
}
}
