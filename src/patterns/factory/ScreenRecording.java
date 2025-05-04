package patterns.factory;

// Concrete implementation of screen recording
public class ScreenRecording implements Recording {
    @Override
    public void start() {
        System.out.println("Starting screen recording...");
    }
}
