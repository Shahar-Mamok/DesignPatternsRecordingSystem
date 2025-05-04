package patterns.adapter;

// External service with a different interface
public class TwilioRecorder {
    public void startTwilio(String sessionId) {
        System.out.println("Recording via Twilio: " + sessionId);
    }
}
