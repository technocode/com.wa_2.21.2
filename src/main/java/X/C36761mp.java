package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: X.1mp  reason: invalid class name and case insensitive filesystem */
public class C36761mp extends Drawable implements Drawable.Callback, AbstractC05200No {
    public static final int[] A0w = {16842910};
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public float A0A;
    public float A0B;
    public float A0C;
    public float A0D;
    public int A0E = 255;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public ColorStateList A0L;
    public ColorStateList A0M;
    public ColorStateList A0N;
    public ColorStateList A0O;
    public ColorStateList A0P;
    public ColorStateList A0Q;
    public ColorStateList A0R;
    public ColorFilter A0S;
    public PorterDuff.Mode A0T = PorterDuff.Mode.SRC_IN;
    public PorterDuffColorFilter A0U;
    public Drawable A0V;
    public Drawable A0W;
    public Drawable A0X;
    public TextUtils.TruncateAt A0Y;
    public C08050aO A0Z;
    public C08050aO A0a;
    public AnonymousClass1Dg A0b;
    public CharSequence A0c;
    public CharSequence A0d;
    public CharSequence A0e;
    public WeakReference A0f = new WeakReference(null);
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m = true;
    public boolean A0n;
    public int[] A0o;
    public final Context A0p;
    public final Paint.FontMetrics A0q = new Paint.FontMetrics();
    public final Paint A0r = new Paint(1);
    public final PointF A0s = new PointF();
    public final RectF A0t = new RectF();
    public final TextPaint A0u = new TextPaint(1);
    public final AbstractC04990Mq A0v = new C36751mo(this);

    public int getOpacity() {
        return -3;
    }

    public C36761mp(Context context) {
        this.A0p = context;
        this.A0d = "";
        this.A0u.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = A0w;
        setState(iArr);
        if (!Arrays.equals(this.A0o, iArr)) {
            this.A0o = iArr;
            if (A0S()) {
                A0T(getState(), iArr);
            }
        }
        this.A0l = true;
    }

    public float A00() {
        if (A0R() || A0Q()) {
            return this.A0A + this.A02 + this.A09;
        }
        return 0.0f;
    }

    public final float A01() {
        if (A0S()) {
            return this.A08 + this.A07 + this.A06;
        }
        return 0.0f;
    }

    public final float A02() {
        float measureText;
        if (!this.A0m) {
            return this.A0D;
        }
        CharSequence charSequence = this.A0e;
        if (charSequence == null) {
            measureText = 0.0f;
        } else {
            measureText = this.A0u.measureText(charSequence, 0, charSequence.length());
        }
        this.A0D = measureText;
        this.A0m = false;
        return measureText;
    }

    public Drawable A03() {
        Drawable drawable = this.A0X;
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof AnonymousClass0Nr) {
            return ((AnonymousClass0Nr) drawable).A9v();
        }
        return drawable;
    }

    public void A04() {
        AnonymousClass1DN r0 = (AnonymousClass1DN) this.A0f.get();
        if (r0 != null) {
            r0.AE6();
        }
    }

    public void A05(float f) {
        if (this.A02 != f) {
            float A002 = A00();
            this.A02 = f;
            float A003 = A00();
            invalidateSelf();
            if (A002 != A003) {
                A04();
            }
        }
    }

    public void A06(float f) {
        if (this.A05 != f) {
            this.A05 = f;
            this.A0r.setStrokeWidth(f);
            invalidateSelf();
        }
    }

    public void A07(float f) {
        if (this.A06 != f) {
            this.A06 = f;
            invalidateSelf();
            if (A0S()) {
                A04();
            }
        }
    }

    public void A08(float f) {
        if (this.A07 != f) {
            this.A07 = f;
            invalidateSelf();
            if (A0S()) {
                A04();
            }
        }
    }

    public void A09(float f) {
        if (this.A08 != f) {
            this.A08 = f;
            invalidateSelf();
            if (A0S()) {
                A04();
            }
        }
    }

    public void A0A(float f) {
        if (this.A09 != f) {
            float A002 = A00();
            this.A09 = f;
            float A003 = A00();
            invalidateSelf();
            if (A002 != A003) {
                A04();
            }
        }
    }

    public void A0B(float f) {
        if (this.A0A != f) {
            float A002 = A00();
            this.A0A = f;
            float A003 = A00();
            invalidateSelf();
            if (A002 != A003) {
                A04();
            }
        }
    }

    public void A0C(ColorStateList colorStateList) {
        if (this.A0M != colorStateList) {
            this.A0M = colorStateList;
            if (A0R()) {
                C002001d.A2b(this.A0W, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void A0D(ColorStateList colorStateList) {
        if (this.A0O != colorStateList) {
            this.A0O = colorStateList;
            if (A0S()) {
                C002001d.A2b(this.A0X, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void A0E(ColorStateList colorStateList) {
        ColorStateList colorStateList2;
        if (this.A0Q != colorStateList) {
            this.A0Q = colorStateList;
            if (this.A0n) {
                colorStateList2 = C08220af.A01(colorStateList);
            } else {
                colorStateList2 = null;
            }
            this.A0P = colorStateList2;
            onStateChange(getState());
        }
    }

    public final void A0F(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (A0R() || A0Q()) {
            float f = this.A04 + this.A0A;
            if (C002001d.A07(this) == 0) {
                float f2 = ((float) rect.left) + f;
                rectF.left = f2;
                rectF.right = f2 + this.A02;
            } else {
                float f3 = ((float) rect.right) - f;
                rectF.right = f3;
                rectF.left = f3 - this.A02;
            }
            float exactCenterY = rect.exactCenterY();
            float f4 = this.A02;
            float f5 = exactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    public void A0G(Drawable drawable) {
        if (this.A0V != drawable) {
            float A002 = A00();
            this.A0V = drawable;
            float A003 = A00();
            if (drawable != null) {
                drawable.setCallback(null);
            }
            A0J(this.A0V);
            invalidateSelf();
            if (A002 != A003) {
                A04();
            }
        }
    }

    public void A0H(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.A0W;
        if (drawable3 == null) {
            drawable3 = null;
        } else if (drawable3 instanceof AnonymousClass0Nr) {
            drawable3 = ((AnonymousClass0Nr) drawable3).A9v();
        }
        if (drawable3 != drawable) {
            float A002 = A00();
            if (drawable != null) {
                drawable2 = C002001d.A0d(drawable).mutate();
            } else {
                drawable2 = null;
            }
            this.A0W = drawable2;
            float A003 = A00();
            if (drawable3 != null) {
                drawable3.setCallback(null);
            }
            if (A0R()) {
                A0J(this.A0W);
            }
            invalidateSelf();
            if (A002 != A003) {
                A04();
            }
        }
    }

    public void A0I(Drawable drawable) {
        Drawable drawable2;
        Drawable A032 = A03();
        if (A032 != drawable) {
            float A012 = A01();
            if (drawable != null) {
                drawable2 = C002001d.A0d(drawable).mutate();
            } else {
                drawable2 = null;
            }
            this.A0X = drawable2;
            float A013 = A01();
            if (A032 != null) {
                A032.setCallback(null);
            }
            if (A0S()) {
                A0J(this.A0X);
            }
            invalidateSelf();
            if (A012 != A013) {
                A04();
            }
        }
    }

    public final void A0J(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            C002001d.A2Y(drawable, C002001d.A07(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.A0X) {
                if (drawable.isStateful()) {
                    drawable.setState(this.A0o);
                }
                C002001d.A2b(drawable, this.A0O);
            } else if (drawable.isStateful()) {
                drawable.setState(getState());
            }
        }
    }

    public void A0K(AnonymousClass1Dg r4) {
        if (this.A0b != r4) {
            this.A0b = r4;
            if (r4 != null) {
                r4.A02(this.A0p, this.A0u, this.A0v);
                this.A0m = true;
            }
            onStateChange(getState());
            A04();
        }
    }

    public void A0L(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (this.A0d != charSequence) {
            this.A0d = charSequence;
            C06570Tw A022 = C06570Tw.A02();
            this.A0e = A022.A03(charSequence, A022.A01);
            this.A0m = true;
            invalidateSelf();
            A04();
        }
    }

    public void A0M(boolean z) {
        if (this.A0g != z) {
            this.A0g = z;
            float A002 = A00();
            if (!z && this.A0k) {
                this.A0k = false;
            }
            float A003 = A00();
            invalidateSelf();
            if (A002 != A003) {
                A04();
            }
        }
    }

    public void A0N(boolean z) {
        if (this.A0h != z) {
            boolean A0Q2 = A0Q();
            this.A0h = z;
            boolean A0Q3 = A0Q();
            if (A0Q2 != A0Q3) {
                if (A0Q3) {
                    A0J(this.A0V);
                } else {
                    Drawable drawable = this.A0V;
                    if (drawable != null) {
                        drawable.setCallback(null);
                    }
                }
                invalidateSelf();
                A04();
            }
        }
    }

    public void A0O(boolean z) {
        if (this.A0i != z) {
            boolean A0R2 = A0R();
            this.A0i = z;
            boolean A0R3 = A0R();
            if (A0R2 != A0R3) {
                if (A0R3) {
                    A0J(this.A0W);
                } else {
                    Drawable drawable = this.A0W;
                    if (drawable != null) {
                        drawable.setCallback(null);
                    }
                }
                invalidateSelf();
                A04();
            }
        }
    }

    public void A0P(boolean z) {
        if (this.A0j != z) {
            boolean A0S2 = A0S();
            this.A0j = z;
            boolean A0S3 = A0S();
            if (A0S2 != A0S3) {
                if (A0S3) {
                    A0J(this.A0X);
                } else {
                    Drawable drawable = this.A0X;
                    if (drawable != null) {
                        drawable.setCallback(null);
                    }
                }
                invalidateSelf();
                A04();
            }
        }
    }

    public final boolean A0Q() {
        return this.A0h && this.A0V != null && this.A0k;
    }

    public final boolean A0R() {
        return this.A0i && this.A0W != null;
    }

    public final boolean A0S() {
        return this.A0j && this.A0X != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0066, code lost:
        if (r8.A0g == false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00b2, code lost:
        if (r1 == false) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00c7, code lost:
        if (r1 == false) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00dc, code lost:
        if (r1 == false) goto L_0x00de;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00f5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0T(int[] r9, int[] r10) {
        /*
        // Method dump skipped, instructions count: 265
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36761mp.A0T(int[], int[]):boolean");
    }

    public void draw(Canvas canvas) {
        int i;
        int i2;
        boolean z;
        int i3;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i = this.A0E) != 0) {
            if (i < 255) {
                float f = (float) bounds.left;
                float f2 = (float) bounds.top;
                float f3 = (float) bounds.right;
                float f4 = (float) bounds.bottom;
                i2 = Build.VERSION.SDK_INT > 21 ? canvas.saveLayerAlpha(f, f2, f3, f4, i) : canvas.saveLayerAlpha(f, f2, f3, f4, i, 31);
            } else {
                i2 = 0;
            }
            Paint paint = this.A0r;
            paint.setColor(this.A0F);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.A0S;
            if (colorFilter == null) {
                colorFilter = this.A0U;
            }
            paint.setColorFilter(colorFilter);
            RectF rectF = this.A0t;
            rectF.set(bounds);
            float f5 = this.A00;
            canvas.drawRoundRect(rectF, f5, f5, paint);
            if (this.A05 > 0.0f) {
                paint.setColor(this.A0G);
                paint.setStyle(Paint.Style.STROKE);
                ColorFilter colorFilter2 = this.A0S;
                if (colorFilter2 == null) {
                    colorFilter2 = this.A0U;
                }
                paint.setColorFilter(colorFilter2);
                float f6 = this.A05 / 2.0f;
                rectF.set(((float) bounds.left) + f6, ((float) bounds.top) + f6, ((float) bounds.right) - f6, ((float) bounds.bottom) - f6);
                float f7 = this.A00 - (this.A05 / 2.0f);
                canvas.drawRoundRect(rectF, f7, f7, paint);
            }
            paint.setColor(this.A0H);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            float f8 = this.A00;
            canvas.drawRoundRect(rectF, f8, f8, paint);
            if (A0R()) {
                A0F(bounds, rectF);
                float f9 = rectF.left;
                float f10 = rectF.top;
                canvas.translate(f9, f10);
                this.A0W.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
                this.A0W.draw(canvas);
                canvas.translate(-f9, -f10);
            }
            if (A0Q()) {
                A0F(bounds, rectF);
                float f11 = rectF.left;
                float f12 = rectF.top;
                canvas.translate(f11, f12);
                this.A0V.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
                this.A0V.draw(canvas);
                canvas.translate(-f11, -f12);
            }
            if (this.A0l && this.A0e != null) {
                PointF pointF = this.A0s;
                pointF.set(0.0f, 0.0f);
                Paint.Align align = Paint.Align.LEFT;
                if (this.A0e != null) {
                    float A002 = A00() + this.A04 + this.A0C;
                    if (C002001d.A07(this) == 0) {
                        pointF.x = ((float) bounds.left) + A002;
                    } else {
                        pointF.x = ((float) bounds.right) - A002;
                        align = Paint.Align.RIGHT;
                    }
                    float centerY = (float) bounds.centerY();
                    TextPaint textPaint = this.A0u;
                    Paint.FontMetrics fontMetrics = this.A0q;
                    textPaint.getFontMetrics(fontMetrics);
                    pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
                }
                rectF.setEmpty();
                if (this.A0e != null) {
                    float A003 = A00() + this.A04 + this.A0C;
                    float A012 = A01() + this.A01 + this.A0B;
                    if (C002001d.A07(this) == 0) {
                        rectF.left = ((float) bounds.left) + A003;
                        rectF.right = ((float) bounds.right) - A012;
                    } else {
                        rectF.left = ((float) bounds.left) + A012;
                        rectF.right = ((float) bounds.right) - A003;
                    }
                    rectF.top = (float) bounds.top;
                    rectF.bottom = (float) bounds.bottom;
                }
                if (this.A0b != null) {
                    TextPaint textPaint2 = this.A0u;
                    textPaint2.drawableState = getState();
                    this.A0b.A01(this.A0p, textPaint2, this.A0v);
                }
                TextPaint textPaint3 = this.A0u;
                textPaint3.setTextAlign(align);
                if (Math.round(A02()) > Math.round(rectF.width())) {
                    z = true;
                    i3 = canvas.save();
                    canvas.clipRect(rectF);
                } else {
                    z = false;
                    i3 = 0;
                }
                CharSequence charSequence = this.A0e;
                if (z && this.A0Y != null) {
                    charSequence = TextUtils.ellipsize(charSequence, textPaint3, rectF.width(), this.A0Y);
                }
                canvas.drawText(charSequence, 0, charSequence.length(), pointF.x, pointF.y, textPaint3);
                if (z) {
                    canvas.restoreToCount(i3);
                }
            }
            if (A0S()) {
                rectF.setEmpty();
                if (A0S()) {
                    float f13 = this.A01 + this.A06;
                    if (C002001d.A07(this) == 0) {
                        float f14 = ((float) bounds.right) - f13;
                        rectF.right = f14;
                        rectF.left = f14 - this.A07;
                    } else {
                        float f15 = ((float) bounds.left) + f13;
                        rectF.left = f15;
                        rectF.right = f15 + this.A07;
                    }
                    float exactCenterY = bounds.exactCenterY();
                    float f16 = this.A07;
                    float f17 = exactCenterY - (f16 / 2.0f);
                    rectF.top = f17;
                    rectF.bottom = f17 + f16;
                }
                float f18 = rectF.left;
                float f19 = rectF.top;
                canvas.translate(f18, f19);
                this.A0X.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
                this.A0X.draw(canvas);
                canvas.translate(-f18, -f19);
            }
            if (this.A0E < 255) {
                canvas.restoreToCount(i2);
            }
        }
    }

    public int getAlpha() {
        return this.A0E;
    }

    public ColorFilter getColorFilter() {
        return this.A0S;
    }

    public int getIntrinsicHeight() {
        return (int) this.A03;
    }

    public int getIntrinsicWidth() {
        float f = this.A04;
        float A022 = A02();
        return Math.min(Math.round(A01() + A022 + A00() + f + this.A0C + this.A0B + this.A01), this.A0K);
    }

    public void getOutline(Outline outline) {
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.A00);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.A03, this.A00);
        }
        outline.setAlpha(((float) this.A0E) / 255.0f);
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004c, code lost:
        if (r1 == false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x005a, code lost:
        if (r1 == false) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
        // Method dump skipped, instructions count: 106
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36761mp.isStateful():boolean");
    }

    public boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (A0R()) {
            onLayoutDirectionChanged |= this.A0W.setLayoutDirection(i);
        }
        if (A0Q()) {
            onLayoutDirectionChanged |= this.A0V.setLayoutDirection(i);
        }
        if (A0S()) {
            onLayoutDirectionChanged |= this.A0X.setLayoutDirection(i);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    public boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (A0R()) {
            onLevelChange |= this.A0W.setLevel(i);
        }
        if (A0Q()) {
            onLevelChange |= this.A0V.setLevel(i);
        }
        if (A0S()) {
            onLevelChange |= this.A0X.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public boolean onStateChange(int[] iArr) {
        return A0T(iArr, this.A0o);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(int i) {
        if (this.A0E != i) {
            this.A0E = i;
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.A0S != colorFilter) {
            this.A0S = colorFilter;
            invalidateSelf();
        }
    }

    @Override // X.AbstractC05200No
    public void setTintList(ColorStateList colorStateList) {
        if (this.A0R != colorStateList) {
            this.A0R = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // X.AbstractC05200No
    public void setTintMode(PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.A0T != mode) {
            this.A0T = mode;
            ColorStateList colorStateList = this.A0R;
            if (colorStateList == null || mode == null) {
                porterDuffColorFilter = null;
            } else {
                porterDuffColorFilter = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            }
            this.A0U = porterDuffColorFilter;
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (A0R()) {
            visible |= this.A0W.setVisible(z, z2);
        }
        if (A0Q()) {
            visible |= this.A0V.setVisible(z, z2);
        }
        if (A0S()) {
            visible |= this.A0X.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
