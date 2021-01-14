package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: X.0rX  reason: invalid class name and case insensitive filesystem */
public class C17440rX extends Drawable.ConstantState {
    public final Drawable.ConstantState A00;

    public C17440rX(Drawable.ConstantState constantState) {
        this.A00 = constantState;
    }

    public boolean canApplyTheme() {
        return this.A00.canApplyTheme();
    }

    public int getChangingConfigurations() {
        return this.A00.getChangingConfigurations();
    }

    public Drawable newDrawable() {
        AnonymousClass24Q r2 = new AnonymousClass24Q(null);
        Drawable newDrawable = this.A00.newDrawable();
        ((AnonymousClass0VA) r2).A00 = newDrawable;
        newDrawable.setCallback(r2.A05);
        return r2;
    }

    public Drawable newDrawable(Resources resources) {
        AnonymousClass24Q r2 = new AnonymousClass24Q(null);
        Drawable newDrawable = this.A00.newDrawable(resources);
        ((AnonymousClass0VA) r2).A00 = newDrawable;
        newDrawable.setCallback(r2.A05);
        return r2;
    }

    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        AnonymousClass24Q r2 = new AnonymousClass24Q(null);
        Drawable newDrawable = this.A00.newDrawable(resources, theme);
        ((AnonymousClass0VA) r2).A00 = newDrawable;
        newDrawable.setCallback(r2.A05);
        return r2;
    }
}
