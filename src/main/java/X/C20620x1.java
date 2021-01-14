package X;

import java.io.Closeable;
import java.io.InputStream;

/* renamed from: X.0x1  reason: invalid class name and case insensitive filesystem */
public class C20620x1 implements Closeable {
    public int A00 = 1;
    public int A01 = -1;
    public C20280wS A02 = C20280wS.A01;
    public final AbstractC20030w0 A03;

    public C20620x1(AbstractC20030w0 r2) {
        AnonymousClass0N2.A1Y(AbstractC20030w0.A02(r2));
        this.A03 = r2.clone();
    }

    public InputStream A00() {
        AbstractC20030w0 A002 = AbstractC20030w0.A00(this.A03);
        if (A002 == null) {
            return null;
        }
        try {
            return new C20000vx((C32901fn) A002.A04());
        } finally {
            A002.close();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        AbstractC20030w0 r0 = this.A03;
        if (r0 != null) {
            r0.close();
        }
    }
}
