import com.example.IFeline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class TestLion {

    @Mock
    IFeline feline;

    @Test
    public void testLionMaleIsTrue() throws Exception {
        Lion lion = new Lion("Самец", feline);
        assertTrue(lion.doesHaveMane());
    }

    @Test
    public void testLionFemaleIsFalse() throws Exception {
        Lion lion = new Lion("Самка", feline);
        assertFalse(lion.doesHaveMane());
    }

    @Test
    public void testUnknownLionSex() {
        Exception exception = Assert.assertThrows(Exception.class, () -> {
            Lion lion = new Lion("неизвестный", feline);
        });
        String expectedResult = "Используйте допустимые значения пола животного - самец или самка";
        assertEquals(expectedResult, exception.getMessage());
    }

    @Test
    public void testLionFoodIsMeat() throws Exception {
        Lion lion = new Lion("Самец", feline);
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedResult, lion.getFood());
    }

    @Test
    public void testGetKittens() throws Exception {
        Lion lion = new Lion("Самец", feline);
        int expectedResult = 1;
        assertEquals(expectedResult, lion.getKittens());
    }


}
