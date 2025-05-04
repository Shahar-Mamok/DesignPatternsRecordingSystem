package patterns.adapter;

// Internal implementation that conforms to Recording
public class InternalRecording implements Recording {
    @Override
    public void record(String callId) {
        System.out.println("Recording internally: " + callId);
    }
}
