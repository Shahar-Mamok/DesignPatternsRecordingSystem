package patterns.command;

// Simulates a system that handles recording logic
public class RecordingSystem {
    public void startRecording(String callId) {
        System.out.println("Recording started for: " + callId);
    }

    public void stopRecording(String callId) {
        System.out.println("Recording stopped for: " + callId);
    }
}
