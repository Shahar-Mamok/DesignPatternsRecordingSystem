package patterns.decorator;

// Core recording without any decorations
public class BasicRecording implements Recording {
    @Override
    public void save() {
        System.out.println("Saving basic recording");
    }
}
