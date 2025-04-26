
public class Even {

    public static void checkNumber(int number) throws Exception {

        if (number % 2 == 0) {
            throw new Exception("Even number is not allowed: " + number);
        } else {
            System.out.println("Valid output number: " + number);
        }
    }

    public static void main(String[] args) {
        try {
            checkNumber(9);
        } catch (Exception e) {

            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
