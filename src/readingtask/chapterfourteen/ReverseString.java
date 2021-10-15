package readingtask.chapterfourteen;

import javax.swing.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReverseString {
    public static void main(String[] args) {
        String result = solution("a-bC-dEf=ghlj!!");
        System.out.println(result);
    }

    private static String solution(String s) {
//        int firstPointer= 0;
//        int secondPointer = s.length()-1;
        StringBuilder result = new StringBuilder(s.length());
        result.append(s);

        Pattern pattern = Pattern.compile("^\\w+$");
        Matcher matcher = pattern.matcher(result);

        while (matcher.find()){
            matcher.appendReplacement(result, String.valueOf(new StringBuilder(matcher.group()).reverse()));
        }

        matcher.appendTail(result);
//        while(firstPointer<secondPointer) {
//            while (!(s.charAt(firstPointer) + "").matches("[a-zA-Z]")){
//                firstPointer++;
//            }
//            while(!(s.charAt(secondPointer) + "").matches("[a-zA-Z]")){
//                secondPointer--;
//            }
//            swap()
//        }
        return result.toString();
    }
}
