package readingtask.chapterfourteen;

public class LastWord {
    public static int lengthOfLastWord(String s) {

        String[] sArray = s.split(" ");

        String lastWord = sArray[sArray.length - 1];

        return lastWord.length();

    }
}
