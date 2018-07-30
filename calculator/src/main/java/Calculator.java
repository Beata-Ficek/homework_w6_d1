public class Calculator {
    private int add;
    private int substract;


    public void add(int a, int b) {
        int result = a + b;
        System.out.println("The sum is " + result);
    }

    public void substract(int a, int b) {
        int result = a - b;
        System.out.println("The result of substraction is " + result);
    }

    public void multiply(int a, int b) {
        int result = a * b;
        System.out.println("The result of multiplication is " + result);
    }

    public void divide(int a, int b) {
        int result = a / b;
        System.out.println("The result of division is " + result);
    }
}