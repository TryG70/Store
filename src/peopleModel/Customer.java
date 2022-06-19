package peopleModel;

import interfaces.CustomerFunction;

import java.util.Scanner;

public class Customer implements CustomerFunction {

   private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void customerList(int productsNum, String[] customerList) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < productsNum; i++) {
            customerList[i] = scanner.next();
        }
    }



}
