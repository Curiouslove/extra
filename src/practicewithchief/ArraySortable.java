package practicewithchief;

import practicewithchief.execptions.ArraySortException;

public interface ArraySortable {

    public int[] sortForAscnd(int[] arrayToSort) throws ArraySortException;
    public int[] sortForDscnd(int[] arrayToSort) throws ArraySortException;

    void validateArray(int[] arrayToCheck) throws ArraySortException;

}
