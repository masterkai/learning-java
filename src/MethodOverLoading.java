public class MethodOverLoading {
    public MethodOverLoading(){}
    public static void main(String[] args) {
        MethodOverLoading m = new MethodOverLoading();
        m.addition("hello ", "world!!");
    }

    public void addition(int a, int b) {
        System.out.println(a+b);
    }
    public void addition(String a, String b) {
        System.out.println(a+b);
    }
}
