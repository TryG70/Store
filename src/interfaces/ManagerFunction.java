package interfaces;

import peopleModel.Cashier;

public interface ManagerFunction extends Staff {

    void haveAccDegree(String cashierName);

    boolean hireCashier(String qualify);
    void hired(String customerName, boolean ifHired, Cashier cashier);
}
