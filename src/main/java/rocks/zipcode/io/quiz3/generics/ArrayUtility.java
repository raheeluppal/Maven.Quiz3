package rocks.zipcode.io.quiz3.generics;

import java.util.function.Function;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<T> {
    private final T[] array;

    public ArrayUtility(T[] array) {
        this.array = array;
    }

    public T findOddOccurringValue() {
        for(T t : array){
            if(getNumberOfOccurrences(t) %2 != 0){
                return t;
            }
        }
        return null;
    }

    public T findEvenOccurringValue() {
        for(T t : array){
            if(getNumberOfOccurrences(t) %2 == 0){
                return t;
            }
        }
        return null;
    }

    public int getNumberOfOccurrences(T valueToEvaluate) {
        int count = 0;
        for (T t : array) {
            if (valueToEvaluate.equals(t))
                count++;
        }
        return count;
    }

    public T[] filter(Function<T, Boolean> predicate) {
        return null;
    }
}
