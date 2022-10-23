import com.example.Animal;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalFamilyTest {
    Animal animal = new Animal();

    @Test
    public void TestGetFamily() {
        String expectedResult = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        assertEquals(animal.getFamily(), expectedResult);
    }
}
