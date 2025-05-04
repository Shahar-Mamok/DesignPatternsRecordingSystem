package patterns.decorator;

// Adds masking to the recording
public class MaskingDecorator extends RecordingDecorator {
    public MaskingDecorator(Recording wrapped) {
        super(wrapped);
    }

    @Override
    public void save() {
        super.save();
        System.out.println("Applying data masking");
    }
}
