package patterns.factory;

// Demonstrates use of Factory Pattern for creating recordings
public class Main {
    public static void main(String[] args) {
        Recording audio = RecordingFactory.createRecording(RecordingType.AUDIO);
        audio.start();

        Recording screen = RecordingFactory.createRecording(RecordingType.SCREEN);
        screen.start();

        Recording combined = RecordingFactory.createRecording(RecordingType.COMBINED);
        combined.start();
    }
}
