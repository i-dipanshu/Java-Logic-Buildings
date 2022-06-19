package Number_01;

public class UsingRecursion {
    static void reverse(int original) {
        // base case to exit recusrsive loop
        if (original < 10) {
            System.out.print(original);
            return;
        }
        System.out.print(original % 10);
        reverse(original / 10);
    }

    public static void main(String[] args) {
        int original = 12345;
        // calling static reverse method
        reverse(original);
    }
}
