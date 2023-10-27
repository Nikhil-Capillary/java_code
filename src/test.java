// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Test {
    static Double nullCheckPointerNoncompliant(Double digit) {
        // Noncompliant: avoids null checks before dereferencing the pointer.
        return digit + 1.0;

    }

    public static void main(String[] args) {
        nullCheckPointerNoncompliant(0.0);
    }
}