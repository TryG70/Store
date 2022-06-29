import peopleModel.Cashier;
import peopleModel.Customer;
import peopleModel.Manager;

import java.util.HashMap;
import java.util.Scanner;






public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        HashMap<String, Integer> products = new HashMap<>();
        products.put("milk", 20);
        products.put("milo", 15);
        products.put("sugar", 5);
        products.put("goldenMourn", 20);
        products.put("cornFlakes", 25);

        // Manager's Name
        String managerName = "TryGod";


        Manager manager = new Manager(managerName);




        // manager greeting
        manager.greeting();

        // cashier to be hired inputs his/her name
        String cashierName = scanner.nextLine();



        // Managers asks whether he/she has an Accounting degree
        manager.haveAccDegree(cashierName);

        // he/she answers whether they have a degree or not
        String haveAccDegree = scanner.next();

        // Manager hires cashier based on whether they have an accounting degree or not
        manager.hireCashier(haveAccDegree);



// End of peopleModel.Manager and peopleModel.Cashier Hiring Process

        // Instantiating cashier class
        Cashier cashier = new Cashier(cashierName);
        cashier.setName(cashierName);


        // greeting the customer
        cashier.greeting();

        // customer inputs name
        String customerName = scanner.next();


        // Instantiating customer class
        Customer customer = new Customer(customerName);
        customer.setName(customerName);


        // getting customer name and asking how many things they want
        manager.hired(customer.getName(), Manager.hiredOrNot, cashier);


        // cashier prints out list of products
        cashier.printListOfProducts(products);

        // customer inputs list of products
        int numberOfProducts = scanner.nextInt();

        // cashier ask customer to type in the products they want
        cashier.askingCustomerForProducts();

        // Declaring an array that will contain what the customer wants
        String[] customerProducts;



        // filling up the customerProducts array
        customerProducts = customer.customerList(numberOfProducts);


        // calculating the total amount of everything the customer purchased
        int totalAmount = cashier.calculateTotalPrice(customerProducts, products);




        // cashier prints receipt
        cashier.printReceipts(totalAmount);


    }
}