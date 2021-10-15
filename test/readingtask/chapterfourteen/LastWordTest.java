package readingtask.chapterfourteen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LastWordTest {

    @Test
    void lengthOfLastWord(){
        assertEquals(4, LastWord.lengthOfLastWord("my name is love"));
    }

}