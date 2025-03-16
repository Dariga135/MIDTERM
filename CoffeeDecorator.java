abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;
    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
    public double getCost() {
        return coffee.getCost();
    }
    public String getDescription() {
        return coffee.getDescription();
    }
}

class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }
    public double getCost() {
        return coffee.getCost() + 0.5;
    }
    public String getDescription() {
        return coffee.getDescription() + ", Milk";
    }
}

class CaramelDecorator extends CoffeeDecorator {
    public CaramelDecorator(Coffee coffee) {
        super(coffee);
    }
    public double getCost() {
        return coffee.getCost() + 0.7;
    }
    public String getDescription() {
        return coffee.getDescription() + ", Caramel Syrup";
    }
}

class WhippedCreamDecorator extends CoffeeDecorator {
    public WhippedCreamDecorator(Coffee coffee) {
        super(coffee);
    }
    public double getCost() {
        return coffee.getCost() + 0.6;
    }
    public String getDescription() {
        return coffee.getDescription() + ", Whipped Cream";
    }
}

class ChocolateDecorator extends CoffeeDecorator {
    public ChocolateDecorator(Coffee coffee) {
        super(coffee);
    }
    public double getCost() {
        return coffee.getCost() + 0.8;
    }
    public String getDescription() {
        return coffee.getDescription() + ", Chocolate Syrup";
    }
}
