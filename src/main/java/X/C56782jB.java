package X;

/* renamed from: X.2jB  reason: invalid class name and case insensitive filesystem */
public class C56782jB implements AnonymousClass34M {
    public final /* synthetic */ C60602pn A00;

    @Override // X.AnonymousClass34M
    public void AFz(AnonymousClass34N r1) {
    }

    public C56782jB(C60602pn r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass34M
    public void ADc(AnonymousClass34N r8, long j) {
        long j2;
        C60602pn r6 = this.A00;
        r6.A0h.A05(1);
        synchronized (r8) {
            j2 = r8.A06;
        }
        r6.A0J.A04(Long.valueOf(j2));
        r6.A0Y.A08(j2);
        AnonymousClass1WB r5 = r6.A01;
        synchronized (r5) {
            r5.A03 = j2;
            r5.A02 += j;
        }
        AnonymousClass1W6 r0 = r6.A00;
        if (r0 != null) {
            r0.A06 = j2;
        }
    }

    @Override // X.AnonymousClass34M
    public void AFI(int i) {
        if (i == 1) {
            this.A00.A01.A02();
        } else if (i == 2) {
            this.A00.A01.A04();
        } else if (i == 3) {
            this.A00.A01.A05();
        }
    }

    @Override // X.AnonymousClass34M
    public void AFJ(AnonymousClass34N r4) {
        if (r4.A00() == 4) {
            AnonymousClass1WB r2 = this.A00.A01;
            boolean z = false;
            if (r2.A08 != null) {
                z = true;
            }
            if (!z) {
                r2.A02();
            }
            boolean z2 = false;
            if (r2.A0E != null) {
                z2 = true;
            }
            if (!z2) {
                r2.A05();
            }
        }
    }

    @Override // X.AnonymousClass34M
    public void AJR() {
        C60602pn r2 = this.A00;
        byte[] A0B = r2.A0Y.A0B();
        if (A0B != null) {
            r2.A0K.A04(A0B);
        }
    }
}
