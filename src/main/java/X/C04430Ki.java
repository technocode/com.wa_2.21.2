package X;

import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0Ki  reason: invalid class name and case insensitive filesystem */
public class C04430Ki {
    public static volatile C04430Ki A07;
    public final AnonymousClass01I A00;
    public final AnonymousClass0B3 A01;
    public final C002701k A02;
    public final C02450Cb A03;
    public final AnonymousClass0AK A04;
    public final C02220Bc A05;
    public final C02580Cq A06;

    public C04430Ki(C002701k r1, AnonymousClass01I r2, C02220Bc r3, C02450Cb r4, C02580Cq r5, AnonymousClass0AK r6, AnonymousClass0B3 r7) {
        this.A02 = r1;
        this.A00 = r2;
        this.A05 = r3;
        this.A03 = r4;
        this.A06 = r5;
        this.A04 = r6;
        this.A01 = r7;
    }

    public static boolean A00(AnonymousClass0M3 r4, boolean z) {
        synchronized (r4) {
            AnonymousClass0M4 r3 = r4.A02;
            if (r3 == null) {
                throw null;
            } else if (((AbstractC007503q) r4).A08 != 1) {
                return false;
            } else {
                ((AbstractC007503q) r4).A08 = 0;
                r3.A0a = false;
                r3.A0P = false;
                r3.A0L = z;
                r3.A0C = 0;
                return true;
            }
        }
    }

    public static final boolean A01(Object obj, C40531tQ r5, AbstractC49902Sq r6) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        for (AnonymousClass0M3 r1 : Collections.unmodifiableList(r5.A01)) {
            synchronized (r1) {
                AnonymousClass0M4 r0 = r1.A02;
                if (r0 == null) {
                    throw null;
                } else if (r6.A21(obj, r1, r0)) {
                    atomicBoolean.set(true);
                }
            }
        }
        return atomicBoolean.get();
    }
}
