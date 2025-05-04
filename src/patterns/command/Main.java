package patterns.command;

public class Main {
    public static void main(String[] args) {
        RecordingSystem system = new RecordingSystem();
        CommandInvoker invoker = new CommandInvoker();

        Command start = new StartRecordingCommand(system, "CALL-700");
        Command stop = new StopRecordingCommand(system, "CALL-700");

        invoker.run(start);
        invoker.run(stop);

        System.out.println("Executed commands: " + invoker.getHistorySize());
    }
}
