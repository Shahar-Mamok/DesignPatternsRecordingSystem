package patterns.proxy;

// Proxy that controls access based on user role
public class ProxyRecordingAccessor implements RecordingAccessor {
    private final String userRole;

    public ProxyRecordingAccessor(String userRole) {
        this.userRole = userRole;
    }

    @Override
    public void access(String callId) {
        if ("ADMIN".equalsIgnoreCase(userRole) || "QM".equalsIgnoreCase(userRole)) {
            System.out.println("Access granted to recording: " + callId);
        } else {
            System.out.println("Access denied for user role: " + userRole);
        }
    }
}
