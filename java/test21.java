public class SampleProgram {

    // Main method - program execution starts here
    public static void main(String[] args) {

        System.out.println("Welcome to Java Programming!");

        int a = 10;
        int b = 20;

        int sum = add(a, b);
        System.out.println("Sum of " + a + " and " + b + " is: " + sum);

        if (sum > 20) {
            System.out.println("Sum is greater than 20");
        } else {
            System.out.println("Sum is less than or equal to 20");
        }
    }

    // Method to add two numbers
    public static int add(int x, int y) {
        return x + y;
    }
    //my new branch
    //what branch
}
