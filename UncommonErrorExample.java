public class UncommonErrorExample {
    public static void main(String[] args) {
        try {
            // Simulate an uncommon error: accessing a non-existent array index
            int[] array = {1, 2, 3};
            int value = array[5]; // This will throw an ArrayIndexOutOfBoundsException
            System.out.println("Value: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the exception gracefully and provide informative error message
            System.err.println("Error: Array index out of bounds. Check array size and access.");
            e.printStackTrace(); //Optional: print the exception stack trace for debugging
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}