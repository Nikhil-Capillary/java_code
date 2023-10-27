class Dev6{
    private Double nullCheckPointerNoncompliant(@Nullable Double digit) {
    // Noncompliant: avoids null checks before dereferencing the pointer.
    return digit + 1.0;
    }
    public static void main(String[] args) {
        System.out.println("The strings are equal.");
    }
}

