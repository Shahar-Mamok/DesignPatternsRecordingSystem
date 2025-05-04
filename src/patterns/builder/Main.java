package patterns.builder;

public class Main {
    public static void main(String[] args) {
        RecordingSession session = new RecordingSession.Builder()
                .setCallId("CALL-999")
                .setAgentName("Dani Din")
                .setType("AUDIO_SCREEN")
                .setEncrypted(true)
                .setUploaded(true)
                .build();

        session.printDetails();
    }
}
