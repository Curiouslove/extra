package readingtask.chapterseven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BaseballArrayTest {

    @Test
    void calculatePoint(){
        String[] ops = {"5", "2", "C", "D", "+"};
        assertEquals(30, BaseballArray.calculatePoints(ops));
    }

    @Test
    void calculatePointWithAnotherTestCase(){
        String[] ops = {"5", "-2", "4", "C", "D", "9", "+", "+"};
        assertEquals(27, BaseballArray.calculatePoints(ops));
    }

//    @Test
//    void calculatePointWithArray(){
//        String[] ops = {"5", "2", "C", "D", "+"};
//        assertEquals(30, BaseballArray.calculatePointsWithArray(ops));
//    }
//
//    @Test
//    void calculatePointWithAnotherTestCaseWithArray(){
//        String[] ops = {"5", "-2", "4", "C", "D", "9", "+", "+"};
//        assertEquals(27, BaseballArray.calculatePointsWithArray(ops));
//    }


}