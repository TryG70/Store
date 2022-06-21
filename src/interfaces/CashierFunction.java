package interfaces;


import java.util.HashMap;

public interface CashierFunction extends Staff {

    void sellProducts(String customerName);

    void listOfProducts(HashMap<String, Integer> products);

    void kindlyTypeIn();

    void printReceipts(int totalAmount);

    int yourTotalAmount(String[] customerProduct, HashMap<String, Integer> products);
}
