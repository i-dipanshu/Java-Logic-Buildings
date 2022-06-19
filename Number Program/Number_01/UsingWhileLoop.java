package Number_01;

public class UsingWhileLoop {
    public static void main(String[] args) {
        // original and reverse integer
        int original = 4123, reverse = 0;
        // while loop to execute the logic
        while(original != 0){
            int remainder = original % 10;
            reverse = reverse * 10 + remainder;
            original /= 10;
        }
        // printing the reversed number
        System.out.println("The reversed number is " + reverse );
    }
}
