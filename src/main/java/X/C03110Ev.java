package X;

import com.whatsapp.util.Log;

/* renamed from: X.0Ev  reason: invalid class name and case insensitive filesystem */
public class C03110Ev {
    public static volatile C03110Ev A04;
    public final AnonymousClass02M A00;
    public final AnonymousClass0D7 A01;
    public final AnonymousClass0AK A02;
    public final AnonymousClass00T A03;

    public C03110Ev(AnonymousClass02M r1, AnonymousClass00T r2, AnonymousClass0AK r3, AnonymousClass0D7 r4) {
        this.A00 = r1;
        this.A03 = r2;
        this.A02 = r3;
        this.A01 = r4;
    }

    public static C03110Ev A00() {
        if (A04 == null) {
            synchronized (C03110Ev.class) {
                if (A04 == null) {
                    A04 = new C03110Ev(AnonymousClass02M.A00(), C002101e.A00(), AnonymousClass0AK.A00(), AnonymousClass0D7.A00());
                }
            }
        }
        return A04;
    }

    public void A01(AbstractC007503q r5) {
        C05450Op A0u;
        C05450Op A0u2;
        if (r5 != null) {
            if (C003701u.A0D()) {
                Log.w("message is lazy loaded on ui thread", new Throwable());
            }
            this.A02.A01(r5);
            AnonymousClass0D7 r3 = this.A01;
            synchronized (r3) {
                if ((r5 instanceof AnonymousClass0M3) && (A0u2 = ((AnonymousClass0M3) r5).A0u()) != null) {
                    r3.A01(A0u2);
                    A0u2.A00 = true;
                }
                AbstractC007503q A09 = r5.A09();
                if ((A09 instanceof AnonymousClass0M3) && (A0u = ((AnonymousClass0M3) A09).A0u()) != null) {
                    A0u.A00 = true;
                }
            }
            if (!AnonymousClass0FI.A0V(r5)) {
                throw new IllegalStateException("ensureCompletelyLoaded failed");
            }
        }
    }
}
