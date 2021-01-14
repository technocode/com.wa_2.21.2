package X;

import android.content.Context;

/* renamed from: X.2cC  reason: invalid class name and case insensitive filesystem */
public class C52972cC implements AbstractC48432Mf {
    public final C000300f A00;
    public final C03960Il A01;
    public final C02590Cr A02;

    @Override // X.AbstractC48432Mf
    public boolean A2S(boolean z, boolean z2) {
        return z2;
    }

    @Override // X.AbstractC48432Mf
    public int A7q(Context context, int i) {
        return 0;
    }

    @Override // X.AbstractC48432Mf
    public int A8W(boolean z) {
        return 0;
    }

    @Override // X.AbstractC48432Mf
    public boolean AMt() {
        return true;
    }

    public C52972cC(C03960Il r1, C02590Cr r2, C000300f r3) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = r3;
    }

    public C52972cC(String str, C02590Cr r3, C000300f r4) {
        this.A01 = new C03960Il(str);
        this.A02 = r3;
        this.A00 = r4;
    }

    public C52972cC(int[] iArr, C02590Cr r3, C000300f r4) {
        this.A01 = new C03960Il(iArr);
        this.A02 = r3;
        this.A00 = r4;
    }

    @Override // X.AbstractC48432Mf
    public AbstractC48582Mw A3S(Context context, AnonymousClass01X r9, boolean z) {
        return new C59462ni(this.A01, context, this.A02, z, this.A00.A0D(AbstractC000400g.A2I));
    }

    @Override // X.AbstractC48432Mf
    public String A5S(AnonymousClass01X r2) {
        return this.A01.toString();
    }

    @Override // X.AbstractC48432Mf
    public C03960Il[] A6B() {
        return new C03960Il[]{this.A01};
    }

    @Override // X.AbstractC48432Mf
    public String A9J() {
        StringBuilder A0S = AnonymousClass008.A0S("EmojiShapeCreator:");
        A0S.append(this.A01.toString());
        return A0S.toString();
    }

    public boolean equals(Object obj) {
        if (obj instanceof C52972cC) {
            return this.A01.equals(((C52972cC) obj).A01);
        }
        return false;
    }

    public int hashCode() {
        return this.A01.hashCode();
    }
}
