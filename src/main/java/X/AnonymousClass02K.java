package X;

import android.graphics.BitmapFactory;

/* renamed from: X.02K  reason: invalid class name */
public class AnonymousClass02K {
    public final int A00;
    public final int A01;
    public final BitmapFactory.Options A02;
    public final Long A03;
    public final boolean A04;

    public AnonymousClass02K(int i, int i2) {
        this(i, i2, null, false, null);
    }

    public AnonymousClass02K(int i, int i2, Long l, boolean z, BitmapFactory.Options options) {
        boolean z2;
        if (i < 2 || i2 < 2 || ((l != null && l.longValue() <= 0) || (z && i != i2))) {
            z2 = false;
        } else {
            z2 = true;
        }
        StringBuilder A0U = AnonymousClass008.A0U("bitmaputils/bitmapspec/wrong/", i, ",", i2, ",");
        A0U.append(l);
        A0U.append(",");
        A0U.append(z);
        AnonymousClass00E.A08(z2, A0U.toString());
        if (!z2) {
            this.A01 = Integer.MAX_VALUE;
            this.A00 = Integer.MAX_VALUE;
            this.A03 = null;
            this.A04 = false;
        } else {
            this.A01 = i;
            this.A00 = i2;
            this.A03 = l;
            this.A04 = z;
        }
        this.A02 = options == null ? new BitmapFactory.Options() : options;
    }
}
