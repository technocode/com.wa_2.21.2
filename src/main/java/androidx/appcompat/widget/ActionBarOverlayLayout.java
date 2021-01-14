package androidx.appcompat.widget;

import X.AbstractC07870a0;
import X.AnonymousClass008;
import X.AnonymousClass0Q7;
import X.AnonymousClass0T4;
import X.AnonymousClass0TA;
import X.AnonymousClass0TB;
import X.AnonymousClass0TD;
import X.AnonymousClass0TR;
import X.AnonymousClass0W6;
import X.AnonymousClass0W7;
import X.C12960jN;
import X.C13120je;
import X.C13130jf;
import X.C14920n6;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.search.verification.client.R;

public class ActionBarOverlayLayout extends ViewGroup implements AnonymousClass0T4, AnonymousClass0W7, AnonymousClass0W6, AbstractC07870a0 {
    public static final int[] A0R = {R.attr.actionBarSize, 16842841};
    public int A00;
    public int A01;
    public int A02;
    public int A03 = 0;
    public Drawable A04;
    public ViewPropertyAnimator A05;
    public OverScroller A06;
    public ActionBarContainer A07;
    public AnonymousClass0TB A08;
    public ContentFrameLayout A09;
    public AnonymousClass0TD A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final AnimatorListenerAdapter A0G = new C13120je(this);
    public final Rect A0H = new Rect();
    public final Rect A0I = new Rect();
    public final Rect A0J = new Rect();
    public final Rect A0K = new Rect();
    public final Rect A0L = new Rect();
    public final Rect A0M = new Rect();
    public final Rect A0N = new Rect();
    public final C14920n6 A0O;
    public final Runnable A0P = new RunnableEBaseShape5S0100000_I1_0(this, 2);
    public final Runnable A0Q = new RunnableEBaseShape5S0100000_I1_0(this, 1);

    @Override // X.AnonymousClass0W7
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // X.AnonymousClass0W7
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A03(context);
        this.A0O = new C14920n6();
    }

    public static final boolean A00(View view, Rect rect, boolean z) {
        boolean z2;
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i2 = marginLayoutParams.leftMargin;
        int i3 = rect.left;
        if (i2 != i3) {
            marginLayoutParams.leftMargin = i3;
            z2 = true;
        } else {
            z2 = false;
        }
        int i4 = marginLayoutParams.topMargin;
        int i5 = rect.top;
        if (i4 != i5) {
            marginLayoutParams.topMargin = i5;
            z2 = true;
        }
        int i6 = marginLayoutParams.rightMargin;
        int i7 = rect.right;
        if (i6 != i7) {
            marginLayoutParams.rightMargin = i7;
            z2 = true;
        }
        if (!z || marginLayoutParams.bottomMargin == (i = rect.bottom)) {
            return z2;
        }
        marginLayoutParams.bottomMargin = i;
        return true;
    }

    public void A01() {
        removeCallbacks(this.A0Q);
        removeCallbacks(this.A0P);
        ViewPropertyAnimator viewPropertyAnimator = this.A05;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public void A02() {
        AnonymousClass0TD wrapper;
        if (this.A09 == null) {
            this.A09 = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.A07 = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof AnonymousClass0TD) {
                wrapper = (AnonymousClass0TD) findViewById;
            } else if (findViewById instanceof Toolbar) {
                wrapper = ((Toolbar) findViewById).getWrapper();
            } else {
                StringBuilder A0S = AnonymousClass008.A0S("Can't make a decor toolbar out of ");
                A0S.append(findViewById.getClass().getSimpleName());
                throw new IllegalStateException(A0S.toString());
            }
            this.A0A = wrapper;
        }
    }

    public final void A03(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(A0R);
        boolean z = false;
        this.A00 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.A04 = drawable;
        boolean z2 = false;
        if (drawable == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z = true;
        }
        this.A0E = z;
        this.A06 = new OverScroller(context);
    }

    @Override // X.AnonymousClass0T4
    public boolean A2V() {
        A02();
        return this.A0A.A2V();
    }

    @Override // X.AnonymousClass0T4
    public void A3p() {
        A02();
        this.A0A.A3o();
    }

    @Override // X.AnonymousClass0T4
    public boolean AAS() {
        A02();
        return this.A0A.AAS();
    }

    @Override // X.AnonymousClass0T4
    public void AAg(int i) {
        A02();
        if (i == 2) {
            this.A0A.AAj();
        } else if (i == 5) {
            this.A0A.AAi();
        } else if (i == 109) {
            setOverlayMode(true);
        }
    }

    @Override // X.AnonymousClass0T4
    public boolean ABN() {
        A02();
        return this.A0A.ABN();
    }

    @Override // X.AnonymousClass0T4
    public boolean ABO() {
        A02();
        return this.A0A.ABO();
    }

    @Override // X.AnonymousClass0W6
    public void AHt(View view, int i, int i2, int[] iArr, int i3) {
    }

    @Override // X.AnonymousClass0W6
    public void AHu(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // X.AbstractC07870a0
    public void AHv(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // X.AnonymousClass0W6
    public void AHw(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // X.AnonymousClass0W6
    public boolean AKM(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // X.AnonymousClass0W6
    public void AKc(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // X.AnonymousClass0T4
    public void AOZ() {
        A02();
        this.A0A.AOZ();
    }

    @Override // X.AnonymousClass0T4
    public boolean APs() {
        A02();
        return this.A0A.APs();
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C13130jf;
    }

    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.A04 != null && !this.A0E) {
            if (this.A07.getVisibility() == 0) {
                i = (int) (this.A07.getTranslationY() + ((float) this.A07.getBottom()) + 0.5f);
            } else {
                i = 0;
            }
            this.A04.setBounds(0, i, getWidth(), this.A04.getIntrinsicHeight() + i);
            this.A04.draw(canvas);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0033, code lost:
        if (r4 != false) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean fitSystemWindows(android.graphics.Rect r7) {
        /*
            r6 = this;
            r6.A02()
            r6.getWindowSystemUiVisibility()
            androidx.appcompat.widget.ActionBarContainer r1 = r6.A07
            r5 = 1
            r0 = 0
            boolean r4 = A00(r1, r7, r0)
            android.graphics.Rect r3 = r6.A0I
            r3.set(r7)
            android.graphics.Rect r2 = r6.A0H
            X.C06360Sy.A00(r6, r3, r2)
            android.graphics.Rect r1 = r6.A0M
            boolean r0 = r1.equals(r3)
            if (r0 != 0) goto L_0x0024
            r1.set(r3)
            r4 = 1
        L_0x0024:
            android.graphics.Rect r1 = r6.A0L
            boolean r0 = r1.equals(r2)
            if (r0 != 0) goto L_0x0033
            r1.set(r2)
        L_0x002f:
            r6.requestLayout()
        L_0x0032:
            return r5
        L_0x0033:
            if (r4 == 0) goto L_0x0032
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.fitSystemWindows(android.graphics.Rect):boolean");
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C13130jf();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C13130jf(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C13130jf(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.A07;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        C14920n6 r0 = this.A0O;
        return r0.A01 | r0.A00;
    }

    public CharSequence getTitle() {
        A02();
        return this.A0A.getTitle();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A03(getContext());
        AnonymousClass0Q7.A0M(this);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A01();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = marginLayoutParams.leftMargin + paddingLeft;
                int i7 = marginLayoutParams.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        boolean z;
        int measuredHeight;
        A02();
        measureChildWithMargins(this.A07, i, 0, i2, 0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A07.getLayoutParams();
        int max = Math.max(0, this.A07.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        int max2 = Math.max(0, this.A07.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.A07.getMeasuredState());
        if ((getWindowSystemUiVisibility() & 256) != 0) {
            z = true;
            measuredHeight = this.A00;
            if (this.A0C && this.A07.A06 != null) {
                measuredHeight += measuredHeight;
            }
        } else {
            z = false;
            measuredHeight = this.A07.getVisibility() != 8 ? this.A07.getMeasuredHeight() : 0;
        }
        Rect rect = this.A0J;
        rect.set(this.A0H);
        Rect rect2 = this.A0K;
        rect2.set(this.A0I);
        if (this.A0F || z) {
            rect2.top += measuredHeight;
            rect2.bottom += 0;
        } else {
            rect.top += measuredHeight;
            rect.bottom += 0;
        }
        A00(this.A09, rect, true);
        Rect rect3 = this.A0N;
        if (!rect3.equals(rect2)) {
            rect3.set(rect2);
            this.A09.A00(rect2);
        }
        measureChildWithMargins(this.A09, i, 0, i2, 0);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.A09.getLayoutParams();
        int max3 = Math.max(max, this.A09.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin);
        int max4 = Math.max(max2, this.A09.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.A09.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    @Override // X.AnonymousClass0W7
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.A0D || !z) {
            return false;
        }
        this.A06.fling(0, 0, 0, (int) f2, 0, 0, EditorInfoCompat.IME_FLAG_FORCE_ASCII, Integer.MAX_VALUE);
        if (this.A06.getFinalY() > this.A07.getHeight()) {
            A01();
            this.A0P.run();
        } else {
            A01();
            this.A0Q.run();
        }
        this.A0B = true;
        return true;
    }

    @Override // X.AnonymousClass0W7
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.A01 + i2;
        this.A01 = i5;
        setActionBarHideOffset(i5);
    }

    @Override // X.AnonymousClass0W7
    public void onNestedScrollAccepted(View view, View view2, int i) {
        AnonymousClass0TA r1;
        C12960jN r0;
        this.A0O.A01 = i;
        this.A01 = getActionBarHideOffset();
        A01();
        AnonymousClass0TB r12 = this.A08;
        if (r12 != null && (r0 = (r1 = (AnonymousClass0TA) r12).A07) != null) {
            r0.A00();
            r1.A07 = null;
        }
    }

    @Override // X.AnonymousClass0W7
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.A07.getVisibility() != 0) {
            return false;
        }
        return this.A0D;
    }

    @Override // X.AnonymousClass0W7
    public void onStopNestedScroll(View view) {
        if (this.A0D && !this.A0B) {
            if (this.A01 <= this.A07.getHeight()) {
                A01();
                postDelayed(this.A0Q, 600);
                return;
            }
            A01();
            postDelayed(this.A0P, 600);
        }
    }

    public void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        A02();
        int i2 = this.A02 ^ i;
        this.A02 = i;
        boolean z = false;
        if ((i & 4) == 0) {
            z = true;
        }
        boolean z2 = false;
        if ((i & 256) != 0) {
            z2 = true;
        }
        AnonymousClass0TB r1 = this.A08;
        if (r1 != null) {
            AnonymousClass0TA r12 = (AnonymousClass0TA) r1;
            r12.A0D = !z2;
            if (z || !z2) {
                if (r12.A0H) {
                    r12.A0H = false;
                    r12.A0J(true);
                }
            } else if (!r12.A0H) {
                r12.A0H = true;
                r12.A0J(true);
            }
        }
        if ((i2 & 256) != 0 && this.A08 != null) {
            AnonymousClass0Q7.A0M(this);
        }
    }

    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.A03 = i;
        AnonymousClass0TB r0 = this.A08;
        if (r0 != null) {
            ((AnonymousClass0TA) r0).A00 = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        A01();
        this.A07.setTranslationY((float) (-Math.max(0, Math.min(i, this.A07.getHeight()))));
    }

    public void setActionBarVisibilityCallback(AnonymousClass0TB r3) {
        this.A08 = r3;
        if (getWindowToken() != null) {
            ((AnonymousClass0TA) this.A08).A00 = this.A03;
            int i = this.A02;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                AnonymousClass0Q7.A0M(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.A0C = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.A0D) {
            this.A0D = z;
            if (!z) {
                A01();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        A02();
        this.A0A.AOK(i);
    }

    public void setIcon(Drawable drawable) {
        A02();
        this.A0A.AOL(drawable);
    }

    public void setLogo(int i) {
        A02();
        this.A0A.AOS(i);
    }

    @Override // X.AnonymousClass0T4
    public void setMenu(Menu menu, AnonymousClass0TR r3) {
        A02();
        this.A0A.setMenu(menu, r3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (getContext().getApplicationInfo().targetSdkVersion >= 19) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setOverlayMode(boolean r4) {
        /*
            r3 = this;
            r3.A0F = r4
            if (r4 == 0) goto L_0x0013
            android.content.Context r0 = r3.getContext()
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            int r2 = r0.targetSdkVersion
            r1 = 19
            r0 = 1
            if (r2 < r1) goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            r3.A0E = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.setOverlayMode(boolean):void");
    }

    @Override // X.AnonymousClass0T4
    public void setWindowCallback(Window.Callback callback) {
        A02();
        this.A0A.setWindowCallback(callback);
    }

    @Override // X.AnonymousClass0T4
    public void setWindowTitle(CharSequence charSequence) {
        A02();
        this.A0A.setWindowTitle(charSequence);
    }
}
