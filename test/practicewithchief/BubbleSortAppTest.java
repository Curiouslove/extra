package practicewithchief;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practicewithchief.execptions.ArraySortException;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortAppTest {
    private ArraySortable sorter;
    @BeforeEach
    void setUp() {
        sorter = new BubbleSortApp();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void sortWithoutAnArray(){
        assertThrows(ArraySortException.class, () -> sorter.sortForAscnd(null));
    }

    @Test
    void SortArray(){
        int[] testScores = { 10, 5, 3, 7, 9, 2, 1, 6, 4, 8};
        int[] result = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        try{
            int[] sortedTestScores = sorter.sortForAscnd(testScores);
            assertArrayEquals(result, sortedTestScores);
        }catch (ArraySortException ex){
            ex.printStackTrace();
        }
    }

    @Test
    void sortdescendingWithoutAnArray(){
        assertThrows(ArraySortException.class, () -> sorter.sortForDscnd(null));
    }

    @Test
    void SortArrayInDescending(){
        int[] testScores = { 10, 5, 3, 7, 9, 2, 1, 6, 4, 8};
        int[] result = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        try{
            int[] sortedTestScores = sorter.sortForDscnd(testScores);
            assertArrayEquals(result, sortedTestScores);
        }catch (ArraySortException ex){
            ex.printStackTrace();
        }
    }

}