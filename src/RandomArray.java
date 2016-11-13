import java.util.*;


public class RandomArray {
    private Random rand = new Random();

    public RandomArray() {
    }

    public int[] sortedArray(int size) {

        int[] array = new int[size];
        double[] logArray = new double[size];
        double log = 0;

        for (int i = 1; i <= size; i++) {
            log += (Math.log(Math.random())) *-1;
            logArray[i - 1] = (log);
        }

        log += (Math.log(Math.random())) * -1;

        for (int i = 1; i <= size; i++) {
            array[i - 1] = (int) (size * (logArray[i - 1]) / log);
        }
        return array;
    }

    public int[] sortedArrayX(int size){
        int[] arr = sortedArray(size);
        arr[arr.length-1] = rand.nextInt(size + 1);
        return arr;
    }

    public int[] sortedArrayReversed(int size) {

        int[] array = new int[size];
        double[] logArray = new double[size];
        double log = 0;

        for (int i = 1; i <= size; i++) {
            log += (Math.log(Math.random())) * -1;
            logArray[i - 1] = (log);
        }

        log += (Math.log(Math.random())) * -1;

        for (int i = 1; i <= size; i++) {
            array[i - 1] = (int) (size * (logArray[size - i]) / log);
        }

        return array;
    }


    public int[] randomArray(int size){
        int[] randArray = new int[size];
        for (int i = 0; i < randArray.length; i++) {
           randArray[i] = rand.nextInt(size + 1);
        }
        return randArray;
    }

    public int randomInt(int max) {
        return rand.nextInt(max + 1);
    }












}
