package ShoppingCartExample.classes;

import ShoppingCartExample.interfaces.ShoppingCartVisitorInterface;

public class ShoppingCart implements ShoppingCartVisitorInterface
{

    public int visit(Book book) {
        int cost=0;
        //apply 5$ discount if book price is greater than 50
        if(book.getPrice() > 50)
        {
            cost = book.getPrice()-5;
        }
        else
            cost = book.getPrice();

        System.out.println("Book Number::"+book.getIsbnNumber() + " cost ="+cost);
        return cost;
    }


    public int visit(Fruits fruit) {
        int cost = fruit.getPricePerKg()*fruit.getWeight();
        System.out.println(fruit.getName() + " cost = "+cost);
        return cost;
    }
}
