package patterns.decorator;

// Adds encryption to the recording
public class EncryptionDecorator extends RecordingDecorator {
    public EncryptionDecorator(Recording wrapped) {
        super(wrapped);
    }

    @Override
    public void save() {
        super.save();
        System.out.println("Encrypting recording");
    }
}
