package X;

import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.058  reason: invalid class name */
public final class AnonymousClass058 {
    public final AnonymousClass050 A00;
    public final C001000o A01;
    public final C001400w A02;

    public AnonymousClass058(C001400w r1, C001000o r2, AnonymousClass050 r3) {
        this.A02 = r1;
        this.A01 = r2;
        this.A00 = r3;
    }

    public C29481Yv A00(AnonymousClass0OD r3) {
        this.A02.A01();
        if (r3 != null) {
            AnonymousClass1Q7 A002 = this.A00.A00(C002001d.A0v(r3));
            if (A002 != null) {
                return new C29481Yv(A002.A01);
            }
            try {
                return new C29481Yv();
            } catch (IOException e) {
                Log.w("axolotl ioexception while reading sender key record", e);
                return new C29481Yv();
            }
        } else {
            throw null;
        }
    }
}
