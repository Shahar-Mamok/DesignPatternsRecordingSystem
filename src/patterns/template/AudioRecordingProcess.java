package patterns.template;

// Concrete recording process for audio
public class AudioRecordingProcess extends AbstractRecordingProcess {
    @Override
    protected void recordContent(String callId) {
        System.out.println("Recording audio for call " + callId);
    }
}
