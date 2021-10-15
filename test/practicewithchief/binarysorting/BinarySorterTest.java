package practicewithchief.binarysorting;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practicewithchief.ArraySortable;
import practicewithchief.execptions.ArraySortException;

import static org.junit.jupiter.api.Assertions.*;

class BinarySorterTest {
   private ArraySortable sorter;
    @BeforeEach
    void setUp() {
        sorter = new BinarySorter();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void sortAscdWithoutAnArray(){
        assertThrows(ArraySortException.class, () -> sorter.sortForAscnd(null));
    }

    @Test
    void SortArrayInAscd(){
        int[] testScores = { 10, 5, 3, 7, 9, 2, 1, 6, 4, 8};
        int[] result = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        try{
            int[] sortedTestScores = sorter.sortForAscnd(testScores);
            assertArrayEquals(result, sortedTestScores);
        }catch (ArraySortException ex){
            ex.printStackTrace();
        }
    }


}