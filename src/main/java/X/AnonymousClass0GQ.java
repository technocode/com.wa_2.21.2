package X;

/* renamed from: X.0GQ  reason: invalid class name */
public class AnonymousClass0GQ {
    public static volatile AnonymousClass0GQ A05;
    public boolean A00;
    public final AnonymousClass0GR A01;
    public final C02040Ak A02;
    public final C01970Ad A03;
    public final C018809u A04 = C018809u.A00("PaymentsLifecycleManager", "network", "COMMON");

    public AnonymousClass0GQ(C01970Ad r4, C02040Ak r5, AnonymousClass0GP r6, AnonymousClass0GR r7) {
        this.A03 = r4;
        this.A02 = r5;
        this.A01 = r7;
        r6.A00 = this;
    }

    public static AnonymousClass0GQ A00() {
        if (A05 == null) {
            synchronized (AnonymousClass0GQ.class) {
                if (A05 == null) {
                    A05 = new AnonymousClass0GQ(C01970Ad.A00(), C02040Ak.A00(), AnonymousClass0GP.A00(), AnonymousClass0GR.A00());
                }
            }
        }
        return A05;
    }

    public synchronized void A01() {
        if (this.A00) {
            this.A04.A07(null, "payments was already initialized", null);
            return;
        }
        if (this.A02.A04()) {
            this.A04.A07(null, "initializing payments", null);
            AnonymousClass0GR r3 = this.A01;
            synchronized (r3) {
                r3.A00 = true;
                AnonymousClass02M r2 = r3.A02;
                r2.A02.post(new RunnableEBaseShape3S0100000_I0_3(r3, 31));
                r3.A04.A00(r3);
            }
            this.A00 = true;
        }
    }

    public synchronized void A02(boolean z, boolean z2) {
        this.A04.A07(null, "reinitializing payments", null);
        this.A00 = false;
        this.A03.A06(z, z2);
        AnonymousClass0GR r3 = this.A01;
        synchronized (r3) {
            r3.A00 = false;
            AnonymousClass02M r2 = r3.A02;
            r2.A02.post(new RunnableEBaseShape3S0100000_I0_3(r3, 32));
            r3.A04.A01(r3);
        }
        A01();
    }
}
