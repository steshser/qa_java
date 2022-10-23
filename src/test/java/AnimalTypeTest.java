import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AnimalTypeTest {
    private final String animalType;
    private final List<String> expectedResult;
    Animal animal = new Animal();

    public AnimalTypeTest(String animalType, List<String> expectedResult) {
        this.animalType = animalType;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] getFoodData() {
        return new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
        };
    }

    @Test
    public void TestAnimalType() throws Exception {
        List<String> actualResult = animal.getFood(this.animalType);
        assertEquals(actualResult, this.expectedResult);
    }
}
