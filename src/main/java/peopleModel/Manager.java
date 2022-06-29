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

    // manager greeting
    public void greeting() {
        System.out.println("Welcome!, What is your name?");
    }

    // Asks the cashier if they have a degree in accounting
    @Override
    public void haveAccDegree(String name) {
        System.out.println("Hi " + name + ". I am " + getName());
        System.out.println("Do you have a degree in accounting?");
    }

    public static boolean hiredOrNot;

    // Pending if the cashier has an accounting degree or not, hires or rejects them
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
        return hiredOrNot;

    }

    // Based off if the Cashier is hired or not; Cashier performs cashier function or manager does
    public void hired(String customerName, boolean hireCashier, Cashier cashier) {
        if(hireCashier) {
            cashier.sellProducts(customerName);
        }else {
            System.out.println("Hi " + customerName + ". I am " + getName() + ", Welcome to our store");
        }
    }

}
