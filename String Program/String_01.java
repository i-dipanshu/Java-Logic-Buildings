// Java Program to count the total number of characters in a string
public class String_01 {
    public static void main(String[] args) {
        //creating string variable
        String str = "The world to come";
        //counter to count the no of characters
        int count = 0;
        // main logic
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ' '){
                count++;
            }
        }
        System.out.println("The number of characters in line '" + str + "' is " + count);
    }
}
