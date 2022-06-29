package peopleModel;

import interfaces.CashierFunction;

import java.util.HashMap;


public class Cashier implements CashierFunction {
    private String name;


    public Cashier(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void greeting() {
        System.out.println("Welcome to Decagon Store!, What is your name?");
    }
    @Override
    public void sellProducts(String customerName) {
        System.out.println("Hi " + customerName + ". I am " + getName() + ", Welcome to our store");
    }


    @Override
    // prints list of available products in the store
    public void printListOfProducts(HashMap<String, Integer> products) {
        System.out.println("Here is our list of products");
        System.out.println();
        for (String i: products.keySet()) {
            System.out.println(i + " : " + products.get(i));
        }
        System.out.println("how many products will you like to buy?");
        System.out.println();
    }


    // Requesting the customer to input names of the items they want.
    public void askingCustomerForProducts() {
        System.out.println("Kindly type in the products you want.");
        System.out.println("After each product entry, press the enter key");
        System.out.println();
    }

    // checking if an item in the customer list is present in the store product list.
    // if item exists, adding the price(value) of the item to the total price.
    public int calculateTotalPrice(String[] customerProduct, HashMap<String, Integer> products) {

        int totalPrice = 0;
        for (String s : customerProduct) {

            boolean isProductPresent = products.containsKey(s);  // checks if the products contains the customer product

            if (isProductPresent) {
                totalPrice += products.get(s); // if it has products, add the value of the product to the total price
            } else {
                System.out.println("We don\"t have that product");  // if it doesn't contain the product, print out this
            }
        }
        return totalPrice;
    }

    // print the receipt containing the total price of items bought by customer
    public void printReceipts(int totalAmount){
        System.out.println("Here's your receipt, you are to pay " + totalAmount + "naira");
    }
}
