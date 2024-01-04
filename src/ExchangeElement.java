public class ExchangeElement {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        int temp;
        temp = b;
        b = a;
        a = temp;
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int temp2 = arr[0];
        arr[0] = arr[3];
        arr[3] = temp2;

        System.out.println(a + ", " + b);

        for (int n : arr) {
            System.out.println(n + " ");
        }

    }
}
