package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;

/* renamed from: X.23J  reason: invalid class name */
public class AnonymousClass23J extends AnonymousClass1ZK {
    public C015008i A00;
    public C06540Tt A01;

    public AnonymousClass23J(AnonymousClass23J r3, AnonymousClass23K r4, Resources resources) {
        super(r3, r4, resources);
        if (r3 != null) {
            this.A00 = r3.A00;
            this.A01 = r3.A01;
            return;
        }
        this.A00 = new C015008i();
        this.A01 = new C06540Tt(10);
    }

    public int A07(int[] iArr) {
        int A06 = super.A06(iArr);
        if (A06 >= 0) {
            return A06;
        }
        return super.A06(StateSet.WILD_CARD);
    }

    @Override // X.AnonymousClass1ZK
    public Drawable newDrawable() {
        return new AnonymousClass23K(this, null);
    }

    @Override // X.AnonymousClass1ZK
    public Drawable newDrawable(Resources resources) {
        return new AnonymousClass23K(this, resources);
    }
}
