package readingtask.chapterseven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void displayTwoSum() {
        int [] testArray = {2, 7, 11, 15};
        int target = 9;
        assertArrayEquals(new int[]{0, 1}, TwoSum.displayTwoSum(testArray, target));
    }

    @Test
    void displayTwoSumWithDifferentTarget() {
        int [] testArray = {2, 7, 11, 15};
        int target = 13;
        assertArrayEquals(new int[]{0, 2}, TwoSum.displayTwoSum(testArray, target));
    }

    @Test
    void displayTwoSumWhenIndicesDoesNotMatchTarget() {
        int [] testArray = {3, 7, 11, 15};
        int target = 9;
        assertArrayEquals(new int[]{0, 0}, TwoSum.displayTwoSum(testArray, target));
    }

    @Test
    void displayTwoSumUsingMap() {
        int [] testArray = {2, 7, 11, 15};
        int target = 9;
        assertArrayEquals(new int[]{0, 1}, TwoSum.displayTwoSumUsingMap(testArray, target));
    }

    @Test
    void displayTwoSumUsingMapWhenIndicesDoesNotMatchTarget() {
        int [] testArray = {3, 7, 11, 15};
        int target = 9;
        assertArrayEquals(new int[]{0, 0}, TwoSum.displayTwoSumUsingMap(testArray, target));
    }

    @Test
    void displayTwoSumUsingMapWithDifferentTarget() {
        int [] testArray = {2, 7, 11, 15};
        int target = 13;
        assertArrayEquals(new int[]{0, 2}, TwoSum.displayTwoSumUsingMap(testArray, target));
    }

}