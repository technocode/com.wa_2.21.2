package X;

import android.widget.LinearLayout;

/* renamed from: X.3Ft  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C69103Ft implements AnonymousClass0SG {
    public final /* synthetic */ AnonymousClass3YI A00;

    public /* synthetic */ C69103Ft(AnonymousClass3YI r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        LinearLayout linearLayout = this.A00.A00.A05;
        int i = 8;
        if (((Boolean) obj).booleanValue()) {
            i = 0;
        }
        linearLayout.setVisibility(i);
    }
}
