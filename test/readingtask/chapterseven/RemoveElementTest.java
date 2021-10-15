package readingtask.chapterseven;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {

    @Test
    void removeElement(){
       // int[] testArray = {3, 2, 2, 3};
//        int[] testArray = {2, 3, 2, 3};
        int[] testArray = {0, 1, 2, 2, 3, 0};
//        assertEquals(2, RemoveElement.removeElement(testArray, 3));
        assertEquals(1, RemoveElement.removeElementWithEhisMethod(testArray, 3));
        System.out.println(Arrays.toString(testArray));
    }
}