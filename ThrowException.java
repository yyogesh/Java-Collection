public class ThrowExample {
    public void checkAge(int age) {
        if (age < 18)
            throw new ArithmeticException("Not Eligible for voting");
        else
            System.out.println("Eligible for voting");
    }

    public static void main(String args[]) {
        JavaTester obj = new JavaTester();
        obj.checkAge(13);
        System.out.println("End Of Program");
    }
}

// Exception in thread "main" java.lang.ArithmeticException:
// Not Eligible for voting
// at ThrowExample.checkAge(ThrowExample.java:4)
// at ThrowExample.main(JavaTester.java:10)

class ThrowsExample {
    public int division(int a, int b) throws ArithmeticException {
        int t = a / b;
        return t;
    }

    public static void main(String args[]) {
        JavaTester obj = new JavaTester();
        try {
            System.out.println(obj.division(15, 0));
        } catch (ArithmeticException e) {
            System.out.println("You shouldn't divide number by zero");
        }
    }
}

// You shouldn't divide number by zero
