package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.1bb  reason: invalid class name and case insensitive filesystem */
public class C30591bb implements AbstractC16630q7 {
    public final /* synthetic */ AnonymousClass0VT A00;

    public C30591bb(AnonymousClass0VT r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC16630q7
    public View A5D(int i) {
        return this.A00.A0I(i);
    }

    @Override // X.AbstractC16630q7
    public int A5F(View view) {
        return AnonymousClass0VT.A04(view) + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin;
    }

    @Override // X.AbstractC16630q7
    public int A5G(View view) {
        return AnonymousClass0VT.A03(view) - ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).leftMargin;
    }

    @Override // X.AbstractC16630q7
    public int A7w() {
        AnonymousClass0VT r0 = this.A00;
        return r0.A03 - r0.A0E();
    }

    @Override // X.AbstractC16630q7
    public int A7x() {
        return this.A00.A0D();
    }
}
