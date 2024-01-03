import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ForLoop {
    public static void main(String[] args) {
        // array of string
        //        String[] friends = {"france", "Mark", "Dino", "JavaScript"};
        //        System.out.println(friends[friends.length - 1]);
        ArrayList<String> friends = new ArrayList<String>();
        ArrayList<Integer> friends2 = new ArrayList<Integer>();
        int[][] my2DArray = new int[4][3];
        int[] my1DArray = new int[5];
        for (int i = 0; i < 5; i++) {
            my1DArray[i] = i;
        }
        my2DArray[1][2] = 3;
        friends.add("Mike");
        friends.add("Bird");
        friends.add("Android");
        friends.add("Donald");
        friends.add("Vivian");
        friends.add("Wilson");
        friends.add("Zion");
        friends2.add(1);
        friends2.add(2);
        friends2.add(3);
        friends2.add(1);
        ArrayList<Integer> friends3 = new ArrayList<Integer>(friends2);

        for (String friend : friends) {
            System.out.println(friend + " is my friend.");
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 3; j > 0; j--) {
                System.out.println(i + "," + j);
            }
        }

        Collections.sort(friends);
        System.out.println(friends);
        System.out.println(friends3);
        System.out.println(Arrays.deepToString(my2DArray));
        System.out.println(Arrays.toString(my1DArray));

    }
}
