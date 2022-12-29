package JUnit_Testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {
    BankAccount b=new BankAccount();
    @Test
    void withdraw()
    {
        assertEquals(20000,b.withDraw(20000,25000));
    }
}
