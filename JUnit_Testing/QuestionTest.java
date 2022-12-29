package JUnit_Testing;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class QuestionTest {
    Question4 m;
    @BeforeAll
    static void beforeAllInit()
    {
        System.out.println("before all need to work");
    }
    @BeforeEach
    void init()
    {
        m= new Question4();
    }
    @AfterEach
    void cleaning()
    {
        System.out.println("Cleaning up.......");
    }
    @Test
    @DisplayName("Testing add method")
    void testAdd() {
        int expected = 4;
        int actual = m.add(2, 2);
        assertEquals(expected, actual);

    }
    @Test
    void TestDivide()
    {
        assertThrows(ArithmeticException.class,()->m.divide(2,0));
    }
    @Test
        //@Disabled("it should not run")
    void circleArea() {

        assertEquals(314.1592653589793, m.circleArea(10), "The area should be return");
    }
    @Test
    @Disabled("Test Display Method should not run")
    void testDisplayed()
    {
        fail("The test should be disabled");
    }
}
