import com.magic.generics.findMaximum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class maximumTestTest {
    @Test
    public void checkformaximum(){
        findMaximum test=new findMaximum();
        int result = test.maximum(87,56,99);
        Assertions.assertEquals(99,result);
    }
    @Test
    public void checkmaximumatfirstposition(){
        findMaximum test = new findMaximum();
        int result = test.maximum(987,458,222);
        Assertions.assertEquals(987,result);
    }
    @Test
    public void checkmaximumatsecondposition(){
        findMaximum test = new findMaximum();
        int result = test.maximum(454,999,128);
        Assertions.assertEquals(999,result);
    }
    @Test
    public void checkmaximumatthirdposition(){
        findMaximum test = new findMaximum();
        int result = test.maximum(781,121,818);
        Assertions.assertEquals(818,result);
    }
    @Test
    public void checkmaximumforfloat(){
        findMaximum test = new findMaximum();
        float result = test.maximum(41.8f,88.5f,98.7f);
        Assertions.assertEquals(98.7f,result);
    }
}