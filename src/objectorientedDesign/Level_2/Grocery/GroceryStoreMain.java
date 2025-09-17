package objectorientedDesign.Level_2.Grocery;

public class GroceryStoreMain {
    public static void main(String[] args) {
        Customerop customer = new Customerop("Alice");

        // Adding products
        customer.addProduct(new Product("Apples", 2, 3));   // 2kg at $3/kg
        customer.addProduct(new Product("Milk", 1, 2));     // 1L at $2/L
        customer.addProduct(new Product("Bread", 3, 1.5));  // 3 units at $1.5

        // Generate and print bill
        BillGenerator billGen = new BillGenerator();
        billGen.printBill(customer);
    }
}