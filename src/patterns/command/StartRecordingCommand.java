package patterns.command;

public class StartRecordingCommand implements Command {
    private final RecordingSystem system;
    private final String callId;

    public StartRecordingCommand(RecordingSystem system, String callId) {
        this.system = system;
        this.callId = callId;
    }

    @Override
    public void execute() {
        system.startRecording(callId);
    }
}
