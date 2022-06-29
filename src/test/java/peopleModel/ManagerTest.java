package peopleModel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {

    Manager manager = new Manager("TryGod");

    @Test
    void cashierHired() {
        boolean actual = manager.hireCashier("yes");
        boolean expected = true;
        assertEquals(expected, actual);
    }
    @Test
    void cashierNotHired() {
        boolean actual = manager.hireCashier("no");
        boolean expected = false;
        assertEquals(expected, actual);
    }
}