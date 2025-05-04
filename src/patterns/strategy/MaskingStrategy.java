package patterns.strategy;

// Strategy for masking sensitive data in recordings
public class MaskingStrategy implements RecordingStrategy {
    @Override
    public void process(String callId) {
        System.out.println("Masking sensitive data in call " + callId);
    }
}
