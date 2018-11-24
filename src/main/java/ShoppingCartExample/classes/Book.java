package ShoppingCartExample.classes;

import ShoppingCartExample.interfaces.CartElements;
import ShoppingCartExample.interfaces.ShoppingCartVisitorInterface;

public class Book implements CartElements
{
    private int price;
    private String isbnNumber;

    public Book(int cost, String isbn)
    {
        this.price=cost;
        this.isbnNumber=isbn;
    }

    public int getPrice()
    {
        return price;
    }

    public String getIsbnNumber()
    {
        return isbnNumber;
    }

    public int accept(ShoppingCartVisitorInterface visitor)
    {
        return visitor.visit(this);
    }

}