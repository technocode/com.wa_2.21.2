package androidx.viewpager.widget;

import X.AbstractC15200nf;
import X.AbstractC17490rd;
import X.AbstractC17500re;
import X.AnonymousClass0Q7;
import X.AnonymousClass0XW;
import X.AnonymousClass0YE;
import X.C004302a;
import X.C07700Ze;
import X.C07720Zg;
import X.C07730Zh;
import X.C07740Zi;
import X.C07930a8;
import X.C08380b1;
import X.C09550d8;
import X.C30941cF;
import X.animation.InterpolatorC07710Zf;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ViewPager extends ViewGroup {
    public static final Interpolator A0p = new animation.InterpolatorC07710Zf();
    public static final C07720Zg A0q = new C07720Zg();
    public static final Comparator A0r = new C07700Ze();
    public static final int[] A0s = {16842931};
    public float A00 = -3.4028235E38f;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05 = Float.MAX_VALUE;
    public int A06 = -1;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J = 1;
    public int A0K;
    public int A0L;
    public int A0M = -1;
    public int A0N = 0;
    public int A0O;
    public int A0P;
    public Drawable A0Q;
    public Parcelable A0R = null;
    public VelocityTracker A0S;
    public EdgeEffect A0T;
    public EdgeEffect A0U;
    public AnonymousClass0YE A0V;
    public AnonymousClass0XW A0W;
    public AbstractC17500re A0X;
    public C08380b1 A0Y;
    public ClassLoader A0Z = null;
    public ArrayList A0a;
    public List A0b;
    public List A0c;
    public boolean A0d;
    public boolean A0e = true;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public final Rect A0l = new Rect();
    public final C07730Zh A0m = new C07730Zh();
    public final Runnable A0n = new RunnableEBaseShape0S0100000_I0_0(this, 23);
    public final ArrayList A0o = new ArrayList();
    public Scroller mScroller;

    public @interface DecorView {
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.mScroller = new Scroller(context2, A0p);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f = context2.getResources().getDisplayMetrics().density;
        this.A0P = viewConfiguration.getScaledPagingTouchSlop();
        this.A0I = (int) (400.0f * f);
        this.A0H = viewConfiguration.getScaledMaximumFlingVelocity();
        this.A0T = new EdgeEffect(context2);
        this.A0U = new EdgeEffect(context2);
        this.A0F = (int) (25.0f * f);
        this.A09 = (int) (2.0f * f);
        this.A0C = (int) (f * 16.0f);
        AnonymousClass0Q7.A0d(this, new C07740Zi(this));
        if (getImportantForAccessibility() == 0) {
            AnonymousClass0Q7.A0W(this, 1);
        }
        AnonymousClass0Q7.A0e(this, new C07930a8(this));
    }

    public final Rect A00(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    public final C07730Zh A01() {
        float f;
        float f2;
        C07730Zh r3;
        int i;
        int clientWidth = getClientWidth();
        float f3 = 0.0f;
        if (clientWidth > 0) {
            float f4 = (float) clientWidth;
            f = ((float) getScrollX()) / f4;
            f2 = ((float) this.A0K) / f4;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        C07730Zh r11 = null;
        float f5 = 0.0f;
        int i2 = -1;
        int i3 = 0;
        boolean z = true;
        while (true) {
            ArrayList arrayList = this.A0o;
            if (i3 >= arrayList.size()) {
                return r11;
            }
            r3 = (C07730Zh) arrayList.get(i3);
            if (!z && r3.A02 != (i = i2 + 1)) {
                r3 = this.A0m;
                r3.A00 = f3 + f5 + f2;
                r3.A02 = i;
                r3.A01 = this.A0V.A00(i);
                i3--;
            }
            f3 = r3.A00;
            f5 = r3.A01;
            float f6 = f5 + f3 + f2;
            if (!z && f < f3) {
                return r11;
            }
            if (f < f6 || i3 == arrayList.size() - 1) {
                return r3;
            }
            i2 = r3.A02;
            i3++;
            r11 = r3;
            z = false;
        }
        return r3;
    }

    public C07730Zh A02(int i) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.A0o;
            if (i2 >= arrayList.size()) {
                return null;
            }
            C07730Zh r1 = (C07730Zh) arrayList.get(i2);
            if (r1.A02 == i) {
                return r1;
            }
            i2++;
        }
    }

    public C07730Zh A03(int i, int i2) {
        C07730Zh r2 = new C07730Zh();
        r2.A02 = i;
        r2.A03 = this.A0V.A05(this, i);
        r2.A01 = this.A0V.A00(i);
        if (i2 >= 0) {
            ArrayList arrayList = this.A0o;
            if (i2 < arrayList.size()) {
                arrayList.add(i2, r2);
                return r2;
            }
        }
        this.A0o.add(r2);
        return r2;
    }

    public C07730Zh A04(View view) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A0o;
            if (i >= arrayList.size()) {
                return null;
            }
            C07730Zh r2 = (C07730Zh) arrayList.get(i);
            if (this.A0V.A0E(view, r2.A03)) {
                return r2;
            }
            i++;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        if (r3.size() >= r8) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05() {
        /*
        // Method dump skipped, instructions count: 162
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.A05():void");
    }

    public final void A06() {
        if (this.A0D != 0) {
            ArrayList arrayList = this.A0a;
            if (arrayList == null) {
                this.A0a = new ArrayList();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.A0a.add(getChildAt(i));
            }
            Collections.sort(this.A0a, A0q);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005d, code lost:
        if (r0 == r2) goto L_0x005f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(int r19) {
        /*
        // Method dump skipped, instructions count: 855
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.A07(int):void");
    }

    public final void A08(int i) {
        AnonymousClass0XW r0 = this.A0W;
        if (r0 != null) {
            r0.AIH(i);
        }
        List list = this.A0c;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                AnonymousClass0XW r02 = (AnonymousClass0XW) this.A0c.get(i2);
                if (r02 != null) {
                    r02.AIH(i);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A09(int r13, float r14, int r15) {
        /*
        // Method dump skipped, instructions count: 189
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.A09(int, float, int):void");
    }

    public final void A0A(int i, int i2, int i3, int i4) {
        float f;
        if (i2 <= 0 || this.A0o.isEmpty()) {
            C07730Zh A022 = A02(this.A0A);
            if (A022 != null) {
                f = Math.min(A022.A00, this.A05);
            } else {
                f = 0.0f;
            }
            int paddingLeft = (int) (f * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
            if (paddingLeft != getScrollX()) {
                A0G(false);
                scrollTo(paddingLeft, getScrollY());
            }
        } else if (!this.mScroller.isFinished()) {
            this.mScroller.setFinalX(getCurrentItem() * getClientWidth());
        } else {
            scrollTo((int) ((((float) getScrollX()) / ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))) * ((float) (((i - getPaddingLeft()) - getPaddingRight()) + i3))), getScrollY());
        }
    }

    public void A0B(int i, boolean z) {
        this.A0j = false;
        A0D(i, z, false, 0);
    }

    public final void A0C(int i, boolean z, int i2, boolean z2) {
        int i3;
        int scrollX;
        int A002;
        C07730Zh A022 = A02(i);
        if (A022 != null) {
            i3 = (int) (Math.max(this.A00, Math.min(A022.A00, this.A05)) * ((float) getClientWidth()));
        } else {
            i3 = 0;
        }
        if (z) {
            if (getChildCount() == 0) {
                setScrollingCacheEnabled(false);
            } else {
                Scroller scroller = this.mScroller;
                if (scroller == null || scroller.isFinished()) {
                    scrollX = getScrollX();
                } else {
                    if (this.A0h) {
                        scrollX = this.mScroller.getCurrX();
                    } else {
                        scrollX = this.mScroller.getStartX();
                    }
                    this.mScroller.abortAnimation();
                    setScrollingCacheEnabled(false);
                }
                int scrollY = getScrollY();
                int i4 = i3 - scrollX;
                int i5 = 0 - scrollY;
                if (i4 == 0 && i5 == 0) {
                    A0G(false);
                    A07(this.A0A);
                    setScrollState(0);
                } else {
                    setScrollingCacheEnabled(true);
                    setScrollState(2);
                    int clientWidth = getClientWidth();
                    float abs = (float) Math.abs(i4);
                    float f = (float) clientWidth;
                    float f2 = (float) (clientWidth >> 1);
                    float sin = (((float) Math.sin((double) ((Math.min(1.0f, (abs * 1.0f) / f) - 0.5f) * 0.47123894f))) * f2) + f2;
                    int abs2 = Math.abs(i2);
                    if (abs2 > 0) {
                        A002 = Math.round(Math.abs(sin / ((float) abs2)) * 1000.0f) << 2;
                    } else {
                        A002 = (int) (((abs / ((this.A0V.A00(this.A0A) * f) + ((float) this.A0K))) + 1.0f) * 100.0f);
                    }
                    int min = Math.min(A002, 600);
                    this.A0h = false;
                    this.mScroller.startScroll(scrollX, scrollY, i4, i5, min);
                    postInvalidateOnAnimation();
                }
            }
            if (z2) {
                A08(i);
                return;
            }
            return;
        }
        if (z2) {
            A08(i);
        }
        A0G(false);
        scrollTo(i3, 0);
        A0M(i3);
    }

    public void A0D(int i, boolean z, boolean z2, int i2) {
        AnonymousClass0YE r0 = this.A0V;
        boolean z3 = false;
        if (r0 == null || r0.A01() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z2 || this.A0A != i || this.A0o.size() == 0) {
            if (i < 0) {
                i = 0;
            } else if (i >= this.A0V.A01()) {
                i = this.A0V.A01() - 1;
            }
            int i3 = this.A0J;
            int i4 = this.A0A;
            if (i > i4 + i3 || i < i4 - i3) {
                int i5 = 0;
                while (true) {
                    ArrayList arrayList = this.A0o;
                    if (i5 >= arrayList.size()) {
                        break;
                    }
                    ((C07730Zh) arrayList.get(i5)).A04 = true;
                    i5++;
                }
            }
            if (i4 != i) {
                z3 = true;
            }
            if (this.A0e) {
                this.A0A = i;
                if (z3) {
                    A08(i);
                }
                requestLayout();
                return;
            }
            A07(i);
            A0C(i, z, i2, z3);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    public final void A0E(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.A06) {
            int i = 0;
            if (actionIndex == 0) {
                i = 1;
            }
            this.A03 = motionEvent.getX(i);
            this.A06 = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.A0S;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public void A0F(AnonymousClass0XW r2) {
        List list = this.A0c;
        if (list == null) {
            list = new ArrayList();
            this.A0c = list;
        }
        list.add(r2);
    }

    public final void A0G(boolean z) {
        boolean z2 = false;
        if (this.A0N == 2) {
            z2 = true;
            setScrollingCacheEnabled(false);
            if (!this.mScroller.isFinished()) {
                this.mScroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.mScroller.getCurrX();
                int currY = this.mScroller.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        A0M(currX);
                    }
                }
            }
        }
        this.A0j = false;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A0o;
            if (i >= arrayList.size()) {
                break;
            }
            C07730Zh r1 = (C07730Zh) arrayList.get(i);
            if (r1.A04) {
                r1.A04 = false;
                z2 = true;
            }
            i++;
        }
        if (!z2) {
            return;
        }
        if (z) {
            postOnAnimation(this.A0n);
        } else {
            this.A0n.run();
        }
    }

    public void A0H(boolean z, AbstractC17500re r7) {
        int i = 1;
        boolean z2 = false;
        if (r7 != null) {
            z2 = true;
        }
        boolean z3 = false;
        if (this.A0X != null) {
            z3 = true;
        }
        boolean z4 = false;
        if (z2 != z3) {
            z4 = true;
        }
        this.A0X = r7;
        setChildrenDrawingOrderEnabled(z2);
        if (z2) {
            if (z) {
                i = 2;
            }
            this.A0D = i;
            this.A0L = 2;
        } else {
            this.A0D = 0;
        }
        if (z4) {
            A07(this.A0A);
        }
    }

    public boolean A0I() {
        AnonymousClass0YE r0 = this.A0V;
        if (r0 == null || this.A0A >= r0.A01() - 1) {
            return false;
        }
        A0B(this.A0A + 1, true);
        return true;
    }

    public final boolean A0J() {
        this.A06 = -1;
        this.A0g = false;
        this.A0i = false;
        VelocityTracker velocityTracker = this.A0S;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.A0S = null;
        }
        this.A0T.onRelease();
        this.A0U.onRelease();
        if (this.A0T.isFinished() || this.A0U.isFinished()) {
            return true;
        }
        return false;
    }

    public final boolean A0K(float f) {
        boolean z;
        boolean z2;
        this.A03 = f;
        float scrollX = ((float) getScrollX()) + (this.A03 - f);
        float clientWidth = (float) getClientWidth();
        float f2 = this.A00 * clientWidth;
        float f3 = this.A05 * clientWidth;
        ArrayList arrayList = this.A0o;
        boolean z3 = false;
        C07730Zh r1 = (C07730Zh) arrayList.get(0);
        C07730Zh r8 = (C07730Zh) arrayList.get(arrayList.size() - 1);
        if (r1.A02 != 0) {
            f2 = r1.A00 * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (r8.A02 != this.A0V.A01() - 1) {
            f3 = r8.A00 * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f2) {
            if (z) {
                this.A0T.onPull(Math.abs(f2 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f2;
        } else if (scrollX > f3) {
            if (z2) {
                this.A0U.onPull(Math.abs(scrollX - f3) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        }
        int i = (int) scrollX;
        this.A03 = (scrollX - ((float) i)) + this.A03;
        scrollTo(i, getScrollY());
        A0M(i);
        return z3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008b, code lost:
        if (r4 != false) goto L_0x008d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0L(int r8) {
        /*
        // Method dump skipped, instructions count: 208
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.A0L(int):boolean");
    }

    public final boolean A0M(int i) {
        if (this.A0o.size() != 0) {
            C07730Zh A012 = A01();
            int clientWidth = getClientWidth();
            int i2 = this.A0K;
            int i3 = clientWidth + i2;
            float f = (float) i2;
            float f2 = (float) clientWidth;
            int i4 = A012.A02;
            float f3 = ((((float) i) / f2) - A012.A00) / (A012.A01 + (f / f2));
            this.A0d = false;
            A09(i4, f3, (int) (((float) i3) * f3));
            if (this.A0d) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.A0e) {
            return false;
        } else {
            this.A0d = false;
            A09(0, 0.0f, 0);
            if (this.A0d) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    public boolean A0N(View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && A0N(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (!z || !view.canScrollHorizontally(-i)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addFocusables(ArrayList arrayList, int i, int i2) {
        C07730Zh A042;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (A042 = A04(childAt)) != null && A042.A02 == this.A0A) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
            if (descendantFocusability == 262144 && size != arrayList.size()) {
                return;
            }
        }
        if (isFocusable()) {
            if ((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) {
                arrayList.add(this);
            }
        }
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addTouchables(ArrayList arrayList) {
        C07730Zh A042;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (A042 = A04(childAt)) != null && A042.A02 == this.A0A) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C09550d8 r4 = (C09550d8) layoutParams;
        boolean z = r4.A04;
        boolean z2 = false;
        if (view.getClass().getAnnotation(DecorView.class) != null) {
            z2 = true;
        }
        boolean z3 = z | z2;
        r4.A04 = z3;
        if (!this.A0f) {
            super.addView(view, i, layoutParams);
        } else if (!z3) {
            r4.A05 = true;
            addViewInLayout(view, i, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    public boolean canScrollHorizontally(int i) {
        if (this.A0V == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            if (scrollX > ((int) (((float) clientWidth) * this.A00))) {
                return true;
            }
            return false;
        } else if (i <= 0 || scrollX >= ((int) (((float) clientWidth) * this.A05))) {
            return false;
        } else {
            return true;
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C09550d8) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        this.A0h = true;
        if (this.mScroller.isFinished() || !this.mScroller.computeScrollOffset()) {
            A0G(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.mScroller.getCurrX();
        int currY = this.mScroller.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!A0M(currX)) {
                this.mScroller.abortAnimation();
                scrollTo(0, currY);
            }
        }
        postInvalidateOnAnimation();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean A0L2;
        if (!super.dispatchKeyEvent(keyEvent)) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode != 61) {
                        return false;
                    }
                    if (keyEvent.hasNoModifiers()) {
                        A0L2 = A0L(2);
                    } else if (!keyEvent.hasModifiers(1)) {
                        return false;
                    } else {
                        A0L2 = A0L(1);
                    }
                } else if (keyEvent.hasModifiers(2)) {
                    A0L2 = A0I();
                } else {
                    A0L2 = A0L(66);
                }
            } else if (keyEvent.hasModifiers(2)) {
                int i = this.A0A;
                if (i <= 0) {
                    return false;
                }
                A0B(i - 1, true);
            } else {
                A0L2 = A0L(17);
            }
            if (A0L2) {
                return true;
            }
            return false;
        }
        return true;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C07730Zh A042;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (A042 = A04(childAt)) != null && A042.A02 == this.A0A && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public void draw(Canvas canvas) {
        AnonymousClass0YE r0;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (r0 = this.A0V) != null && r0.A01() > 1)) {
            if (!this.A0T.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) (getPaddingTop() + (-height)), this.A00 * ((float) width));
                this.A0T.setSize(height, width);
                z = false | this.A0T.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.A0U.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.A05 + 1.0f)) * ((float) width2));
                this.A0U.setSize(height2, width2);
                z |= this.A0U.draw(canvas);
                canvas.restoreToCount(save2);
            }
            if (z) {
                postInvalidateOnAnimation();
                return;
            }
            return;
        }
        this.A0T.finish();
        this.A0U.finish();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.A0Q;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C09550d8();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C09550d8(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public AnonymousClass0YE getAdapter() {
        return this.A0V;
    }

    public int getChildDrawingOrder(int i, int i2) {
        if (this.A0D == 2) {
            i2 = (i - 1) - i2;
        }
        return ((C09550d8) ((View) this.A0a.get(i2)).getLayoutParams()).A01;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public int getCurrentItem() {
        return this.A0A;
    }

    public int getOffscreenPageLimit() {
        return this.A0J;
    }

    public int getPageMargin() {
        return this.A0K;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A0e = true;
    }

    public void onDetachedFromWindow() {
        removeCallbacks(this.A0n);
        Scroller scroller = this.mScroller;
        if (scroller != null && !scroller.isFinished()) {
            this.mScroller.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    public void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        if (this.A0K > 0 && this.A0Q != null) {
            ArrayList arrayList = this.A0o;
            if (arrayList.size() > 0 && this.A0V != null) {
                int scrollX = getScrollX();
                int width = getWidth();
                float f2 = (float) width;
                float f3 = ((float) this.A0K) / f2;
                int i = 0;
                C07730Zh r5 = (C07730Zh) arrayList.get(0);
                float f4 = r5.A00;
                int size = arrayList.size();
                int i2 = ((C07730Zh) arrayList.get(size - 1)).A02;
                for (int i3 = r5.A02; i3 < i2; i3++) {
                    while (i3 > r5.A02 && i < size) {
                        i++;
                        r5 = (C07730Zh) arrayList.get(i);
                    }
                    if (i3 == r5.A02) {
                        float f5 = r5.A00 + r5.A01;
                        f = f5 * f2;
                        f4 = f5 + f3;
                    } else {
                        float A002 = this.A0V.A00(i3);
                        f = (f4 + A002) * f2;
                        f4 = A002 + f3 + f4;
                    }
                    float f6 = ((float) this.A0K) + f;
                    if (f6 > ((float) scrollX)) {
                        this.A0Q.setBounds(Math.round(f), this.A0O, Math.round(f6), this.A07);
                        this.A0Q.draw(canvas);
                    }
                    if (f > ((float) (scrollX + width))) {
                        return;
                    }
                }
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            A0J();
            return false;
        }
        if (action != 0) {
            if (this.A0g) {
                return true;
            }
            if (this.A0i) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.A01 = x;
            this.A03 = x;
            float y = motionEvent.getY();
            this.A02 = y;
            this.A04 = y;
            this.A06 = motionEvent.getPointerId(0);
            this.A0i = false;
            this.A0h = true;
            this.mScroller.computeScrollOffset();
            if (this.A0N != 2 || Math.abs(this.mScroller.getFinalX() - this.mScroller.getCurrX()) <= this.A09) {
                A0G(false);
                this.A0g = false;
            } else {
                this.mScroller.abortAnimation();
                this.A0j = false;
                A07(this.A0A);
                this.A0g = true;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.A06;
            if (i != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i);
                float x2 = motionEvent.getX(findPointerIndex);
                float f2 = x2 - this.A03;
                float abs = Math.abs(f2);
                float y2 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.A02);
                if (f2 != 0.0f) {
                    float f3 = this.A03;
                    if ((f3 >= ((float) this.A0G) || f2 <= 0.0f) && ((f3 <= ((float) (getWidth() - this.A0G)) || f2 >= 0.0f) && A0N(this, false, (int) f2, (int) x2, (int) y2))) {
                        this.A03 = x2;
                        this.A04 = y2;
                        this.A0i = true;
                        return false;
                    }
                }
                float f4 = (float) this.A0P;
                if (abs > f4 && abs * 0.5f > abs2) {
                    this.A0g = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                    if (f2 > 0.0f) {
                        f = this.A01 + ((float) this.A0P);
                    } else {
                        f = this.A01 - ((float) this.A0P);
                    }
                    this.A03 = f;
                    this.A04 = y2;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > f4) {
                    this.A0i = true;
                }
                if (this.A0g && A0K(x2)) {
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            A0E(motionEvent);
        }
        VelocityTracker velocityTracker = this.A0S;
        if (velocityTracker == null) {
            velocityTracker = VelocityTracker.obtain();
            this.A0S = velocityTracker;
        }
        velocityTracker.addMovement(motionEvent);
        return this.A0g;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r16, int r17, int r18, int r19, int r20) {
        /*
        // Method dump skipped, instructions count: 272
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0068, code lost:
        if (r2 == 80) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b1, code lost:
        if (r12 == false) goto L_0x0079;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r18, int r19) {
        /*
        // Method dump skipped, instructions count: 244
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onMeasure(int, int):void");
    }

    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        C07730Zh A042;
        int childCount = getChildCount();
        int i4 = -1;
        if ((i & 2) != 0) {
            i4 = childCount;
            i2 = 0;
            i3 = 1;
        } else {
            i2 = childCount - 1;
            i3 = -1;
        }
        while (i2 != i4) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (A042 = A04(childAt)) != null && A042.A02 == this.A0A && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i3;
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C30941cF)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C30941cF r4 = (C30941cF) parcelable;
        super.onRestoreInstanceState(((AbstractC15200nf) r4).A00);
        AnonymousClass0YE r2 = this.A0V;
        if (r2 != null) {
            r2.A09(r4.A01, r4.A02);
            A0D(r4.A00, false, true, 0);
            return;
        }
        this.A0M = r4.A00;
        this.A0R = r4.A01;
        this.A0Z = r4.A02;
    }

    public Parcelable onSaveInstanceState() {
        C30941cF r1 = new C30941cF(super.onSaveInstanceState());
        r1.A00 = this.A0A;
        AnonymousClass0YE r0 = this.A0V;
        if (r0 != null) {
            r1.A01 = r0.A03();
        }
        return r1;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.A0K;
            A0A(i, i3, i5, i5);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x00fe  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
        // Method dump skipped, instructions count: 413
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void removeView(View view) {
        if (this.A0f) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(AnonymousClass0YE r8) {
        ArrayList arrayList;
        AnonymousClass0YE r1 = this.A0V;
        if (r1 != null) {
            synchronized (r1) {
                r1.A00 = null;
            }
            this.A0V.A0B(this);
            int i = 0;
            while (true) {
                arrayList = this.A0o;
                if (i >= arrayList.size()) {
                    break;
                }
                C07730Zh r0 = (C07730Zh) arrayList.get(i);
                this.A0V.A0C(this, r0.A02, r0.A03);
                i++;
            }
            this.A0V.A0A(this);
            arrayList.clear();
            int i2 = 0;
            while (i2 < getChildCount()) {
                if (!((C09550d8) getChildAt(i2).getLayoutParams()).A04) {
                    removeViewAt(i2);
                    i2--;
                }
                i2++;
            }
            this.A0A = 0;
            scrollTo(0, 0);
        }
        AnonymousClass0YE r3 = this.A0V;
        this.A0V = r8;
        this.A0E = 0;
        if (r8 != null) {
            C08380b1 r02 = this.A0Y;
            if (r02 == null) {
                r02 = new C08380b1(this);
                this.A0Y = r02;
            }
            AnonymousClass0YE r12 = this.A0V;
            synchronized (r12) {
                r12.A00 = r02;
            }
            this.A0j = false;
            boolean z = this.A0e;
            this.A0e = true;
            this.A0E = this.A0V.A01();
            if (this.A0M >= 0) {
                this.A0V.A09(this.A0R, this.A0Z);
                A0D(this.A0M, false, true, 0);
                this.A0M = -1;
                this.A0R = null;
                this.A0Z = null;
            } else if (!z) {
                A07(this.A0A);
            } else {
                requestLayout();
            }
        }
        List list = this.A0b;
        if (!(list == null || list.isEmpty())) {
            int size = this.A0b.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((AbstractC17490rd) this.A0b.get(i3)).ACb(this, r3, r8);
            }
        }
    }

    public void setCurrentItem(int i) {
        this.A0j = false;
        A0D(i, !this.A0e, false, 0);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            StringBuilder sb = new StringBuilder("Requested offscreen page limit ");
            sb.append(i);
            sb.append(" too small; defaulting to ");
            sb.append(1);
            Log.w("ViewPager", sb.toString());
            i = 1;
        }
        if (i != this.A0J) {
            this.A0J = i;
            A07(this.A0A);
        }
    }

    public void setOnPageChangeListener(AnonymousClass0XW r1) {
        this.A0W = r1;
    }

    public void setPageMargin(int i) {
        int i2 = this.A0K;
        this.A0K = i;
        int width = getWidth();
        A0A(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(C004302a.A03(getContext(), i));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        boolean z;
        this.A0Q = drawable;
        if (drawable != null) {
            refreshDrawableState();
            z = false;
        } else {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setScrollState(int i) {
        int i2;
        if (this.A0N != i) {
            this.A0N = i;
            if (this.A0X != null) {
                boolean z = false;
                if (i != 0) {
                    z = true;
                }
                int childCount = getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    if (z) {
                        i2 = this.A0L;
                    } else {
                        i2 = 0;
                    }
                    getChildAt(i3).setLayerType(i2, null);
                }
            }
            AnonymousClass0XW r0 = this.A0W;
            if (r0 != null) {
                r0.AIF(i);
            }
            List list = this.A0c;
            if (list != null) {
                int size = list.size();
                for (int i4 = 0; i4 < size; i4++) {
                    AnonymousClass0XW r02 = (AnonymousClass0XW) this.A0c.get(i4);
                    if (r02 != null) {
                        r02.AIF(i);
                    }
                }
            }
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.A0k != z) {
            this.A0k = z;
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.A0Q;
    }
}
