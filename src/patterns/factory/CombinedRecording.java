package patterns.factory;

// Concrete implementation of combined audio + screen recording
public class CombinedRecording implements Recording {
    @Override
    public void start() {
        System.out.println("Starting combined audio and screen recording...");
    }
}
