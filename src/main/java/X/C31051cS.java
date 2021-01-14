package X;

import android.os.Build;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1cS  reason: invalid class name and case insensitive filesystem */
public final class C31051cS extends AbstractC17690rz {
    public C31051cS(Class cls, long j, TimeUnit timeUnit, long j2, TimeUnit timeUnit2) {
        super(cls);
        this.A00.A01(timeUnit.toMillis(j), timeUnit2.toMillis(j2));
    }

    public C31051cS(Class cls, TimeUnit timeUnit) {
        super(cls);
        C18030sf r7 = this.A00;
        long millis = timeUnit.toMillis(3600000);
        if (r7 != null) {
            if (millis < 900000) {
                AbstractC17610rq.A00().A05(C18030sf.A0I, String.format("Interval duration lesser than minimum allowed value; Changed to %s", 900000L), new Throwable[0]);
                millis = 900000;
            }
            r7.A01(millis, millis);
            return;
        }
        throw null;
    }

    @Override // X.AbstractC17690rz
    public AnonymousClass0s0 A01() {
        if (!this.A03 || Build.VERSION.SDK_INT < 23 || !this.A00.A09.A06) {
            C18030sf r1 = this.A00;
            if (!r1.A0G || Build.VERSION.SDK_INT < 23 || !r1.A09.A06) {
                return new C31061cT(this);
            }
            throw new IllegalArgumentException("Cannot run in foreground with an idle mode constraint");
        }
        throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
    }
}
