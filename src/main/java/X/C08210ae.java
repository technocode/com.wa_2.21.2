package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* renamed from: X.0ae  reason: invalid class name and case insensitive filesystem */
public final class C08210ae extends Drawable.ConstantState {
    public int A00;
    public ColorStateList A01 = null;
    public PorterDuff.Mode A02 = C05220Nq.A06;
    public Drawable.ConstantState A03;

    public C08210ae(C08210ae r2) {
        if (r2 != null) {
            this.A00 = r2.A00;
            this.A03 = r2.A03;
            this.A02 = r2.A02;
        }
    }

    public int getChangingConfigurations() {
        int i = this.A00;
        Drawable.ConstantState constantState = this.A03;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    public Drawable newDrawable() {
        return newDrawable(null);
    }

    public Drawable newDrawable(Resources resources) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new C05210Np(this, resources);
        }
        return new C05220Nq(this, resources);
    }
}
