private Double nullCheckPointerNoncompliant(@Nullable Double digit) {
    // Noncompliant: avoids null checks before dereferencing the pointer.
    return digit + 1.0;
}