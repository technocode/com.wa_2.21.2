package androidx.appcompat.widget;

import X.AbstractC05570Pf;
import X.AbstractC13270jv;
import X.AbstractView$OnTouchListenerC13300jz;
import X.AnonymousClass05p;
import X.AnonymousClass0ZW;
import X.C13210jp;
import X.C13260ju;
import X.ViewTreeObserver$OnGlobalLayoutListenerC13200jo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.google.android.search.verification.client.R;

public class AppCompatSpinner extends Spinner implements AbstractC05570Pf {
    public static final int[] A08 = {16843505};
    public int A00;
    public SpinnerAdapter A01;
    public AbstractC13270jv A02;
    public AbstractView$OnTouchListenerC13300jz A03;
    public final Context A04;
    public final Rect A05;
    public final AnonymousClass0ZW A06;
    public final boolean A07;

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.spinnerStyle);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003f, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0040, code lost:
        r5 = null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppCompatSpinner(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
        // Method dump skipped, instructions count: 202
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public int A00(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        Rect rect = this.A05;
        drawable.getPadding(rect);
        return i2 + rect.left + rect.right;
    }

    public void A01() {
        if (Build.VERSION.SDK_INT >= 17) {
            this.A02.APg(getTextDirection(), getTextAlignment());
        } else {
            this.A02.APg(-1, -1);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        AnonymousClass0ZW r0 = this.A06;
        if (r0 != null) {
            r0.A02();
        }
    }

    public int getDropDownHorizontalOffset() {
        AbstractC13270jv r0 = this.A02;
        if (r0 != null) {
            return r0.A6i();
        }
        return super.getDropDownHorizontalOffset();
    }

    public int getDropDownVerticalOffset() {
        AbstractC13270jv r0 = this.A02;
        if (r0 != null) {
            return r0.A9f();
        }
        return super.getDropDownVerticalOffset();
    }

    public int getDropDownWidth() {
        if (this.A02 != null) {
            return this.A00;
        }
        return super.getDropDownWidth();
    }

    public final AbstractC13270jv getInternalPopup() {
        return this.A02;
    }

    public Drawable getPopupBackground() {
        AbstractC13270jv r0 = this.A02;
        if (r0 != null) {
            return r0.A4r();
        }
        return super.getPopupBackground();
    }

    public Context getPopupContext() {
        return this.A04;
    }

    public CharSequence getPrompt() {
        AbstractC13270jv r0 = this.A02;
        return r0 != null ? r0.A6h() : super.getPrompt();
    }

    @Override // X.AbstractC05570Pf
    public ColorStateList getSupportBackgroundTintList() {
        AnonymousClass0ZW r0 = this.A06;
        if (r0 != null) {
            return r0.A00();
        }
        return null;
    }

    @Override // X.AbstractC05570Pf
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AnonymousClass0ZW r0 = this.A06;
        if (r0 != null) {
            return r0.A01();
        }
        return null;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AbstractC13270jv r0 = this.A02;
        if (r0 != null && r0.ABa()) {
            this.A02.dismiss();
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A02 != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), A00(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C13260ju r3 = (C13260ju) parcelable;
        super.onRestoreInstanceState(r3.getSuperState());
        if (r3.A00 && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC13200jo(this));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r1 == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Parcelable onSaveInstanceState() {
        /*
            r3 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            X.0ju r2 = new X.0ju
            r2.<init>(r0)
            X.0jv r0 = r3.A02
            if (r0 == 0) goto L_0x0014
            boolean r1 = r0.ABa()
            r0 = 1
            if (r1 != 0) goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            r2.A00 = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.onSaveInstanceState():android.os.Parcelable");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractView$OnTouchListenerC13300jz r0 = this.A03;
        if (r0 == null || !r0.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        AbstractC13270jv r0 = this.A02;
        if (r0 == null) {
            return super.performClick();
        }
        if (r0.ABa()) {
            return true;
        }
        A01();
        return true;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.A07) {
            this.A01 = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.A02 != null) {
            Context context = this.A04;
            if (context == null) {
                context = getContext();
            }
            this.A02.ANt(new C13210jp(spinnerAdapter, context.getTheme()));
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AnonymousClass0ZW r0 = this.A06;
        if (r0 != null) {
            r0.A03();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        AnonymousClass0ZW r0 = this.A06;
        if (r0 != null) {
            r0.A04(i);
        }
    }

    public void setDropDownHorizontalOffset(int i) {
        AbstractC13270jv r0 = this.A02;
        if (r0 != null) {
            r0.AOJ(i);
            this.A02.AOI(i);
            return;
        }
        super.setDropDownHorizontalOffset(i);
    }

    public void setDropDownVerticalOffset(int i) {
        AbstractC13270jv r0 = this.A02;
        if (r0 != null) {
            r0.API(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    public void setDropDownWidth(int i) {
        if (this.A02 != null) {
            this.A00 = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        AbstractC13270jv r0 = this.A02;
        if (r0 != null) {
            r0.ANx(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(AnonymousClass05p.A01(getPopupContext(), i));
    }

    public void setPrompt(CharSequence charSequence) {
        AbstractC13270jv r0 = this.A02;
        if (r0 != null) {
            r0.AOu(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // X.AbstractC05570Pf
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        AnonymousClass0ZW r0 = this.A06;
        if (r0 != null) {
            r0.A06(colorStateList);
        }
    }

    @Override // X.AbstractC05570Pf
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        AnonymousClass0ZW r0 = this.A06;
        if (r0 != null) {
            r0.A07(mode);
        }
    }
}
