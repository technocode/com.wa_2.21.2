package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/* renamed from: X.06V  reason: invalid class name */
public class AnonymousClass06V implements AnonymousClass06R {
    public GradientDrawable.Orientation A00;
    public C009405x A01;
    public C009405x A02;
    public C009405x A03;

    @Override // X.AnonymousClass06R
    public boolean AMv() {
        return false;
    }

    @Override // X.AnonymousClass06R
    public Drawable A3G(AnonymousClass05r r9, AnonymousClass06Q r10) {
        int[] iArr;
        Integer A002 = this.A01.A00(r9);
        Integer A003 = this.A02.A00(r9);
        C009405x r0 = this.A03;
        if (r0 != null) {
            iArr = new int[]{A002.intValue(), r0.A00(r9).intValue(), A003.intValue()};
        } else {
            iArr = new int[]{A002.intValue(), A003.intValue()};
        }
        return new GradientDrawable(this.A00, iArr);
    }
}
