class Espresso implements Coffee {
    public double getCost() { return 2.0; }
    public String getDescription() { return "Espresso"; }
}

class Cappuccino implements Coffee {
    public double getCost() {
        return 2.5;
    }
    public String getDescription() {
        return "Cappuccino";
    }
}

class Latte implements Coffee {
    public double getCost() {
        return 3.0;
    }
    public String getDescription() {
        return "Latte";
    }
}

class Americano implements Coffee {
    public double getCost() {
        return 2.0;
    }
    public String getDescription() {
        return "Americano";
    }
}