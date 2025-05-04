package patterns.strategy;

// Strategy for encrypting recordings
public class EncryptionStrategy implements RecordingStrategy {
    @Override
    public void process(String callId) {
        System.out.println("Encrypting recording for call " + callId);
    }
}
