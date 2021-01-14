package com.google.android.material.tabs;

import X.AbstractC24981Dz;
import X.AnonymousClass05p;
import X.AnonymousClass0Q7;
import X.AnonymousClass0T3;
import X.AnonymousClass0YE;
import X.AnonymousClass1E0;
import X.AnonymousClass1E3;
import X.AnonymousClass1E4;
import X.AnonymousClass1E5;
import X.C008805h;
import X.C08030aM;
import X.C08040aN;
import X.C08060aP;
import X.C08440b7;
import X.C14840my;
import X.C24971Dy;
import X.C30101aj;
import X.C36921n9;
import X.C36931nA;
import X.C36941nB;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@ViewPager.DecorView
public class TabLayout extends HorizontalScrollView {
    public static final C14840my A0e = new C30101aj(16);
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07 = Integer.MAX_VALUE;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public ValueAnimator A0D;
    public ColorStateList A0E;
    public ColorStateList A0F;
    public ColorStateList A0G;
    public DataSetObserver A0H;
    public PorterDuff.Mode A0I;
    public Drawable A0J;
    public AnonymousClass0YE A0K;
    public ViewPager A0L;
    public C36921n9 A0M;
    public AbstractC24981Dz A0N;
    public AbstractC24981Dz A0O;
    public AnonymousClass1E4 A0P;
    public C36931nA A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public final int A0V;
    public final int A0W;
    public final int A0X;
    public final int A0Y;
    public final RectF A0Z = new RectF();
    public final C14840my A0a = new C14840my(12);
    public final AnonymousClass1E3 A0b;
    public final ArrayList A0c = new ArrayList();
    public final ArrayList A0d = new ArrayList();

    /* JADX INFO: finally extract failed */
    public TabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.tabStyle);
        setHorizontalScrollBarEnabled(false);
        AnonymousClass1E3 r3 = new AnonymousClass1E3(this, context);
        this.A0b = r3;
        super.addView(r3, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray A002 = C08040aN.A00(context, attributeSet, C08030aM.A0v, R.attr.tabStyle, 2131952411, 22);
        AnonymousClass1E3 r6 = this.A0b;
        int dimensionPixelSize = A002.getDimensionPixelSize(10, -1);
        if (r6.A04 != dimensionPixelSize) {
            r6.A04 = dimensionPixelSize;
            r6.postInvalidateOnAnimation();
        }
        AnonymousClass1E3 r7 = this.A0b;
        int color = A002.getColor(7, 0);
        Paint paint = r7.A07;
        if (paint.getColor() != color) {
            paint.setColor(color);
            r7.postInvalidateOnAnimation();
        }
        setSelectedTabIndicator(C008805h.A0B(context, A002, 5));
        setSelectedTabIndicatorGravity(A002.getInt(9, 0));
        setTabIndicatorFullWidth(A002.getBoolean(8, true));
        int dimensionPixelSize2 = A002.getDimensionPixelSize(15, 0);
        this.A08 = dimensionPixelSize2;
        this.A09 = dimensionPixelSize2;
        this.A0B = dimensionPixelSize2;
        this.A0A = dimensionPixelSize2;
        this.A0A = A002.getDimensionPixelSize(18, dimensionPixelSize2);
        this.A0B = A002.getDimensionPixelSize(19, this.A0B);
        this.A09 = A002.getDimensionPixelSize(17, this.A09);
        this.A08 = A002.getDimensionPixelSize(16, this.A08);
        int resourceId = A002.getResourceId(22, 2131952130);
        this.A0C = resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId, AnonymousClass0T3.A0b);
        try {
            this.A01 = (float) obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.A0G = C008805h.A08(context, obtainStyledAttributes, 3);
            obtainStyledAttributes.recycle();
            if (A002.hasValue(23)) {
                this.A0G = C008805h.A08(context, A002, 23);
            }
            if (A002.hasValue(21)) {
                this.A0G = A00(this.A0G.getDefaultColor(), A002.getColor(21, 0));
            }
            this.A0E = C008805h.A08(context, A002, 3);
            this.A0I = C008805h.A0A(A002.getInt(4, -1), null);
            this.A0F = C008805h.A08(context, A002, 20);
            this.A05 = A002.getInt(6, 300);
            this.A0W = A002.getDimensionPixelSize(13, -1);
            this.A0V = A002.getDimensionPixelSize(12, -1);
            this.A0Y = A002.getResourceId(0, 0);
            this.A02 = A002.getDimensionPixelSize(1, 0);
            this.A03 = A002.getInt(14, 1);
            this.A04 = A002.getInt(2, 0);
            this.A0R = A002.getBoolean(11, false);
            this.A0U = A002.getBoolean(24, false);
            A002.recycle();
            Resources resources = getResources();
            this.A00 = (float) resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.A0X = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            A07();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static ColorStateList A00(int i, int i2) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i});
    }

    public int A01(int i) {
        return Math.round(getResources().getDisplayMetrics().density * ((float) i));
    }

    public final int A02(int i, float f) {
        View view;
        int i2;
        int i3 = 0;
        if (this.A03 != 0) {
            return 0;
        }
        AnonymousClass1E3 r3 = this.A0b;
        View childAt = r3.getChildAt(i);
        int i4 = i + 1;
        if (i4 < r3.getChildCount()) {
            view = r3.getChildAt(i4);
        } else {
            view = null;
        }
        if (childAt != null) {
            i2 = childAt.getWidth();
        } else {
            i2 = 0;
        }
        if (view != null) {
            i3 = view.getWidth();
        }
        int left = ((i2 >> 1) + childAt.getLeft()) - (getWidth() >> 1);
        int i5 = (int) (((float) (i2 + i3)) * 0.5f * f);
        if (AnonymousClass0Q7.A05(this) == 0) {
            return left + i5;
        }
        return left - i5;
    }

    public AnonymousClass1E4 A03() {
        AnonymousClass1E5 r1;
        AnonymousClass1E4 r2 = (AnonymousClass1E4) A0e.A00();
        if (r2 == null) {
            r2 = new AnonymousClass1E4();
        }
        r2.A02 = this;
        C14840my r0 = this.A0a;
        if (r0 == null || (r1 = (AnonymousClass1E5) r0.A00()) == null) {
            r1 = new AnonymousClass1E5(this, getContext());
        }
        if (r2 != r1.A04) {
            r1.A04 = r2;
            r1.A00();
        }
        r1.setFocusable(true);
        r1.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(r2.A03)) {
            r1.setContentDescription(r2.A04);
        } else {
            r1.setContentDescription(r2.A03);
        }
        r2.A01 = r1;
        return r2;
    }

    public AnonymousClass1E4 A04(int i) {
        if (i < 0) {
            return null;
        }
        ArrayList arrayList = this.A0d;
        if (i < arrayList.size()) {
            return (AnonymousClass1E4) arrayList.get(i);
        }
        return null;
    }

    public void A05() {
        int currentItem;
        A06();
        AnonymousClass0YE r0 = this.A0K;
        if (r0 != null) {
            int A012 = r0.A01();
            for (int i = 0; i < A012; i++) {
                AnonymousClass1E4 A032 = A03();
                A032.A01(this.A0K.A04(i));
                A0E(A032, false);
            }
            ViewPager viewPager = this.A0L;
            if (viewPager != null && A012 > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < this.A0d.size()) {
                A0F(A04(currentItem), true);
            }
        }
    }

    public void A06() {
        AnonymousClass1E3 r4 = this.A0b;
        for (int childCount = r4.getChildCount() - 1; childCount >= 0; childCount--) {
            AnonymousClass1E5 r1 = (AnonymousClass1E5) r4.getChildAt(childCount);
            r4.removeViewAt(childCount);
            if (r1 != null) {
                if (r1.A04 != null) {
                    r1.A04 = null;
                    r1.A00();
                }
                r1.setSelected(false);
                this.A0a.A01(r1);
            }
            requestLayout();
        }
        Iterator it = this.A0d.iterator();
        while (it.hasNext()) {
            AnonymousClass1E4 r12 = (AnonymousClass1E4) it.next();
            it.remove();
            r12.A02 = null;
            r12.A01 = null;
            r12.A04 = null;
            r12.A03 = null;
            r12.A00 = -1;
            A0e.A01(r12);
        }
        this.A0P = null;
    }

    public final void A07() {
        int i;
        if (this.A03 == 0) {
            i = Math.max(0, this.A02 - this.A0A);
        } else {
            i = 0;
        }
        AnonymousClass1E3 r2 = this.A0b;
        AnonymousClass0Q7.A0Z(r2, i, 0, 0, 0);
        int i2 = this.A03;
        if (i2 == 0) {
            r2.setGravity(8388611);
        } else if (i2 == 1) {
            r2.setGravity(1);
        }
        A0G(true);
    }

    public final void A08() {
        if (this.A0D == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.A0D = valueAnimator;
            valueAnimator.setInterpolator(C08060aP.A02);
            this.A0D.setDuration((long) this.A05);
            this.A0D.addUpdateListener(new C24971Dy(this));
        }
    }

    public final void A09(int i) {
        if (i != -1) {
            if (getWindowToken() != null && AnonymousClass0Q7.A0j(this)) {
                AnonymousClass1E3 r5 = this.A0b;
                int childCount = r5.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    if (r5.getChildAt(i2).getWidth() > 0) {
                    }
                }
                int scrollX = getScrollX();
                int A022 = A02(i, 0.0f);
                if (scrollX != A022) {
                    A08();
                    this.A0D.setIntValues(scrollX, A022);
                    this.A0D.start();
                }
                r5.A01(i, this.A05);
                return;
            }
            A0A(i, 0.0f, true, true);
        }
    }

    public void A0A(int i, float f, boolean z, boolean z2) {
        int round = Math.round(((float) i) + f);
        if (round >= 0) {
            AnonymousClass1E3 r1 = this.A0b;
            if (round < r1.getChildCount()) {
                if (z2) {
                    ValueAnimator valueAnimator = r1.A06;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        r1.A06.cancel();
                    }
                    r1.A05 = i;
                    r1.A00 = f;
                    r1.A00();
                }
                ValueAnimator valueAnimator2 = this.A0D;
                if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                    this.A0D.cancel();
                }
                scrollTo(A02(i, f), 0);
                if (z) {
                    setSelectedTabView(round);
                }
            }
        }
    }

    public final void A0B(LinearLayout.LayoutParams layoutParams) {
        if (this.A03 == 1 && this.A04 == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            return;
        }
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
    }

    public void A0C(AnonymousClass0YE r4, boolean z) {
        DataSetObserver dataSetObserver;
        AnonymousClass0YE r2 = this.A0K;
        if (!(r2 == null || (dataSetObserver = this.A0H) == null)) {
            if (!(r2 instanceof C08440b7)) {
                r2.A01.unregisterObserver(dataSetObserver);
            } else {
                ((C08440b7) r2).A00.A08(dataSetObserver);
            }
        }
        this.A0K = r4;
        if (z && r4 != null) {
            DataSetObserver dataSetObserver2 = this.A0H;
            if (dataSetObserver2 == null) {
                dataSetObserver2 = new AnonymousClass1E0(this);
                this.A0H = dataSetObserver2;
            }
            if (!(r4 instanceof C08440b7)) {
                r4.A01.registerObserver(dataSetObserver2);
            } else {
                ((C08440b7) r4).A00.A07(dataSetObserver2);
            }
        }
        A05();
    }

    public final void A0D(ViewPager viewPager, boolean z) {
        List list;
        List list2;
        ViewPager viewPager2 = this.A0L;
        if (viewPager2 != null) {
            C36931nA r1 = this.A0Q;
            if (!(r1 == null || (list2 = viewPager2.A0c) == null)) {
                list2.remove(r1);
            }
            C36921n9 r12 = this.A0M;
            if (!(r12 == null || (list = this.A0L.A0b) == null)) {
                list.remove(r12);
            }
        }
        AbstractC24981Dz r13 = this.A0N;
        if (r13 != null) {
            this.A0c.remove(r13);
            this.A0N = null;
        }
        if (viewPager != null) {
            this.A0L = viewPager;
            C36931nA r0 = this.A0Q;
            if (r0 == null) {
                r0 = new C36931nA(this);
                this.A0Q = r0;
            }
            r0.A01 = 0;
            r0.A00 = 0;
            viewPager.A0F(r0);
            C36941nB r2 = new C36941nB(viewPager);
            this.A0N = r2;
            ArrayList arrayList = this.A0c;
            if (!arrayList.contains(r2)) {
                arrayList.add(r2);
            }
            AnonymousClass0YE r02 = viewPager.A0V;
            if (r02 != null) {
                A0C(r02, true);
            }
            C36921n9 r14 = this.A0M;
            if (r14 == null) {
                r14 = new C36921n9(this);
                this.A0M = r14;
            }
            r14.A00 = true;
            List list3 = viewPager.A0b;
            if (list3 == null) {
                list3 = new ArrayList();
                viewPager.A0b = list3;
            }
            list3.add(r14);
            A0A(viewPager.getCurrentItem(), 0.0f, true, true);
        } else {
            this.A0L = null;
            A0C(null, false);
        }
        this.A0S = z;
    }

    public void A0E(AnonymousClass1E4 r7, boolean z) {
        ArrayList arrayList = this.A0d;
        int size = arrayList.size();
        if (r7.A02 == this) {
            r7.A00 = size;
            arrayList.add(size, r7);
            int size2 = arrayList.size();
            while (true) {
                size++;
                if (size >= size2) {
                    break;
                }
                ((AnonymousClass1E4) arrayList.get(size)).A00 = size;
            }
            AnonymousClass1E5 r5 = r7.A01;
            AnonymousClass1E3 r4 = this.A0b;
            int i = r7.A00;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            A0B(layoutParams);
            r4.addView(r5, i, layoutParams);
            if (z) {
                r7.A00();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    public void A0F(AnonymousClass1E4 r6, boolean z) {
        int i;
        AnonymousClass1E4 r4 = this.A0P;
        if (r4 != r6) {
            if (r6 != null) {
                i = r6.A00;
            } else {
                i = -1;
            }
            if (z) {
                if ((r4 == null || r4.A00 == -1) && i != -1) {
                    A0A(i, 0.0f, true, true);
                } else {
                    A09(i);
                }
                if (i != -1) {
                    setSelectedTabView(i);
                }
            }
            this.A0P = r6;
            if (r4 != null) {
                ArrayList arrayList = this.A0c;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    arrayList.get(size);
                }
            }
            if (r6 != null) {
                ArrayList arrayList2 = this.A0c;
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    ((AbstractC24981Dz) arrayList2.get(size2)).AKu(r6);
                }
            }
        } else if (r4 != null) {
            ArrayList arrayList3 = this.A0c;
            for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                arrayList3.get(size3);
            }
            A09(r6.A00);
        }
    }

    public void A0G(boolean z) {
        int i = 0;
        while (true) {
            AnonymousClass1E3 r1 = this.A0b;
            if (i < r1.getChildCount()) {
                View childAt = r1.getChildAt(i);
                childAt.setMinimumWidth(getTabMinWidth());
                A0B((LinearLayout.LayoutParams) childAt.getLayoutParams());
                if (z) {
                    childAt.requestLayout();
                }
                i++;
            } else {
                return;
            }
        }
    }

    public void addView(View view) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.FrameLayout, android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    private int getDefaultHeight() {
        ArrayList arrayList = this.A0d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i);
        }
        return 48;
    }

    public int getSelectedTabPosition() {
        AnonymousClass1E4 r0 = this.A0P;
        if (r0 != null) {
            return r0.A00;
        }
        return -1;
    }

    public int getTabCount() {
        return this.A0d.size();
    }

    public int getTabGravity() {
        return this.A04;
    }

    public ColorStateList getTabIconTint() {
        return this.A0E;
    }

    public int getTabIndicatorGravity() {
        return this.A06;
    }

    public int getTabMaxWidth() {
        return this.A07;
    }

    private int getTabMinWidth() {
        int i = this.A0W;
        if (i != -1) {
            return i;
        }
        if (this.A03 == 0) {
            return this.A0X;
        }
        return 0;
    }

    public int getTabMode() {
        return this.A03;
    }

    public ColorStateList getTabRippleColor() {
        return this.A0F;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.A0b.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    public Drawable getTabSelectedIndicator() {
        return this.A0J;
    }

    public ColorStateList getTabTextColors() {
        return this.A0G;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.A0L == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                A0D((ViewPager) parent, true);
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.A0S) {
            A0D(null, false);
            this.A0S = false;
        }
    }

    public void onDraw(Canvas canvas) {
        AnonymousClass1E5 r5;
        Drawable drawable;
        int i = 0;
        while (true) {
            AnonymousClass1E3 r1 = this.A0b;
            if (i < r1.getChildCount()) {
                View childAt = r1.getChildAt(i);
                if ((childAt instanceof AnonymousClass1E5) && (drawable = (r5 = (AnonymousClass1E5) childAt).A01) != null) {
                    drawable.setBounds(r5.getLeft(), r5.getTop(), r5.getRight(), r5.getBottom());
                    r5.A01.draw(canvas);
                }
                i++;
            } else {
                super.onDraw(canvas);
                return;
            }
        }
    }

    public void onMeasure(int i, int i2) {
        int A012 = A01(getDefaultHeight());
        int paddingBottom = getPaddingBottom() + getPaddingTop() + A012;
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(paddingBottom, View.MeasureSpec.getSize(i2)), 1073741824);
        } else if (mode == 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int i3 = this.A0V;
            if (i3 <= 0) {
                i3 = size - A01(56);
            }
            this.A07 = i3;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i4 = this.A03;
            if (i4 != 0) {
                if (i4 != 1 || childAt.getMeasuredWidth() == getMeasuredWidth()) {
                    return;
                }
            } else if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), HorizontalScrollView.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
        }
    }

    public void setInlineLabel(boolean z) {
        if (this.A0R != z) {
            this.A0R = z;
            int i = 0;
            while (true) {
                AnonymousClass1E3 r1 = this.A0b;
                if (i < r1.getChildCount()) {
                    View childAt = r1.getChildAt(i);
                    if (childAt instanceof AnonymousClass1E5) {
                        AnonymousClass1E5 r2 = (AnonymousClass1E5) childAt;
                        r2.setOrientation(!r2.A05.A0R ? 1 : 0);
                        r2.A02(r2.A03, r2.A02);
                    }
                    i++;
                } else {
                    A07();
                    return;
                }
            }
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    public void setOnTabSelectedListener(AbstractC24981Dz r3) {
        AbstractC24981Dz r1 = this.A0O;
        if (r1 != null) {
            this.A0c.remove(r1);
        }
        this.A0O = r3;
        if (r3 != null) {
            ArrayList arrayList = this.A0c;
            if (!arrayList.contains(r3)) {
                arrayList.add(r3);
            }
        }
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        A08();
        this.A0D.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(AnonymousClass05p.A01(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.A0J != drawable) {
            this.A0J = drawable;
            this.A0b.postInvalidateOnAnimation();
        }
    }

    public void setSelectedTabIndicatorColor(int i) {
        AnonymousClass1E3 r2 = this.A0b;
        Paint paint = r2.A07;
        if (paint.getColor() != i) {
            paint.setColor(i);
            r2.postInvalidateOnAnimation();
        }
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.A06 != i) {
            this.A06 = i;
            this.A0b.postInvalidateOnAnimation();
        }
    }

    public void setSelectedTabIndicatorHeight(int i) {
        AnonymousClass1E3 r1 = this.A0b;
        if (r1.A04 != i) {
            r1.A04 = i;
            r1.postInvalidateOnAnimation();
        }
    }

    private void setSelectedTabView(int i) {
        AnonymousClass1E3 r5 = this.A0b;
        int childCount = r5.getChildCount();
        if (i < childCount) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = r5.getChildAt(i2);
                boolean z = true;
                boolean z2 = false;
                if (i2 == i) {
                    z2 = true;
                }
                childAt.setSelected(z2);
                if (i2 != i) {
                    z = false;
                }
                childAt.setActivated(z);
            }
        }
    }

    public void setTabGravity(int i) {
        if (this.A04 != i) {
            this.A04 = i;
            A07();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.A0E != colorStateList) {
            this.A0E = colorStateList;
            ArrayList arrayList = this.A0d;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                AnonymousClass1E5 r0 = ((AnonymousClass1E4) arrayList.get(i)).A01;
                if (r0 != null) {
                    r0.A00();
                }
            }
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(AnonymousClass05p.A00(getContext(), i));
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.A0T = z;
        this.A0b.postInvalidateOnAnimation();
    }

    public void setTabMode(int i) {
        if (i != this.A03) {
            this.A03 = i;
            A07();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.A0F != colorStateList) {
            this.A0F = colorStateList;
            int i = 0;
            while (true) {
                AnonymousClass1E3 r1 = this.A0b;
                if (i < r1.getChildCount()) {
                    View childAt = r1.getChildAt(i);
                    if (childAt instanceof AnonymousClass1E5) {
                        ((AnonymousClass1E5) childAt).A01(getContext());
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(AnonymousClass05p.A00(getContext(), i));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.A0G != colorStateList) {
            this.A0G = colorStateList;
            ArrayList arrayList = this.A0d;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                AnonymousClass1E5 r0 = ((AnonymousClass1E4) arrayList.get(i)).A01;
                if (r0 != null) {
                    r0.A00();
                }
            }
        }
    }

    public void setTabsFromPagerAdapter(AnonymousClass0YE r2) {
        A0C(r2, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.A0U != z) {
            this.A0U = z;
            int i = 0;
            while (true) {
                AnonymousClass1E3 r1 = this.A0b;
                if (i < r1.getChildCount()) {
                    View childAt = r1.getChildAt(i);
                    if (childAt instanceof AnonymousClass1E5) {
                        ((AnonymousClass1E5) childAt).A01(getContext());
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        A0D(viewPager, false);
    }

    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }
}
