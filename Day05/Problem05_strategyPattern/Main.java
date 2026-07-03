package Day05.Problem05_strategyPattern;

interface PricingStrategy {

    double calculatePrice(double amount);
}

class FestivalDiscount implements PricingStrategy {

    @Override
    public double calculatePrice(double amount) {
        return amount * 0.80;
    }
}

class PremiumDelivery implements PricingStrategy {

    @Override
    public double calculatePrice(double amount) {
        return amount + 100;
    }
}

class MembershipOffer implements PricingStrategy {

    @Override
    public double calculatePrice(double amount) {
        return amount * 0.90;
    }
}

class StudentDiscount implements PricingStrategy {

    @Override
    public double calculatePrice(double amount) {
        return amount * 0.85;
    }
}

class PricingEngine {

    private PricingStrategy strategy;

    public PricingEngine(PricingStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(PricingStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculate(double amount) {
        return strategy.calculatePrice(amount);
    }
}

public class Main {

    public static void main(String[] args) {

        PricingEngine engine = new PricingEngine(new FestivalDiscount());

        double amount = 1000;

        System.out.println("Original Price      : ₹" + amount);

        System.out.println("\nUsing Festival Discount");
        System.out.println("Final Price         : ₹" + engine.calculate(amount));

        engine.setStrategy(new PremiumDelivery());

        System.out.println("\nUsing Premium Delivery");
        System.out.println("Final Price         : ₹" + engine.calculate(amount));

        engine.setStrategy(new MembershipOffer());

        System.out.println("\nUsing Membership Offer");
        System.out.println("Final Price         : ₹" + engine.calculate(amount));

        engine.setStrategy(new StudentDiscount());

        System.out.println("\nUsing Student Discount");
        System.out.println("Final Price         : ₹" + engine.calculate(amount));
    }
}