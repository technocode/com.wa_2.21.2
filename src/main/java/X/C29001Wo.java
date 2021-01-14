package X;

import javax.net.ssl.SSLException;

/* renamed from: X.1Wo  reason: invalid class name and case insensitive filesystem */
public class C29001Wo extends Exception {
    public final byte description;
    public final boolean errorTransient = false;
    public final SSLException ex;

    public C29001Wo(byte b, SSLException sSLException) {
        this.description = b;
        this.ex = sSLException;
    }

    public C29001Wo(byte b, SSLException sSLException, boolean z) {
        this.description = b;
        this.ex = sSLException;
    }
}
