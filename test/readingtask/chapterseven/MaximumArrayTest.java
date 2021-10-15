package readingtask.chapterseven;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumArrayTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testMaximumArray(){
        assertEquals(-1, MaximumArray.maxSubArray(new int[]{-1}));
        assertEquals(-1, MaximumArray.maxSubArray(new int[]{-2,-1}));
    }
}