public class ReferenceDataType {
    // java -> copy by reference
    public static void changeFirstElement(int[] arr) {
        arr[0] = 10000;
    }
    public static void main(String[] args) {
        // reference data type (non-primitive data type)
        int[] myArray1 = {10,20,30};
        int[] myArray2 = myArray1;
//        myArray1[0] = 100;
        changeFirstElement(myArray1);

        for (int i : myArray1) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i : myArray2) {
            System.out.print(i+" ");
        }

    }
}
