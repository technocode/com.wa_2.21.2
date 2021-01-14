package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: X.0VC  reason: invalid class name */
public class AnonymousClass0VC extends Drawable.ConstantState {
    public final Drawable.ConstantState A00;

    public AnonymousClass0VC(Drawable.ConstantState constantState) {
        this.A00 = constantState;
    }

    public boolean canApplyTheme() {
        return this.A00.canApplyTheme();
    }

    public int getChangingConfigurations() {
        return this.A00.getChangingConfigurations();
    }

    public Drawable newDrawable() {
        AnonymousClass0V9 r1 = new AnonymousClass0V9();
        ((AnonymousClass0VA) r1).A00 = this.A00.newDrawable();
        return r1;
    }

    public Drawable newDrawable(Resources resources) {
        AnonymousClass0V9 r1 = new AnonymousClass0V9();
        ((AnonymousClass0VA) r1).A00 = this.A00.newDrawable(resources);
        return r1;
    }

    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        AnonymousClass0V9 r1 = new AnonymousClass0V9();
        ((AnonymousClass0VA) r1).A00 = this.A00.newDrawable(resources, theme);
        return r1;
    }
}
