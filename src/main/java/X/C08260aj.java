package X;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: X.0aj  reason: invalid class name and case insensitive filesystem */
public class C08260aj extends Drawable implements Drawable.Callback {
    public Drawable A00;

    public C08260aj(Drawable drawable) {
        Drawable drawable2 = this.A00;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.A00 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.A00.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.A00.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.A00.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.A00.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.A00.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.A00.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.A00.getMinimumWidth();
    }

    public int getOpacity() {
        return this.A00.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.A00.getPadding(rect);
    }

    public int[] getState() {
        return this.A00.getState();
    }

    public Region getTransparentRegion() {
        return this.A00.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return C002001d.A3G(this.A00);
    }

    public boolean isStateful() {
        return this.A00.isStateful();
    }

    public void jumpToCurrentState() {
        this.A00.jumpToCurrentState();
    }

    public void onBoundsChange(Rect rect) {
        this.A00.setBounds(rect);
    }

    public boolean onLevelChange(int i) {
        return this.A00.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.A00.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        C002001d.A2d(this.A00, z);
    }

    public void setChangingConfigurations(int i) {
        this.A00.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A00.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.A00.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.A00.setFilterBitmap(z);
    }

    public void setHotspot(float f, float f2) {
        C002001d.A2X(this.A00, f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        C002001d.A2a(this.A00, i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        return this.A00.setState(iArr);
    }

    public void setTint(int i) {
        C002001d.A2Z(this.A00, i);
    }

    public void setTintList(ColorStateList colorStateList) {
        C002001d.A2b(this.A00, colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C002001d.A2c(this.A00, mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.A00.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
