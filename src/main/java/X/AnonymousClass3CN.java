package X;

/* renamed from: X.3CN  reason: invalid class name */
public class AnonymousClass3CN extends RuntimeException {
    public final Throwable nested;

    public AnonymousClass3CN() {
        super("best");
        this.nested = null;
    }

    public AnonymousClass3CN(Throwable th) {
        this.nested = th;
    }
}
