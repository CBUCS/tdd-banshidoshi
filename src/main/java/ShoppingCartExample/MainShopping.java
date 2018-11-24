package ShoppingCartExample;

import ShoppingCartExample.classes.Book;
import ShoppingCartExample.classes.Fruits;
import ShoppingCartExample.classes.ShoppingCart;
import ShoppingCartExample.interfaces.CartElements;
import ShoppingCartExample.interfaces.ShoppingCartVisitorInterface;

public class MainShopping {

    public static void main(String[] args)
    {
        CartElements[] items = new CartElements[]{new Book(40, "1234"),new Book(60, "5678"),
                new Fruits(70, 2, "Mangoes"), new Fruits(5, 5, "Cherries")};

        int total = calculatePrice(items);
        System.out.println("Total Cost = "+total);
    }

    private static int calculatePrice(CartElements[] items)
    {
        ShoppingCartVisitorInterface visitor = new ShoppingCart();
        int sum=0;
        for(CartElements item : items)
        {
            sum = sum + item.accept(visitor);
        }
        return sum;
    }

}