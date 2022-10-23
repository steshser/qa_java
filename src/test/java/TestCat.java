import com.example.Cat;
import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestCat {
    Feline feline = new Feline();
    Cat cat = new Cat(feline);

    @Test
    public void testIsCatSoundMeow() {
        String expectedResult = "Мяу";
        assertEquals(cat.getSound(), expectedResult);
    }

    @Test
    public void testIsCatFoodMeat() throws Exception {
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        assertEquals(cat.getFood(), expectedResult);
    }
}
