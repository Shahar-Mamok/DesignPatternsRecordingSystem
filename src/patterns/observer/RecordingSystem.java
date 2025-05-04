package patterns.observer;

import java.util.ArrayList;
import java.util.List;

// Subject class that manages recording observers
public class RecordingSystem {
    private final List<RecordingObserver> observers = new ArrayList<>();

    // Add a new observer
    public void addObserver(RecordingObserver observer) {
        observers.add(observer);
    }

    // Remove an observer
    public void removeObserver(RecordingObserver observer) {
        observers.remove(observer);
    }

    // Simulate saving a recording and notify all observers
    public void saveRecording(String callId) {
        System.out.println("Recording saved: " + callId);
        notifyObservers(new RecordingEvent(callId));
    }

    // Notify all registered observers
    private void notifyObservers(RecordingEvent event) {
        for (RecordingObserver observer : observers) {
            observer.onRecordingSaved(event);
        }
    }
}
