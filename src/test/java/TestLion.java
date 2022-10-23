import com.example.IFeline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestLion {

    private final String sex;
    private final boolean isMale;
    IFeline feline;

    public TestLion(String sex, boolean isMale) {
        this.sex = sex;
        this.isMale = isMale;
    }

    @Parameterized.Parameters
    public static Object[][] getLionSexData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void testLionIsMale() throws Exception {
        Lion lion = new Lion(sex, feline);
        assertEquals(isMale, lion.doesHaveMane());
    }

    @Test
    public void testLionFoodIsMeat() throws Exception {
        Lion lion = new Lion(sex, feline);
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedResult, lion.getFood());
    }

    @Test
    public void testGetKittens() throws Exception {
        Lion lion = new Lion(sex, feline);
        int expectedResult = 1;
        assertEquals(expectedResult, lion.getKittens());
    }



}
