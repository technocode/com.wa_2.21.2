package androidx.coordinatorlayout.widget;

import X.AbstractC07570Yg;
import X.AbstractC07820Zr;
import X.AbstractC15200nf;
import X.AnonymousClass008;
import X.AnonymousClass05W;
import X.AnonymousClass0N2;
import X.AnonymousClass0Q7;
import X.AnonymousClass0TF;
import X.AnonymousClass0W6;
import X.AnonymousClass1DC;
import X.C002001d;
import X.C004302a;
import X.C06730Um;
import X.C14250lo;
import X.C14270lr;
import X.C14300lu;
import X.C14310lv;
import X.C14320lw;
import X.C14840my;
import X.C14920n6;
import X.C29871aL;
import X.C29881aM;
import X.C30101aj;
import X.C36661mb;
import X.C36711mk;
import X.ViewGroup$OnHierarchyChangeListenerC14260lq;
import X.ViewTreeObserver$OnPreDrawListenerC14280ls;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.HeaderBehavior;
import com.google.android.material.appbar.HeaderScrollingViewBehavior;
import com.google.android.material.appbar.ViewOffsetBehavior;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.bottomappbar.BottomAppBar$Behavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.search.verification.client.R;
import com.whatsapp.gesture.VerticalSwipeDismissBehavior;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class CoordinatorLayout extends ViewGroup implements AnonymousClass0W6 {
    public static final C14840my A0I = new C30101aj(12);
    public static final String A0J;
    public static final ThreadLocal A0K = new ThreadLocal();
    public static final Comparator A0L = new C14300lu();
    public static final Class[] A0M = {Context.class, AttributeSet.class};
    public Drawable A00;
    public View A01;
    public View A02;
    public ViewGroup.OnHierarchyChangeListener A03;
    public ViewTreeObserver$OnPreDrawListenerC14280ls A04;
    public AnonymousClass0TF A05;
    public C06730Um A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public int[] A0B;
    public final C14310lv A0C = new C14310lv();
    public final C14920n6 A0D = new C14920n6();
    public final List A0E = new ArrayList();
    public final List A0F = new ArrayList();
    public final List A0G = new ArrayList();
    public final int[] A0H = new int[2];

    public @interface DefaultBehavior {
        Class value();
    }

    static {
        Package r1 = CoordinatorLayout.class.getPackage();
        String str = null;
        if (r1 != null) {
            str = r1.getName();
        }
        A0J = str;
        if (Build.VERSION.SDK_INT >= 21) {
        }
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C14250lo.A01, R.attr.coordinatorLayoutStyle, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.A0B = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int[] iArr = this.A0B;
            int length = iArr.length;
            for (int i = 0; i < length; i++) {
                iArr[i] = (int) (((float) iArr[i]) * f);
            }
        }
        this.A00 = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        A08();
        super.setOnHierarchyChangeListener(new ViewGroup$OnHierarchyChangeListenerC14260lq(this));
    }

    public static Rect A00() {
        Rect rect = (Rect) A0I.A00();
        return rect == null ? new Rect() : rect;
    }

    public static C14270lr A01(View view) {
        C14270lr r5 = (C14270lr) view.getLayoutParams();
        if (!r5.A0B) {
            Class<?> cls = view.getClass();
            while (true) {
                if (cls == null) {
                    break;
                }
                DefaultBehavior defaultBehavior = (DefaultBehavior) cls.getAnnotation(DefaultBehavior.class);
                if (defaultBehavior == null) {
                    cls = cls.getSuperclass();
                } else {
                    try {
                        r5.A00((AbstractC07570Yg) defaultBehavior.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                        break;
                    } catch (Exception e) {
                        StringBuilder A0S = AnonymousClass008.A0S("Default behavior class ");
                        A0S.append(defaultBehavior.value().getName());
                        A0S.append(" could not be instantiated. Did you forget");
                        A0S.append(" a default constructor?");
                        Log.e("CoordinatorLayout", A0S.toString(), e);
                    }
                }
            }
            r5.A0B = true;
        }
        return r5;
    }

    public static final void A02(int i, Rect rect, Rect rect2, C14270lr r11, int i2, int i3) {
        int width;
        int height;
        int i4 = r11.A02;
        if (i4 == 0) {
            i4 = 17;
        }
        int A032 = AnonymousClass0N2.A03(i4, i);
        int i5 = r11.A00;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int A033 = AnonymousClass0N2.A03(i5, i);
        int i6 = A032 & 7;
        int i7 = A032 & 112;
        int i8 = A033 & 7;
        int i9 = A033 & 112;
        if (i8 == 1) {
            width = rect.left + (rect.width() >> 1);
        } else if (i8 != 5) {
            width = rect.left;
        } else {
            width = rect.right;
        }
        if (i9 == 16) {
            height = rect.top + (rect.height() >> 1);
        } else if (i9 != 80) {
            height = rect.top;
        } else {
            height = rect.bottom;
        }
        if (i6 == 1) {
            width -= i2 >> 1;
        } else if (i6 != 5) {
            width -= i2;
        }
        if (i7 == 16) {
            height -= i3 >> 1;
        } else if (i7 != 80) {
            height -= i3;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    public static final void A03(View view, int i) {
        C14270lr r1 = (C14270lr) view.getLayoutParams();
        int i2 = r1.A06;
        if (i2 != i) {
            AnonymousClass0Q7.A0T(view, i - i2);
            r1.A06 = i;
        }
    }

    public static final void A04(View view, int i) {
        C14270lr r1 = (C14270lr) view.getLayoutParams();
        int i2 = r1.A07;
        if (i2 != i) {
            AnonymousClass0Q7.A0U(view, i - i2);
            r1.A07 = i;
        }
    }

    public final int A05(int i) {
        int[] iArr = this.A0B;
        if (iArr == null) {
            StringBuilder sb = new StringBuilder("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i);
            Log.e("CoordinatorLayout", sb.toString());
            return 0;
        } else if (i >= 0 && i < iArr.length) {
            return iArr[i];
        } else {
            StringBuilder sb2 = new StringBuilder("Keyline index ");
            sb2.append(i);
            sb2.append(" out of range for ");
            sb2.append(this);
            Log.e("CoordinatorLayout", sb2.toString());
            return 0;
        }
    }

    public List A06(View view) {
        AnonymousClass05W r5 = this.A0C.A00;
        int i = r5.A00;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            AbstractCollection abstractCollection = (AbstractCollection) r5.A02[(i2 << 1) + 1];
            if (abstractCollection != null && abstractCollection.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(r5.A02[i2 << 1]);
            }
        }
        List list = this.A0F;
        list.clear();
        if (arrayList != null) {
            list.addAll(arrayList);
        }
        return list;
    }

    public final void A07() {
        View childAt;
        int A052;
        int A032;
        AbstractC07570Yg r0;
        List list = this.A0E;
        list.clear();
        C14310lv r7 = this.A0C;
        AnonymousClass05W r6 = r7.A00;
        int i = r6.A00;
        for (int i2 = 0; i2 < i; i2++) {
            AbstractCollection abstractCollection = (AbstractCollection) r6.A02[(i2 << 1) + 1];
            if (abstractCollection != null) {
                abstractCollection.clear();
                r7.A01.A01(abstractCollection);
            }
        }
        r6.clear();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            C14270lr A012 = A01(childAt2);
            if (A012.A05 == -1) {
                A012.A08 = null;
                A012.A09 = null;
            } else {
                View view = A012.A09;
                if (view != null && view.getId() == A012.A05) {
                    View view2 = A012.A09;
                    for (ViewParent parent = view2.getParent(); parent != this; parent = parent.getParent()) {
                        if (parent == null || parent == childAt2) {
                            A012.A08 = null;
                            A012.A09 = null;
                        } else {
                            if (parent instanceof View) {
                                view2 = (View) parent;
                            }
                        }
                    }
                    A012.A08 = view2;
                }
                View findViewById = findViewById(A012.A05);
                A012.A09 = findViewById;
                if (findViewById != null) {
                    if (findViewById != this) {
                        ViewParent parent2 = findViewById.getParent();
                        while (true) {
                            if (parent2 == this || parent2 == null) {
                                A012.A08 = findViewById;
                            } else if (parent2 != childAt2) {
                                if (parent2 instanceof View) {
                                    findViewById = (View) parent2;
                                }
                                parent2 = parent2.getParent();
                            } else if (isInEditMode()) {
                                A012.A08 = null;
                                A012.A09 = null;
                            } else {
                                throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                            }
                        }
                    } else if (isInEditMode()) {
                        A012.A08 = null;
                        A012.A09 = null;
                    } else {
                        throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                    }
                } else if (isInEditMode()) {
                    A012.A08 = null;
                    A012.A09 = null;
                } else {
                    StringBuilder A0S = AnonymousClass008.A0S("Could not find CoordinatorLayout descendant view with id ");
                    A0S.append(getResources().getResourceName(A012.A05));
                    A0S.append(" to anchor view ");
                    A0S.append(childAt2);
                    throw new IllegalStateException(A0S.toString());
                }
            }
            if (r6.A02(childAt2) < 0) {
                r6.put(childAt2, null);
            }
            for (int i4 = 0; i4 < childCount; i4++) {
                if (i4 != i3 && ((childAt = getChildAt(i4)) == A012.A08 || (((A032 = AnonymousClass0N2.A03(((C14270lr) childAt.getLayoutParams()).A03, (A052 = AnonymousClass0Q7.A05(this)))) != 0 && (AnonymousClass0N2.A03(A012.A01, A052) & A032) == A032) || ((r0 = A012.A0A) != null && r0.A01(this, childAt2, childAt))))) {
                    if (r6.A02(childAt) < 0 && r6.A02(childAt) < 0) {
                        r6.put(childAt, null);
                    }
                    if (r6.A02(childAt) < 0 || r6.A02(childAt2) < 0) {
                        throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
                    }
                    AbstractCollection abstractCollection2 = (AbstractCollection) r6.getOrDefault(childAt, null);
                    if (abstractCollection2 == null) {
                        abstractCollection2 = (AbstractCollection) r7.A01.A00();
                        if (abstractCollection2 == null) {
                            abstractCollection2 = new ArrayList();
                        }
                        r6.put(childAt, abstractCollection2);
                    }
                    abstractCollection2.add(childAt2);
                }
            }
        }
        ArrayList arrayList = r7.A02;
        arrayList.clear();
        HashSet hashSet = r7.A03;
        hashSet.clear();
        int i5 = r6.A00;
        for (int i6 = 0; i6 < i5; i6++) {
            r7.A00(r6.A02[i6 << 1], arrayList, hashSet);
        }
        list.addAll(arrayList);
        Collections.reverse(list);
    }

    public final void A08() {
        if (Build.VERSION.SDK_INT >= 21) {
            if (getFitsSystemWindows()) {
                AnonymousClass0TF r0 = this.A05;
                if (r0 == null) {
                    r0 = new C29871aL(this);
                    this.A05 = r0;
                }
                AnonymousClass0Q7.A0e(this, r0);
                setSystemUiVisibility(1280);
                return;
            }
            AnonymousClass0Q7.A0e(this, null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0093, code lost:
        if (r9.top != r10.top) goto L_0x0095;
     */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0243  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09(int r27) {
        /*
        // Method dump skipped, instructions count: 742
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.A09(int):void");
    }

    public void A0A(View view) {
        List list = (List) this.A0C.A00.getOrDefault(view, null);
        if (!(list == null || list.isEmpty())) {
            for (int i = 0; i < list.size(); i++) {
                View view2 = (View) list.get(i);
                AbstractC07570Yg r0 = ((C14270lr) view2.getLayoutParams()).A0A;
                if (r0 != null) {
                    r0.A02(this, view2, view);
                }
            }
        }
    }

    public void A0B(View view, int i) {
        C14270lr r5 = (C14270lr) view.getLayoutParams();
        View view2 = r5.A09;
        int i2 = 0;
        if (view2 == null && r5.A05 != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        } else if (view2 != null) {
            Rect A002 = A00();
            Rect A003 = A00();
            try {
                C14320lw.A00(this, view2, A002);
                C14270lr r2 = (C14270lr) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                A02(i, A002, A003, r2, measuredWidth, measuredHeight);
                A0E(r2, A003, measuredWidth, measuredHeight);
                view.layout(A003.left, A003.top, A003.right, A003.bottom);
            } finally {
                A002.setEmpty();
                C14840my r0 = A0I;
                r0.A01(A002);
                A003.setEmpty();
                r0.A01(A003);
            }
        } else {
            int i3 = r5.A04;
            if (i3 >= 0) {
                C14270lr r9 = (C14270lr) view.getLayoutParams();
                int i4 = r9.A02;
                if (i4 == 0) {
                    i4 = 8388661;
                }
                int A032 = AnonymousClass0N2.A03(i4, i);
                int i5 = A032 & 7;
                int i6 = A032 & 112;
                int width = getWidth();
                int height = getHeight();
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                if (i == 1) {
                    i3 = width - i3;
                }
                int A052 = A05(i3) - measuredWidth2;
                if (i5 == 1) {
                    A052 += measuredWidth2 >> 1;
                } else if (i5 == 5) {
                    A052 += measuredWidth2;
                }
                if (i6 == 16) {
                    i2 = 0 + (measuredHeight2 >> 1);
                } else if (i6 == 80) {
                    i2 = measuredHeight2;
                }
                int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) r9).leftMargin, Math.min(A052, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) r9).rightMargin));
                int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) r9).topMargin, Math.min(i2, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) r9).bottomMargin));
                view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
                return;
            }
            C14270lr r22 = (C14270lr) view.getLayoutParams();
            Rect A004 = A00();
            A004.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) r22).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) r22).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) r22).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) r22).bottomMargin);
            if (this.A06 != null && getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                A004.left = this.A06.A02() + A004.left;
                A004.top = this.A06.A04() + A004.top;
                A004.right -= this.A06.A03();
                A004.bottom -= this.A06.A01();
            }
            Rect A005 = A00();
            int i7 = r22.A02;
            if ((i7 & 7) == 0) {
                i7 |= 8388611;
            }
            if ((i7 & 112) == 0) {
                i7 |= 48;
            }
            AnonymousClass0N2.A10(i7, view.getMeasuredWidth(), view.getMeasuredHeight(), A004, A005, i);
            view.layout(A005.left, A005.top, A005.right, A005.bottom);
            A004.setEmpty();
            C14840my r02 = A0I;
            r02.A01(A004);
            A005.setEmpty();
            r02.A01(A005);
        }
    }

    public void A0C(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    public void A0D(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            C14320lw.A00(this, view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final void A0E(C14270lr r6, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) r6).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) r6).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) r6).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) r6).bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    public final void A0F(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            AbstractC07570Yg r1 = ((C14270lr) childAt.getLayoutParams()).A0A;
            if (r1 != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    r1.A05(this, childAt, obtain);
                } else {
                    r1.A06(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            getChildAt(i2).getLayoutParams();
        }
        this.A01 = null;
        this.A07 = false;
    }

    public final boolean A0G(MotionEvent motionEvent, int i) {
        int i2;
        int actionMasked = motionEvent.getActionMasked();
        List list = this.A0G;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            if (isChildrenDrawingOrderEnabled) {
                i2 = getChildDrawingOrder(childCount, i3);
            } else {
                i2 = i3;
            }
            list.add(getChildAt(i2));
        }
        Comparator comparator = A0L;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view = (View) list.get(i4);
            AbstractC07570Yg r1 = ((C14270lr) view.getLayoutParams()).A0A;
            if (!z) {
                if (r1 != null) {
                    if (i == 0) {
                        z = r1.A05(this, view, motionEvent);
                    } else if (i == 1) {
                        z = r1.A06(this, view, motionEvent);
                    }
                    if (z) {
                        this.A01 = view;
                    }
                }
            } else if (!(actionMasked == 0 || r1 == null)) {
                if (motionEvent2 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i == 0) {
                    r1.A05(this, view, motionEvent2);
                } else if (i == 1) {
                    r1.A06(this, view, motionEvent2);
                }
            }
        }
        list.clear();
        return z;
    }

    public boolean A0H(View view, int i, int i2) {
        Rect A002 = A00();
        C14320lw.A00(this, view, A002);
        try {
            return A002.contains(i, i2);
        } finally {
            A002.setEmpty();
            A0I.A01(A002);
        }
    }

    @Override // X.AnonymousClass0W6
    public void AHt(View view, int i, int i2, int[] iArr, int i3) {
        boolean z;
        AbstractC07570Yg r15;
        int i4;
        int i5;
        int i6;
        int childCount = getChildCount();
        boolean z2 = false;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                C14270lr r1 = (C14270lr) childAt.getLayoutParams();
                if (i3 == 0) {
                    z = r1.A0D;
                } else if (i3 == 1) {
                    z = r1.A0C;
                }
                if (z && (r15 = r1.A0A) != null) {
                    int[] iArr2 = this.A0H;
                    iArr2[1] = 0;
                    iArr2[0] = 0;
                    if (r15 instanceof VerticalSwipeDismissBehavior) {
                        VerticalSwipeDismissBehavior verticalSwipeDismissBehavior = (VerticalSwipeDismissBehavior) r15;
                        if (view == verticalSwipeDismissBehavior.A07.get()) {
                            int top = childAt.getTop();
                            if (i2 > 0) {
                                if (!view.canScrollVertically(1)) {
                                    iArr2[1] = i2;
                                    AnonymousClass0Q7.A0U(childAt, -i2);
                                    verticalSwipeDismissBehavior.A0A = true;
                                } else if (top > 0) {
                                    int min = Math.min(i2, top);
                                    iArr2[1] = min;
                                    AnonymousClass0Q7.A0U(childAt, -min);
                                }
                            } else if (i2 < 0) {
                                if (!view.canScrollVertically(-1)) {
                                    iArr2[1] = i2;
                                    AnonymousClass0Q7.A0U(childAt, -i2);
                                    verticalSwipeDismissBehavior.A0A = true;
                                } else if (top < 0) {
                                    int max = Math.max(i2, top);
                                    iArr2[1] = max;
                                    AnonymousClass0Q7.A0U(childAt, -max);
                                }
                            }
                            if (verticalSwipeDismissBehavior.A0A) {
                                verticalSwipeDismissBehavior.A06.AKE(childAt, Math.min(1.0f, (((float) Math.abs(childAt.getTop())) * 1.0f) / ((float) childAt.getHeight())));
                            }
                        }
                    } else if (r15 instanceof BottomSheetBehavior) {
                        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) r15;
                        if (i3 != 1 && view == bottomSheetBehavior.A0F.get()) {
                            int top2 = childAt.getTop();
                            int i10 = top2 - i2;
                            if (i2 > 0) {
                                if (bottomSheetBehavior.A0I) {
                                    i4 = bottomSheetBehavior.A03;
                                } else {
                                    i4 = 0;
                                }
                                if (i10 < i4) {
                                    int i11 = top2 - i4;
                                    iArr2[1] = i11;
                                    AnonymousClass0Q7.A0U(childAt, -i11);
                                    bottomSheetBehavior.A0B(3);
                                } else {
                                    iArr2[1] = i2;
                                    AnonymousClass0Q7.A0U(childAt, -i2);
                                    bottomSheetBehavior.A0B(1);
                                }
                            } else if (i2 < 0 && !view.canScrollVertically(-1)) {
                                int i12 = bottomSheetBehavior.A02;
                                if (i10 <= i12 || bottomSheetBehavior.A0J) {
                                    iArr2[1] = i2;
                                    AnonymousClass0Q7.A0U(childAt, -i2);
                                    bottomSheetBehavior.A0B(1);
                                } else {
                                    int i13 = top2 - i12;
                                    iArr2[1] = i13;
                                    AnonymousClass0Q7.A0U(childAt, -i13);
                                    bottomSheetBehavior.A0B(4);
                                }
                            }
                            bottomSheetBehavior.A0A(childAt.getTop());
                            bottomSheetBehavior.A06 = i2;
                            bottomSheetBehavior.A0L = true;
                        }
                    } else if (r15 instanceof AppBarLayout.BaseBehavior) {
                        HeaderBehavior headerBehavior = (HeaderBehavior) r15;
                        AppBarLayout appBarLayout = (AppBarLayout) childAt;
                        if (i2 != 0) {
                            if (i2 < 0) {
                                i5 = -appBarLayout.getTotalScrollRange();
                                i6 = appBarLayout.getDownNestedPreScrollRange() + i5;
                            } else {
                                i5 = -appBarLayout.getTotalScrollRange();
                                i6 = 0;
                            }
                            if (i5 != i6) {
                                iArr2[1] = headerBehavior.A08(this, appBarLayout, headerBehavior.A07() - i2, i5, i6);
                                if (i3 == 1) {
                                    int A072 = headerBehavior.A07();
                                    if (i2 >= 0 ? A072 == (-appBarLayout.getDownNestedScrollRange()) : A072 == 0) {
                                        if (view instanceof AbstractC07820Zr) {
                                            ((AbstractC07820Zr) view).AQF(1);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    int i14 = iArr2[0];
                    if (i > 0) {
                        i7 = Math.max(i7, i14);
                    } else {
                        i7 = Math.min(i7, i14);
                    }
                    int i15 = iArr2[1];
                    if (i2 > 0) {
                        i8 = Math.max(i8, i15);
                    } else {
                        i8 = Math.min(i8, i15);
                    }
                    z2 = true;
                }
            }
        }
        iArr[0] = i7;
        iArr[1] = i8;
        if (z2) {
            A09(1);
        }
    }

    @Override // X.AnonymousClass0W6
    public void AHu(View view, int i, int i2, int i3, int i4, int i5) {
        boolean z;
        AbstractC07570Yg r7;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C14270lr r1 = (C14270lr) childAt.getLayoutParams();
                if (i5 == 0) {
                    z = r1.A0D;
                } else if (i5 == 1) {
                    z = r1.A0C;
                }
                if (z && (r7 = r1.A0A) != null) {
                    if (r7 instanceof AppBarLayout.BaseBehavior) {
                        HeaderBehavior headerBehavior = (HeaderBehavior) r7;
                        AppBarLayout appBarLayout = (AppBarLayout) childAt;
                        if (i4 < 0) {
                            headerBehavior.A08(this, appBarLayout, headerBehavior.A07() - i4, -appBarLayout.getDownNestedScrollRange(), 0);
                            if (i5 == 1 && headerBehavior.A07() == 0 && (view instanceof AbstractC07820Zr)) {
                                ((AbstractC07820Zr) view).AQF(1);
                            }
                        }
                        if (appBarLayout.A07) {
                            boolean z3 = false;
                            if (view.getScrollY() > 0) {
                                z3 = true;
                            }
                            if (appBarLayout.A09 != z3) {
                                appBarLayout.A09 = z3;
                                appBarLayout.refreshDrawableState();
                            }
                        }
                    } else if (i5 == 0 && (r7 instanceof HideBottomViewOnScrollBehavior)) {
                        HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) r7;
                        int i7 = hideBottomViewOnScrollBehavior.A00;
                        if (i7 != 1 && i2 > 0) {
                            hideBottomViewOnScrollBehavior.A07(childAt);
                        } else if (i7 != 2 && i2 < 0) {
                            hideBottomViewOnScrollBehavior.A08(childAt);
                        }
                    }
                    z2 = true;
                }
            }
        }
        if (z2) {
            A09(1);
        }
    }

    @Override // X.AnonymousClass0W6
    public void AHw(View view, View view2, int i, int i2) {
        C14920n6 r1 = this.A0D;
        if (i2 == 1) {
            r1.A00 = i;
        } else {
            r1.A01 = i;
        }
        this.A02 = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            C14270lr r12 = (C14270lr) getChildAt(i3).getLayoutParams();
            if (i2 == 0) {
                boolean z = r12.A0D;
            } else if (i2 == 1) {
                boolean z2 = r12.A0C;
            }
        }
    }

    @Override // X.AnonymousClass0W6
    public boolean AKM(View view, View view2, int i, int i2) {
        boolean z;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C14270lr r2 = (C14270lr) childAt.getLayoutParams();
                AbstractC07570Yg r6 = r2.A0A;
                if (r6 != null) {
                    if (r6 instanceof VerticalSwipeDismissBehavior) {
                        z = false;
                        ((VerticalSwipeDismissBehavior) r6).A0A = false;
                        if ((i & 2) != 0) {
                            z = true;
                        }
                    } else if (r6 instanceof BottomSheetBehavior) {
                        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) r6;
                        z = false;
                        bottomSheetBehavior.A06 = 0;
                        bottomSheetBehavior.A0L = false;
                        if ((i & 2) != 0) {
                            z = true;
                        }
                    } else if (r6 instanceof BottomAppBar$Behavior) {
                        throw null;
                    } else if (r6 instanceof AppBarLayout.BaseBehavior) {
                        AppBarLayout.BaseBehavior baseBehavior = (AppBarLayout.BaseBehavior) r6;
                        AppBarLayout appBarLayout = (AppBarLayout) childAt;
                        z = true;
                        if ((i & 2) == 0 || (!appBarLayout.A07 && (appBarLayout.getTotalScrollRange() == 0 || getHeight() - view.getHeight() > appBarLayout.getHeight()))) {
                            z = false;
                        } else {
                            ValueAnimator valueAnimator = baseBehavior.A04;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                        }
                        baseBehavior.A05 = null;
                        baseBehavior.A01 = i2;
                    } else if (i2 != 0) {
                        z = false;
                    } else if (!(r6 instanceof HideBottomViewOnScrollBehavior)) {
                        z = false;
                    } else {
                        z = false;
                        if (i == 2) {
                            z = true;
                        }
                    }
                    z2 |= z;
                    if (i2 == 0) {
                        r2.A0D = z;
                    } else if (i2 == 1) {
                        r2.A0C = z;
                    }
                } else if (i2 == 0) {
                    r2.A0D = false;
                } else if (i2 == 1) {
                    r2.A0C = false;
                }
            }
        }
        return z2;
    }

    @Override // X.AnonymousClass0W6
    public void AKc(View view, int i) {
        boolean z;
        C14920n6 r1 = this.A0D;
        if (i == 1) {
            r1.A00 = 0;
        } else {
            r1.A01 = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C14270lr r12 = (C14270lr) childAt.getLayoutParams();
            if (i == 0) {
                z = r12.A0D;
            } else if (i == 1) {
                z = r12.A0C;
            }
            if (z) {
                AbstractC07570Yg r0 = r12.A0A;
                if (r0 != null) {
                    r0.A03(this, childAt, view, i);
                }
                if (i == 0) {
                    r12.A0D = false;
                } else if (i == 1) {
                    r12.A0C = false;
                }
                r12.A0E = false;
            }
        }
        this.A02 = null;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C14270lr) && super.checkLayoutParams(layoutParams);
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        view.getLayoutParams();
        return super.drawChild(canvas, view, j);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.A00;
        if (drawable != null && drawable.isStateful() && (false || drawable.setState(drawableState))) {
            invalidate();
        }
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C14270lr();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C14270lr(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C14270lr) {
            return new C14270lr((C14270lr) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C14270lr((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C14270lr(layoutParams);
    }

    public final List getDependencySortedChildren() {
        A07();
        return Collections.unmodifiableList(this.A0E);
    }

    public final C06730Um getLastWindowInsets() {
        return this.A06;
    }

    public int getNestedScrollAxes() {
        C14920n6 r0 = this.A0D;
        return r0.A01 | r0.A00;
    }

    public Drawable getStatusBarBackground() {
        return this.A00;
    }

    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        A0F(false);
        if (this.A0A) {
            if (this.A04 == null) {
                this.A04 = new ViewTreeObserver$OnPreDrawListenerC14280ls(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.A04);
        }
        if (this.A06 == null && getFitsSystemWindows()) {
            if (Build.VERSION.SDK_INT >= 20) {
                requestApplyInsets();
            } else {
                requestFitSystemWindows();
            }
        }
        this.A09 = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A0F(false);
        if (this.A0A && this.A04 != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.A04);
        }
        View view = this.A02;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.A09 = false;
    }

    public void onDraw(Canvas canvas) {
        C06730Um r0;
        int A042;
        super.onDraw(canvas);
        if (this.A08 && this.A00 != null && (r0 = this.A06) != null && (A042 = r0.A04()) > 0) {
            this.A00.setBounds(0, 0, getWidth(), A042);
            this.A00.draw(canvas);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            A0F(true);
        }
        boolean A0G2 = A0G(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            A0F(true);
        }
        return A0G2;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AbstractC07570Yg r0;
        int A052 = AnonymousClass0Q7.A05(this);
        List list = this.A0E;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) list.get(i5);
            if (view.getVisibility() != 8 && ((r0 = ((C14270lr) view.getLayoutParams()).A0A) == null || !r0.A04(this, view, A052))) {
                A0B(view, A052);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0092, code lost:
        if (getFitsSystemWindows() == false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00cd, code lost:
        if (r22 != false) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0115, code lost:
        if (r9 == false) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01d1, code lost:
        if (r22 != false) goto L_0x01d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01d3, code lost:
        r29 = java.lang.Math.max(0, (r21 - r23) - r9);
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x010a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r40, int r41) {
        /*
        // Method dump skipped, instructions count: 545
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // X.AnonymousClass0W7
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                boolean z2 = ((C14270lr) childAt.getLayoutParams()).A0D;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
        if (r1.A0B == 3) goto L_0x003f;
     */
    @Override // X.AnonymousClass0W7
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onNestedPreFling(android.view.View r7, float r8, float r9) {
        /*
            r6 = this;
            int r4 = r6.getChildCount()
            r3 = 0
            r5 = 0
        L_0x0006:
            if (r3 >= r4) goto L_0x004a
            android.view.View r2 = r6.getChildAt(r3)
            int r1 = r2.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x002c
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            X.0lr r1 = (X.C14270lr) r1
            boolean r0 = r1.A0D
            if (r0 == 0) goto L_0x002c
            X.0Yg r1 = r1.A0A
            if (r1 == 0) goto L_0x002c
            boolean r0 = r1 instanceof com.whatsapp.gesture.VerticalSwipeDismissBehavior
            if (r0 != 0) goto L_0x0041
            boolean r0 = r1 instanceof com.google.android.material.bottomsheet.BottomSheetBehavior
            if (r0 != 0) goto L_0x002f
            r2 = 0
        L_0x002b:
            r5 = r5 | r2
        L_0x002c:
            int r3 = r3 + 1
            goto L_0x0006
        L_0x002f:
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r1
            java.lang.ref.WeakReference r0 = r1.A0F
            java.lang.Object r0 = r0.get()
            if (r7 != r0) goto L_0x003f
            int r1 = r1.A0B
            r0 = 3
            r2 = 1
            if (r1 != r0) goto L_0x002b
        L_0x003f:
            r2 = 0
            goto L_0x002b
        L_0x0041:
            com.whatsapp.gesture.VerticalSwipeDismissBehavior r1 = (com.whatsapp.gesture.VerticalSwipeDismissBehavior) r1
            java.lang.ref.WeakReference r0 = r1.A07
            r0.get()
            r2 = 0
            goto L_0x002b
        L_0x004a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onNestedPreFling(android.view.View, float, float):boolean");
    }

    @Override // X.AnonymousClass0W7
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        AHt(view, i, i2, iArr, 0);
    }

    @Override // X.AnonymousClass0W7
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        AHu(view, i, i2, i3, i4, 0);
    }

    @Override // X.AnonymousClass0W7
    public void onNestedScrollAccepted(View view, View view2, int i) {
        AHw(view, view2, i, 0);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C29881aM)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C29881aM r7 = (C29881aM) parcelable;
        super.onRestoreInstanceState(((AbstractC15200nf) r7).A00);
        SparseArray sparseArray = r7.A00;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC07570Yg r2 = A01(childAt).A0A;
            if (!(id == -1 || r2 == null || (parcelable2 = (Parcelable) sparseArray.get(id)) == null)) {
                if (r2 instanceof BottomSheetBehavior) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) r2;
                    int i2 = ((C36711mk) parcelable2).A00;
                    if (i2 == 1 || i2 == 2) {
                        bottomSheetBehavior.A0B = 4;
                    } else {
                        bottomSheetBehavior.A0B = i2;
                    }
                } else if (r2 instanceof AppBarLayout.BaseBehavior) {
                    AppBarLayout.BaseBehavior baseBehavior = (AppBarLayout.BaseBehavior) r2;
                    if (parcelable2 instanceof C36661mb) {
                        C36661mb r1 = (C36661mb) parcelable2;
                        baseBehavior.A03 = r1.A01;
                        baseBehavior.A00 = r1.A00;
                        baseBehavior.A06 = r1.A02;
                    } else {
                        baseBehavior.A03 = -1;
                    }
                }
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        Parcelable r11;
        int i;
        C29881aM r8 = new C29881aM(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            AbstractC07570Yg r2 = ((C14270lr) childAt.getLayoutParams()).A0A;
            if (!(id == -1 || r2 == null)) {
                if (r2 instanceof BottomSheetBehavior) {
                    r11 = new C36711mk(View.BaseSavedState.EMPTY_STATE, ((BottomSheetBehavior) r2).A0B);
                } else if (r2 instanceof AppBarLayout.BaseBehavior) {
                    AppBarLayout appBarLayout = (AppBarLayout) childAt;
                    r11 = View.BaseSavedState.EMPTY_STATE;
                    AnonymousClass1DC r0 = ((ViewOffsetBehavior) r2).A01;
                    if (r0 != null) {
                        i = r0.A02;
                    } else {
                        i = 0;
                    }
                    int childCount2 = appBarLayout.getChildCount();
                    boolean z = false;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= childCount2) {
                            break;
                        }
                        View childAt2 = appBarLayout.getChildAt(i3);
                        int bottom = childAt2.getBottom() + i;
                        if (childAt2.getTop() + i > 0 || bottom < 0) {
                            i3++;
                        } else {
                            C36661mb r22 = new C36661mb(r11);
                            r22.A01 = i3;
                            if (bottom == appBarLayout.getTopInset() + childAt2.getMinimumHeight()) {
                                z = true;
                            }
                            r22.A02 = z;
                            r22.A00 = ((float) bottom) / ((float) childAt2.getHeight());
                            r11 = r22;
                        }
                    }
                } else {
                    r11 = View.BaseSavedState.EMPTY_STATE;
                }
                if (r11 != null) {
                    sparseArray.append(id, r11);
                }
            }
        }
        r8.A00 = sparseArray;
        return r8;
    }

    @Override // X.AnonymousClass0W7
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return AKM(view, view2, i, 0);
    }

    @Override // X.AnonymousClass0W7
    public void onStopNestedScroll(View view) {
        AKc(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r4 != false) goto L_0x0010;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r13) {
        /*
            r12 = this;
            int r2 = r13.getActionMasked()
            android.view.View r0 = r12.A01
            r3 = 1
            r11 = 0
            if (r0 != 0) goto L_0x004d
            boolean r4 = r12.A0G(r13, r3)
            if (r4 == 0) goto L_0x004b
        L_0x0010:
            android.view.View r0 = r12.A01
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            X.0lr r0 = (X.C14270lr) r0
            X.0Yg r1 = r0.A0A
            if (r1 == 0) goto L_0x004b
            android.view.View r0 = r12.A01
            boolean r1 = r1.A06(r12, r0, r13)
        L_0x0022:
            android.view.View r0 = r12.A01
            if (r0 != 0) goto L_0x0034
            boolean r0 = super.onTouchEvent(r13)
            r1 = r1 | r0
        L_0x002b:
            if (r2 == r3) goto L_0x0030
            r0 = 3
            if (r2 != r0) goto L_0x0033
        L_0x0030:
            r12.A0F(r11)
        L_0x0033:
            return r1
        L_0x0034:
            if (r4 == 0) goto L_0x002b
            long r4 = android.os.SystemClock.uptimeMillis()
            r8 = 3
            r9 = 0
            r6 = r4
            r10 = r9
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r4, r6, r8, r9, r10, r11)
            super.onTouchEvent(r0)
            if (r0 == 0) goto L_0x002b
            r0.recycle()
            goto L_0x002b
        L_0x004b:
            r1 = 0
            goto L_0x0022
        L_0x004d:
            r4 = 0
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        boolean z2;
        AbstractC07570Yg r2 = ((C14270lr) view.getLayoutParams()).A0A;
        if (r2 != null) {
            if (!(r2 instanceof AppBarLayout.ScrollingViewBehavior)) {
                z2 = false;
            } else {
                HeaderScrollingViewBehavior headerScrollingViewBehavior = (HeaderScrollingViewBehavior) r2;
                AppBarLayout A002 = AppBarLayout.ScrollingViewBehavior.A00(A06(view));
                if (A002 != null) {
                    rect.offset(view.getLeft(), view.getTop());
                    Rect rect2 = headerScrollingViewBehavior.A02;
                    rect2.set(0, 0, getWidth(), getHeight());
                    if (!rect2.contains(rect)) {
                        z2 = true;
                        A002.A02(false, !z, true);
                    }
                }
                z2 = false;
            }
            if (z2) {
                return true;
            }
        }
        return super.requestChildRectangleOnScreen(view, rect, z);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.A07) {
            A0F(false);
            this.A07 = true;
        }
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        A08();
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.A03 = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.A00;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.A00 = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.A00.setState(getDrawableState());
                }
                C002001d.A2Y(this.A00, AnonymousClass0Q7.A05(this));
                Drawable drawable4 = this.A00;
                boolean z = false;
                if (getVisibility() == 0) {
                    z = true;
                }
                drawable4.setVisible(z, false);
                this.A00.setCallback(this);
            }
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? C004302a.A03(getContext(), i) : null);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = false;
        if (i == 0) {
            z = true;
        }
        Drawable drawable = this.A00;
        if (drawable != null && drawable.isVisible() != z) {
            this.A00.setVisible(z, false);
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.A00;
    }
}
