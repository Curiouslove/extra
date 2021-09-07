import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

   @Test
   void test_That_Calculator_Can_Add_Numbers(){
      assertEquals(5, Calculator.addNumbers(2, "+", 3));
   }

}
