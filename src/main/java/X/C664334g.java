package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: X.34g  reason: invalid class name and case insensitive filesystem */
public class C664334g {
    public final int A00;
    public final C72133Rq A01;
    public final boolean A02;

    public C664334g(AnonymousClass02M r8, C02660Cy r9, C664234e r10, int i) {
        this.A01 = new C72133Rq(r8, r9, r10.A08, new C72113Ro(r10.A04, r10.A03), r10.A02);
        this.A02 = r10.A05;
        this.A00 = i;
    }

    public void A00(String str, ImageView imageView) {
        A01(str, imageView, null, null, null);
    }

    public void A01(String str, ImageView imageView, Drawable drawable, Drawable drawable2, AnonymousClass34f r16) {
        int i = this.A00;
        this.A01.A00(new C72123Rp(str, str, imageView, drawable, drawable2, i, i, r16), this.A02);
    }
}
