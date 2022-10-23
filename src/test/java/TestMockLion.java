import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestMockLion {

    @Mock
    Lion lion;

    @Test
    public void testHaveMane() {
        lion.doesHaveMane();
        Mockito.verify(lion).doesHaveMane();
    }

    @Test
    public void testKittens() {
        lion.getKittens();
        Mockito.verify(lion).getKittens();
    }

    @Test
    public void testGetFood() throws Exception {
        lion.getFood();
        lion.getFood();
        Mockito.verify(lion, Mockito.times(2)).getFood();
    }

}
