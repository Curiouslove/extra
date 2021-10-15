package readingtask.chapterseven;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
        int count = 1;
        for (int index = 0; index < nums.length - 1; index++){
            if(nums[index] != nums[index + 1]){
                //int temp = nums[count];
                nums[count] = nums[index + 1];
               // nums[index + 1] = temp;
                count++;

            }
        }
        return count;
    }

}
