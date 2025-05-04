package patterns.command;

public class StopRecordingCommand implements Command {
    private final RecordingSystem system;
    private final String callId;

    public StopRecordingCommand(RecordingSystem system, String callId) {
        this.system = system;
        this.callId = callId;
    }

    @Override
    public void execute() {
        system.stopRecording(callId);
    }
}
