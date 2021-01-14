package X;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.33G  reason: invalid class name */
public abstract class AnonymousClass33G {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C29241Xq A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;

    public AnonymousClass33G(C29241Xq r1, String str, int i, int i2, boolean z, int i3, boolean z2) {
        this.A03 = r1;
        this.A04 = str;
        this.A02 = i;
        this.A00 = i2;
        this.A05 = z;
        this.A01 = i3;
        this.A06 = z2;
    }

    public Context A00() {
        if (!(this instanceof AnonymousClass3QK)) {
            return ((AnonymousClass3QJ) this).A00;
        }
        return ((AnonymousClass3QK) this).A00.getContext();
    }

    public void A01(Drawable drawable, AnonymousClass02M r9) {
        if (!(this instanceof AnonymousClass3QK)) {
            AnonymousClass3QJ r3 = (AnonymousClass3QJ) this;
            if (drawable != null) {
                drawable.setBounds(0, 0, r3.A02, ((AnonymousClass33G) r3).A00);
                C59472nj r1 = r3.A01;
                r1.A02 = drawable;
                if (drawable instanceof C71913Qu) {
                    ((C71913Qu) drawable).A03 = r1.A07;
                }
                RectF rectF = ((AbstractC48582Mw) r1).A04;
                r1.A0E(rectF, rectF.left, rectF.top, rectF.right, rectF.bottom);
            }
        } else if (r9 != null) {
            r9.A02.post(new RunnableEBaseShape9S0200000_I1_4(this, drawable, 13));
        } else {
            throw null;
        }
    }

    public boolean A02() {
        if (!(this instanceof AnonymousClass3QK)) {
            return true;
        }
        AnonymousClass3QK r0 = (AnonymousClass3QK) this;
        return r0.A04.equals(r0.A00.getTag());
    }
}
