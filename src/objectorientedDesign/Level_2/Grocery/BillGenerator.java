package objectorientedDesign.Level_2.Grocery;

public class BillGenerator {
    public double generateBill(Customerop customer) {
        double total = 0;
        for (Product product : customer.getProducts()) {
            total += product.getTotalPrice();
        }
        return total;
    }

    public void printBill(Customerop customer) {
        System.out.println("Customer: " + customer.getName());
        System.out.println("Purchased Products:");
        for (Product product : customer.getProducts()) {
            System.out.println(" - " + product.getName() +
                    " (" + product.getQuantity() + " units at $" +
                    product.getPricePerUnit() + " per unit) → $" +
                    product.getTotalPrice());
        }
        System.out.println("Total Bill: $" + generateBill(customer));
    }
}