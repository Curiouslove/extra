package readingtask.chapterseven;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {

    @Test
    void removeDuplicates() {
     int[] testArray = {0, 0, 1, 1, 2, 2};
//        int[] testArray = {2, 2, 5, 5, 9, 21};
        // assertArrayEquals(new int[]{0, 1, 2, 0, 1, 2}, RemoveDuplicates.removeDuplicates(testArray));
        assertEquals(3, RemoveDuplicates.removeDuplicates(testArray));
        System.out.println(Arrays.toString(testArray));
    }

    @Test
    void returnArray() {
        int[] testArray = {0, 0, 1, 1, 2, 2};
        int[] expectedArray = {0, 1, 2, 1, 2, 2};
        int k = RemoveDuplicates.removeDuplicates(testArray);
        for(int i = 0; i < k; i++ ) {
            assertEquals(expectedArray[i], testArray[i]);
        }
    }
}