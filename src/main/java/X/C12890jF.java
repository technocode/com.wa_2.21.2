package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* renamed from: X.0jF  reason: invalid class name and case insensitive filesystem */
public class C12890jF extends Drawable implements Drawable.Callback {
    public int A00 = 255;
    public int A01 = -1;
    public long A02;
    public long A03;
    public Rect A04;
    public Drawable A05;
    public Drawable A06;
    public C12870jD A07;
    public AbstractC12880jE A08;
    public Runnable A09;
    public boolean A0A;
    public boolean A0B;

    public final void A00(Drawable drawable) {
        C12870jD r1 = this.A07;
        if (r1 == null) {
            r1 = new C12870jD();
            this.A07 = r1;
        }
        r1.A00 = drawable.getCallback();
        drawable.setCallback(r1);
        try {
            if (this.A08.A07 <= 0 && this.A0A) {
                drawable.setAlpha(this.A00);
            }
            AbstractC12880jE r12 = this.A08;
            if (r12.A0R) {
                drawable.setColorFilter(r12.A0E);
            } else {
                if (r12.A0S) {
                    C002001d.A2b(drawable, r12.A0C);
                }
                AbstractC12880jE r13 = this.A08;
                if (r13.A0T) {
                    C002001d.A2c(drawable, r13.A0F);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.A08.A0Q);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            int i = Build.VERSION.SDK_INT;
            if (i >= 23) {
                drawable.setLayoutDirection(getLayoutDirection());
            }
            if (i >= 19) {
                drawable.setAutoMirrored(this.A08.A0I);
            }
            Rect rect = this.A04;
            if (i >= 21 && rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            C12870jD r14 = this.A07;
            Drawable.Callback callback = r14.A00;
            r14.A00 = null;
            drawable.setCallback(callback);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(boolean r14) {
        /*
        // Method dump skipped, instructions count: 113
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12890jF.A01(boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0067  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02(int r9) {
        /*
        // Method dump skipped, instructions count: 126
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12890jF.A02(int):boolean");
    }

    public void A03(AbstractC12880jE r2) {
        this.A08 = r2;
        int i = this.A01;
        if (i >= 0) {
            Drawable A012 = r2.A01(i);
            this.A05 = A012;
            if (A012 != null) {
                A00(A012);
            }
        }
        this.A06 = null;
    }

    public void applyTheme(Resources.Theme theme) {
        AbstractC12880jE r5 = this.A08;
        if (r5 == null) {
            throw null;
        } else if (theme != null) {
            r5.A03();
            int i = r5.A0A;
            Drawable[] drawableArr = r5.A0V;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2] != null && drawableArr[i2].canApplyTheme()) {
                    drawableArr[i2].applyTheme(theme);
                    r5.A01 |= drawableArr[i2].getChangingConfigurations();
                }
            }
            r5.A05(theme.getResources());
        }
    }

    public boolean canApplyTheme() {
        return this.A08.canApplyTheme();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.A05;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.A06;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public int getAlpha() {
        return this.A00;
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.A08.getChangingConfigurations();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000c, code lost:
        if (r0 == false) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable.ConstantState getConstantState() {
        /*
            r7 = this;
            X.0jE r6 = r7.A08
            monitor-enter(r6)
            boolean r0 = r6.A0L     // Catch:{ all -> 0x003a }
            r5 = 0
            r4 = 1
            if (r0 == 0) goto L_0x000f
            boolean r0 = r6.A0J     // Catch:{ all -> 0x003a }
            monitor-exit(r6)
            if (r0 == 0) goto L_0x002a
            goto L_0x002f
        L_0x000f:
            r6.A03()
            r6.A0L = r4
            int r3 = r6.A0A
            android.graphics.drawable.Drawable[] r2 = r6.A0V
            r1 = 0
        L_0x0019:
            if (r1 >= r3) goto L_0x002c
            r0 = r2[r1]
            android.graphics.drawable.Drawable$ConstantState r0 = r0.getConstantState()
            if (r0 != 0) goto L_0x0026
            r6.A0J = r5
            goto L_0x0029
        L_0x0026:
            int r1 = r1 + 1
            goto L_0x0019
        L_0x0029:
            monitor-exit(r6)
        L_0x002a:
            r0 = 0
            return r0
        L_0x002c:
            r6.A0J = r4
            monitor-exit(r6)
        L_0x002f:
            X.0jE r1 = r7.A08
            int r0 = r7.getChangingConfigurations()
            r1.A00 = r0
            X.0jE r0 = r7.A08
            return r0
        L_0x003a:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12890jF.getConstantState():android.graphics.drawable.Drawable$ConstantState");
    }

    public Drawable getCurrent() {
        return this.A05;
    }

    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.A04;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public int getIntrinsicHeight() {
        AbstractC12880jE r1 = this.A08;
        if (r1.A0P) {
            if (!r1.A0K) {
                r1.A02();
            }
            return r1.A02;
        }
        Drawable drawable = this.A05;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        AbstractC12880jE r1 = this.A08;
        if (r1.A0P) {
            if (!r1.A0K) {
                r1.A02();
            }
            return r1.A05;
        }
        Drawable drawable = this.A05;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    public int getMinimumHeight() {
        AbstractC12880jE r1 = this.A08;
        if (r1.A0P) {
            if (!r1.A0K) {
                r1.A02();
            }
            return r1.A03;
        }
        Drawable drawable = this.A05;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    public int getMinimumWidth() {
        AbstractC12880jE r1 = this.A08;
        if (r1.A0P) {
            if (!r1.A0K) {
                r1.A02();
            }
            return r1.A04;
        }
        Drawable drawable = this.A05;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    public int getOpacity() {
        Drawable drawable = this.A05;
        int i = -2;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        AbstractC12880jE r6 = this.A08;
        if (r6.A0M) {
            return r6.A0B;
        }
        r6.A03();
        int i2 = r6.A0A;
        Drawable[] drawableArr = r6.A0V;
        if (i2 > 0) {
            i = drawableArr[0].getOpacity();
        }
        for (int i3 = 1; i3 < i2; i3++) {
            i = Drawable.resolveOpacity(i, drawableArr[i3].getOpacity());
        }
        r6.A0B = i;
        r6.A0M = true;
        return i;
    }

    public void getOutline(Outline outline) {
        Drawable drawable = this.A05;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    public boolean getPadding(Rect rect) {
        boolean z;
        AbstractC12880jE r9 = this.A08;
        Rect rect2 = null;
        if (!r9.A0U) {
            Rect rect3 = r9.A0G;
            if (rect3 != null || r9.A0N) {
                rect2 = rect3;
            } else {
                r9.A03();
                Rect rect4 = new Rect();
                int i = r9.A0A;
                Drawable[] drawableArr = r9.A0V;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i3 = rect4.left;
                        if (i3 > rect2.left) {
                            rect2.left = i3;
                        }
                        int i4 = rect4.top;
                        if (i4 > rect2.top) {
                            rect2.top = i4;
                        }
                        int i5 = rect4.right;
                        if (i5 > rect2.right) {
                            rect2.right = i5;
                        }
                        int i6 = rect4.bottom;
                        if (i6 > rect2.bottom) {
                            rect2.bottom = i6;
                        }
                    }
                }
                r9.A0N = true;
                r9.A0G = rect2;
            }
            if (rect2 != null) {
                rect.set(rect2);
                z = false;
                if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                    z = true;
                }
                if (this.A08.A0I && C002001d.A07(this) == 1) {
                    int i7 = rect.left;
                    rect.left = rect.right;
                    rect.right = i7;
                }
                return z;
            }
        }
        Drawable drawable = this.A05;
        z = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        int i72 = rect.left;
        rect.left = rect.right;
        rect.right = i72;
        return z;
    }

    public void invalidateDrawable(Drawable drawable) {
        AbstractC12880jE r1 = this.A08;
        if (r1 != null) {
            r1.A0M = false;
            r1.A0O = false;
        }
        if (drawable == this.A05 && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public boolean isAutoMirrored() {
        return this.A08.A0I;
    }

    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.A06;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.A06 = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.A05;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.A0A) {
                this.A05.setAlpha(this.A00);
            }
        }
        if (this.A03 != 0) {
            this.A03 = 0;
            z = true;
        }
        if (this.A02 != 0) {
            this.A02 = 0;
        } else if (!z) {
            return;
        }
        invalidateSelf();
    }

    public Drawable mutate() {
        AbstractC12880jE r2;
        if (!this.A0B && super.mutate() == this) {
            if (!(this instanceof AnonymousClass1ZL)) {
                throw null;
            }
            AnonymousClass1ZL r3 = (AnonymousClass1ZL) this;
            if (r3 instanceof AnonymousClass23K) {
                AnonymousClass23K r32 = (AnonymousClass23K) r3;
                r2 = new AnonymousClass23J(r32.A02, r32, null);
            } else if (!(r3 instanceof AnonymousClass23K)) {
                r2 = new AnonymousClass1ZK(r3.A00, r3, null);
            } else {
                AnonymousClass23K r33 = (AnonymousClass23K) r3;
                r2 = new AnonymousClass23J(r33.A02, r33, null);
            }
            r2.A04();
            A03(r2);
            this.A0B = true;
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.A06;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.A05;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i) {
        AbstractC12880jE r7 = this.A08;
        int i2 = this.A01;
        int i3 = r7.A0A;
        Drawable[] drawableArr = r7.A0V;
        boolean z = false;
        for (int i4 = 0; i4 < i3; i4++) {
            if (drawableArr[i4] != null) {
                boolean layoutDirection = Build.VERSION.SDK_INT >= 23 ? drawableArr[i4].setLayoutDirection(i) : false;
                if (i4 == i2) {
                    z = layoutDirection;
                }
            }
        }
        r7.A09 = i;
        return z;
    }

    public boolean onLevelChange(int i) {
        Drawable drawable = this.A06;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.A05;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.A06;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.A05;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable == this.A05 && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(int i) {
        if (!this.A0A || this.A00 != i) {
            this.A0A = true;
            this.A00 = i;
            Drawable drawable = this.A05;
            if (drawable == null) {
                return;
            }
            if (this.A02 == 0) {
                drawable.setAlpha(i);
            } else {
                A01(false);
            }
        }
    }

    public void setAutoMirrored(boolean z) {
        AbstractC12880jE r1 = this.A08;
        if (r1.A0I != z) {
            r1.A0I = z;
            Drawable drawable = this.A05;
            if (drawable != null) {
                C002001d.A2d(drawable, z);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        AbstractC12880jE r1 = this.A08;
        r1.A0R = true;
        if (r1.A0E != colorFilter) {
            r1.A0E = colorFilter;
            Drawable drawable = this.A05;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean z) {
        AbstractC12880jE r1 = this.A08;
        if (r1.A0Q != z) {
            r1.A0Q = z;
            Drawable drawable = this.A05;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    public void setHotspot(float f, float f2) {
        Drawable drawable = this.A05;
        if (drawable != null) {
            C002001d.A2X(drawable, f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.A04;
        if (rect == null) {
            this.A04 = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.A05;
        if (drawable != null) {
            C002001d.A2a(drawable, i, i2, i3, i4);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        AbstractC12880jE r1 = this.A08;
        r1.A0S = true;
        if (r1.A0C != colorStateList) {
            r1.A0C = colorStateList;
            C002001d.A2b(this.A05, colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        AbstractC12880jE r1 = this.A08;
        r1.A0T = true;
        if (r1.A0F != mode) {
            r1.A0F = mode;
            C002001d.A2c(this.A05, mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.A06;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.A05;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.A05 && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
