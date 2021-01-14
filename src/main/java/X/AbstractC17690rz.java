package X;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0rz  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC17690rz {
    public C18030sf A00;
    public Set A01 = new HashSet();
    public UUID A02;
    public boolean A03 = false;

    public abstract AnonymousClass0s0 A01();

    public AbstractC17690rz(Class cls) {
        UUID randomUUID = UUID.randomUUID();
        this.A02 = randomUUID;
        String obj = randomUUID.toString();
        String name = cls.getName();
        this.A00 = new C18030sf(obj, name);
        this.A01.add(name);
    }

    public final AnonymousClass0s0 A00() {
        AnonymousClass0s0 A012 = A01();
        this.A02 = UUID.randomUUID();
        C18030sf r1 = new C18030sf(this.A00);
        this.A00 = r1;
        r1.A0D = this.A02.toString();
        return A012;
    }

    public final void A02(EnumC06980Vl r9, long j, TimeUnit timeUnit) {
        this.A03 = true;
        C18030sf r4 = this.A00;
        r4.A08 = r9;
        long millis = timeUnit.toMillis(j);
        if (millis > 18000000) {
            AbstractC17610rq.A00().A05(C18030sf.A0I, "Backoff delay duration exceeds maximum value", new Throwable[0]);
            millis = 18000000;
        } else if (millis < 10000) {
            AbstractC17610rq.A00().A05(C18030sf.A0I, "Backoff delay duration less than minimum value", new Throwable[0]);
            millis = 10000;
        }
        r4.A01 = millis;
    }
}
