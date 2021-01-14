package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.1bc  reason: invalid class name and case insensitive filesystem */
public class C30601bc implements AbstractC16630q7 {
    public final /* synthetic */ AnonymousClass0VT A00;

    public C30601bc(AnonymousClass0VT r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC16630q7
    public View A5D(int i) {
        return this.A00.A0I(i);
    }

    @Override // X.AbstractC16630q7
    public int A5F(View view) {
        return AnonymousClass0VT.A02(view) + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
    }

    @Override // X.AbstractC16630q7
    public int A5G(View view) {
        return AnonymousClass0VT.A05(view) - ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin;
    }

    @Override // X.AbstractC16630q7
    public int A7w() {
        AnonymousClass0VT r0 = this.A00;
        return r0.A00 - r0.A0C();
    }

    @Override // X.AbstractC16630q7
    public int A7x() {
        return this.A00.A0F();
    }
}
