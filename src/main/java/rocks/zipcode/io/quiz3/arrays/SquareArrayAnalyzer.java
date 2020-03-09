package rocks.zipcode.io.quiz3.arrays;

import java.util.ArrayList;

/**
 * @author leon on 09/12/2018.
 */
public class SquareArrayAnalyzer {
    /**
     * Given two shuffled arrays `inputArray`, and `squareValues`,
     * ensure each `element` of `inputArray` has a corresponding `value` in `squaredValues`
     * such that `element == value*value`
     *
     * @param inputArray    an array of integers
     * @param squaredValues an array of integers
     * @return true if each `inputArray[i]` has a corresponding `squaredValues[j]` such that `squaredValues[j] == inputArray[i] * inputArray[i]`
     */
    public static Boolean compare(Integer[] inputArray, Integer[] squaredValues) {
        ArrayList<Integer> inputAL = new ArrayList<>();
        ArrayList<Integer> squaredValuesAL = new ArrayList<>();

        for (int i = 0; i <squaredValues.length ; i++) {
            squaredValuesAL.add(i);
        }
        for (int i = 0; i <inputArray.length ; i++) {
            inputAL.add(i);
        }


        for(int i : inputArray){
            inputAL.add(i^2);
        }

        for (int i = 0; i <inputAL.size() ; i++) {
            if(squaredValuesAL.contains(inputAL.get(i))){
                return true;
            }
        }
        return false;
    }
}
