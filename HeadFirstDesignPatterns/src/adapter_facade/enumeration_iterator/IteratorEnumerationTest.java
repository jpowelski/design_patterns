package adapter_facade.enumeration_iterator;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class IteratorEnumerationTest {

	public static void main(String[] args) {

		List<Object> list = new ArrayList<>();
		Enumeration<Object> e = new IteratorEnumeration(list.iterator());
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
}
