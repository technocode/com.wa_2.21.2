package X;

/* renamed from: X.0PV  reason: invalid class name */
public class AnonymousClass0PV implements AnonymousClass0PR {
    public long A00 = 0;
    public boolean A01 = false;
    public final long A02;
    public final AnonymousClass0AV A03;
    public final AnonymousClass00S A04;

    public AnonymousClass0PV(AnonymousClass0AV r5, AnonymousClass00S r6) {
        this.A04 = r6;
        this.A02 = 5000;
        this.A03 = r5;
    }

    @Override // X.AnonymousClass0PR
    public Integer A3e() {
        return 1;
    }

    @Override // X.AnonymousClass0PR
    public synchronized boolean isValid() {
        boolean z;
        long A042 = this.A04.A04();
        if (A042 - this.A00 < this.A02) {
            return this.A01;
        }
        this.A00 = A042;
        try {
            AnonymousClass0AW r3 = this.A03.A00;
            int i = r3.A00;
            if (i != 1 || r3.A01 > 0 || r3.A03 > 0 || r3.A02 != Integer.MIN_VALUE) {
                if (!r3.A02() || i != 2) {
                    z = false;
                    this.A01 = z;
                    return z;
                }
            }
            z = true;
            this.A01 = z;
        } catch (Exception unused) {
            this.A01 = false;
            z = false;
        }
        return z;
    }
}
