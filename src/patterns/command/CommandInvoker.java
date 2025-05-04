package patterns.command;

import java.util.ArrayList;
import java.util.List;

// Invoker that executes and stores commands
public class CommandInvoker {
    private final List<Command> history = new ArrayList<>();

    public void run(Command command) {
        command.execute();
        history.add(command);
    }

    public int getHistorySize() {
        return history.size();
    }
}
