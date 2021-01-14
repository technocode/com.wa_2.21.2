package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton$Behavior;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;
import java.util.Iterator;

@CoordinatorLayout.DefaultBehavior(FloatingActionButton$Behavior.class)
/* renamed from: X.0aJ  reason: invalid class name and case insensitive filesystem */
public class C08000aJ extends C08010aK implements AbstractC05570Pf, AnonymousClass0W8, AbstractC08020aL {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public ColorStateList A05;
    public ColorStateList A06;
    public ColorStateList A07;
    public PorterDuff.Mode A08;
    public PorterDuff.Mode A09;
    public C08120aV A0A;
    public boolean A0B;
    public final Rect A0C = new Rect();
    public final Rect A0D = new Rect();
    public final C08080aR A0E;
    public final C08090aS A0F;

    public C08000aJ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.floatingActionButtonStyle);
        TypedArray A002 = C08040aN.A00(context, attributeSet, C08030aM.A0T, R.attr.floatingActionButtonStyle, 2131952407, new int[0]);
        this.A05 = C008805h.A08(context, A002, 1);
        this.A08 = C008805h.A0A(A002.getInt(2, -1), null);
        this.A07 = C008805h.A08(context, A002, 11);
        this.A04 = A002.getInt(6, -1);
        this.A01 = A002.getDimensionPixelSize(5, 0);
        this.A00 = A002.getDimensionPixelSize(3, 0);
        float dimension = A002.getDimension(4, 0.0f);
        float dimension2 = A002.getDimension(8, 0.0f);
        float dimension3 = A002.getDimension(10, 0.0f);
        this.A0B = A002.getBoolean(13, false);
        this.A03 = A002.getDimensionPixelSize(9, 0);
        C08050aO A012 = C08050aO.A01(context, A002, 12);
        C08050aO A013 = C08050aO.A01(context, A002, 7);
        A002.recycle();
        C08080aR r0 = new C08080aR(this);
        this.A0E = r0;
        r0.A02(attributeSet, R.attr.floatingActionButtonStyle);
        this.A0F = new C08090aS(this);
        getImpl().A0D(this.A05, this.A08, this.A07, this.A00);
        C08120aV impl = getImpl();
        if (impl.A00 != dimension) {
            impl.A00 = dimension;
            impl.A0A(dimension, impl.A01, impl.A03);
        }
        C08120aV impl2 = getImpl();
        if (impl2.A01 != dimension2) {
            impl2.A01 = dimension2;
            impl2.A0A(impl2.A00, dimension2, impl2.A03);
        }
        C08120aV impl3 = getImpl();
        if (impl3.A03 != dimension3) {
            impl3.A03 = dimension3;
            impl3.A0A(impl3.A00, impl3.A01, dimension3);
        }
        C08120aV impl4 = getImpl();
        int i = this.A03;
        if (impl4.A06 != i) {
            impl4.A06 = i;
            impl4.A09(impl4.A02);
        }
        getImpl().A0F = A012;
        getImpl().A0E = A013;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public static int A00(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i, size);
        }
        if (mode == 0) {
            return i;
        }
        if (mode == 1073741824) {
            return size;
        }
        throw new IllegalArgumentException();
    }

    public final int A02(int i) {
        int i2 = this.A01;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i != -1) {
            if (i != 1) {
                return resources.getDimensionPixelSize(R.dimen.design_fab_size_normal);
            }
            return resources.getDimensionPixelSize(R.dimen.design_fab_size_mini);
        } else if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
            return A02(1);
        } else {
            return A02(0);
        }
    }

    public final void A03() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.A06;
            if (colorStateList == null) {
                C002001d.A2W(drawable);
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            PorterDuff.Mode mode = this.A09;
            if (mode == null) {
                mode = PorterDuff.Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(C06340Sv.A00(colorForState, mode));
        }
    }

    public void A04(boolean z) {
        C08120aV impl = getImpl();
        C08010aK r2 = impl.A0P;
        if (r2.getVisibility() == 0) {
            if (impl.A05 == 1) {
                return;
            }
        } else if (impl.A05 != 2) {
            return;
        }
        Animator animator = impl.A07;
        if (animator != null) {
            animator.cancel();
        }
        if (!AnonymousClass0Q7.A0j(r2) || r2.isInEditMode()) {
            int i = 4;
            if (z) {
                i = 8;
            }
            r2.A00(i, z);
            return;
        }
        C08050aO r1 = impl.A0E;
        if (r1 == null && (r1 = impl.A0C) == null) {
            r1 = C08050aO.A00(r2.getContext(), R.animator.design_fab_hide_motion_spec);
            impl.A0C = r1;
        }
        AnimatorSet A022 = impl.A02(r1, 0.0f, 0.0f, 0.0f);
        A022.addListener(new AnonymousClass1DY(impl, z));
        ArrayList arrayList = impl.A0I;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                A022.addListener((Animator.AnimatorListener) it.next());
            }
        }
        A022.start();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        if (r4.isInEditMode() != false) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(boolean r6) {
        /*
        // Method dump skipped, instructions count: 146
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08000aJ.A05(boolean):void");
    }

    @Override // X.AbstractC08020aL
    public boolean AB2() {
        return this.A0F.A01;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().A0G(getDrawableState());
    }

    public ColorStateList getBackgroundTintList() {
        return this.A05;
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return this.A08;
    }

    public float getCompatElevation() {
        return getImpl().A01();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().A01;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().A03;
    }

    public Drawable getContentBackground() {
        return getImpl().A08;
    }

    public int getCustomSize() {
        return this.A01;
    }

    public int getExpandedComponentIdHint() {
        return this.A0F.A00;
    }

    public C08050aO getHideMotionSpec() {
        return getImpl().A0E;
    }

    private C08120aV getImpl() {
        C08120aV r1 = this.A0A;
        if (r1 == null) {
            if (Build.VERSION.SDK_INT >= 21) {
                r1 = new C36781ms(this, new C08100aT(this));
            } else {
                r1 = new C08120aV(this, new C08100aT(this));
            }
            this.A0A = r1;
        }
        return r1;
    }

    public int getRippleColor() {
        ColorStateList colorStateList = this.A07;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.A07;
    }

    public C08050aO getShowMotionSpec() {
        return getImpl().A0F;
    }

    public int getSize() {
        return this.A04;
    }

    public int getSizeDimension() {
        return A02(this.A04);
    }

    @Override // X.AbstractC05570Pf
    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    @Override // X.AbstractC05570Pf
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    @Override // X.AnonymousClass0W8
    public ColorStateList getSupportImageTintList() {
        return this.A06;
    }

    @Override // X.AnonymousClass0W8
    public PorterDuff.Mode getSupportImageTintMode() {
        return this.A09;
    }

    public boolean getUseCompatPadding() {
        return this.A0B;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().A06();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C08120aV impl = getImpl();
        if (impl.A0H()) {
            if (impl.A0B == null) {
                impl.A0B = new ViewTreeObserver$OnPreDrawListenerC09000c7(impl);
            }
            impl.A0P.getViewTreeObserver().addOnPreDrawListener(impl.A0B);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C08120aV impl = getImpl();
        if (impl.A0B != null) {
            impl.A0P.getViewTreeObserver().removeOnPreDrawListener(impl.A0B);
            impl.A0B = null;
        }
    }

    public void onMeasure(int i, int i2) {
        int A022 = A02(this.A04);
        this.A02 = (A022 - this.A03) >> 1;
        getImpl().A08();
        int min = Math.min(A00(A022, i), A00(A022, i2));
        Rect rect = this.A0C;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C36911n8)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C36911n8 r5 = (C36911n8) parcelable;
        super.onRestoreInstanceState(((AbstractC15200nf) r5).A00);
        C08090aS r3 = this.A0F;
        Bundle bundle = (Bundle) r5.A00.getOrDefault("expandableWidgetHelper", null);
        if (r3 != null) {
            r3.A01 = bundle.getBoolean("expanded", false);
            r3.A00 = bundle.getInt("expandedComponentIdHint", 0);
            if (r3.A01) {
                View view = r3.A02;
                ViewParent parent = view.getParent();
                if (parent instanceof CoordinatorLayout) {
                    ((CoordinatorLayout) parent).A0A(view);
                    return;
                }
                return;
            }
            return;
        }
        throw null;
    }

    public Parcelable onSaveInstanceState() {
        C36911n8 r5 = new C36911n8(super.onSaveInstanceState());
        AnonymousClass05W r4 = r5.A00;
        C08090aS r3 = this.A0F;
        if (r3 != null) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("expanded", r3.A01);
            bundle.putInt("expandedComponentIdHint", r3.A00);
            r4.put("expandableWidgetHelper", bundle);
            return r5;
        }
        throw null;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (motionEvent.getAction() == 0) {
            Rect rect = this.A0D;
            if (AnonymousClass0Q7.A0j(this)) {
                rect.set(0, 0, getWidth(), getHeight());
                int i = rect.left;
                Rect rect2 = this.A0C;
                rect.left = i + rect2.left;
                rect.top += rect2.top;
                rect.right -= rect2.right;
                rect.bottom -= rect2.bottom;
                z = true;
            } else {
                z = false;
            }
            if (z && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.A05 != colorStateList) {
            this.A05 = colorStateList;
            C08120aV impl = getImpl();
            Drawable drawable = impl.A0A;
            if (drawable != null) {
                C002001d.A2b(drawable, colorStateList);
            }
            C08230ag r2 = impl.A0G;
            if (r2 != null) {
                if (colorStateList != null) {
                    r2.A04 = colorStateList.getColorForState(r2.getState(), r2.A04);
                }
                r2.A07 = colorStateList;
                r2.A08 = true;
                r2.invalidateSelf();
            }
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.A08 != mode) {
            this.A08 = mode;
            Drawable drawable = getImpl().A0A;
            if (drawable != null) {
                C002001d.A2c(drawable, mode);
            }
        }
    }

    public void setCompatElevation(float f) {
        C08120aV impl = getImpl();
        if (impl.A00 != f) {
            impl.A00 = f;
            impl.A0A(f, impl.A01, impl.A03);
        }
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        C08120aV impl = getImpl();
        if (impl.A01 != f) {
            impl.A01 = f;
            impl.A0A(impl.A00, f, impl.A03);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        C08120aV impl = getImpl();
        if (impl.A03 != f) {
            impl.A03 = f;
            impl.A0A(impl.A00, impl.A01, f);
        }
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i >= 0) {
            this.A01 = i;
            return;
        }
        throw new IllegalArgumentException("Custom size must be non-negative");
    }

    public void setExpandedComponentIdHint(int i) {
        this.A0F.A00 = i;
    }

    public void setHideMotionSpec(C08050aO r2) {
        getImpl().A0E = r2;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C08050aO.A00(getContext(), i));
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C08120aV impl = getImpl();
        impl.A09(impl.A02);
    }

    public void setImageResource(int i) {
        this.A0E.A01(i);
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.A07 != colorStateList) {
            this.A07 = colorStateList;
            getImpl().A0C(this.A07);
        }
    }

    public void setShowMotionSpec(C08050aO r2) {
        getImpl().A0F = r2;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C08050aO.A00(getContext(), i));
    }

    public void setSize(int i) {
        this.A01 = 0;
        if (i != this.A04) {
            this.A04 = i;
            requestLayout();
        }
    }

    @Override // X.AbstractC05570Pf
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    @Override // X.AbstractC05570Pf
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    @Override // X.AnonymousClass0W8
    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.A06 != colorStateList) {
            this.A06 = colorStateList;
            A03();
        }
    }

    @Override // X.AnonymousClass0W8
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.A09 != mode) {
            this.A09 = mode;
            A03();
        }
    }

    public void setUseCompatPadding(boolean z) {
        if (this.A0B != z) {
            this.A0B = z;
            getImpl().A07();
        }
    }
}
