package X;

/* renamed from: X.00A  reason: invalid class name */
public class AnonymousClass00A extends RuntimeException {
    public AnonymousClass00A(String str) {
        super(str);
    }

    public AnonymousClass00A(Throwable th) {
        super(th.toString());
        setStackTrace(th.getStackTrace());
    }
}
