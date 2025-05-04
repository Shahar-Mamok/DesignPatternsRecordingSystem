package patterns.factory;

// Factory to create different recording implementations
public class RecordingFactory {
    public static Recording createRecording(RecordingType type) {
        return switch (type) {
            case AUDIO -> new AudioRecording();
            case SCREEN -> new ScreenRecording();
            case COMBINED -> new CombinedRecording();
        };
    }
}
