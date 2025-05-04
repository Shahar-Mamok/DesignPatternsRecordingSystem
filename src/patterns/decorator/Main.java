package patterns.decorator;

// Demonstrates Decorator Pattern with recording enhancements
public class Main {
    public static void main(String[] args) {
        // Basic recording
        Recording basic = new BasicRecording();
        basic.save();

        // Recording with encryption
        Recording encrypted = new EncryptionDecorator(new BasicRecording());
        encrypted.save();

        // Recording with encryption and masking
        Recording secured = new MaskingDecorator(
                new EncryptionDecorator(
                        new BasicRecording()));
        secured.save();
    }
}
