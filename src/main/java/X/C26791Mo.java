package X;

/* renamed from: X.1Mo  reason: invalid class name and case insensitive filesystem */
public class C26791Mo extends Exception {
    public final int errorCode;

    public C26791Mo(int i, String str) {
        super(str);
        this.errorCode = i;
    }

    public C26791Mo(int i, String str, Throwable th) {
        super(str, th);
        this.errorCode = i;
    }
}
