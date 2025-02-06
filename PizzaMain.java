import java.util.ArrayList;
import java.util.Scanner;

public class PizzaMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PizzaCrust crust;

        System.out.println("What kind of crust would you like: ");
        System.out.println("1 - Thin Crust");
        System.out.println("2 - Thick Crust");
        System.out.println("Your choice: ");
        int crustChoice = in.nextInt();
        if (crustChoice == 1) {
            crust = new ThinCrust();
        }
        else {
            crust = new ThickCrust();
        }

        PizzaSauce sauce;

        System.out.println("\nWhat kind of sauce would you like:");
        System.out.println("1 - Tomato Sauce");
        System.out.println("2 - Alfredo Sauce");
        System.out.println("Your choice: ");
        int sauceChoice = in.nextInt();
        if (sauceChoice == 1) {
            sauce = new Tomato();
        }
        else {
            sauce = new Alfredo();
        }


        System.out.println("\nHow many toppings do you want? (Up to 4): ");
        int toppingAmount = in.nextInt();
        ArrayList<PizzaTopping> toppings = new ArrayList<>();

        System.out.println("1 - Sausage");
        System.out.println("2 - Pepperoni");
        System.out.println("3 - Bacon");
        System.out.println("4 - Chicken");
        System.out.println("5 - Mozzarella");
        System.out.println("6 - Parmesan");
        System.out.println("7 - Cheddar");
        System.out.println("8 - PepperJack");
        System.out.println("9 - Green Onions");
        System.out.println("10 - Olives");
        System.out.println("11 - Peppers");
        System.out.println("12 - Onions");

        for (int i = 0; i < toppingAmount; i++) {
            System.out.println("Your choice: ");
            int toppingChoice = in.nextInt();

            switch (toppingChoice) {
                case 1: toppings.add(new Sausage());
                        break;
                case 2: toppings.add(new Pepperoni());
                        break;
                case 3: toppings.add(new Bacon());
                        break;
                case 4: toppings.add(new Chicken());
                        break;
                case 5: toppings.add(new Mozzarella());
                        break;
                case 6: toppings.add(new Parmesan());
                        break;
                case 7: toppings.add(new Cheddar());
                        break;
                case 8: toppings.add(new PepperJack());
                        break;
                case 9: toppings.add(new GreenOnions());
                        break;
                case 10: toppings.add(new Olives());
                        break;
                case 11: toppings.add(new Peppers());
                        break;
                case 12: toppings.add(new Onions());
                        break;
            }
        }

        Pizza pizza = new Pizza(crust, sauce, toppings);
        System.out.println("Here is your pizza: ");
        System.out.println(pizza);
    }
}