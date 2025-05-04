package patterns.adapter;

public class Main {
    public static void main(String[] args) {
        Recording internal = new InternalRecording();
        internal.record("CALL-301");

        TwilioRecorder twilio = new TwilioRecorder();
        Recording twilioAdapted = new TwilioAdapter(twilio);
        twilioAdapted.record("CALL-302");
    }
}
