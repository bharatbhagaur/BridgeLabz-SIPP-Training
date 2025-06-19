import java.util.Scanner;

public class NullPointerDemo {

    public static void generateNullPointerException() {
        String text = null;
        System.out.println("Length of text: " + text.length());
    }

    public static void handleNullPointerException() {
        String text = null;
        try {
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught generic Exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
    

        handleNullPointerException();
        System.out.println("Program continues after handling the exception.");
    }
}
