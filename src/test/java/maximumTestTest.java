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

}