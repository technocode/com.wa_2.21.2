package X;

import android.content.Context;
import android.text.SpannableStringBuilder;

/* renamed from: X.1qQ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C38771qQ implements AbstractC26691Ma {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ boolean A02;

    public /* synthetic */ C38771qQ(Context context, int i, boolean z) {
        this.A01 = context;
        this.A00 = i;
        this.A02 = z;
    }

    @Override // X.AbstractC26691Ma
    public final void AJK(SpannableStringBuilder spannableStringBuilder, int i, int i2, C007003k r8) {
        Context context = this.A01;
        int i3 = this.A00;
        boolean z = this.A02;
        spannableStringBuilder.setSpan(new AnonymousClass27P(context, i3, r8), i, i2, 33);
        if (z) {
            spannableStringBuilder.setSpan(new C29261Xt(context.getApplicationContext()), i + 1, i2, 33);
        }
    }
}
