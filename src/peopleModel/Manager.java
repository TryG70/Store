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
    public void cashierQualify(String name) {
        System.out.println("Hi " + name + ". I am " + getName());
        System.out.println("Do you have a degree in accounting?");
    }

    @Override
    public void hireCashier(boolean qualify) {
        if (qualify){
            System.out.println("You are hired");
        } else {
            System.out.println("Sorry, this role is for those with an Accounting Degree");
        }
        System.out.println();
        System.out.println();
    }

}
