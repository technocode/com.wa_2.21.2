package X;

import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.3MP  reason: invalid class name */
public class AnonymousClass3MP {
    public static volatile AnonymousClass3MP A02;
    public final AnonymousClass00Y A00;
    public final AtomicInteger A01 = new AtomicInteger();

    public AnonymousClass3MP(AnonymousClass00Y r2) {
        this.A00 = r2;
    }

    public final void A00(int i, String str, Object... objArr) {
        if (this.A01.getAndIncrement() < 5) {
            C446020t r3 = new C446020t();
            r3.A00 = Integer.valueOf(i);
            if (str != null) {
                r3.A01 = String.format(Locale.US, str, objArr);
            }
            this.A00.A0B(r3, null, false);
        }
    }

    public void A01(String str) {
        A00(10, "errorString:%s", str);
    }
}
