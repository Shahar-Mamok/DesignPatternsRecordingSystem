package patterns.decorator;

// Abstract decorator class that implements the same interface
public abstract class RecordingDecorator implements Recording {
    protected Recording wrapped;

    public RecordingDecorator(Recording wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void save() {
        wrapped.save();
    }
}
