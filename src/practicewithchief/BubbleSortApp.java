package practicewithchief;

import practicewithchief.execptions.ArraySortException;

public class BubbleSortApp implements ArraySortable{
    @Override
    public int[] sortForAscnd(int[] arrayToSort) throws ArraySortException {
        validateArray(arrayToSort);
        int temp = 0;
        for (int i = 0; i < arrayToSort.length - 1; i++) {
            for (int j = i + 1; j < arrayToSort.length; j++) {
                if (arrayToSort[i] > arrayToSort[j]) {
                    temp = arrayToSort[i];
                    arrayToSort[i] = arrayToSort[j];
                    arrayToSort[j] = temp;
                }
            }
        }
        return arrayToSort;
    }

    @Override
    public int[] sortForDscnd(int[] arrayToSort) throws ArraySortException {
        validateArray(arrayToSort);
        int temp = 0;
        for (int i = 0; i < arrayToSort.length - 1; i++) {
            for (int j = i + 1; j < arrayToSort.length; j++) {
                if (arrayToSort[i] < arrayToSort[j]) {
                    temp = arrayToSort[i];
                    arrayToSort[i] = arrayToSort[j];
                    arrayToSort[j] = temp;
                }
            }
        }
        return arrayToSort;
    }

    @Override
    public void validateArray(int[] arrayToCheck) throws ArraySortException {

        if(arrayToCheck == null){
            throw new ArraySortException("Array to sort cannot be null");
        }


    }

}
