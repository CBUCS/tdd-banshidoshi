package ShoppingCartExample.interfaces;


import ShoppingCartExample.classes.Book;
import ShoppingCartExample.classes.Fruits;


public interface ShoppingCartVisitorInterface
{

     int visit(Book book);
     int visit(Fruits fruit);
}
