package X;

import android.graphics.Bitmap;

/* renamed from: X.1fh  reason: invalid class name and case insensitive filesystem */
public class C32841fh extends AbstractC20610x0 {
    public AbstractC20030w0 A00;
    public volatile Bitmap A01;

    public C32841fh(AbstractC20030w0 r2) {
        AbstractC20030w0 A03;
        synchronized (r2) {
            A03 = r2.A05() ? r2.clone() : null;
        }
        if (A03 != null) {
            this.A00 = A03;
            this.A01 = (Bitmap) A03.A04();
            return;
        }
        throw null;
    }
}
