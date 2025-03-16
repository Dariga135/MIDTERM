import java.util.Scanner;

public class CoffeeShopSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CoffeeFactory factory = null;

        System.out.println("Select Coffee Type: 1. Espresso 2. Cappuccino 3. Latte 4. Americano");
        int coffeeChoice = scanner.nextInt();

        switch (coffeeChoice) {
            case 1:
                factory = new EspressoFactory();
                break;
            case 2:
                factory = new CappuccinoFactory();
                break;
            case 3:
                factory = new LatteFactory();
            break;
            case 4:
                factory = new AmericanoFactory();
            break;
            default:
                System.out.println("Invalid choice");
            return;
        }

        Coffee coffee = factory.createCoffee();

        System.out.println("Add Toppings (Enter numbers, 0 to finish): 1. Milk 2. Caramel Syrup 3. Whipped Cream 4. Chocolate Syrup");
        while (true) {
            int toppingChoice = scanner.nextInt();
            if (toppingChoice == 0) break;
            switch (toppingChoice) {
                case 1:
                    coffee = new MilkDecorator(coffee);
                    break;
                case 2:
                    coffee = new CaramelDecorator(coffee);
                    break;
                case 3:
                    coffee = new WhippedCreamDecorator(coffee);
                    break;
                case 4:
                    coffee = new ChocolateDecorator(coffee);
                    break;
                default: System.out.println("Invalid topping");
            }
        }

        System.out.println("Your order: " + coffee.getDescription());
        System.out.printf("Total Cost: $%.2f\n", coffee.getCost());
    }
}
