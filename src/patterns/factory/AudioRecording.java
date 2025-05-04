package patterns.factory;

// Concrete implementation of audio recording
public class AudioRecording implements Recording {
    @Override
    public void start() {
        System.out.println("Starting audio recording...");
    }
}
