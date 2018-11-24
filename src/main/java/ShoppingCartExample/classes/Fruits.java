package ShoppingCartExample.classes;


import ShoppingCartExample.interfaces.CartElements;
import ShoppingCartExample.interfaces.ShoppingCartVisitorInterface;

public class Fruits implements CartElements
{
    private int pricePerKg;
    private int weight;
    private String name;

    public Fruits(int priceKg, int wt, String nm)
    {
        this.pricePerKg=priceKg;
        this.weight=wt;
        this.name = nm;
    }

    public int getPricePerKg()
    {
        return pricePerKg;
    }

    public int getWeight()
    {
        return weight;
    }

    public String getName()
    {
        return this.name;
    }

    public int accept(ShoppingCartVisitorInterface visitor)
    {
        return visitor.visit(this);
    }

}