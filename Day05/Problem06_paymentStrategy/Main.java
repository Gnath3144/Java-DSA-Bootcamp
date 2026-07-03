package Day05.Problem06_paymentStrategy;

public class Main {

    public static void main(String[] args) {

        PaymentGateway gateway = new PaymentGateway(new UpiPayment());

        gateway.processPayment(500);

        gateway.setPaymentStrategy(new CreditCardPayment());
        gateway.processPayment(500);

        gateway.setPaymentStrategy(new WalletPayment());
        gateway.processPayment(500);

        gateway.setPaymentStrategy(new NetBankingPayment());
        gateway.processPayment(500);
    }
}

interface PaymentStrategy {
    void pay(double amount);
}

class UpiPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}

class CreditCardPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card");
    }
}

class WalletPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Wallet");
    }
}

class NetBankingPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Net Banking");
    }
}

class PaymentGateway {

    private PaymentStrategy paymentStrategy;

    public PaymentGateway(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(double amount) {
        paymentStrategy.pay(amount);
    }
}