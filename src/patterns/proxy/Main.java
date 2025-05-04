package patterns.proxy;

public class Main {
    public static void main(String[] args) {
        RecordingAccessor admin = new ProxyRecordingAccessor("ADMIN");
        admin.access("CALL-500");

        RecordingAccessor agent = new ProxyRecordingAccessor("AGENT");
        agent.access("CALL-501");

        RecordingAccessor qm = new ProxyRecordingAccessor("QM");
        qm.access("CALL-502");
    }
}
