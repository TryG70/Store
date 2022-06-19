import peopleModel.Cashier;
import peopleModel.Customer;
import peopleModel.Manager;

import java.util.HashMap;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {

        HashMap<String, Integer> products = new HashMap<>();
        products.put("milk", 20);
        products.put("milo", 15);
        products.put("sugar", 5);
        products.put("goldenMourn", 20);
        products.put("cornFlakes", 25);

        String managerName = "TryGod";


        Manager manager = new Manager(managerName);


        Scanner scanner = new Scanner(System.in);

        // manager greeting
        manager.greeting();

        String cashierName = scanner.next();

        // peopleModel.Manager Hiring peopleModel.Cashier
        manager.cashierQualify(cashierName);

        boolean haveAccDegree = scanner.nextBoolean();

        manager.hireCashier(haveAccDegree);

// End of peopleModel.Manager and peopleModel.Cashier Hiring Process

        // Instantiating cashier class
        Cashier cashier = new Cashier(cashierName);
        cashier.setName(cashierName);


        // greeting the customer
        cashier.greeting();

        String customerName = scanner.next();

        Customer customer = new Customer(customerName);



        // getting customer name and asking how many things they want
        cashier.sellProducts(customerName);


        // cashier prints out list of products
        cashier.listOfProducts(products);

        int numberOfProducts = scanner.nextInt();

        cashier.kindlyTypeIn();

        String[] customerProducts = new String[numberOfProducts];


        customer.customerList(numberOfProducts, customerProducts);



        int totalAmount = cashier.yourTotalAmount(customerProducts, products);

            // customer enter the products he/she wants


            // cashier prints receipt
        cashier.printReceipts(totalAmount);


    }
}