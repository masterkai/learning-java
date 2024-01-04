public class Recursion {
    public static void printHi(int i) {
        if(i==0) return;
        System.out.println("we just print Hi!!with i --> "+i);
        printHi(i -1);
    }
    public static void main(String[] args) {
        // recursive method
        // a method that calls its self
        printHi(10);
    }
}
