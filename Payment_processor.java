class PaymentProcessor {

    void processPayment(double amount) {
        System.out.println("Payment without coupon");
        System.out.println("Amount: " + amount);
    }

    void processPayment(double amount, String coupon) {
        System.out.println("Payment with coupon: " + coupon);
        System.out.println("Amount: " + (amount - 100));
    }

    public static void main(String[] args) {
        PaymentProcessor p = new PaymentProcessor();

        p.processPayment(1000);
        p.processPayment(1000, "SAVE100");
    }
}
