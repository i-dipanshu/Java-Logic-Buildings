// Program to copy all elements of one array into another array
import java.util.Arrays;
public class Array_01 {
    public static void main(String[] args) {
        // creating our original array
        int[] original = { 1, 3, 5, 7, 9 };
        // creating an copy array
        int[] copy = new int[5];
        // loop to copy the elements in new array
        for(int i = 0; i < original.length; i++){
            copy[i] = original[i];
        }
        // printing new array
        System.out.println(Arrays.toString(copy));
    }
}