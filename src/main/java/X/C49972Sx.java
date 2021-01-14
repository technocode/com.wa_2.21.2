package X;

import java.io.IOException;

/* renamed from: X.2Sx  reason: invalid class name and case insensitive filesystem */
public class C49972Sx extends Exception {
    public final int downloadStatus;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C49972Sx(IOException iOException) {
        super(null, iOException);
        int A0G = C002001d.A0G(iOException);
        this.downloadStatus = A0G;
    }

    public C49972Sx(String str, Exception exc, int i) {
        super(str, exc);
        this.downloadStatus = i;
    }
}
