package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import com.google.android.search.verification.client.R;

/* renamed from: X.26x  reason: invalid class name and case insensitive filesystem */
public class C459026x extends C29581Zk {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public ColorStateList A04;
    public PorterDuff.Mode A05;
    public Drawable A06;
    public final AnonymousClass1DL A07;

    public C459026x(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialButtonStyle);
        int i;
        Drawable insetDrawable;
        TypedArray A002 = C08040aN.A00(context, attributeSet, C08030aM.A0c, R.attr.materialButtonStyle, 2131952418, new int[0]);
        this.A02 = A002.getDimensionPixelSize(9, 0);
        this.A05 = C008805h.A0A(A002.getInt(12, -1), PorterDuff.Mode.SRC_IN);
        this.A04 = C008805h.A08(getContext(), A002, 11);
        this.A06 = C008805h.A0B(getContext(), A002, 7);
        this.A00 = A002.getInteger(8, 1);
        this.A03 = A002.getDimensionPixelSize(10, 0);
        AnonymousClass1DL r6 = new AnonymousClass1DL(this);
        this.A07 = r6;
        r6.A02 = A002.getDimensionPixelOffset(0, 0);
        r6.A03 = A002.getDimensionPixelOffset(1, 0);
        r6.A04 = A002.getDimensionPixelOffset(2, 0);
        r6.A01 = A002.getDimensionPixelOffset(3, 0);
        r6.A00 = A002.getDimensionPixelSize(6, 0);
        r6.A05 = A002.getDimensionPixelSize(15, 0);
        r6.A09 = C008805h.A0A(A002.getInt(5, -1), PorterDuff.Mode.SRC_IN);
        C459026x r5 = r6.A0L;
        r6.A06 = C008805h.A08(r5.getContext(), A002, 4);
        r6.A08 = C008805h.A08(r5.getContext(), A002, 14);
        r6.A07 = C008805h.A08(r5.getContext(), A002, 13);
        Paint paint = r6.A0I;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth((float) r6.A05);
        ColorStateList colorStateList = r6.A08;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(r5.getDrawableState(), 0);
        } else {
            i = 0;
        }
        paint.setColor(i);
        int A072 = AnonymousClass0Q7.A07(r5);
        int paddingTop = r5.getPaddingTop();
        int A062 = AnonymousClass0Q7.A06(r5);
        int paddingBottom = r5.getPaddingBottom();
        if (AnonymousClass1DL.A0M) {
            insetDrawable = r6.A00();
        } else {
            GradientDrawable gradientDrawable = new GradientDrawable();
            r6.A0D = gradientDrawable;
            gradientDrawable.setCornerRadius(((float) r6.A00) + 1.0E-5f);
            r6.A0D.setColor(-1);
            Drawable A0d = C002001d.A0d(r6.A0D);
            r6.A0A = A0d;
            C002001d.A2b(A0d, r6.A06);
            PorterDuff.Mode mode = r6.A09;
            if (mode != null) {
                C002001d.A2c(r6.A0A, mode);
            }
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            r6.A0F = gradientDrawable2;
            gradientDrawable2.setCornerRadius(((float) r6.A00) + 1.0E-5f);
            r6.A0F.setColor(-1);
            Drawable A0d2 = C002001d.A0d(r6.A0F);
            r6.A0B = A0d2;
            C002001d.A2b(A0d2, r6.A07);
            insetDrawable = new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{r6.A0A, r6.A0B}), r6.A02, r6.A04, r6.A03, r6.A01);
        }
        super.setBackgroundDrawable(insetDrawable);
        AnonymousClass0Q7.A0Z(r5, A072 + r6.A02, paddingTop + r6.A04, A062 + r6.A03, paddingBottom + r6.A01);
        A002.recycle();
        setCompoundDrawablePadding(this.A02);
        A00();
    }

    public final void A00() {
        Drawable drawable = this.A06;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.A06 = mutate;
            C002001d.A2b(mutate, this.A04);
            PorterDuff.Mode mode = this.A05;
            if (mode != null) {
                C002001d.A2c(this.A06, mode);
            }
            int i = this.A03;
            if (i == 0) {
                i = this.A06.getIntrinsicWidth();
            }
            int i2 = this.A03;
            if (i2 == 0) {
                i2 = this.A06.getIntrinsicHeight();
            }
            Drawable drawable2 = this.A06;
            int i3 = this.A01;
            drawable2.setBounds(i3, 0, i + i3, i2);
        }
        AnonymousClass0N2.A1N(this, this.A06, null, null, null);
    }

    public final boolean A01() {
        AnonymousClass1DL r0 = this.A07;
        return r0 != null && !r0.A0H;
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (A01()) {
            return this.A07.A00;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.A06;
    }

    public int getIconGravity() {
        return this.A00;
    }

    public int getIconPadding() {
        return this.A02;
    }

    public int getIconSize() {
        return this.A03;
    }

    public ColorStateList getIconTint() {
        return this.A04;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.A05;
    }

    public ColorStateList getRippleColor() {
        if (A01()) {
            return this.A07.A07;
        }
        return null;
    }

    public ColorStateList getStrokeColor() {
        if (A01()) {
            return this.A07.A08;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (A01()) {
            return this.A07.A05;
        }
        return 0;
    }

    @Override // X.C29581Zk, X.AbstractC05570Pf
    public ColorStateList getSupportBackgroundTintList() {
        if (A01()) {
            return this.A07.A06;
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // X.C29581Zk, X.AbstractC05570Pf
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (A01()) {
            return this.A07.A09;
        }
        return super.getSupportBackgroundTintMode();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (Build.VERSION.SDK_INT < 21 && A01()) {
            AnonymousClass1DL r4 = this.A07;
            if (r4 == null) {
                throw null;
            } else if (canvas != null && r4.A08 != null && r4.A05 > 0) {
                Rect rect = r4.A0J;
                rect.set(r4.A0L.getBackground().getBounds());
                RectF rectF = r4.A0K;
                float f = (float) rect.left;
                float f2 = ((float) r4.A05) / 2.0f;
                rectF.set(f + f2 + ((float) r4.A02), ((float) rect.top) + f2 + ((float) r4.A04), (((float) rect.right) - f2) - ((float) r4.A03), (((float) rect.bottom) - f2) - ((float) r4.A01));
                float f3 = ((float) r4.A00) - (((float) r4.A05) / 2.0f);
                canvas.drawRoundRect(rectF, f3, f3, r4.A0I);
            }
        }
    }

    @Override // X.C29581Zk
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AnonymousClass1DL r4;
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT == 21 && (r4 = this.A07) != null) {
            int i5 = i4 - i2;
            int i6 = i3 - i;
            GradientDrawable gradientDrawable = r4.A0E;
            if (gradientDrawable != null) {
                gradientDrawable.setBounds(r4.A02, r4.A04, i6 - r4.A03, i5 - r4.A01);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A06 != null && this.A00 == 2) {
            int measureText = (int) getPaint().measureText(getText().toString());
            int i3 = this.A03;
            if (i3 == 0) {
                i3 = this.A06.getIntrinsicWidth();
            }
            int measuredWidth = (((((getMeasuredWidth() - measureText) - AnonymousClass0Q7.A06(this)) - i3) - this.A02) - AnonymousClass0Q7.A07(this)) / 2;
            if (AnonymousClass0Q7.A05(this) == 1) {
                measuredWidth = -measuredWidth;
            }
            if (this.A01 != measuredWidth) {
                this.A01 = measuredWidth;
                A00();
            }
        }
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i) {
        GradientDrawable gradientDrawable;
        GradientDrawable gradientDrawable2;
        if (A01()) {
            AnonymousClass1DL r2 = this.A07;
            if (r2 != null) {
                boolean z = AnonymousClass1DL.A0M;
                if (z && (gradientDrawable2 = r2.A0C) != null) {
                    gradientDrawable2.setColor(i);
                } else if (!z && (gradientDrawable = r2.A0D) != null) {
                    gradientDrawable.setColor(i);
                }
            } else {
                throw null;
            }
        } else {
            super.setBackgroundColor(i);
        }
    }

    @Override // X.C29581Zk
    public void setBackgroundDrawable(Drawable drawable) {
        if (!A01()) {
            super.setBackgroundDrawable(drawable);
        } else if (drawable != getBackground()) {
            Log.i("MaterialButton", "Setting a custom background is not supported.");
            AnonymousClass1DL r2 = this.A07;
            r2.A0H = true;
            C459026x r1 = r2.A0L;
            r1.setSupportBackgroundTintList(r2.A06);
            r1.setSupportBackgroundTintMode(r2.A09);
            super.setBackgroundDrawable(drawable);
        } else {
            getBackground().setState(drawable.getState());
        }
    }

    @Override // X.C29581Zk
    public void setBackgroundResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = AnonymousClass05p.A01(getContext(), i);
        } else {
            drawable = null;
        }
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setCornerRadius(int r9) {
        /*
        // Method dump skipped, instructions count: 164
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C459026x.setCornerRadius(int):void");
    }

    public void setCornerRadiusResource(int i) {
        if (A01()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.A06 != drawable) {
            this.A06 = drawable;
            A00();
        }
    }

    public void setIconGravity(int i) {
        this.A00 = i;
    }

    public void setIconPadding(int i) {
        if (this.A02 != i) {
            this.A02 = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = AnonymousClass05p.A01(getContext(), i);
        } else {
            drawable = null;
        }
        setIcon(drawable);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.A03 != i) {
            this.A03 = i;
            A00();
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.A04 != colorStateList) {
            this.A04 = colorStateList;
            A00();
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.A05 != mode) {
            this.A05 = mode;
            A00();
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(AnonymousClass05p.A00(getContext(), i));
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        Drawable drawable;
        if (A01()) {
            AnonymousClass1DL r3 = this.A07;
            if (r3.A07 != colorStateList) {
                r3.A07 = colorStateList;
                boolean z = AnonymousClass1DL.A0M;
                if (z) {
                    C459026x r1 = r3.A0L;
                    if (r1.getBackground() instanceof RippleDrawable) {
                        ((RippleDrawable) r1.getBackground()).setColor(colorStateList);
                        return;
                    }
                }
                if (!z && (drawable = r3.A0B) != null) {
                    C002001d.A2b(drawable, colorStateList);
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (A01()) {
            setRippleColor(AnonymousClass05p.A00(getContext(), i));
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (A01()) {
            AnonymousClass1DL r3 = this.A07;
            if (r3.A08 != colorStateList) {
                r3.A08 = colorStateList;
                Paint paint = r3.A0I;
                int i = 0;
                if (colorStateList != null) {
                    i = colorStateList.getColorForState(r3.A0L.getDrawableState(), 0);
                }
                paint.setColor(i);
                boolean z = AnonymousClass1DL.A0M;
                if (z && r3.A0G != null) {
                    super.setBackgroundDrawable(r3.A00());
                } else if (!z) {
                    r3.A0L.invalidate();
                }
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (A01()) {
            setStrokeColor(AnonymousClass05p.A00(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (A01()) {
            AnonymousClass1DL r2 = this.A07;
            if (r2.A05 != i) {
                r2.A05 = i;
                r2.A0I.setStrokeWidth((float) i);
                boolean z = AnonymousClass1DL.A0M;
                if (z && r2.A0G != null) {
                    super.setBackgroundDrawable(r2.A00());
                } else if (!z) {
                    r2.A0L.invalidate();
                }
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (A01()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // X.C29581Zk, X.AbstractC05570Pf
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (A01()) {
            AnonymousClass1DL r1 = this.A07;
            if (r1.A06 != colorStateList) {
                r1.A06 = colorStateList;
                if (AnonymousClass1DL.A0M) {
                    r1.A01();
                    return;
                }
                Drawable drawable = r1.A0A;
                if (drawable != null) {
                    C002001d.A2b(drawable, colorStateList);
                }
            }
        } else if (this.A07 != null) {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // X.C29581Zk, X.AbstractC05570Pf
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (A01()) {
            AnonymousClass1DL r1 = this.A07;
            if (r1.A09 != mode) {
                r1.A09 = mode;
                if (AnonymousClass1DL.A0M) {
                    r1.A01();
                    return;
                }
                Drawable drawable = r1.A0A;
                if (drawable != null && mode != null) {
                    C002001d.A2c(drawable, mode);
                }
            }
        } else if (this.A07 != null) {
            super.setSupportBackgroundTintMode(mode);
        }
    }
}
