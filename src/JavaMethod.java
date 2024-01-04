public class JavaMethod {
    public JavaMethod() {
    }

    public static void main(String[] args) {
        JavaMethod m = new JavaMethod();
        m.sayHello();
        System.out.println(m.multiply(4,4));
        m.test();
    }

    public void sayHello() {
        System.out.println("Hello!!");

    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public void test() {
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 10; j++) {
                if (i==25) return;
                System.out.println(j+", "+i);
            }
        }
    }
}
