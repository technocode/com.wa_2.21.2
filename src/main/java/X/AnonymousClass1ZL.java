package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;

/* renamed from: X.1ZL  reason: invalid class name */
public class AnonymousClass1ZL extends C12890jF {
    public AnonymousClass1ZK A00;
    public boolean A01;

    public boolean isStateful() {
        return true;
    }

    public AnonymousClass1ZL() {
    }

    public AnonymousClass1ZL(AnonymousClass1ZK r2, Resources resources) {
        A03(new AnonymousClass1ZK(r2, this, resources));
        onStateChange(getState());
    }

    @Override // X.C12890jF
    public void A03(AbstractC12880jE r2) {
        super.A03(r2);
        if (r2 instanceof AnonymousClass1ZK) {
            this.A00 = (AnonymousClass1ZK) r2;
        }
    }

    @Override // X.C12890jF
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // X.C12890jF
    public Drawable mutate() {
        if (!this.A01) {
            super.mutate();
            if (this == this) {
                this.A00.A04();
                this.A01 = true;
            }
        }
        return this;
    }

    @Override // X.C12890jF
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int A06 = this.A00.A06(iArr);
        if (A06 < 0) {
            A06 = this.A00.A06(StateSet.WILD_CARD);
        }
        return A02(A06) || onStateChange;
    }
}
