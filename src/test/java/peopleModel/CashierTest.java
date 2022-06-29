package peopleModel;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class CashierTest {


    String[] customerProducts = {"milk", "milo"};

    HashMap<String, Integer> products = new HashMap<>();

    Cashier cashier = new Cashier("daniel");


    @Test
    void calculateTotalPrice() {

        products.put("milk", 20);
        products.put("milo", 15);
        products.put("sugar", 5);
        products.put("goldenMourn", 20);
        products.put("cornFlakes", 25);


        int actual = cashier.calculateTotalPrice(customerProducts, products);
        int expected = 20 + 15;
        assertEquals(expected, actual);
    }
}