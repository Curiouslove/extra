package readingtask.chapterseven;

public class RemoveElement {

    public static int removeElement(int[] nums, int value) {
        int count = 0;
        for (int index = 0; index < nums.length - 1; index++){
            if(nums[index] == value){
                count = index;
            }else{
                nums[count] = nums[index];
                        count++;
            }
        }
        return count;
    }

    public static int removeElementWithEhisMethod(int[] nums, int value) {
        int pointer = 0;
        int numberOfSwaps = 0;
        for (int index = 0; index < nums.length; index++){
            if(nums[index] == value){
                pointer = index;
            }else{
//                int temp = nums[index];
                nums[index] = nums[pointer];
//                nums[pointer] = temp;
                numberOfSwaps++;
            }
        }
        return numberOfSwaps;
    }


}
