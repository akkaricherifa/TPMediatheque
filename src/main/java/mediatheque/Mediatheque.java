package mediatheque;

import java.util.LinkedList;
import java.util.List;

public class Mediatheque {
	private final List<Item> items = new LinkedList<>();

	public void addItem(Item i) {
		items.add(i);
	}
	
	public void printCatalog() {
		for (Item i : items)
			i.print();
	}

	public void printOnlyBooks() {
		printBooks printBooks = new printBooks();
		for (Item item : items) {
			item.accept(printBooks);
		}
	}
	public void printOnlyCDs() {
		printCD printCDsVisitor = new printCD();
		for (Item item : items) {
			item.accept(printCDsVisitor);
		}
	}
}
