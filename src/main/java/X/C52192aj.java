package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.google.android.search.verification.client.R;

/* renamed from: X.2aj  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C52192aj implements AbstractC26691Ma {
    public final /* synthetic */ AbstractC11990hN A00;

    public /* synthetic */ C52192aj(AbstractC11990hN r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC26691Ma
    public final void AJK(SpannableStringBuilder spannableStringBuilder, int i, int i2, C007003k r8) {
        Context context = this.A00.A02;
        spannableStringBuilder.setSpan(new ForegroundColorSpan(C004302a.A00(context, R.color.mention_preview)), i, i2, 33);
        spannableStringBuilder.setSpan(new C29261Xt(context.getApplicationContext()), i + 1, i2, 33);
    }
}
