package X;

import android.view.ViewGroup;

/* renamed from: X.2f0  reason: invalid class name and case insensitive filesystem */
public class C54492f0 extends AbstractC16300pa {
    public AbstractC49192Pj A00;
    public AnonymousClass2Q1 A01;
    public final int A02;
    public final C000300f A03;
    public final AnonymousClass03P A04;
    public final AnonymousClass01X A05;
    public final AnonymousClass00Y A06;
    public final AnonymousClass0Eg A07;
    public final AbstractC49292Px A08;
    public final AnonymousClass022 A09;

    public C54492f0(AnonymousClass0Eg r1, AnonymousClass00Y r2, C000300f r3, AnonymousClass03P r4, AnonymousClass01X r5, AbstractC49292Px r6, AnonymousClass022 r7, int i) {
        this.A07 = r1;
        this.A06 = r2;
        this.A03 = r3;
        this.A04 = r4;
        this.A05 = r5;
        this.A09 = r7;
        this.A08 = r6;
        this.A02 = i;
    }

    @Override // X.AbstractC16300pa
    public synchronized int A05() {
        AnonymousClass2Q1 r0 = this.A01;
        int i = 0;
        if (r0 == null) {
            return 0;
        }
        int size = r0.A04.size();
        if (this.A01.A00 != null) {
            i = 1;
        }
        return size + i;
    }

    @Override // X.AbstractC16300pa
    public AbstractC11910hD A06(ViewGroup viewGroup, int i) {
        return new C60542pf(this.A07, this.A06, this.A03, this.A04, this.A05, this.A09, viewGroup, this.A08, this.A02);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0075, code lost:
        if (r0 != false) goto L_0x0077;
     */
    @Override // X.AbstractC16300pa
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.AbstractC11910hD r11, int r12) {
        /*
        // Method dump skipped, instructions count: 160
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54492f0.A07(X.0hD, int):void");
    }

    public void A08(AnonymousClass2Q1 r3) {
        if (r3.equals(this.A01)) {
            super.A01.A00();
        }
        AbstractC49192Pj r1 = this.A00;
        if (r1 != null) {
            r1.ALV(!r3.A02);
        }
    }

    public synchronized void A09(AnonymousClass2Q1 r2) {
        AnonymousClass2Q1 r0 = this.A01;
        if (r0 != null) {
            r0.A01.remove(this);
        }
        this.A01 = r2;
        if (r2 != null) {
            r2.A01.add(this);
            if (!r2.A04.isEmpty()) {
                A08(r2);
            }
        }
        super.A01.A00();
    }

    public final boolean A0A(int i) {
        AnonymousClass2Q1 r0 = this.A01;
        return r0 != null && i == r0.A04.size();
    }
}
