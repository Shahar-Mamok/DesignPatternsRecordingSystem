package patterns.observer;

// Concrete observer that logs recording events to a database
public class DatabaseLogger implements RecordingObserver {
    @Override
    public void onRecordingSaved(RecordingEvent event) {
        System.out.println("Database log: " + event.getCallId());
    }
}
