package readingtask.chapterseven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TuringArrayTest {

    @Test
    void calculateCount(){
        int [] testArray = {1, 2, 3, 4, 5};
        assertEquals(4, TuringArray.calculateCount(testArray));
    }
    @Test
    void calculateCountForAnEdgeCase(){
        int [] testArray = {1, 1, 1, 1, 1};
        assertEquals(0, TuringArray.calculateCount(testArray));
    }

}