package peopleModel;

import interfaces.ManagerFunction;



public class Manager implements ManagerFunction {
    private String name;


    public Manager(String name) {
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
    public void haveAccDegree(String name) {
        System.out.println("Hi " + name + ". I am " + getName());
        System.out.println("Do you have a degree in accounting?");
    }

    public static boolean hiredOrNot;
    @Override
    public boolean hireCashier(String qualify) {
        if (qualify.equalsIgnoreCase("yes")){
            System.out.println("You are hired");
            System.out.println();
            System.out.println();
            hiredOrNot = true;
        }
        if(qualify.equalsIgnoreCase("no")){
            System.out.println("Sorry, this role is for those with an Accounting Degree");
            System.out.println();
            System.out.println();
            hiredOrNot = false;
        }
        return false;

    }

    public void hired(String customerName, boolean ifHired, Cashier cashier) {
        if(ifHired) {
            cashier.sellProducts(customerName);
        }else {
            System.out.println("Hi " + customerName + ". I am " + getName() + ", Welcome to our store");
        }
    }

}
