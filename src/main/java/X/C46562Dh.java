package X;

import java.io.FileOutputStream;
import java.io.OutputStream;

/* renamed from: X.2Dh  reason: invalid class name and case insensitive filesystem */
public final class C46562Dh {
    public boolean A00;
    public final AnonymousClass2Di A01;
    public final /* synthetic */ AnonymousClass2Dk A02;

    public C46562Dh(AnonymousClass2Dk r1, AnonymousClass2Di r2) {
        this.A02 = r1;
        this.A01 = r2;
    }

    public OutputStream A00() {
        AnonymousClass2Dg r0;
        synchronized (this.A02) {
            AnonymousClass2Di r1 = this.A01;
            if (r1.A01 == this) {
                r0 = new AnonymousClass2Dg(this, new FileOutputStream(r1.A01(0)));
            } else {
                throw new IllegalStateException();
            }
        }
        return r0;
    }
}
