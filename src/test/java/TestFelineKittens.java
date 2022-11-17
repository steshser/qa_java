import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestFelineKittens {
    private final int kittenQuantity;
    private final int expectedResult;

    Feline feline = new Feline();

    public TestFelineKittens(int kittenQuantity, int expectedResult) {
        this.kittenQuantity = kittenQuantity;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Object[][] getKittensData() {
        return new Object[][]{
                {0, 0},
                {5, 5},
        };
    }

    @Test
    public void testFelineKittens() {
        assertEquals(expectedResult, feline.getKittens(kittenQuantity));
    }

}
