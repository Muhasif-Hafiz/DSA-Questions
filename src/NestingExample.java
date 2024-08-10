public class NestingExample {


    public void outerFunction() {
        System.out.println("Inside outer function.");


        innerFunction();
    }

    // Inner member function
    private void innerFunction() {
        System.out.println("Inside inner function.");
    }

    public static void main(String[] args) {
        NestingExample example = new NestingExample();
        example.outerFunction();
    }
}
