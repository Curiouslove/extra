package practicewithchief.binarysorting;

import practicewithchief.ArraySortable;
import practicewithchief.execptions.ArraySortException;

public class BinarySorter implements ArraySortable {
    @Override
    public int[] sortForAscnd(int[] arrayToSort) throws ArraySortException {
        validateArray(arrayToSort);

        return new int[0];
    }

    @Override
    public int[] sortForDscnd(int[] arrayToSort) throws ArraySortException {
        validateArray(arrayToSort);
        int midPoint = arrayToSort.length / 2;
        // for (int i)
        return new int[0];
    }

    @Override
    public void validateArray(int[] arrayToCheck) throws ArraySortException {
        if(arrayToCheck == null){
            throw new ArraySortException("Array to sort cannot be null");
        }
    }
}
