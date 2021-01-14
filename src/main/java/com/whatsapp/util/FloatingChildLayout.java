package com.whatsapp.util;

import X.AnonymousClass35F;
import X.AnonymousClass35Z;
import X.C666035a;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewPropertyAnimator;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import com.google.android.search.verification.client.R;

public class FloatingChildLayout extends FrameLayout {
    public static final boolean A09;
    public int A00;
    public int A01 = 0;
    public int A02;
    public int A03 = 0;
    public ValueAnimator A04 = null;
    public Rect A05 = new Rect();
    public View.OnTouchListener A06;
    public View A07;
    public boolean A08;

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 21) {
            z = true;
        }
        A09 = z;
    }

    public FloatingChildLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = getResources();
        this.A02 = resources.getDimensionPixelOffset(R.dimen.quick_contact_top_position);
        this.A00 = (resources.getInteger(17694720) * 11) / 10;
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 127);
        this.A04 = ofInt;
        ofInt.addUpdateListener(new AnonymousClass35F(this));
        super.setBackgroundDrawable(new ColorDrawable(0));
    }

    public static int A00(int i, int i2, int i3) {
        if (i2 > i3) {
            return (i3 - i2) >> 1;
        }
        return Math.min(Math.max(i, 0), i3 - i2);
    }

    public final void A01(boolean z, Runnable runnable) {
        float f;
        float width;
        int i;
        float f2 = 1.0f;
        if (z) {
            f = ((float) this.A05.width()) / ((float) this.A07.getWidth());
            width = 1.0f;
        } else {
            f = 1.0f;
            width = ((float) this.A05.width()) / ((float) this.A07.getWidth());
        }
        if (this.A08 && A09) {
            float sqrt = ((float) (Math.sqrt(2.0d) * ((double) Math.max(this.A07.getWidth(), this.A07.getHeight())))) / 2.0f;
            float min = ((float) Math.min(this.A07.getWidth(), this.A07.getHeight())) / 2.0f;
            if (!z) {
                min = sqrt;
                sqrt = min;
            }
            View view = this.A07;
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, view.getWidth() / 2, this.A07.getWidth() / 2, sqrt, min);
            createCircularReveal.setDuration((long) this.A00);
            if (z) {
                createCircularReveal.addListener(new AnonymousClass35Z(this));
            }
            createCircularReveal.start();
        }
        int[] iArr = new int[2];
        this.A07.getLocationOnScreen(iArr);
        int i2 = 0;
        Rect rect = this.A05;
        int i3 = rect.left - iArr[0];
        int i4 = rect.top - iArr[1];
        if (!z) {
            if (!A09) {
                this.A07.setAlpha(0.0f);
            }
            i2 = i3;
            i = 0;
            i3 = 0;
        } else {
            i = i4;
            i4 = 0;
        }
        this.A07.setTranslationX((float) i2);
        this.A07.setTranslationY((float) i4);
        this.A07.setPivotX(0.0f);
        this.A07.setPivotY(0.0f);
        this.A07.setScaleX(width);
        this.A07.setScaleY(width);
        ViewPropertyAnimator translationY = this.A07.animate().setDuration((long) this.A00).setInterpolator(AnimationUtils.loadInterpolator(getContext(), 17563654)).scaleX(f).scaleY(f).translationX((float) i3).translationY((float) i);
        if (z && !A09) {
            f2 = 0.0f;
        }
        translationY.alpha(f2).setListener(new C666035a(this, z, runnable));
    }

    public View getChild() {
        return this.A07;
    }

    private Rect getTargetInWindow() {
        Rect rect = new Rect();
        getWindowVisibleDisplayFrame(rect);
        Rect rect2 = new Rect(this.A05);
        rect2.offset(-rect.left, -rect.top);
        return rect2;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(16908290);
        this.A07 = findViewById;
        findViewById.setDuplicateParentStateEnabled(true);
        if (!A09) {
            this.A07.setAlpha(0.0f);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view = this.A07;
        Rect targetInWindow = getTargetInWindow();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (this.A02 != -1) {
            int i5 = this.A02;
            int A002 = A00((getWidth() - measuredWidth) >> 1, measuredWidth, getWidth());
            int A003 = A00(i5, measuredHeight, getHeight());
            view.layout(A002, A003, view.getMeasuredWidth() + A002, view.getMeasuredHeight() + A003);
            return;
        }
        int centerX = targetInWindow.centerX() - (measuredWidth >> 1);
        int centerY = targetInWindow.centerY() - Math.round(((float) measuredHeight) * 0.75f);
        int A004 = A00(centerX, measuredWidth, getWidth());
        int A005 = A00(centerY, measuredHeight, getHeight());
        view.layout(A004, A005, view.getMeasuredWidth() + A004, view.getMeasuredHeight() + A005);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = this.A06;
        if (onTouchListener != null) {
            return onTouchListener.onTouch(this, motionEvent);
        }
        return false;
    }

    public void setBackground(Drawable drawable) {
        Log.e("don't setBackground(), it is managed internally");
    }

    public void setBackgroundColorAlpha(int i) {
        setBackgroundColor(i << 24);
    }

    public void setChildTargetScreen(Rect rect) {
        this.A05 = rect;
        requestLayout();
    }

    public void setCircularReveal(boolean z) {
        this.A08 = z;
    }

    public void setOnOutsideTouchListener(View.OnTouchListener onTouchListener) {
        this.A06 = onTouchListener;
    }
}
