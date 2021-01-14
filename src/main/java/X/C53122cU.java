package X;

import android.content.Context;
import com.google.android.search.verification.client.R;

/* renamed from: X.2cU  reason: invalid class name and case insensitive filesystem */
public class C53122cU implements AbstractC48432Mf {
    public int A00 = 0;
    public C03960Il A01;
    public String A02;
    public boolean A03;

    @Override // X.AbstractC48432Mf
    public boolean A2S(boolean z, boolean z2) {
        return !z2;
    }

    @Override // X.AbstractC48432Mf
    public int A8W(boolean z) {
        return 0;
    }

    @Override // X.AbstractC48432Mf
    public boolean AMt() {
        return true;
    }

    public C53122cU(String str) {
        this.A02 = str;
    }

    public void A00(int[] iArr) {
        this.A01 = new C03960Il(iArr);
    }

    @Override // X.AbstractC48432Mf
    public AbstractC48582Mw A3S(Context context, AnonymousClass01X r4, boolean z) {
        String str = this.A02;
        C60502pa r1 = new C60502pa(context);
        r1.A04 = str;
        r1.A0H();
        r1.A06 = this.A03;
        r1.A01 = this.A00;
        return r1;
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
    public int A7q(Context context, int i) {
        return context.getResources().getDimensionPixelSize(R.dimen.doodle_shape_picker_grid_padding);
    }

    @Override // X.AbstractC48432Mf
    public String A9J() {
        StringBuilder A0S = AnonymousClass008.A0S("svg:");
        A0S.append(this.A02);
        A0S.append(":");
        A0S.append(this.A03 ? 1 : 0);
        A0S.append(":");
        A0S.append(this.A00);
        return A0S.toString();
    }
}
