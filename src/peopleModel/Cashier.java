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
        System.out.println("Welcome!, What is your name?");
    }
    @Override
    public void sellProducts(String customerName) {
        System.out.println("Hi " + customerName + ". I am " + getName() + ", Welcome to our store");

    }


    @Override
    public void listOfProducts(HashMap<String, Integer> products) {
        System.out.println("Here is our list of products");
        System.out.println();
        for (String i: products.keySet()) {
            System.out.println(i + " : " + products.get(i));
        }
        System.out.println("how many products will you like to buy?");
        System.out.println();
    }


    public void kindlyTypeIn() {
        System.out.println("Kindly type in the products you want.");
        System.out.println("After each product entry, press the enter key");
        System.out.println();
    }

    public int yourTotalAmount(String[] customerProduct, HashMap<String, Integer> products) {

        int totalPrice = 0;
        for (String s : customerProduct) {

            boolean isProductPresent = products.containsKey(s);

            if (isProductPresent) {
                totalPrice += products.get(s);
            } else {
                System.out.println("We don\"t have that product");
            }
        }
        return totalPrice;
    }

    public void printReceipts(int totalAmount){
        System.out.println("Here's your receipt, you are to pay " + totalAmount + "naira");
    }
}
