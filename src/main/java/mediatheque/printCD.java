package mediatheque;

import javax.xml.catalog.Catalog;

public class printCD implements Visitor{
    @Override
    public void visit(Book book) {

    }

    @Override
    public void visit(CD cd) {
        System.out.println("print onlyyyyyy CD"+ cd.getTitle());

    }

    @Override
    public void visit(Catalog catalog) {

    }
}
