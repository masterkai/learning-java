import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        // Creating a Random object
        Random random = new Random();
        int min = 0;
        int max = 100;
        // Generating a random number between 0 (inclusive) and 99 (exclusive)
        int secret = random.nextInt((max - min)+min);


        System.out.println("The Secret Number between 0 and 99 is --> " + secret);
    }
}
