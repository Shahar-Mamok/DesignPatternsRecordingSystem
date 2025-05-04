package patterns.singleton;

// Singleton class that manages access to the recording system
public class RecordingManager {
    private static RecordingManager instance;

    private RecordingManager() {
        // private constructor to prevent instantiation
        System.out.println("RecordingManager initialized");
    }

    public static RecordingManager getInstance() {
        if (instance == null) {
            instance = new RecordingManager();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("[RecordingManager] " + message);
    }
}
