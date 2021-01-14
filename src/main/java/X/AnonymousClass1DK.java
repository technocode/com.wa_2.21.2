package X;

import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;

/* renamed from: X.1DK  reason: invalid class name */
public class AnonymousClass1DK extends RippleDrawable {
    public AnonymousClass1DK(ColorStateList colorStateList, InsetDrawable insetDrawable, Drawable drawable) {
        super(colorStateList, insetDrawable, drawable);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (getDrawable(0) != null) {
            ((LayerDrawable) ((InsetDrawable) getDrawable(0)).getDrawable()).getDrawable(0).setColorFilter(colorFilter);
        }
    }
}
