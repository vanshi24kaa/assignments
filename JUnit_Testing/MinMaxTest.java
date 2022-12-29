package JUnit_Testing;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class MinMaxTest {
    MinMax m=new MinMax();
    @Test 
    void minmax()
    {
        int[] sample={66,9,1,4};
        assertEquals(1,m.min(sample));
    }

    private void assertEquals(int i, int min) {
    }

    @Test
    void minmax1() {
        int[] sample = {66, 9, 1, 4};
        assertEquals(66, m.max(sample));
    }
}
