package patterns.observer;

// Observer interface to be implemented by all listeners of recording events
public interface RecordingObserver {
    void onRecordingSaved(RecordingEvent event);
}
