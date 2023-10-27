import org.jetbrains.annotations.Nullable; // Import the Nullable annotation from your IDE or library

public class Dev8 {
    public void processUserData(@Nullable Double digit) {
        return digit + 1.0;
    }

    public static void main(String[] args) {
        Dev8 example = new Dev8();

        Double user2 = null;
        example.processUserData(user2);
    }
}