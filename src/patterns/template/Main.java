package patterns.template;

public class Main {
    public static void main(String[] args) {
        AbstractRecordingProcess process = new AudioRecordingProcess();
        process.record("CALL-808");
    }
}
