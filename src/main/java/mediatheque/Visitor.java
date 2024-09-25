package mediatheque;

import javax.xml.catalog.Catalog;

public interface Visitor {
    void visit ( Book book);
    void visit ( CD cd);
    void visit (Catalog catalog);
}
