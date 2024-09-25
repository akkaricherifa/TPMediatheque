package mediatheque;

import javax.xml.catalog.Catalog;

public class printBooks implements Visitor{
    @Override
    public void visit(Book book) {
        System.out.println("print DETAILS OF Books" + book.getAuthor());
    }

    @Override
    public void visit(CD cd) {

    }

    @Override
    public void visit(Catalog catalog) {

    }
}
