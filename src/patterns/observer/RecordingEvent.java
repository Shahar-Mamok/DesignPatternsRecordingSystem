package patterns.observer;

// Represents the event triggered when a recording is saved
public class RecordingEvent {
    private final String callId;

    public RecordingEvent(String callId) {
        this.callId = callId;
    }

    public String getCallId() {
        return callId;
    }
}
