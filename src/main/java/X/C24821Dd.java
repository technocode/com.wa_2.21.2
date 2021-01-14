package X;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.view.View;

/* renamed from: X.1Dd  reason: invalid class name and case insensitive filesystem */
public final class C24821Dd {
    public static final boolean A0j;
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05 = 15.0f;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public float A0A;
    public float A0B;
    public float A0C;
    public float A0D;
    public float A0E;
    public float A0F = 15.0f;
    public float A0G;
    public float A0H;
    public float A0I;
    public int A0J;
    public int A0K = 16;
    public int A0L;
    public int A0M = 16;
    public TimeInterpolator A0N;
    public TimeInterpolator A0O;
    public ColorStateList A0P;
    public ColorStateList A0Q;
    public Bitmap A0R;
    public Paint A0S;
    public Typeface A0T;
    public Typeface A0U;
    public Typeface A0V;
    public CharSequence A0W;
    public CharSequence A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public int[] A0c;
    public final Rect A0d;
    public final Rect A0e;
    public final RectF A0f;
    public final TextPaint A0g;
    public final TextPaint A0h;
    public final View A0i;

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT < 18) {
            z = true;
        }
        A0j = z;
    }

    public C24821Dd(View view) {
        this.A0i = view;
        TextPaint textPaint = new TextPaint(129);
        this.A0g = textPaint;
        this.A0h = new TextPaint(textPaint);
        this.A0d = new Rect();
        this.A0e = new Rect();
        this.A0f = new RectF();
    }

    public static int A00(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((((float) Color.alpha(i2)) * f) + (((float) Color.alpha(i)) * f2)), (int) ((((float) Color.red(i2)) * f) + (((float) Color.red(i)) * f2)), (int) ((((float) Color.green(i2)) * f) + (((float) Color.green(i)) * f2)), (int) ((((float) Color.blue(i2)) * f) + (((float) Color.blue(i)) * f2)));
    }

    public static boolean A01(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    public float A02() {
        if (this.A0W == null) {
            return 0.0f;
        }
        TextPaint textPaint = this.A0h;
        textPaint.setTextSize(this.A05);
        textPaint.setTypeface(this.A0T);
        CharSequence charSequence = this.A0W;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public float A03() {
        TextPaint textPaint = this.A0h;
        textPaint.setTextSize(this.A05);
        textPaint.setTypeface(this.A0T);
        return -textPaint.ascent();
    }

    public int A04() {
        int[] iArr = this.A0c;
        if (iArr != null) {
            return this.A0P.getColorForState(iArr, 0);
        }
        return this.A0P.getDefaultColor();
    }

    public final Typeface A05(int i) {
        TypedArray obtainStyledAttributes = this.A0i.getContext().obtainStyledAttributes(i, new int[]{16843692});
        try {
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                return Typeface.create(string, 0);
            }
            obtainStyledAttributes.recycle();
            return null;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r1.height() <= 0) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06() {
        /*
            r2 = this;
            android.graphics.Rect r1 = r2.A0d
            int r0 = r1.width()
            if (r0 <= 0) goto L_0x001d
            int r0 = r1.height()
            if (r0 <= 0) goto L_0x001d
            android.graphics.Rect r1 = r2.A0e
            int r0 = r1.width()
            if (r0 <= 0) goto L_0x001d
            int r1 = r1.height()
            r0 = 1
            if (r1 > 0) goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            r2.A0Z = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24821Dd.A06():void");
    }

    public void A07() {
        float f;
        Rect rect;
        Rect rect2;
        View view = this.A0i;
        if (view.getHeight() > 0 && view.getWidth() > 0) {
            float f2 = this.A08;
            A0A(this.A05);
            CharSequence charSequence = this.A0X;
            float f3 = 0.0f;
            if (charSequence != null) {
                f = this.A0g.measureText(charSequence, 0, charSequence.length());
            } else {
                f = 0.0f;
            }
            int A032 = AnonymousClass0N2.A03(this.A0K, this.A0a ? 1 : 0);
            int i = A032 & 112;
            if (i == 48) {
                rect = this.A0d;
                this.A01 = ((float) rect.top) - this.A0g.ascent();
            } else if (i != 80) {
                TextPaint textPaint = this.A0g;
                float descent = ((textPaint.descent() - textPaint.ascent()) / 2.0f) - textPaint.descent();
                rect = this.A0d;
                this.A01 = ((float) rect.centerY()) + descent;
            } else {
                rect = this.A0d;
                this.A01 = (float) rect.bottom;
            }
            int i2 = A032 & 8388615;
            if (i2 == 1) {
                this.A00 = ((float) rect.centerX()) - (f / 2.0f);
            } else if (i2 != 5) {
                this.A00 = (float) rect.left;
            } else {
                this.A00 = ((float) rect.right) - f;
            }
            A0A(this.A0F);
            CharSequence charSequence2 = this.A0X;
            if (charSequence2 != null) {
                f3 = this.A0g.measureText(charSequence2, 0, charSequence2.length());
            }
            int A033 = AnonymousClass0N2.A03(this.A0M, this.A0a ? 1 : 0);
            int i3 = A033 & 112;
            if (i3 == 48) {
                rect2 = this.A0e;
                this.A0A = ((float) rect2.top) - this.A0g.ascent();
            } else if (i3 != 80) {
                TextPaint textPaint2 = this.A0g;
                float descent2 = ((textPaint2.descent() - textPaint2.ascent()) / 2.0f) - textPaint2.descent();
                rect2 = this.A0e;
                this.A0A = ((float) rect2.centerY()) + descent2;
            } else {
                rect2 = this.A0e;
                this.A0A = (float) rect2.bottom;
            }
            int i4 = A033 & 8388615;
            if (i4 == 1) {
                this.A09 = ((float) rect2.centerX()) - (f3 / 2.0f);
            } else if (i4 != 5) {
                this.A09 = (float) rect2.left;
            } else {
                this.A09 = ((float) rect2.right) - f3;
            }
            Bitmap bitmap = this.A0R;
            if (bitmap != null) {
                bitmap.recycle();
                this.A0R = null;
            }
            A0B(f2);
            A09(this.A0B);
        }
    }

    public void A08(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f != this.A0B) {
            this.A0B = f;
            A09(f);
        }
    }

    public final void A09(float f) {
        TextPaint textPaint;
        int defaultColor;
        RectF rectF = this.A0f;
        Rect rect = this.A0e;
        float f2 = (float) rect.left;
        Rect rect2 = this.A0d;
        float f3 = (float) rect2.left;
        TimeInterpolator timeInterpolator = this.A0N;
        float f4 = f;
        if (timeInterpolator != null) {
            f4 = timeInterpolator.getInterpolation(f);
        }
        rectF.left = ((f3 - f2) * f4) + f2;
        float f5 = this.A0A;
        float f6 = this.A01;
        TimeInterpolator timeInterpolator2 = this.A0N;
        float f7 = f;
        if (timeInterpolator2 != null) {
            f7 = timeInterpolator2.getInterpolation(f);
        }
        rectF.top = ((f6 - f5) * f7) + f5;
        float f8 = (float) rect.right;
        float f9 = (float) rect2.right;
        TimeInterpolator timeInterpolator3 = this.A0N;
        float f10 = f;
        if (timeInterpolator3 != null) {
            f10 = timeInterpolator3.getInterpolation(f);
        }
        rectF.right = ((f9 - f8) * f10) + f8;
        float f11 = (float) rect.bottom;
        float f12 = (float) rect2.bottom;
        TimeInterpolator timeInterpolator4 = this.A0N;
        float f13 = f;
        if (timeInterpolator4 != null) {
            f13 = timeInterpolator4.getInterpolation(f);
        }
        rectF.bottom = ((f12 - f11) * f13) + f11;
        float f14 = this.A09;
        float f15 = this.A00;
        TimeInterpolator timeInterpolator5 = this.A0N;
        float f16 = f;
        if (timeInterpolator5 != null) {
            f16 = timeInterpolator5.getInterpolation(f);
        }
        this.A06 = ((f15 - f14) * f16) + f14;
        float f17 = this.A0A;
        float f18 = this.A01;
        TimeInterpolator timeInterpolator6 = this.A0N;
        float f19 = f;
        if (timeInterpolator6 != null) {
            f19 = timeInterpolator6.getInterpolation(f);
        }
        this.A07 = ((f18 - f17) * f19) + f17;
        float f20 = this.A0F;
        float f21 = this.A05;
        TimeInterpolator timeInterpolator7 = this.A0O;
        float f22 = f;
        if (timeInterpolator7 != null) {
            f22 = timeInterpolator7.getInterpolation(f);
        }
        A0B(((f21 - f20) * f22) + f20);
        ColorStateList colorStateList = this.A0P;
        ColorStateList colorStateList2 = this.A0Q;
        if (colorStateList != colorStateList2) {
            textPaint = this.A0g;
            int[] iArr = this.A0c;
            if (iArr != null) {
                defaultColor = colorStateList2.getColorForState(iArr, 0);
            } else {
                defaultColor = colorStateList2.getDefaultColor();
            }
            textPaint.setColor(A00(defaultColor, A04(), f));
        } else {
            textPaint = this.A0g;
            textPaint.setColor(A04());
        }
        float f23 = this.A0E;
        float f24 = this.A04;
        TimeInterpolator timeInterpolator8 = null;
        float f25 = f;
        if (0 != 0) {
            f25 = timeInterpolator8.getInterpolation(f);
        }
        float f26 = ((f24 - f23) * f25) + f23;
        float f27 = this.A0C;
        float f28 = this.A02;
        float f29 = f;
        if (0 != 0) {
            f29 = timeInterpolator8.getInterpolation(f);
        }
        float f30 = ((f28 - f27) * f29) + f27;
        float f31 = this.A0D;
        float f32 = this.A03;
        float f33 = f;
        if (0 != 0) {
            f33 = timeInterpolator8.getInterpolation(f);
        }
        textPaint.setShadowLayer(f26, f30, ((f32 - f31) * f33) + f31, A00(this.A0L, this.A0J, f));
        this.A0i.postInvalidateOnAnimation();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0046, code lost:
        if (r1 != false) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A(float r11) {
        /*
        // Method dump skipped, instructions count: 198
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24821Dd.A0A(float):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r9.A0G == 1.0f) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B(float r10) {
        /*
        // Method dump skipped, instructions count: 135
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24821Dd.A0B(float):void");
    }

    public void A0C(int i) {
        Context context = this.A0i.getContext();
        AnonymousClass0TL r1 = new AnonymousClass0TL(context, context.obtainStyledAttributes(i, AnonymousClass0T3.A0b));
        TypedArray typedArray = r1.A02;
        if (typedArray.hasValue(3)) {
            this.A0P = r1.A01(3);
        }
        if (typedArray.hasValue(0)) {
            this.A05 = (float) typedArray.getDimensionPixelSize(0, (int) this.A05);
        }
        this.A0J = typedArray.getInt(6, 0);
        this.A02 = typedArray.getFloat(7, 0.0f);
        this.A03 = typedArray.getFloat(8, 0.0f);
        this.A04 = typedArray.getFloat(9, 0.0f);
        typedArray.recycle();
        this.A0T = A05(i);
        A07();
    }

    public void A0D(int i) {
        Context context = this.A0i.getContext();
        AnonymousClass0TL r1 = new AnonymousClass0TL(context, context.obtainStyledAttributes(i, AnonymousClass0T3.A0b));
        TypedArray typedArray = r1.A02;
        if (typedArray.hasValue(3)) {
            this.A0Q = r1.A01(3);
        }
        if (typedArray.hasValue(0)) {
            this.A0F = (float) typedArray.getDimensionPixelSize(0, (int) this.A0F);
        }
        this.A0L = typedArray.getInt(6, 0);
        this.A0C = typedArray.getFloat(7, 0.0f);
        this.A0D = typedArray.getFloat(8, 0.0f);
        this.A0E = typedArray.getFloat(9, 0.0f);
        typedArray.recycle();
        this.A0V = A05(i);
        A07();
    }

    public void A0E(ColorStateList colorStateList) {
        if (this.A0P != colorStateList) {
            this.A0P = colorStateList;
            A07();
        }
    }

    public void A0F(Canvas canvas) {
        boolean z;
        int save = canvas.save();
        if (this.A0X != null && this.A0Z) {
            float f = this.A06;
            float f2 = this.A07;
            if (!this.A0b || this.A0R == null) {
                z = false;
                TextPaint textPaint = this.A0g;
                textPaint.ascent();
                textPaint.descent();
            } else {
                z = true;
                f2 += this.A0H * this.A0G;
            }
            float f3 = this.A0G;
            if (f3 != 1.0f) {
                canvas.scale(f3, f3, f, f2);
            }
            if (z) {
                canvas.drawBitmap(this.A0R, f, f2, this.A0S);
            } else {
                CharSequence charSequence = this.A0X;
                canvas.drawText(charSequence, 0, charSequence.length(), f, f2, this.A0g);
            }
        }
        canvas.restoreToCount(save);
    }

    public void A0G(CharSequence charSequence) {
        if (charSequence == null || !charSequence.equals(this.A0W)) {
            this.A0W = charSequence;
            this.A0X = null;
            Bitmap bitmap = this.A0R;
            if (bitmap != null) {
                bitmap.recycle();
                this.A0R = null;
            }
            A07();
        }
    }
}
