package androidx.appcompat.widget;

import X.AbstractC07950aC;
import X.AbstractC13140jg;
import X.AnonymousClass0MX;
import X.AnonymousClass0T8;
import X.AnonymousClass0TR;
import X.AnonymousClass0TT;
import X.AnonymousClass0TU;
import X.AnonymousClass1ZO;
import X.AnonymousClass1ZT;
import X.AnonymousClass1Za;
import X.AnonymousClass23Q;
import X.AnonymousClass23R;
import X.C06360Sy;
import X.C13310k0;
import X.C29551Zf;
import X.C29561Zg;
import X.C29571Zh;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

public class ActionMenuView extends LinearLayoutCompat implements AnonymousClass0TT, AnonymousClass0TU {
    public int A00;
    public int A01;
    public int A02;
    public int A03 = 0;
    public Context A04;
    public AnonymousClass0MX A05;
    public AnonymousClass0T8 A06;
    public AnonymousClass0TR A07;
    public AnonymousClass23R A08;
    public AbstractC07950aC A09;
    public boolean A0A;
    public boolean A0B;

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.A0B = false;
        float f = context.getResources().getDisplayMetrics().density;
        this.A02 = (int) (56.0f * f);
        this.A01 = (int) (f * 4.0f);
        this.A04 = context;
    }

    /* renamed from: A03 */
    public C29561Zg generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C29561Zg r1;
        if (layoutParams != null) {
            if (layoutParams instanceof C29561Zg) {
                r1 = new C29561Zg((C29561Zg) layoutParams);
            } else {
                r1 = new C29561Zg(layoutParams);
            }
            if (((C13310k0) r1).A01 <= 0) {
                ((C13310k0) r1).A01 = 16;
            }
            return r1;
        }
        C29561Zg r12 = new C29561Zg();
        ((C13310k0) r12).A01 = 16;
        return r12;
    }

    public boolean A04(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof AbstractC13140jg)) {
            z = false | ((AbstractC13140jg) childAt).ACE();
        }
        return (i <= 0 || !(childAt2 instanceof AbstractC13140jg)) ? z : z | ((AbstractC13140jg) childAt2).ACF();
    }

    @Override // X.AnonymousClass0TU
    public void AAm(AnonymousClass0T8 r1) {
        this.A06 = r1;
    }

    @Override // X.AnonymousClass0TT
    public boolean AAs(AnonymousClass1ZT r4) {
        return this.A06.A0J(r4, null, 0);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C29561Zg;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        C29561Zg r1 = new C29561Zg();
        ((C13310k0) r1).A01 = 16;
        return r1;
    }

    @Override // android.view.ViewGroup, androidx.appcompat.widget.LinearLayoutCompat
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C29561Zg(getContext(), attributeSet);
    }

    public Menu getMenu() {
        AnonymousClass0T8 r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        Context context = getContext();
        AnonymousClass0T8 r1 = new AnonymousClass0T8(context);
        this.A06 = r1;
        r1.A03 = new C29571Zh(this);
        AnonymousClass23R r2 = new AnonymousClass23R(context);
        this.A08 = r2;
        r2.A0D = true;
        r2.A0E = true;
        AnonymousClass0TR r02 = this.A07;
        if (r02 == null) {
            r02 = new C29551Zf();
        }
        ((AnonymousClass1ZO) r2).A06 = r02;
        this.A06.A0C(r2, this.A04);
        AnonymousClass23R r03 = this.A08;
        ((AnonymousClass1ZO) r03).A07 = this;
        AnonymousClass0T8 r04 = ((AnonymousClass1ZO) r03).A05;
        this.A06 = r04;
        return r04;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        AnonymousClass23R r1 = this.A08;
        AnonymousClass23Q r0 = r1.A08;
        if (r0 != null) {
            return r0.getDrawable();
        }
        if (r1.A0C) {
            return r1.A05;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.A03;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AnonymousClass23R r1 = this.A08;
        if (r1 != null) {
            r1.AQr(false);
            if (this.A08.A02()) {
                this.A08.A01();
                this.A08.A03();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnonymousClass23R r0 = this.A08;
        if (r0 != null) {
            r0.A01();
            AnonymousClass1Za r02 = r0.A06;
            if (r02 != null) {
                r02.A01();
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width;
        int i6;
        if (!this.A0A) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i4 - i2) >> 1;
        int i8 = super.A05;
        int i9 = i3 - i;
        int paddingRight = (i9 - getPaddingRight()) - getPaddingLeft();
        boolean A012 = C06360Sy.A01(this);
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                C29561Zg r10 = (C29561Zg) childAt.getLayoutParams();
                if (r10.A04) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (A04(i12)) {
                        measuredWidth += i8;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (A012) {
                        i6 = getPaddingLeft() + ((ViewGroup.MarginLayoutParams) r10).leftMargin;
                        width = i6 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) r10).rightMargin;
                        i6 = width - measuredWidth;
                    }
                    int i13 = i7 - (measuredHeight >> 1);
                    childAt.layout(i6, i13, width, measuredHeight + i13);
                    paddingRight -= measuredWidth;
                    i10 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) r10).leftMargin) + ((ViewGroup.MarginLayoutParams) r10).rightMargin;
                    A04(i12);
                    i11++;
                }
            }
        }
        if (childCount == 1 && i10 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i14 = (i9 >> 1) - (measuredWidth2 >> 1);
            int i15 = i7 - (measuredHeight2 >> 1);
            childAt2.layout(i14, i15, measuredWidth2 + i14, measuredHeight2 + i15);
            return;
        }
        int i16 = i11 - (i10 ^ 1);
        if (i16 > 0) {
            i5 = paddingRight / i16;
        } else {
            i5 = 0;
        }
        int max = Math.max(0, i5);
        if (A012) {
            int width2 = getWidth() - getPaddingRight();
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt3 = getChildAt(i17);
                C29561Zg r4 = (C29561Zg) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !r4.A04) {
                    int i18 = width2 - ((ViewGroup.MarginLayoutParams) r4).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i19 = i7 - (measuredHeight3 >> 1);
                    childAt3.layout(i18 - measuredWidth3, i19, i18, measuredHeight3 + i19);
                    width2 = i18 - ((measuredWidth3 + ((ViewGroup.MarginLayoutParams) r4).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt4 = getChildAt(i20);
            C29561Zg r42 = (C29561Zg) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !r42.A04) {
                int i21 = paddingLeft + ((ViewGroup.MarginLayoutParams) r42).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i22 = i7 - (measuredHeight4 >> 1);
                childAt4.layout(i21, i22, i21 + measuredWidth4, measuredHeight4 + i22);
                paddingLeft = measuredWidth4 + ((ViewGroup.MarginLayoutParams) r42).rightMargin + max + i21;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v66 */
    /* JADX WARN: Type inference failed for: r0v67, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r0v97 */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01da, code lost:
        if (r22 != 1) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b8, code lost:
        if ((!android.text.TextUtils.isEmpty(((X.C05560Pe) r14).getText())) == false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ed, code lost:
        if ((!android.text.TextUtils.isEmpty(r0.getText())) == false) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x015a, code lost:
        if (r22 != 2) goto L_0x015c;
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r30, int r31) {
        /*
        // Method dump skipped, instructions count: 721
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.onMeasure(int, int):void");
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.A08.A0B = z;
    }

    public void setOnMenuItemClickListener(AbstractC07950aC r1) {
        this.A09 = r1;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        AnonymousClass23R r1 = this.A08;
        AnonymousClass23Q r0 = r1.A08;
        if (r0 != null) {
            r0.setImageDrawable(drawable);
            return;
        }
        r1.A0C = true;
        r1.A05 = drawable;
    }

    public void setOverflowReserved(boolean z) {
        this.A0B = z;
    }

    public void setPopupTheme(int i) {
        if (this.A03 != i) {
            this.A03 = i;
            if (i == 0) {
                this.A04 = getContext();
            } else {
                this.A04 = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(AnonymousClass23R r2) {
        this.A08 = r2;
        ((AnonymousClass1ZO) r2).A07 = this;
        this.A06 = ((AnonymousClass1ZO) r2).A05;
    }
}
