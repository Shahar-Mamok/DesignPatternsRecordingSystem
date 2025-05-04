package patterns.builder;

// Represents a recording session with optional fields
public class RecordingSession {
    private final String callId;
    private final String agentName;
    private final String type;
    private final boolean encrypted;
    private final boolean uploaded;

    private RecordingSession(Builder builder) {
        this.callId = builder.callId;
        this.agentName = builder.agentName;
        this.type = builder.type;
        this.encrypted = builder.encrypted;
        this.uploaded = builder.uploaded;
    }

    public void printDetails() {
        System.out.println("Call ID: " + callId);
        System.out.println("Agent: " + agentName);
        System.out.println("Type: " + type);
        System.out.println("Encrypted: " + encrypted);
        System.out.println("Uploaded: " + uploaded);
    }

    public static class Builder {
        private String callId;
        private String agentName;
        private String type = "AUDIO";
        private boolean encrypted;
        private boolean uploaded;

        public Builder setCallId(String callId) {
            this.callId = callId;
            return this;
        }

        public Builder setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setEncrypted(boolean encrypted) {
            this.encrypted = encrypted;
            return this;
        }

        public Builder setUploaded(boolean uploaded) {
            this.uploaded = uploaded;
            return this;
        }

        public RecordingSession build() {
            return new RecordingSession(this);
        }
    }
}
