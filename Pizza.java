import java.util.ArrayList;

public class Pizza {
    private PizzaCrust crust;
    private PizzaSauce sauce;
    private ArrayList<PizzaTopping> toppings;

    public Pizza( PizzaCrust crust, PizzaSauce sauce, ArrayList<PizzaTopping> toppings) {
        this.crust = crust;
        this.sauce = sauce;
        this.toppings = toppings;
    }

    public String toString() {
        return "Pizza with " + crust + ", " + sauce + ", Toppings: " + toppings;
    }
}
