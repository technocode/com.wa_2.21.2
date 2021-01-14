package X;

/* renamed from: X.0VU  reason: invalid class name */
public enum AnonymousClass0VU {
    ENQUEUED,
    RUNNING,
    SUCCEEDED,
    FAILED,
    BLOCKED,
    CANCELLED;

    public boolean A00() {
        return this == SUCCEEDED || this == FAILED || this == CANCELLED;
    }
}
