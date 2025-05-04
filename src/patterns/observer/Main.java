package patterns.observer;

// Demonstrates how the observer pattern works in the recording system
public class Main {
    public static void main(String[] args) {
        RecordingSystem system = new RecordingSystem();

        // Add observers to the system
        system.addObserver(new DatabaseLogger());
        system.addObserver(new ComplianceNotifier());

        // Save a recording (triggers notification to observers)
        system.saveRecording("CALL-001");
    }
}
