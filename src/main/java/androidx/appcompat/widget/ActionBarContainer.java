package androidx.appcompat.widget;

import X.AnonymousClass0T3;
import X.C13110jc;
import X.C13390kA;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.search.verification.client.R;

public class ActionBarContainer extends FrameLayout {
    public int A00;
    public Drawable A01;
    public Drawable A02;
    public Drawable A03;
    public View A04;
    public View A05;
    public View A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C13110jc(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass0T3.A00);
        this.A01 = obtainStyledAttributes.getDrawable(0);
        this.A03 = obtainStyledAttributes.getDrawable(2);
        this.A00 = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        boolean z = true;
        if (getId() == R.id.split_action_bar) {
            this.A07 = true;
            this.A02 = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.A07 ? !(this.A01 == null && this.A03 == null) : this.A02 != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.A01;
        if (drawable != null && drawable.isStateful()) {
            this.A01.setState(getDrawableState());
        }
        Drawable drawable2 = this.A03;
        if (drawable2 != null && drawable2.isStateful()) {
            this.A03.setState(getDrawableState());
        }
        Drawable drawable3 = this.A02;
        if (drawable3 != null && drawable3.isStateful()) {
            this.A02.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.A06;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.A01;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.A03;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.A02;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.A04 = findViewById(R.id.action_bar);
        this.A05 = findViewById(R.id.action_context_bar);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.A09 || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0033, code lost:
        if (r7.A07 == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0035, code lost:
        r2 = r7.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0037, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
        r2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0044, code lost:
        invalidate();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004a, code lost:
        if (r7.A01 == null) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0052, code lost:
        if (r7.A04.getVisibility() != 0) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0054, code lost:
        r7.A01.setBounds(r7.A04.getLeft(), r7.A04.getTop(), r7.A04.getRight(), r7.A04.getBottom());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0071, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0072, code lost:
        r7.A08 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0074, code lost:
        if (r5 == false) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0076, code lost:
        r4 = r7.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0078, code lost:
        if (r4 == null) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007a, code lost:
        r4.setBounds(r6.getLeft(), r6.getTop(), r6.getRight(), r6.getBottom());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008e, code lost:
        r0 = r7.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0090, code lost:
        if (r0 == null) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0096, code lost:
        if (r0.getVisibility() != 0) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0098, code lost:
        r7.A01.setBounds(r7.A05.getLeft(), r7.A05.getTop(), r7.A05.getRight(), r7.A05.getBottom());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b6, code lost:
        r7.A01.setBounds(0, 0, 0, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bc, code lost:
        if (r3 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r6.getVisibility() == 8) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r6 != null) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (r6.getVisibility() == 8) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r4 = getMeasuredHeight();
        r1 = r4 - r6.getMeasuredHeight();
        r0 = ((android.widget.FrameLayout.LayoutParams) r6.getLayoutParams()).bottomMargin;
        r6.layout(r9, r1 - r0, r11, r4 - r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r8, int r9, int r10, int r11, int r12) {
        /*
        // Method dump skipped, instructions count: 191
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (this.A04 == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i5 = this.A00) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i5, View.MeasureSpec.getSize(i2)), EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        }
        super.onMeasure(i, i2);
        if (this.A04 != null) {
            int mode = View.MeasureSpec.getMode(i2);
            View view = this.A06;
            if (view != null && view.getVisibility() != 8 && mode != 1073741824) {
                View view2 = this.A04;
                if (view2 == null || view2.getVisibility() == 8 || view2.getMeasuredHeight() == 0) {
                    View view3 = this.A05;
                    if (view3 == null || view3.getVisibility() == 8 || view3.getMeasuredHeight() == 0) {
                        i3 = 0;
                    } else {
                        View view4 = this.A05;
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view4.getLayoutParams();
                        i3 = view4.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
                    }
                } else {
                    View view5 = this.A04;
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view5.getLayoutParams();
                    i3 = view5.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                }
                if (mode == Integer.MIN_VALUE) {
                    i4 = View.MeasureSpec.getSize(i2);
                } else {
                    i4 = Integer.MAX_VALUE;
                }
                int measuredWidth = getMeasuredWidth();
                View view6 = this.A06;
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) view6.getLayoutParams();
                setMeasuredDimension(measuredWidth, Math.min(view6.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin + i3, i4));
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.A01;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.A01);
        }
        this.A01 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.A04;
            if (view != null) {
                this.A01.setBounds(view.getLeft(), this.A04.getTop(), this.A04.getRight(), this.A04.getBottom());
            }
        }
        boolean z = true;
        if (!this.A07 ? !(this.A01 == null && this.A03 == null) : this.A02 != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.A02;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.A02);
        }
        this.A02 = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.A07 && (drawable2 = this.A02) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.A07 ? this.A01 == null && this.A03 == null : this.A02 == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.A03;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.A03);
        }
        this.A03 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.A08 && (drawable2 = this.A03) != null) {
                drawable2.setBounds(this.A06.getLeft(), this.A06.getTop(), this.A06.getRight(), this.A06.getBottom());
            }
        }
        boolean z = true;
        if (!this.A07 ? !(this.A01 == null && this.A03 == null) : this.A02 != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setTabContainer(C13390kA r3) {
        View view = this.A06;
        if (view != null) {
            removeView(view);
        }
        this.A06 = r3;
        if (r3 != null) {
            addView(r3);
            ViewGroup.LayoutParams layoutParams = r3.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            throw null;
        }
    }

    public void setTransitioning(boolean z) {
        this.A09 = z;
        int i = 262144;
        if (z) {
            i = 393216;
        }
        setDescendantFocusability(i);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = false;
        if (i == 0) {
            z = true;
        }
        Drawable drawable = this.A01;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.A03;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.A02;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.A01 && !this.A07) || (drawable == this.A03 && this.A08) || ((drawable == this.A02 && this.A07) || super.verifyDrawable(drawable));
    }
}
