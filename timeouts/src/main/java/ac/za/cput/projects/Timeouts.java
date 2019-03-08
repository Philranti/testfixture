package ac.za.cput.projects;

import java.util.concurrent.TimeUnit;

public class Timeouts {

    private double price;
    private int quantity;

    public Timeouts(double cash, int qty) {
        this.price = cash;
        this.quantity = qty;
    }

    public double getPrice() throws InterruptedException {
        double price = 0.0;
        for (int i = 0; i < 5; i++) {
            price += i;
            TimeUnit.SECONDS.sleep(1);
        }
        return price;
    }

    public int getQuantity() throws InterruptedException {
        TimeUnit.MILLISECONDS.sleep(500);
        return quantity;
    }

    @Override
    public String toString() {
        return "Price:" + price + "Quantity:" + quantity;
    }
}
