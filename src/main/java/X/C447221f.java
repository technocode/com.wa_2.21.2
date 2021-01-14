package X;

import android.text.SpannableStringBuilder;
import java.util.List;

/* renamed from: X.21f  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C447221f implements AbstractC26691Ma {
    public final /* synthetic */ List A00;

    public /* synthetic */ C447221f(List list) {
        this.A00 = list;
    }

    @Override // X.AbstractC26691Ma
    public final void AJK(SpannableStringBuilder spannableStringBuilder, int i, int i2, C007003k r7) {
        List list = this.A00;
        if (spannableStringBuilder.charAt(i) == '@') {
            list.add(Integer.valueOf(i));
        }
    }
}
