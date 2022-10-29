import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalTest {


    @Test
    public void testGetFamily() {
        Animal animal = new Animal();
        String expectedResult = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        assertEquals(animal.getFamily(), expectedResult);
    }

    @Test
    public void testUnknownAnimal() {
        Exception exception = Assert.assertThrows(Exception.class, () -> {
            Animal animal = new Animal();
            animal.getFood("Травохищник");
        });
        String expectedResult = "Неизвестный вид животного, используйте значение Травоядное или Хищник";
        assertEquals(expectedResult, exception.getMessage());
    }
}
