package androidx.core.widget;

import X.AbstractC07820Zr;
import X.AbstractC07870a0;
import X.AbstractC15110nW;
import X.AnonymousClass008;
import X.AnonymousClass0N2;
import X.AnonymousClass0Q7;
import X.C07810Zp;
import X.C14910n5;
import X.C14920n6;
import X.C15130nY;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.search.verification.client.SearchActionVerificationClientService;

public class NestedScrollView extends FrameLayout implements AbstractC07820Zr, AbstractC07870a0 {
    public static final C07810Zp A0Q = new C07810Zp();
    public static final int[] A0R = {16843130};
    public float A00;
    public int A01 = -1;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public long A08;
    public VelocityTracker A09;
    public View A0A = null;
    public EdgeEffect A0B;
    public EdgeEffect A0C;
    public OverScroller A0D = new OverScroller(getContext());
    public AbstractC15110nW A0E;
    public C15130nY A0F;
    public boolean A0G;
    public boolean A0H = false;
    public boolean A0I = false;
    public boolean A0J = true;
    public boolean A0K = true;
    public final Rect A0L = new Rect();
    public final C14910n5 A0M;
    public final C14920n6 A0N;
    public final int[] A0O = new int[2];
    public final int[] A0P = new int[2];

    @Override // X.AnonymousClass0W6
    public boolean AKM(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // X.AnonymousClass0W7
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (i & 2) != 0;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.A07 = viewConfiguration.getScaledTouchSlop();
        this.A05 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.A04 = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A0R, 0, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.A0N = new C14920n6();
        this.A0M = new C14910n5(this);
        setNestedScrollingEnabled(true);
        AnonymousClass0Q7.A0d(this, A0Q);
    }

    public static boolean A00(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || !A00((View) parent, view2)) {
            return false;
        }
        return true;
    }

    public int A01(Rect rect) {
        int i;
        int i2;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i3 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i4 = i3 - verticalFadingEdgeLength;
        if (rect.bottom >= childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin) {
            i4 = i3;
        }
        int i5 = rect.bottom;
        if (i5 > i4 && rect.top > scrollY) {
            if (rect.height() > height) {
                i2 = rect.top - scrollY;
            } else {
                i2 = rect.bottom - i4;
            }
            return Math.min(i2 + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i3);
        } else if (rect.top >= scrollY || i5 >= i4) {
            return 0;
        } else {
            if (rect.height() > height) {
                i = 0 - (i4 - rect.bottom);
            } else {
                i = 0 - (scrollY - rect.top);
            }
            return Math.max(i, -getScrollY());
        }
    }

    public final void A02() {
        this.A0H = false;
        VelocityTracker velocityTracker = this.A09;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.A09 = null;
        }
        this.A0M.A01(0);
        EdgeEffect edgeEffect = this.A0C;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.A0B.onRelease();
        }
    }

    public final void A03() {
        if (getOverScrollMode() == 2) {
            this.A0C = null;
            this.A0B = null;
        } else if (this.A0C == null) {
            Context context = getContext();
            this.A0C = new EdgeEffect(context);
            this.A0B = new EdgeEffect(context);
        }
    }

    public void A04(int i) {
        if (getChildCount() > 0) {
            this.A0D.fling(getScrollX(), getScrollY(), 0, i, 0, 0, EditorInfoCompat.IME_FLAG_FORCE_ASCII, Integer.MAX_VALUE, 0, 0);
            this.A0M.A02(2, 1);
            this.A03 = getScrollY();
            postInvalidateOnAnimation();
        }
    }

    public final void A05(int i) {
        if (i == 0) {
            return;
        }
        if (this.A0K) {
            A06(0, i, false);
        } else {
            scrollBy(0, i);
        }
    }

    public final void A06(int i, int i2, boolean z) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.A08 > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int scrollY = getScrollY();
                OverScroller overScroller = this.A0D;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY);
                if (z) {
                    this.A0M.A02(2, 1);
                } else {
                    this.A0M.A01(1);
                }
                this.A03 = getScrollY();
                postInvalidateOnAnimation();
            } else {
                if (!this.A0D.isFinished()) {
                    this.A0D.abortAnimation();
                    this.A0M.A01(1);
                }
                scrollBy(i, i2);
            }
            this.A08 = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    public final void A07(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.A0M.A03(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    public void A08(int i, boolean z) {
        A06(0 - getScrollX(), i - getScrollY(), z);
    }

    public final void A09(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.A01) {
            int i = 0;
            if (actionIndex == 0) {
                i = 1;
            }
            this.A02 = (int) motionEvent.getY(i);
            this.A01 = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.A09;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean A0A(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !A0F(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33) {
                if (getScrollY() < maxScrollAmount) {
                    maxScrollAmount = getScrollY();
                }
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            A05(maxScrollAmount);
        } else {
            Rect rect = this.A0L;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            A05(A01(rect));
            findNextFocus.requestFocus(i);
        }
        if (findFocus != null && findFocus.isFocused() && (!A0F(findFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public boolean A0B(int i) {
        int childCount;
        boolean z = false;
        if (i == 130) {
            z = true;
        }
        int height = getHeight();
        Rect rect = this.A0L;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return A0C(i, rect.top, rect.bottom);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        if (r2 >= r16) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0C(int r14, int r15, int r16) {
        /*
        // Method dump skipped, instructions count: 123
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.A0C(int, int, int):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0D(int r13, int r14, int r15, int r16) {
        /*
            r12 = this;
            r8 = 0
            int r5 = r12.getOverScrollMode()
            int r1 = r12.computeHorizontalScrollRange()
            int r0 = r12.computeHorizontalScrollExtent()
            r4 = 0
            r3 = 1
            r2 = 0
            if (r1 <= r0) goto L_0x0013
            r2 = 1
        L_0x0013:
            r12.computeVerticalScrollRange()
            r12.computeVerticalScrollExtent()
            int r6 = r14 + r8
            r2 = 0
            int r7 = r15 + r13
            int r1 = -r8
            int r0 = r8 + r16
            if (r6 <= r8) goto L_0x004b
            r6 = 0
        L_0x0024:
            r2 = 1
        L_0x0025:
            if (r7 <= r0) goto L_0x0045
            r7 = r0
        L_0x0028:
            r1 = 1
            X.0n5 r0 = r12.A0M
            android.view.ViewParent r0 = r0.A00(r3)
            if (r0 != 0) goto L_0x003c
            android.widget.OverScroller r5 = r12.A0D
            int r11 = r12.getScrollRange()
            r9 = r8
            r10 = r8
            r5.springBack(r6, r7, r8, r9, r10, r11)
        L_0x003c:
            r12.onOverScrolled(r6, r7, r2, r1)
            if (r2 != 0) goto L_0x0043
            if (r1 == 0) goto L_0x0044
        L_0x0043:
            r4 = 1
        L_0x0044:
            return r4
        L_0x0045:
            if (r7 >= r1) goto L_0x0049
            r7 = r1
            goto L_0x0028
        L_0x0049:
            r1 = 0
            goto L_0x003c
        L_0x004b:
            if (r6 >= r1) goto L_0x0025
            r6 = r1
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.A0D(int, int, int, int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0030, code lost:
        if (r2 <= ((getHeight() - getPaddingTop()) - getPaddingBottom())) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0E(android.view.KeyEvent r9) {
        /*
        // Method dump skipped, instructions count: 234
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.A0E(android.view.KeyEvent):boolean");
    }

    public final boolean A0F(View view, int i, int i2) {
        Rect rect = this.A0L;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i2;
    }

    @Override // X.AnonymousClass0W6
    public void AHt(View view, int i, int i2, int[] iArr, int i3) {
        this.A0M.A04(i, i2, iArr, null, i3);
    }

    @Override // X.AnonymousClass0W6
    public void AHu(View view, int i, int i2, int i3, int i4, int i5) {
        A07(i4, i5, null);
    }

    @Override // X.AbstractC07870a0
    public void AHv(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        A07(i4, i5, iArr);
    }

    @Override // X.AnonymousClass0W6
    public void AHw(View view, View view2, int i, int i2) {
        C14920n6 r1 = this.A0N;
        if (i2 == 1) {
            r1.A00 = i;
        } else {
            r1.A01 = i;
        }
        this.A0M.A02(2, i2);
    }

    @Override // X.AnonymousClass0W6
    public void AKc(View view, int i) {
        C14920n6 r2 = this.A0N;
        if (i == 1) {
            r2.A00 = 0;
        } else {
            r2.A01 = 0;
        }
        this.A0M.A01(i);
    }

    @Override // X.AbstractC07820Zr
    public void AQF(int i) {
        this.A0M.A01(i);
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public void computeScroll() {
        if (!this.A0D.isFinished()) {
            this.A0D.computeScrollOffset();
            int currY = this.A0D.getCurrY();
            int i = currY - this.A03;
            this.A03 = currY;
            int[] iArr = this.A0O;
            iArr[1] = 0;
            C14910n5 r4 = this.A0M;
            r4.A04(0, i, iArr, null, 1);
            int i2 = i - iArr[1];
            int scrollRange = getScrollRange();
            if (i2 != 0) {
                int scrollY = getScrollY();
                A0D(i2, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i3 = i2 - scrollY2;
                iArr[1] = 0;
                r4.A03(0, scrollY2, 0, i3, this.A0P, 1, iArr);
                int i4 = i3 - iArr[1];
                if (i4 != 0) {
                    int overScrollMode = getOverScrollMode();
                    if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                        A03();
                        if (i4 < 0) {
                            if (this.A0C.isFinished()) {
                                this.A0C.onAbsorb((int) this.A0D.getCurrVelocity());
                            }
                        } else if (this.A0B.isFinished()) {
                            this.A0B.onAbsorb((int) this.A0D.getCurrVelocity());
                        }
                    }
                    this.A0D.abortAnimation();
                    r4.A01(1);
                }
            }
            if (!this.A0D.isFinished()) {
                postInvalidateOnAnimation();
            } else {
                r4.A01(1);
            }
        }
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || A0E(keyEvent);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        ViewParent viewParent;
        C14910n5 r2 = this.A0M;
        if (!r2.A02 || (viewParent = r2.A01) == null) {
            return false;
        }
        return AnonymousClass0N2.A1i(viewParent, r2.A04, f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        ViewParent viewParent;
        C14910n5 r2 = this.A0M;
        if (!r2.A02 || (viewParent = r2.A01) == null) {
            return false;
        }
        return AnonymousClass0N2.A1h(viewParent, r2.A04, f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.A0M.A04(i, i2, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.A0M.A03(i, i2, i3, i4, iArr, 0, null);
    }

    public void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        if (this.A0C != null) {
            int scrollY = getScrollY();
            int i = 0;
            if (!this.A0C.isFinished()) {
                int save = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int min = Math.min(0, scrollY);
                if (Build.VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width -= getPaddingRight() + getPaddingLeft();
                    paddingLeft = getPaddingLeft() + 0;
                } else {
                    paddingLeft = 0;
                }
                if (Build.VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height -= getPaddingBottom() + getPaddingTop();
                    min += getPaddingTop();
                }
                canvas.translate((float) paddingLeft, (float) min);
                this.A0C.setSize(width, height);
                if (this.A0C.draw(canvas)) {
                    postInvalidateOnAnimation();
                }
                canvas.restoreToCount(save);
            }
            if (!this.A0B.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = getHeight();
                int max = Math.max(getScrollRange(), scrollY) + height2;
                if (Build.VERSION.SDK_INT < 21 || getClipToPadding()) {
                    width2 -= getPaddingRight() + getPaddingLeft();
                    i = 0 + getPaddingLeft();
                }
                if (Build.VERSION.SDK_INT >= 21 && getClipToPadding()) {
                    height2 -= getPaddingBottom() + getPaddingTop();
                    max -= getPaddingBottom();
                }
                canvas.translate((float) (i - width2), (float) max);
                canvas.rotate(180.0f, (float) width2, 0.0f);
                this.A0B.setSize(width2, height2);
                if (this.A0B.draw(canvas)) {
                    postInvalidateOnAnimation();
                }
                canvas.restoreToCount(save2);
            }
        }
    }

    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        C14920n6 r0 = this.A0N;
        return r0.A01 | r0.A00;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    private float getVerticalScrollFactorCompat() {
        float f = this.A00;
        if (f != 0.0f) {
            return f;
        }
        TypedValue typedValue = new TypedValue();
        Context context = getContext();
        if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
            float dimension = typedValue.getDimension(context.getResources().getDisplayMetrics());
            this.A00 = dimension;
            return dimension;
        }
        throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
    }

    public boolean hasNestedScrollingParent() {
        ViewParent viewParent;
        C14910n5 r1 = this.A0M;
        if (0 == 0) {
            viewParent = r1.A01;
        } else if (0 != 1) {
            viewParent = null;
        } else {
            viewParent = r1.A00;
        }
        return viewParent != null;
    }

    @Override // X.AbstractC06780Ur
    public boolean isNestedScrollingEnabled() {
        return this.A0M.A02;
    }

    public void measureChild(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A0I = false;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.A0H) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int verticalScrollFactorCompat = (int) (axisValue * getVerticalScrollFactorCompat());
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i = scrollY - verticalScrollFactorCompat;
                if (i < 0) {
                    scrollRange = 0;
                } else if (i <= scrollRange) {
                    scrollRange = i;
                }
                if (scrollRange != scrollY) {
                    super.scrollTo(getScrollX(), scrollRange);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 2 && this.A0H) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.A01;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            StringBuilder sb = new StringBuilder("Invalid pointerId=");
                            sb.append(i2);
                            sb.append(" in onInterceptTouchEvent");
                            Log.e("NestedScrollView", sb.toString());
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y - this.A02) > this.A07 && (2 & getNestedScrollAxes()) == 0) {
                                this.A0H = true;
                                this.A02 = y;
                                VelocityTracker velocityTracker = this.A09;
                                if (velocityTracker == null) {
                                    velocityTracker = VelocityTracker.obtain();
                                    this.A09 = velocityTracker;
                                }
                                velocityTracker.addMovement(motionEvent);
                                this.A06 = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        A09(motionEvent);
                    }
                }
            }
            this.A0H = false;
            this.A01 = -1;
            VelocityTracker velocityTracker2 = this.A09;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.A09 = null;
            }
            if (this.A0D.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            this.A0M.A01(0);
        } else {
            int y2 = (int) motionEvent.getY();
            int x = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y2 >= childAt.getTop() - scrollY && y2 < childAt.getBottom() - scrollY && x >= childAt.getLeft() && x < childAt.getRight()) {
                    this.A02 = y2;
                    this.A01 = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker3 = this.A09;
                    if (velocityTracker3 == null) {
                        this.A09 = VelocityTracker.obtain();
                    } else {
                        velocityTracker3.clear();
                    }
                    this.A09.addMovement(motionEvent);
                    this.A0D.computeScrollOffset();
                    this.A0H = !this.A0D.isFinished();
                    this.A0M.A02(2, 0);
                }
            }
            this.A0H = false;
            VelocityTracker velocityTracker4 = this.A09;
            if (velocityTracker4 != null) {
                velocityTracker4.recycle();
                this.A09 = null;
            }
        }
        return this.A0H;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        if (r2 != false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        if (r4 != false) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r7, int r8, int r9, int r10, int r11) {
        /*
        // Method dump skipped, instructions count: 183
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A0G && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // X.AnonymousClass0W7
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        A04((int) f2);
        return true;
    }

    @Override // X.AnonymousClass0W7
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // X.AnonymousClass0W7
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        this.A0M.A04(i, i2, iArr, null, 0);
    }

    @Override // X.AnonymousClass0W7
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        A07(i4, 0, null);
    }

    @Override // X.AnonymousClass0W7
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.A0N.A01 = i;
        this.A0M.A02(2, 0);
    }

    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        View findNextFocusFromRect;
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        FocusFinder instance = FocusFinder.getInstance();
        if (rect == null) {
            findNextFocusFromRect = instance.findNextFocus(this, null, i);
        } else {
            findNextFocusFromRect = instance.findNextFocusFromRect(this, rect, i);
        }
        if (findNextFocusFromRect != null && !(true ^ A0F(findNextFocusFromRect, 0, getHeight()))) {
            return findNextFocusFromRect.requestFocus(i, rect);
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C15130nY)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C15130nY r2 = (C15130nY) parcelable;
        super.onRestoreInstanceState(r2.getSuperState());
        this.A0F = r2;
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        C15130nY r1 = new C15130nY(super.onSaveInstanceState());
        r1.A00 = getScrollY();
        return r1;
    }

    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        AbstractC15110nW r0 = this.A0E;
        if (r0 != null) {
            r0.AJn(this, i, i2, i3, i4);
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && A0F(findFocus, 0, i4)) {
            Rect rect = this.A0L;
            findFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findFocus, rect);
            A05(A01(rect));
        }
    }

    @Override // X.AnonymousClass0W7
    public void onStopNestedScroll(View view) {
        this.A0N.A01 = 0;
        AQF(0);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        boolean z;
        ViewParent viewParent;
        if (this.A09 == null) {
            this.A09 = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.A06 = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(0.0f, (float) this.A06);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.A09;
                velocityTracker.computeCurrentVelocity(SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS, (float) this.A04);
                int yVelocity = (int) velocityTracker.getYVelocity(this.A01);
                if (Math.abs(yVelocity) >= this.A05) {
                    int i = -yVelocity;
                    float f = (float) i;
                    if (!dispatchNestedPreFling(0.0f, f)) {
                        dispatchNestedFling(0.0f, f, true);
                        A04(i);
                    }
                } else if (this.A0D.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.A01 = -1;
                A02();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.A01);
                if (findPointerIndex == -1) {
                    StringBuilder A0S = AnonymousClass008.A0S("Invalid pointerId=");
                    A0S.append(this.A01);
                    A0S.append(" in onTouchEvent");
                    Log.e("NestedScrollView", A0S.toString());
                } else {
                    int y = (int) motionEvent.getY(findPointerIndex);
                    int i2 = this.A02 - y;
                    boolean z2 = this.A0H;
                    if (!z2 && Math.abs(i2) > this.A07) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.A0H = true;
                        z2 = true;
                        int i3 = this.A07;
                        i2 = i2 > 0 ? i2 - i3 : i2 + i3;
                    }
                    if (z2) {
                        int[] iArr = this.A0O;
                        int[] iArr2 = this.A0P;
                        C14910n5 r12 = this.A0M;
                        if (r12.A04(0, i2, iArr, iArr2, 0)) {
                            i2 -= iArr[1];
                            this.A06 += iArr2[1];
                        }
                        this.A02 = y - iArr2[1];
                        int scrollY = getScrollY();
                        int scrollRange = getScrollRange();
                        int overScrollMode = getOverScrollMode();
                        if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (A0D(i2, 0, getScrollY(), scrollRange)) {
                            if (0 == 0) {
                                viewParent = r12.A01;
                            } else if (0 != 1) {
                                viewParent = null;
                            } else {
                                viewParent = r12.A00;
                            }
                            if (viewParent == null) {
                                this.A09.clear();
                            }
                        }
                        int scrollY2 = getScrollY() - scrollY;
                        iArr[1] = 0;
                        r12.A03(0, scrollY2, 0, i2 - scrollY2, iArr2, 0, iArr);
                        int i4 = this.A02;
                        int i5 = iArr2[1];
                        this.A02 = i4 - i5;
                        this.A06 += i5;
                        if (z) {
                            int i6 = i2 - iArr[1];
                            A03();
                            int i7 = scrollY + i6;
                            if (i7 < 0) {
                                AnonymousClass0N2.A1D(this.A0C, ((float) i6) / ((float) getHeight()), motionEvent.getX(findPointerIndex) / ((float) getWidth()));
                                if (!this.A0B.isFinished()) {
                                    this.A0B.onRelease();
                                }
                            } else if (i7 > scrollRange) {
                                AnonymousClass0N2.A1D(this.A0B, ((float) i6) / ((float) getHeight()), 1.0f - (motionEvent.getX(findPointerIndex) / ((float) getWidth())));
                                if (!this.A0C.isFinished()) {
                                    this.A0C.onRelease();
                                }
                            }
                            EdgeEffect edgeEffect = this.A0C;
                            if (edgeEffect != null && (!edgeEffect.isFinished() || !this.A0B.isFinished())) {
                                postInvalidateOnAnimation();
                            }
                        }
                    }
                }
            } else if (actionMasked == 3) {
                if (this.A0H && getChildCount() > 0 && this.A0D.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.A01 = -1;
                A02();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.A02 = (int) motionEvent.getY(actionIndex);
                this.A01 = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                A09(motionEvent);
                this.A02 = (int) motionEvent.getY(motionEvent.findPointerIndex(this.A01));
            }
        } else if (getChildCount() == 0) {
            return false;
        } else {
            boolean z3 = !this.A0D.isFinished();
            this.A0H = z3;
            if (z3 && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.A0D.isFinished()) {
                this.A0D.abortAnimation();
                this.A0M.A01(1);
            }
            this.A02 = (int) motionEvent.getY();
            this.A01 = motionEvent.getPointerId(0);
            this.A0M.A02(2, 0);
        }
        VelocityTracker velocityTracker2 = this.A09;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.A0J) {
            Rect rect = this.A0L;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int A012 = A01(rect);
            if (A012 != 0) {
                scrollBy(0, A012);
            }
        } else {
            this.A0A = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int A012 = A01(rect);
        boolean z2 = false;
        if (A012 != 0) {
            z2 = true;
            if (z) {
                scrollBy(0, A012);
            } else {
                A06(0, A012, false);
                return true;
            }
        }
        return z2;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        VelocityTracker velocityTracker;
        if (z && (velocityTracker = this.A09) != null) {
            velocityTracker.recycle();
            this.A09 = null;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        this.A0J = true;
        super.requestLayout();
    }

    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i < 0) {
                i = 0;
            } else if (width + i > width2) {
                i = width2 - width;
            }
            if (height >= height2 || i2 < 0) {
                i2 = 0;
            } else if (height + i2 > height2) {
                i2 = height2 - height;
            }
            if (i != getScrollX() || i2 != getScrollY()) {
                super.scrollTo(i, i2);
            }
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.A0G) {
            this.A0G = z;
            requestLayout();
        }
    }

    @Override // X.AbstractC06780Ur
    public void setNestedScrollingEnabled(boolean z) {
        C14910n5 r1 = this.A0M;
        if (r1.A02) {
            AnonymousClass0Q7.A0P(r1.A04);
        }
        r1.A02 = z;
    }

    public void setOnScrollChangeListener(AbstractC15110nW r1) {
        this.A0E = r1;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.A0K = z;
    }

    public boolean startNestedScroll(int i) {
        return this.A0M.A02(i, 0);
    }

    @Override // X.AbstractC06780Ur
    public void stopNestedScroll() {
        this.A0M.A01(0);
    }
}
