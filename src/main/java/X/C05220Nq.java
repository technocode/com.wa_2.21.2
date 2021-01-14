package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: X.0Nq  reason: invalid class name and case insensitive filesystem */
public class C05220Nq extends Drawable implements Drawable.Callback, AnonymousClass0Nr, AbstractC05200No {
    public static final PorterDuff.Mode A06 = PorterDuff.Mode.SRC_IN;
    public int A00;
    public PorterDuff.Mode A01;
    public Drawable A02;
    public C08210ae A03;
    public boolean A04;
    public boolean A05;

    public boolean A01() {
        return true;
    }

    public C05220Nq(C08210ae r2, Resources resources) {
        this.A03 = r2;
        Drawable.ConstantState constantState = r2.A03;
        if (constantState != null) {
            APO(constantState.newDrawable(resources));
        }
    }

    public C05220Nq(Drawable drawable) {
        this.A03 = new C08210ae(this.A03);
        APO(drawable);
    }

    public final boolean A00(int[] iArr) {
        if (!A01()) {
            return false;
        }
        C08210ae r0 = this.A03;
        ColorStateList colorStateList = r0.A01;
        PorterDuff.Mode mode = r0.A02;
        if (colorStateList == null || mode == null) {
            this.A04 = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.A04 && colorForState == this.A00 && mode == this.A01)) {
                setColorFilter(colorForState, mode);
                this.A00 = colorForState;
                this.A01 = mode;
                this.A04 = true;
                return true;
            }
        }
        return false;
    }

    @Override // X.AnonymousClass0Nr
    public final Drawable A9v() {
        return this.A02;
    }

    @Override // X.AnonymousClass0Nr
    public final void APO(Drawable drawable) {
        Drawable drawable2 = this.A02;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.A02 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            C08210ae r1 = this.A03;
            if (r1 != null) {
                r1.A03 = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        this.A02.draw(canvas);
    }

    public int getChangingConfigurations() {
        int i;
        int changingConfigurations = super.getChangingConfigurations();
        C08210ae r0 = this.A03;
        if (r0 != null) {
            i = r0.getChangingConfigurations();
        } else {
            i = 0;
        }
        return changingConfigurations | i | this.A02.getChangingConfigurations();
    }

    public Drawable.ConstantState getConstantState() {
        C08210ae r1 = this.A03;
        if (r1 == null || r1.A03 == null) {
            return null;
        }
        r1.A00 = getChangingConfigurations();
        return this.A03;
    }

    public Drawable getCurrent() {
        return this.A02.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.A02.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.A02.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.A02.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.A02.getMinimumWidth();
    }

    public int getOpacity() {
        return this.A02.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.A02.getPadding(rect);
    }

    public int[] getState() {
        return this.A02.getState();
    }

    public Region getTransparentRegion() {
        return this.A02.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return this.A02.isAutoMirrored();
    }

    public boolean isStateful() {
        C08210ae r0;
        ColorStateList colorStateList;
        return (A01() && (r0 = this.A03) != null && (colorStateList = r0.A01) != null && colorStateList.isStateful()) || this.A02.isStateful();
    }

    public void jumpToCurrentState() {
        this.A02.jumpToCurrentState();
    }

    public Drawable mutate() {
        Drawable.ConstantState constantState;
        if (!this.A05 && super.mutate() == this) {
            this.A03 = new C08210ae(this.A03);
            Drawable drawable = this.A02;
            if (drawable != null) {
                drawable.mutate();
            }
            C08210ae r1 = this.A03;
            if (r1 != null) {
                Drawable drawable2 = this.A02;
                if (drawable2 != null) {
                    constantState = drawable2.getConstantState();
                } else {
                    constantState = null;
                }
                r1.A03 = constantState;
            }
            this.A05 = true;
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.A02;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public boolean onLevelChange(int i) {
        return this.A02.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.A02.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        this.A02.setAutoMirrored(z);
    }

    public void setChangingConfigurations(int i) {
        this.A02.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A02.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.A02.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.A02.setFilterBitmap(z);
    }

    public boolean setState(int[] iArr) {
        return A00(iArr) || this.A02.setState(iArr);
    }

    @Override // X.AbstractC05200No
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // X.AbstractC05200No
    public void setTintList(ColorStateList colorStateList) {
        this.A03.A01 = colorStateList;
        A00(getState());
    }

    @Override // X.AbstractC05200No
    public void setTintMode(PorterDuff.Mode mode) {
        this.A03.A02 = mode;
        A00(getState());
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.A02.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
