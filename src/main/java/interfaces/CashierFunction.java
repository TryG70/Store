package interfaces;


import java.util.HashMap;

public interface CashierFunction extends Staff {

    void sellProducts(String customerName);

    void printListOfProducts(HashMap<String, Integer> products);

    void askingCustomerForProducts();

    void printReceipts(int totalAmount);

    int calculateTotalPrice(String[] customerProduct, HashMap<String, Integer> products);
}
