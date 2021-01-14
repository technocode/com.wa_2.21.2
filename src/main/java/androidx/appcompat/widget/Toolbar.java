package androidx.appcompat.widget;

import X.AbstractC07950aC;
import X.AbstractC08280an;
import X.AbstractC15200nf;
import X.AnonymousClass05p;
import X.AnonymousClass0MX;
import X.AnonymousClass0N2;
import X.AnonymousClass0Q7;
import X.AnonymousClass0S5;
import X.AnonymousClass0T3;
import X.AnonymousClass0T8;
import X.AnonymousClass0TD;
import X.AnonymousClass0TL;
import X.AnonymousClass0TR;
import X.AnonymousClass1ZT;
import X.AnonymousClass23R;
import X.C05560Pe;
import X.C06360Sy;
import X.C07880a2;
import X.C07940aB;
import X.C07960aD;
import X.C08290ao;
import X.C08310ar;
import X.C08490bD;
import X.C12950jM;
import X.C29671Zy;
import X.C29681Zz;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.redex.ViewOnClickEBaseShape0S0100000_I0_0;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;

public class Toolbar extends ViewGroup {
    public int A00;
    public int A01;
    public int A02;
    public int A03 = 8388627;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public Context A0C;
    public ColorStateList A0D;
    public ColorStateList A0E;
    public Drawable A0F;
    public View A0G;
    public ImageButton A0H;
    public ImageButton A0I;
    public ImageView A0J;
    public TextView A0K;
    public AnonymousClass0MX A0L;
    public AnonymousClass0TR A0M;
    public AnonymousClass23R A0N;
    public ActionMenuView A0O;
    public C07960aD A0P;
    public C29671Zy A0Q;
    public AbstractC08280an A0R;
    public C08290ao A0S;
    public CharSequence A0T;
    public CharSequence A0U;
    public CharSequence A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public final AbstractC07950aC A0Z = new C07940aB(this);
    public final Runnable A0a = new RunnableEBaseShape0S0100000_I0_0(this, 7);
    public final ArrayList A0b = new ArrayList();
    public final ArrayList A0c = new ArrayList();
    public final int[] A0d = new int[2];
    public TextView mTitleTextView;

    public Toolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.toolbarStyle);
        AnonymousClass0TL A002 = AnonymousClass0TL.A00(getContext(), attributeSet, AnonymousClass0T3.A0c, R.attr.toolbarStyle);
        TypedArray typedArray = A002.A02;
        this.A0B = typedArray.getResourceId(28, 0);
        this.A06 = typedArray.getResourceId(19, 0);
        this.A03 = typedArray.getInteger(0, 8388627);
        this.A00 = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.A07 = dimensionPixelOffset;
        this.A0A = dimensionPixelOffset;
        this.A08 = dimensionPixelOffset;
        this.A09 = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.A09 = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.A08 = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.A0A = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.A07 = dimensionPixelOffset5;
        }
        this.A04 = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        A0A();
        C07960aD r0 = this.A0P;
        r0.A06 = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            r0.A01 = dimensionPixelSize;
            r0.A03 = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            r0.A02 = dimensionPixelSize2;
            r0.A04 = dimensionPixelSize2;
        }
        if (!(dimensionPixelOffset6 == Integer.MIN_VALUE && dimensionPixelOffset7 == Integer.MIN_VALUE)) {
            r0.A00(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.A02 = typedArray.getDimensionPixelOffset(10, EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        this.A01 = typedArray.getDimensionPixelOffset(6, EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        this.A0F = A002.A02(4);
        this.A0T = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.A0C = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable A022 = A002.A02(16);
        if (A022 != null) {
            setNavigationIcon(A022);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable A023 = A002.A02(11);
        if (A023 != null) {
            setLogo(A023);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(A002.A01(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(A002.A01(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        typedArray.recycle();
    }

    public static final int A00(View view) {
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (Build.VERSION.SDK_INT >= 17) {
            i = marginLayoutParams.getMarginStart();
        } else {
            i = marginLayoutParams.leftMargin;
        }
        return AnonymousClass0N2.A0B(marginLayoutParams) + i;
    }

    public static final int A01(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public static C08310ar A02(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C08310ar) {
            return new C08310ar((C08310ar) layoutParams);
        }
        if (layoutParams instanceof AnonymousClass0S5) {
            return new C08310ar((AnonymousClass0S5) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C08310ar((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C08310ar(layoutParams);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        if (r0 != 80) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A03(android.view.View r9, int r10) {
        /*
        // Method dump skipped, instructions count: 103
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.A03(android.view.View, int):int");
    }

    public final int A04(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final int A05(View view, int i, int[] iArr, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i3 = marginLayoutParams.leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int A032 = A03(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, A032, max + measuredWidth, view.getMeasuredHeight() + A032);
        return measuredWidth + marginLayoutParams.rightMargin + max;
    }

    public final int A06(View view, int i, int[] iArr, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i3 = marginLayoutParams.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int A032 = A03(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, A032, max, view.getMeasuredHeight() + A032);
        return max - (measuredWidth + marginLayoutParams.leftMargin);
    }

    public void A07() {
        if (this.A0H == null) {
            C07880a2 r1 = new C07880a2(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.A0H = r1;
            r1.setImageDrawable(this.A0F);
            this.A0H.setContentDescription(this.A0T);
            C08310ar r2 = new C08310ar();
            ((AnonymousClass0S5) r2).A00 = 8388611 | (this.A00 & 112);
            r2.A00 = 2;
            this.A0H.setLayoutParams(r2);
            this.A0H.setOnClickListener(new ViewOnClickEBaseShape0S0100000_I0_0(this, 2));
        }
    }

    public void A08() {
        getMenuInflater().inflate(R.menu.bloks_navigation_menu, getMenu());
    }

    public void A09() {
        A0A();
        C07960aD r0 = this.A0P;
        r0.A06 = false;
        r0.A01 = 0;
        r0.A03 = 0;
        r0.A02 = 0;
        r0.A04 = 0;
    }

    public final void A0A() {
        if (this.A0P == null) {
            this.A0P = new C07960aD();
        }
    }

    public final void A0B() {
        A0C();
        ActionMenuView actionMenuView = this.A0O;
        if (actionMenuView.A06 == null) {
            AnonymousClass0T8 r3 = (AnonymousClass0T8) actionMenuView.getMenu();
            C29671Zy r2 = this.A0Q;
            if (r2 == null) {
                r2 = new C29671Zy(this);
                this.A0Q = r2;
            }
            this.A0O.setExpandedActionViewsExclusive(true);
            r3.A0C(r2, this.A0C);
        }
    }

    public final void A0C() {
        if (this.A0O == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.A0O = actionMenuView;
            actionMenuView.setPopupTheme(this.A05);
            ActionMenuView actionMenuView2 = this.A0O;
            actionMenuView2.A09 = this.A0Z;
            AnonymousClass0TR r1 = this.A0M;
            AnonymousClass0MX r0 = this.A0L;
            actionMenuView2.A07 = r1;
            actionMenuView2.A05 = r0;
            C08310ar r2 = new C08310ar();
            ((AnonymousClass0S5) r2).A00 = 8388613 | (this.A00 & 112);
            this.A0O.setLayoutParams(r2);
            A0F(this.A0O, false);
        }
    }

    public final void A0D() {
        if (this.A0I == null) {
            this.A0I = new C07880a2(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            C08310ar r2 = new C08310ar();
            ((AnonymousClass0S5) r2).A00 = 8388611 | (this.A00 & 112);
            this.A0I.setLayoutParams(r2);
        }
    }

    public final void A0E(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final void A0F(View view, boolean z) {
        C08310ar r1;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            r1 = new C08310ar();
        } else if (!checkLayoutParams(layoutParams)) {
            r1 = A02(layoutParams);
        } else {
            r1 = (C08310ar) layoutParams;
        }
        r1.A00 = 1;
        if (!z || this.A0G == null) {
            addView(view, r1);
            return;
        }
        view.setLayoutParams(r1);
        this.A0b.add(view);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x004e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0085 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0G(java.util.List r10, int r11) {
        /*
        // Method dump skipped, instructions count: 139
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.A0G(java.util.List, int):void");
    }

    public final boolean A0H(View view) {
        return view.getParent() == this || this.A0b.contains(view);
    }

    public final boolean A0I(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C08310ar);
    }

    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C08310ar();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C08310ar(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return A02(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.A0H;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.A0H;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C07960aD r1 = this.A0P;
        if (r1 != null) {
            return r1.A07 ? r1.A03 : r1.A04;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.A01;
        return i == Integer.MIN_VALUE ? getContentInsetEnd() : i;
    }

    public int getContentInsetLeft() {
        C07960aD r0 = this.A0P;
        if (r0 != null) {
            return r0.A03;
        }
        return 0;
    }

    public int getContentInsetRight() {
        C07960aD r0 = this.A0P;
        if (r0 != null) {
            return r0.A04;
        }
        return 0;
    }

    public int getContentInsetStart() {
        C07960aD r1 = this.A0P;
        if (r1 != null) {
            return r1.A07 ? r1.A04 : r1.A03;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.A02;
        return i == Integer.MIN_VALUE ? getContentInsetStart() : i;
    }

    public int getCurrentContentInsetEnd() {
        AnonymousClass0T8 r0;
        ActionMenuView actionMenuView = this.A0O;
        if (actionMenuView == null || (r0 = actionMenuView.A06) == null || !r0.hasVisibleItems()) {
            return getContentInsetEnd();
        }
        return Math.max(getContentInsetEnd(), Math.max(this.A01, 0));
    }

    public int getCurrentContentInsetLeft() {
        if (AnonymousClass0Q7.A05(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (AnonymousClass0Q7.A05(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.A02, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.A0J;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.A0J;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        A0B();
        return this.A0O.getMenu();
    }

    private MenuInflater getMenuInflater() {
        return new C12950jM(getContext());
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.A0I;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.A0I;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public AnonymousClass23R getOuterActionMenuPresenter() {
        return this.A0N;
    }

    public Drawable getOverflowIcon() {
        A0B();
        return this.A0O.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.A0C;
    }

    public int getPopupTheme() {
        return this.A05;
    }

    public CharSequence getSubtitle() {
        return this.A0U;
    }

    public final TextView getSubtitleTextView() {
        return this.A0K;
    }

    public CharSequence getTitle() {
        return this.A0V;
    }

    public int getTitleMarginBottom() {
        return this.A07;
    }

    public int getTitleMarginEnd() {
        return this.A08;
    }

    public int getTitleMarginStart() {
        return this.A09;
    }

    public int getTitleMarginTop() {
        return this.A0A;
    }

    public final TextView getTitleTextView() {
        return this.mTitleTextView;
    }

    public AnonymousClass0TD getWrapper() {
        C08290ao r1 = this.A0S;
        if (r1 != null) {
            return r1;
        }
        C08290ao r12 = new C08290ao(this, true);
        this.A0S = r12;
        return r12;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.A0a);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.A0X = false;
        }
        if (!this.A0X) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9) {
                if (!onHoverEvent) {
                    this.A0X = true;
                }
                return true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.A0X = false;
            return true;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x028e A[LOOP:1: B:103:0x028c->B:104:0x028e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x02ac A[LOOP:2: B:106:0x02aa->B:107:0x02ac, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02e9  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02f6 A[LOOP:3: B:114:0x02f4->B:115:0x02f6, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01a2 A[LOOP:0: B:66:0x01a0->B:67:0x01a2, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0245  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r22, int r23, int r24, int r25, int r26) {
        /*
        // Method dump skipped, instructions count: 775
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int[] iArr = this.A0d;
        int i9 = 0;
        char c = 0;
        char c2 = 1;
        if (C06360Sy.A01(this)) {
            c = 1;
            c2 = 0;
        }
        if (A0I(this.A0I)) {
            A0E(this.A0I, i, 0, i2, this.A04);
            i3 = A00(this.A0I) + this.A0I.getMeasuredWidth();
            i4 = Math.max(0, A01(this.A0I) + this.A0I.getMeasuredHeight());
            i5 = View.combineMeasuredStates(0, this.A0I.getMeasuredState());
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (A0I(this.A0H)) {
            A0E(this.A0H, i, 0, i2, this.A04);
            i3 = A00(this.A0H) + this.A0H.getMeasuredWidth();
            i4 = Math.max(i4, A01(this.A0H) + this.A0H.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.A0H.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i3);
        iArr[c] = Math.max(0, currentContentInsetStart - i3);
        if (A0I(this.A0O)) {
            A0E(this.A0O, i, max, i2, this.A04);
            i6 = A00(this.A0O) + this.A0O.getMeasuredWidth();
            i4 = Math.max(i4, A01(this.A0O) + this.A0O.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.A0O.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = Math.max(currentContentInsetEnd, i6) + max;
        iArr[c2] = Math.max(0, currentContentInsetEnd - i6);
        if (A0I(this.A0G)) {
            max2 += A04(this.A0G, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, A01(this.A0G) + this.A0G.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.A0G.getMeasuredState());
        }
        if (A0I(this.A0J)) {
            max2 += A04(this.A0J, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, A01(this.A0J) + this.A0J.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.A0J.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (((C08310ar) childAt.getLayoutParams()).A00 == 0 && A0I(childAt)) {
                max2 += A04(childAt, i, max2, i2, 0, iArr);
                i4 = Math.max(i4, A01(childAt) + childAt.getMeasuredHeight());
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
            }
        }
        int i11 = this.A0A + this.A07;
        int i12 = this.A09 + this.A08;
        if (A0I(this.mTitleTextView)) {
            A04(this.mTitleTextView, i, max2 + i12, i2, i11, iArr);
            i7 = A00(this.mTitleTextView) + this.mTitleTextView.getMeasuredWidth();
            i8 = A01(this.mTitleTextView) + this.mTitleTextView.getMeasuredHeight();
            i5 = View.combineMeasuredStates(i5, this.mTitleTextView.getMeasuredState());
        } else {
            i7 = 0;
            i8 = 0;
        }
        if (A0I(this.A0K)) {
            i7 = Math.max(i7, A04(this.A0K, i, max2 + i12, i2, i8 + i11, iArr));
            i8 += A01(this.A0K) + this.A0K.getMeasuredHeight();
            i5 = View.combineMeasuredStates(i5, this.A0K.getMeasuredState());
        }
        int i13 = max2 + i7;
        int max3 = Math.max(i4, i8);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(getPaddingRight() + paddingLeft + i13, getSuggestedMinimumWidth()), i, -16777216 & i5);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(getPaddingBottom() + paddingTop + max3, getSuggestedMinimumHeight()), i2, i5 << 16);
        if (this.A0W) {
            int childCount2 = getChildCount();
            int i14 = 0;
            while (true) {
                if (i14 >= childCount2) {
                    break;
                }
                View childAt2 = getChildAt(i14);
                if (A0I(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                    break;
                }
                i14++;
            }
        }
        i9 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i9);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        AnonymousClass0T8 r2;
        MenuItem findItem;
        if (!(parcelable instanceof C29681Zz)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C29681Zz r4 = (C29681Zz) parcelable;
        super.onRestoreInstanceState(((AbstractC15200nf) r4).A00);
        ActionMenuView actionMenuView = this.A0O;
        if (actionMenuView != null) {
            r2 = actionMenuView.A06;
        } else {
            r2 = null;
        }
        int i = r4.A00;
        if (!(i == 0 || this.A0Q == null || r2 == null || (findItem = r2.findItem(i)) == null)) {
            findItem.expandActionView();
        }
        if (r4.A01) {
            Runnable runnable = this.A0a;
            removeCallbacks(runnable);
            post(runnable);
        }
    }

    public void onRtlPropertiesChanged(int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        A0A();
        C07960aD r3 = this.A0P;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (z != r3.A07) {
            r3.A07 = z;
            if (!r3.A06) {
                r3.A03 = r3.A01;
                r3.A04 = r3.A02;
            } else if (z) {
                int i2 = r3.A00;
                if (i2 == Integer.MIN_VALUE) {
                    i2 = r3.A01;
                }
                r3.A03 = i2;
                int i3 = r3.A05;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = r3.A02;
                }
                r3.A04 = i3;
            } else {
                int i4 = r3.A05;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = r3.A01;
                }
                r3.A03 = i4;
                int i5 = r3.A00;
                if (i5 == Integer.MIN_VALUE) {
                    i5 = r3.A02;
                }
                r3.A04 = i5;
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        AnonymousClass23R r0;
        AnonymousClass1ZT r02;
        C29681Zz r2 = new C29681Zz(super.onSaveInstanceState());
        C29671Zy r03 = this.A0Q;
        if (!(r03 == null || (r02 = r03.A01) == null)) {
            r2.A00 = r02.A0R;
        }
        ActionMenuView actionMenuView = this.A0O;
        boolean z = true;
        if (actionMenuView == null || (r0 = actionMenuView.A08) == null || !r0.A02()) {
            z = false;
        }
        r2.A01 = z;
        return r2;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.A0Y = false;
        }
        if (!this.A0Y) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0) {
                if (!onTouchEvent) {
                    this.A0Y = true;
                }
                return true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.A0Y = false;
            return true;
        }
        return true;
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            A07();
        }
        ImageButton imageButton = this.A0H;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(AnonymousClass05p.A01(getContext(), i));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            A07();
            this.A0H.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.A0H;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.A0F);
        }
    }

    public void setCollapsible(boolean z) {
        this.A0W = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        }
        if (i != this.A01) {
            this.A01 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        }
        if (i != this.A02) {
            this.A02 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(AnonymousClass05p.A01(getContext(), i));
    }

    public void setLogo(Drawable drawable) {
        ImageView imageView = this.A0J;
        if (drawable != null) {
            if (imageView == null) {
                imageView = new C08490bD(getContext(), null);
                this.A0J = imageView;
            }
            if (!A0H(imageView)) {
                A0F(this.A0J, true);
            }
        } else if (imageView != null && A0H(imageView)) {
            removeView(this.A0J);
            this.A0b.remove(this.A0J);
        }
        ImageView imageView2 = this.A0J;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.A0J == null) {
            this.A0J = new C08490bD(getContext(), null);
        }
        ImageView imageView = this.A0J;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            A0D();
        }
        ImageButton imageButton = this.A0I;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(AnonymousClass05p.A01(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            A0D();
            if (!A0H(this.A0I)) {
                A0F(this.A0I, true);
            }
        } else {
            ImageButton imageButton = this.A0I;
            if (imageButton != null && A0H(imageButton)) {
                removeView(this.A0I);
                this.A0b.remove(this.A0I);
            }
        }
        ImageButton imageButton2 = this.A0I;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        A0D();
        this.A0I.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(AbstractC08280an r1) {
        this.A0R = r1;
    }

    public void setOverflowIcon(Drawable drawable) {
        A0B();
        this.A0O.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.A05 != i) {
            this.A05 = i;
            if (i == 0) {
                this.A0C = getContext();
            } else {
                this.A0C = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.A0K == null) {
                Context context = getContext();
                C05560Pe r0 = new C05560Pe(context, null);
                this.A0K = r0;
                r0.setSingleLine();
                this.A0K.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.A06;
                if (i != 0) {
                    this.A0K.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.A0D;
                if (colorStateList != null) {
                    this.A0K.setTextColor(colorStateList);
                }
            }
            if (!A0H(this.A0K)) {
                A0F(this.A0K, true);
            }
        } else {
            TextView textView = this.A0K;
            if (textView != null && A0H(textView)) {
                removeView(this.A0K);
                this.A0b.remove(this.A0K);
            }
        }
        TextView textView2 = this.A0K;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.A0U = charSequence;
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.A0D = colorStateList;
        TextView textView = this.A0K;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.mTitleTextView == null) {
                Context context = getContext();
                C05560Pe r0 = new C05560Pe(context, null);
                this.mTitleTextView = r0;
                r0.setSingleLine();
                this.mTitleTextView.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.A0B;
                if (i != 0) {
                    this.mTitleTextView.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.A0E;
                if (colorStateList != null) {
                    this.mTitleTextView.setTextColor(colorStateList);
                }
            }
            if (!A0H(this.mTitleTextView)) {
                A0F(this.mTitleTextView, true);
            }
        } else {
            TextView textView = this.mTitleTextView;
            if (textView != null && A0H(textView)) {
                removeView(this.mTitleTextView);
                this.A0b.remove(this.mTitleTextView);
            }
        }
        TextView textView2 = this.mTitleTextView;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.A0V = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.A07 = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.A08 = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.A09 = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.A0A = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.A0E = colorStateList;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }
}
