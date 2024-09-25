package mediatheque;

import javax.xml.catalog.Catalog;

public class printCatalog implements Visitor{
    @Override
    public void visit(Book book) {

    }

    @Override
    public void visit(CD cd) {

    }

    @Override
    public void visit(Catalog catalog) {
        System.out.println("print onlyyyyyy Catalogs" + catalog.catalogs());
    }
}
