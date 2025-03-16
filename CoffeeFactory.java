abstract class CoffeeFactory {
    public abstract Coffee createCoffee();
}

class EspressoFactory extends CoffeeFactory {
    public Coffee createCoffee() {
        return new Espresso();
    }
}

class CappuccinoFactory extends CoffeeFactory {
    public Coffee createCoffee() {
        return new Cappuccino();
    }
}

class LatteFactory extends CoffeeFactory {
    public Coffee createCoffee() {
        return new Latte();
    }
}

class AmericanoFactory extends CoffeeFactory {
    public Coffee createCoffee() {
        return new Americano();
    }
}