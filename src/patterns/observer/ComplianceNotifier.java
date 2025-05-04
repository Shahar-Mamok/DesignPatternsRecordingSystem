package patterns.observer;

// Concrete observer that notifies compliance system (like GDPR)
public class ComplianceNotifier implements RecordingObserver {
    @Override
    public void onRecordingSaved(RecordingEvent event) {
        System.out.println("Compliance notified for: " + event.getCallId());
    }
}
