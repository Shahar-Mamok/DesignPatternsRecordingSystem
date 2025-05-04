package patterns.singleton;

// Demonstrates use of Singleton Pattern
public class Main {
    public static void main(String[] args) {
        RecordingManager manager1 = RecordingManager.getInstance();
        RecordingManager manager2 = RecordingManager.getInstance();

        manager1.log("Starting system check...");
        manager2.log("Recording initialized.");

        if (manager1 == manager2) {
            System.out.println("Both references point to the same instance.");
        } else {
            System.out.println("Different instances detected (this should not happen).");
        }
    }
}
