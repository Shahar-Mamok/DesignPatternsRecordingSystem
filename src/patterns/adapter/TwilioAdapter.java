package patterns.adapter;

// Adapter that allows TwilioRecorder to be used as Recording
public class TwilioAdapter implements Recording {
    private final TwilioRecorder twilio;

    public TwilioAdapter(TwilioRecorder twilio) {
        this.twilio = twilio;
    }

    @Override
    public void record(String callId) {
        twilio.startTwilio(callId);
    }
}
