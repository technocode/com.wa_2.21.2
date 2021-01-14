package X;

/* renamed from: X.0KX  reason: invalid class name */
public class AnonymousClass0KX {
    public static volatile AnonymousClass0KX A03;
    public final AnonymousClass0C2 A00;
    public final AnonymousClass00Y A01;
    public final AnonymousClass0EU A02;

    public AnonymousClass0KX(AnonymousClass00Y r1, AnonymousClass0C2 r2, AnonymousClass0EU r3) {
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = r3;
    }

    public static AnonymousClass0KX A00() {
        if (A03 == null) {
            synchronized (AnonymousClass0KX.class) {
                if (A03 == null) {
                    A03 = new AnonymousClass0KX(AnonymousClass00Y.A00(), AnonymousClass0C2.A00(), AnonymousClass0EU.A03);
                }
            }
        }
        return A03;
    }

    public final void A01(int i, long j, int i2, int i3, boolean z, boolean z2, int i4) {
        C445520o r3 = new C445520o();
        r3.A07 = Long.valueOf(j);
        r3.A03 = Integer.valueOf(i);
        r3.A06 = Long.valueOf((long) i3);
        r3.A04 = Integer.valueOf(i2);
        if (this.A00.A00) {
            r3.A02 = 1;
        } else {
            r3.A02 = 2;
        }
        r3.A01 = Boolean.valueOf(this.A02.A03());
        r3.A00 = Boolean.valueOf(z);
        r3.A08 = Long.valueOf((long) i4);
        if (z2) {
            r3.A05 = 0;
        } else {
            r3.A05 = 1;
        }
        this.A01.A0B(r3, null, false);
    }

    public void A02(int i, long j, long j2, long j3) {
        AnonymousClass211 r3 = new AnonymousClass211();
        r3.A02 = Integer.valueOf(i);
        r3.A03 = Long.valueOf(j);
        r3.A05 = Long.valueOf(j2);
        r3.A04 = Long.valueOf(j3);
        if (this.A00.A00) {
            r3.A01 = 1;
        } else {
            r3.A01 = 2;
        }
        r3.A00 = Boolean.valueOf(this.A02.A03());
        this.A01.A0B(r3, null, false);
    }
}
