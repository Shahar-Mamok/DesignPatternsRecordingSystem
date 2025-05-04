package patterns.template;

// Template for recording process with a fixed structure
public abstract class AbstractRecordingProcess {

    public final void record(String callId) {
        prepare(callId);
        recordContent(callId);  // This will vary
        finish(callId);
    }

    private void prepare(String callId) {
        System.out.println("Preparing recording for call " + callId);
    }

    protected abstract void recordContent(String callId);

    private void finish(String callId) {
        System.out.println("Finalizing recording for call " + callId);
    }
}
