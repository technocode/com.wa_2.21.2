package X;

import java.io.IOException;

/* renamed from: X.1hz  reason: invalid class name and case insensitive filesystem */
public final class C34151hz implements AbstractC229813y {
    public C229513v A00;
    public final /* synthetic */ AnonymousClass25U A01;

    public C34151hz(AnonymousClass25U r5) {
        this.A01 = r5;
        this.A00 = new C229513v(r5.A03.A02, 0, null);
    }

    public final C229713x A00(C229713x r11) {
        AnonymousClass25U r0 = this.A01;
        long j = r11.A04;
        if (r0 != null) {
            long j2 = r11.A03;
            if (j == j && j2 == j2) {
                return r11;
            }
            return new C229713x(r11.A00, r11.A02, r11.A05, r11.A01, r11.A06, j, j2);
        }
        throw null;
    }

    public final boolean A01(int i, C229113r r6) {
        if (r6 != null) {
            C461728j r2 = (C461728j) this.A01;
            if (r2 == null) {
                throw null;
            } else if (r2.A00 != Integer.MAX_VALUE && (r6 = (C229113r) r2.A02.get(r6)) == null) {
                return false;
            }
        } else {
            r6 = null;
        }
        AnonymousClass25U r22 = this.A01;
        if (r22 != null) {
            C229513v r1 = this.A00;
            if (r1.A00 == i && AnonymousClass0W2.A08(r1.A01, r6)) {
                return true;
            }
            this.A00 = new C229513v(r22.A03.A02, i, r6);
            return true;
        }
        throw null;
    }

    @Override // X.AbstractC229813y
    public void AFK(int i, C229113r r4, C229713x r5) {
        if (A01(i, r4)) {
            this.A00.A09(A00(r5));
        }
    }

    @Override // X.AbstractC229813y
    public void AH2(int i, C229113r r4, C229613w r5, C229713x r6) {
        if (A01(i, r4)) {
            this.A00.A05(r5, A00(r6));
        }
    }

    @Override // X.AbstractC229813y
    public void AH3(int i, C229113r r4, C229613w r5, C229713x r6) {
        if (A01(i, r4)) {
            this.A00.A06(r5, A00(r6));
        }
    }

    @Override // X.AbstractC229813y
    public void AH6(int i, C229113r r4, C229613w r5, C229713x r6, IOException iOException, boolean z) {
        if (A01(i, r4)) {
            this.A00.A08(r5, A00(r6), iOException, z);
        }
    }

    @Override // X.AbstractC229813y
    public void AHC(int i, C229113r r4, C229613w r5, C229713x r6) {
        if (A01(i, r4)) {
            this.A00.A07(r5, A00(r6));
        }
    }

    @Override // X.AbstractC229813y
    public void AHW(int i, C229113r r3) {
        if (A01(i, r3)) {
            this.A00.A02();
        }
    }

    @Override // X.AbstractC229813y
    public void AHX(int i, C229113r r3) {
        if (A01(i, r3)) {
            this.A00.A03();
        }
    }

    @Override // X.AbstractC229813y
    public void AJ2(int i, C229113r r3) {
        if (A01(i, r3)) {
            this.A00.A04();
        }
    }
}
