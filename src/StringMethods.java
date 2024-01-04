public class StringMethods {
    public static void main(String[] args) {
        String s = "Hello, How are you doing today?";
        String s2 = "Hello";
        s2 = s2.substring(0, s2.length() - 1);
        System.out.println(s2);
        String[] myArr = s.split(" ");
        for (String letter: myArr) {
            System.out.println(letter);
        }
    }
}
