package h02;


import org.tudalgo.algoutils.student.annotation.StudentImplementationRequired;



/**
 * This class serves as a container for the methods that are to be implemented by the students for exercise H2.1.1.
 */
public class OneDimensionalArrayStuff {

    /**
     * Prevent instantiation of this utility class.
     */
    private OneDimensionalArrayStuff() {
        throw new IllegalStateException("This class is not meant to be instantiated.");
    }

    /**
     * Returns a new array that is a copy of the input array with the given value appended at the end.
     *
     * @param array the input array
     * @param value the value to append
     * @return a new array that is a copy of the input array with the given value appended at the end
     */
    @SuppressWarnings("ManualArrayCopy")
    @StudentImplementationRequired("H2.1.1")
    public static int[] push(final int[] array, final int value) {
        // TODO: H2.1.1
        int[] secondArray = new int[array.length + 1];

        for(int i = 0; i < array.length; i++){
            secondArray[i] = array[i];
        }
        secondArray[secondArray.length-1] = value;

        return secondArray;
    }

    /**
     * Calculates the next Fibonacci number based on the given array and returns a new array with the next Fibonacci
     * number appended at the end.
     *
     * @param array the input array containing the last two Fibonacci numbers up to the current point
     * @return a new array with the next Fibonacci number appended at the end
     */
    @StudentImplementationRequired("H2.1.1")
    public static int[] calculateNextFibonacci(final int[] array) {
        // TODO: H2.1.1
        int nextFibonacci;

        int firstNumber = array[array.length-2];
        int secondNumber = array[array.length-1];

        nextFibonacci = firstNumber + secondNumber;

        return push(array, nextFibonacci);
    }

    /**
     * Returns the n-th Fibonacci number.
     *
     * @param n the index of the Fibonacci number to return
     * @return the n-th Fibonacci number
     */
    @StudentImplementationRequired("H2.1.1")
    public static int fibonacci(final int n) {
        // TODO: H2.1.1
        int[] array = new int[2];
        array[0] = 0;
        array[1]= 1;

        if(n < array.length){
            return array[n];
        }else{
            for(int i = 0; i < n - array.length; i++){
                array = calculateNextFibonacci(array);
            }
            return array[n];
        }
    }
}
