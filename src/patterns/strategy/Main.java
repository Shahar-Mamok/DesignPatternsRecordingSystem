package patterns.strategy;

// Demonstrates Strategy Pattern with recording post-processing
public class Main {
    public static void main(String[] args) {
        RecordingStrategy strategy;

        // Use encryption strategy
        strategy = new EncryptionStrategy();
        strategy.process("CALL-100");

        // Use masking strategy
        strategy = new MaskingStrategy();
        strategy.process("CALL-101");

        // Use no-operation strategy
        strategy = new NoOpStrategy();
        strategy.process("CALL-102");
    }
}
