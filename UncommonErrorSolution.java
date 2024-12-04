public class UncommonErrorSolution {
    public static void main(String[] args) {
        try {
            int[] array = {1, 2, 3};
            int index = 2; // Safe index
            if (index >= 0 && index < array.length) {
                int value = array[index];
                System.out.println("Value: " + value);
            } else {
                System.err.println("Error: Index out of bounds.");
            }
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
