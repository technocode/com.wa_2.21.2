package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: X.0Np  reason: invalid class name and case insensitive filesystem */
public class C05210Np extends C05220Nq {
    public static Method A00;

    public C05210Np(C08210ae r1, Resources resources) {
        super(r1, resources);
        A00();
    }

    public C05210Np(Drawable drawable) {
        super(drawable);
        A00();
    }

    public static final void A00() {
        if (A00 == null) {
            try {
                A00 = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }

    @Override // X.C05220Nq
    public boolean A01() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.A02;
        if ((drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable)) {
            return true;
        }
        return false;
    }

    public Rect getDirtyBounds() {
        return this.A02.getDirtyBounds();
    }

    public void getOutline(Outline outline) {
        this.A02.getOutline(outline);
    }

    public boolean isProjected() {
        Method method;
        Drawable drawable = this.A02;
        if (!(drawable == null || (method = A00) == null)) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e);
            }
        }
        return false;
    }

    public void setHotspot(float f, float f2) {
        this.A02.setHotspot(f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.A02.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // X.C05220Nq
    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // X.C05220Nq, X.AbstractC05200No
    public void setTint(int i) {
        if (A01()) {
            super.setTint(i);
        } else {
            this.A02.setTint(i);
        }
    }

    @Override // X.C05220Nq, X.AbstractC05200No
    public void setTintList(ColorStateList colorStateList) {
        if (A01()) {
            this.A03.A01 = colorStateList;
            A00(getState());
            return;
        }
        this.A02.setTintList(colorStateList);
    }

    @Override // X.C05220Nq, X.AbstractC05200No
    public void setTintMode(PorterDuff.Mode mode) {
        if (A01()) {
            this.A03.A02 = mode;
            A00(getState());
            return;
        }
        this.A02.setTintMode(mode);
    }
}
