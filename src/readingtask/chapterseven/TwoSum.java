package readingtask.chapterseven;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int [] displayTwoSumUsingMap(int [ ] numbers, int targetValue){
        int [] result = new int[2];
        Map<Integer, Integer> storage = new HashMap<>();
        for(int index = 0; index < result.length; index++){
            int remainder = targetValue - numbers[index];
            if(storage.containsKey(remainder)){
                result[0] = storage.get(remainder);
                result[1] = index;
                return result;
            }
            else{
                storage.put(numbers[index], index);
            }
        }

        return result;
    }

    public static int [] displayTwoSum(int [ ] numbers, int targetValue){
        int [] result = new int[2];

        for(int outerIndex = 0; outerIndex < numbers.length - 1; outerIndex++){
            for(int innerIndex = outerIndex + 1; innerIndex < numbers.length; innerIndex++){
                if(numbers[outerIndex] + numbers[innerIndex] == targetValue){
                    result[0] = outerIndex;
                    result[1] = innerIndex;
                }
            }
        }
        return result;
    }
}
