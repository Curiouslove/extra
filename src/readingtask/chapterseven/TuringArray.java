package readingtask.chapterseven;

public class TuringArray {

    public static int calculateCount(int[] anyArray) {
        int count = 0;
        for(int i = 0; i < anyArray.length - 1; i++){
            int result = anyArray[i] + 1;
            for(int j = i + 1; j < anyArray.length; j++){
                if(result == anyArray[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
