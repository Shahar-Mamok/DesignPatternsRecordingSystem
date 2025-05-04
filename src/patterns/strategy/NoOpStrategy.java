package patterns.strategy;

// Default strategy that does nothing
public class NoOpStrategy implements RecordingStrategy {
    @Override
    public void process(String callId) {
        System.out.println("No processing applied to call " + callId);
    }
}
