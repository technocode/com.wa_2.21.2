package com.google.android.material.appbar;

import X.AbstractC36671mc;
import X.AnonymousClass0Q7;
import X.AnonymousClass1DA;
import X.AnonymousClass1DC;
import X.C002001d;
import X.C004302a;
import X.C06730Um;
import X.C08030aM;
import X.C08040aN;
import X.C08060aP;
import X.C24821Dd;
import X.C36681md;
import X.C458826s;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;
import java.util.List;

public class CollapsingToolbarLayout extends FrameLayout {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06 = -1;
    public int A07;
    public long A08;
    public ValueAnimator A09;
    public Drawable A0A;
    public Drawable A0B;
    public View A0C;
    public View A0D;
    public Toolbar A0E;
    public C06730Um A0F;
    public AbstractC36671mc A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J = true;
    public boolean A0K;
    public final Rect A0L = new Rect();
    public final C24821Dd A0M;

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C24821Dd r3 = new C24821Dd(this);
        this.A0M = r3;
        r3.A0O = C08060aP.A00;
        r3.A07();
        TypedArray A002 = C08040aN.A00(context, attributeSet, C08030aM.A0L, 0, 2131952406, new int[0]);
        C24821Dd r5 = this.A0M;
        int i = A002.getInt(3, 8388691);
        if (r5.A0M != i) {
            r5.A0M = i;
            r5.A07();
        }
        C24821Dd r52 = this.A0M;
        int i2 = A002.getInt(0, 8388627);
        if (r52.A0K != i2) {
            r52.A0K = i2;
            r52.A07();
        }
        int dimensionPixelSize = A002.getDimensionPixelSize(4, 0);
        this.A01 = dimensionPixelSize;
        this.A02 = dimensionPixelSize;
        this.A04 = dimensionPixelSize;
        this.A03 = dimensionPixelSize;
        if (A002.hasValue(7)) {
            this.A03 = A002.getDimensionPixelSize(7, 0);
        }
        if (A002.hasValue(6)) {
            this.A02 = A002.getDimensionPixelSize(6, 0);
        }
        if (A002.hasValue(8)) {
            this.A04 = A002.getDimensionPixelSize(8, 0);
        }
        if (A002.hasValue(5)) {
            this.A01 = A002.getDimensionPixelSize(5, 0);
        }
        this.A0H = A002.getBoolean(14, true);
        setTitle(A002.getText(13));
        this.A0M.A0D(2131952123);
        this.A0M.A0C(2131952096);
        if (A002.hasValue(9)) {
            this.A0M.A0D(A002.getResourceId(9, 0));
        }
        if (A002.hasValue(1)) {
            this.A0M.A0C(A002.getResourceId(1, 0));
        }
        this.A06 = A002.getDimensionPixelSize(11, -1);
        this.A08 = (long) A002.getInt(10, 600);
        setContentScrim(A002.getDrawable(2));
        setStatusBarScrim(A002.getDrawable(12));
        this.A07 = A002.getResourceId(15, -1);
        A002.recycle();
        setWillNotDraw(false);
        AnonymousClass0Q7.A0e(this, new C36681md(this));
    }

    public static AnonymousClass1DC A00(View view) {
        AnonymousClass1DC r1 = (AnonymousClass1DC) view.getTag(R.id.view_offset_helper);
        if (r1 != null) {
            return r1;
        }
        AnonymousClass1DC r12 = new AnonymousClass1DC(view);
        view.setTag(R.id.view_offset_helper, r12);
        return r12;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:29:0x0028 */
    public final void A01() {
        if (this.A0J) {
            Toolbar toolbar = null;
            this.A0E = null;
            this.A0D = null;
            int i = this.A07;
            if (i != -1) {
                Toolbar toolbar2 = (Toolbar) findViewById(i);
                this.A0E = toolbar2;
                if (toolbar2 != null) {
                    ViewParent parent = toolbar2.getParent();
                    View view = toolbar2;
                    while (parent != this && parent != null) {
                        if (parent instanceof View) {
                            view = (View) parent;
                        }
                        parent = parent.getParent();
                        view = view;
                    }
                    this.A0D = view;
                }
            }
            if (this.A0E == null) {
                int childCount = getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        break;
                    }
                    View childAt = getChildAt(i2);
                    if (childAt instanceof Toolbar) {
                        toolbar = (Toolbar) childAt;
                        break;
                    }
                    i2++;
                }
                this.A0E = toolbar;
            }
            A02();
            this.A0J = false;
        }
    }

    public final void A02() {
        View view;
        if (!this.A0H && (view = this.A0C) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.A0C);
            }
        }
        if (this.A0H && this.A0E != null) {
            View view2 = this.A0C;
            if (view2 == null) {
                view2 = new View(getContext());
                this.A0C = view2;
            }
            if (view2.getParent() == null) {
                this.A0E.addView(this.A0C, -1, -1);
            }
        }
    }

    public final void A03() {
        if (this.A0A != null || this.A0B != null) {
            boolean z = false;
            if (getHeight() + this.A00 < getScrimVisibleHeightTrigger()) {
                z = true;
            }
            setScrimsShown(z);
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof AnonymousClass1DA;
    }

    public void draw(Canvas canvas) {
        C06730Um r0;
        int A042;
        Drawable drawable;
        super.draw(canvas);
        A01();
        if (this.A0E == null && (drawable = this.A0A) != null && this.A05 > 0) {
            drawable.mutate().setAlpha(this.A05);
            this.A0A.draw(canvas);
        }
        if (this.A0H && this.A0I) {
            this.A0M.A0F(canvas);
        }
        if (this.A0B != null && this.A05 > 0 && (r0 = this.A0F) != null && (A042 = r0.A04()) > 0) {
            this.A0B.setBounds(0, -this.A00, getWidth(), A042 - this.A00);
            this.A0B.mutate().setAlpha(this.A05);
            this.A0B.draw(canvas);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        View view2;
        Drawable drawable = this.A0A;
        if (drawable == null || this.A05 <= 0 || ((view2 = this.A0D) == null || view2 == this ? view != this.A0E : view != view2)) {
            z = false;
        } else {
            drawable.mutate().setAlpha(this.A05);
            this.A0A.draw(canvas);
            z = true;
        }
        if (super.drawChild(canvas, view, j) || z) {
            return true;
        }
        return false;
    }

    public void drawableStateChanged() {
        ColorStateList colorStateList;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.A0B;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.A0A;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        C24821Dd r3 = this.A0M;
        if (r3 != null) {
            r3.A0c = drawableState;
            ColorStateList colorStateList2 = r3.A0P;
            boolean z2 = true;
            if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = r3.A0Q) == null || !colorStateList.isStateful())) {
                z2 = false;
            } else {
                r3.A07();
            }
            z |= z2;
        }
        if (z) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.widget.FrameLayout
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new AnonymousClass1DA();
    }

    @Override // android.widget.FrameLayout, android.widget.FrameLayout
    /* renamed from: generateDefaultLayoutParams  reason: collision with other method in class */
    public FrameLayout.LayoutParams m4generateDefaultLayoutParams() {
        return new AnonymousClass1DA();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new AnonymousClass1DA(layoutParams);
    }

    @Override // android.widget.FrameLayout, android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new AnonymousClass1DA(getContext(), attributeSet);
    }

    public int getCollapsedTitleGravity() {
        return this.A0M.A0K;
    }

    public Typeface getCollapsedTitleTypeface() {
        Typeface typeface = this.A0M.A0T;
        return typeface == null ? Typeface.DEFAULT : typeface;
    }

    public Drawable getContentScrim() {
        return this.A0A;
    }

    public int getExpandedTitleGravity() {
        return this.A0M.A0M;
    }

    public int getExpandedTitleMarginBottom() {
        return this.A01;
    }

    public int getExpandedTitleMarginEnd() {
        return this.A02;
    }

    public int getExpandedTitleMarginStart() {
        return this.A03;
    }

    public int getExpandedTitleMarginTop() {
        return this.A04;
    }

    public Typeface getExpandedTitleTypeface() {
        Typeface typeface = this.A0M.A0V;
        return typeface == null ? Typeface.DEFAULT : typeface;
    }

    public int getScrimAlpha() {
        return this.A05;
    }

    public long getScrimAnimationDuration() {
        return this.A08;
    }

    public int getScrimVisibleHeightTrigger() {
        int i;
        int i2 = this.A06;
        if (i2 >= 0) {
            return i2;
        }
        C06730Um r0 = this.A0F;
        if (r0 != null) {
            i = r0.A04();
        } else {
            i = 0;
        }
        int minimumHeight = getMinimumHeight();
        if (minimumHeight > 0) {
            return Math.min((minimumHeight << 1) + i, getHeight());
        }
        return getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.A0B;
    }

    public CharSequence getTitle() {
        if (this.A0H) {
            return this.A0M.A0W;
        }
        return null;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            setFitsSystemWindows(((View) parent).getFitsSystemWindows());
            AbstractC36671mc r1 = this.A0G;
            if (r1 == null) {
                r1 = new C458826s(this);
                this.A0G = r1;
            }
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            List list = appBarLayout.A05;
            if (list == null) {
                list = new ArrayList();
                appBarLayout.A05 = list;
            }
            if (r1 != null && !list.contains(r1)) {
                appBarLayout.A05.add(r1);
            }
            if (Build.VERSION.SDK_INT >= 20) {
                requestApplyInsets();
            } else {
                requestFitSystemWindows();
            }
        }
    }

    public void onDetachedFromWindow() {
        List list;
        ViewParent parent = getParent();
        AbstractC36671mc r1 = this.A0G;
        if (!(r1 == null || !(parent instanceof AppBarLayout) || (list = ((AppBarLayout) parent).A05) == null)) {
            list.remove(r1);
        }
        super.onDetachedFromWindow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        if (r14.A0C.getVisibility() != 0) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r15, int r16, int r17, int r18, int r19) {
        /*
        // Method dump skipped, instructions count: 342
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i, int i2) {
        int i3;
        A01();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        C06730Um r0 = this.A0F;
        if (r0 != null) {
            i3 = r0.A04();
        } else {
            i3 = 0;
        }
        if (mode == 0 && i3 > 0) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + i3, 1073741824));
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.A0A;
        if (drawable != null) {
            drawable.setBounds(0, 0, i, i2);
        }
    }

    public void setCollapsedTitleGravity(int i) {
        C24821Dd r1 = this.A0M;
        if (r1.A0K != i) {
            r1.A0K = i;
            r1.A07();
        }
    }

    public void setCollapsedTitleTextAppearance(int i) {
        this.A0M.A0C(i);
    }

    public void setCollapsedTitleTextColor(int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        C24821Dd r1 = this.A0M;
        if (r1.A0P != colorStateList) {
            r1.A0P = colorStateList;
            r1.A07();
        }
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        C24821Dd r1 = this.A0M;
        if (r1.A0T != typeface) {
            r1.A0T = typeface;
            r1.A07();
        }
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.A0A;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.A0A = drawable3;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getWidth(), getHeight());
                this.A0A.setCallback(this);
                this.A0A.setAlpha(this.A05);
            }
            postInvalidateOnAnimation();
        }
    }

    public void setContentScrimColor(int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(int i) {
        setContentScrim(C004302a.A03(getContext(), i));
    }

    public void setExpandedTitleColor(int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleGravity(int i) {
        C24821Dd r1 = this.A0M;
        if (r1.A0M != i) {
            r1.A0M = i;
            r1.A07();
        }
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.A01 = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.A02 = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.A03 = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.A04 = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i) {
        this.A0M.A0D(i);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        C24821Dd r1 = this.A0M;
        if (r1.A0Q != colorStateList) {
            r1.A0Q = colorStateList;
            r1.A07();
        }
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        C24821Dd r1 = this.A0M;
        if (r1.A0V != typeface) {
            r1.A0V = typeface;
            r1.A07();
        }
    }

    public void setScrimAlpha(int i) {
        Toolbar toolbar;
        if (i != this.A05) {
            if (!(this.A0A == null || (toolbar = this.A0E) == null)) {
                toolbar.postInvalidateOnAnimation();
            }
            this.A05 = i;
            postInvalidateOnAnimation();
        }
    }

    public void setScrimAnimationDuration(long j) {
        this.A08 = j;
    }

    public void setScrimVisibleHeightTrigger(int i) {
        if (this.A06 != i) {
            this.A06 = i;
            A03();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (isInEditMode() != false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setScrimsShown(boolean r7) {
        /*
        // Method dump skipped, instructions count: 112
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.setScrimsShown(boolean):void");
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.A0B;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.A0B = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.A0B.setState(getDrawableState());
                }
                C002001d.A2Y(this.A0B, AnonymousClass0Q7.A05(this));
                Drawable drawable4 = this.A0B;
                boolean z = false;
                if (getVisibility() == 0) {
                    z = true;
                }
                drawable4.setVisible(z, false);
                this.A0B.setCallback(this);
                this.A0B.setAlpha(this.A05);
            }
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarScrimColor(int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(int i) {
        setStatusBarScrim(C004302a.A03(getContext(), i));
    }

    public void setTitle(CharSequence charSequence) {
        this.A0M.A0G(charSequence);
        setContentDescription(getTitle());
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.A0H) {
            this.A0H = z;
            setContentDescription(getTitle());
            A02();
            requestLayout();
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = false;
        if (i == 0) {
            z = true;
        }
        Drawable drawable = this.A0B;
        if (!(drawable == null || drawable.isVisible() == z)) {
            this.A0B.setVisible(z, false);
        }
        Drawable drawable2 = this.A0A;
        if (drawable2 != null && drawable2.isVisible() != z) {
            this.A0A.setVisible(z, false);
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.A0A || drawable == this.A0B;
    }
}
